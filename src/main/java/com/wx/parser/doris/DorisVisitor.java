package com.wx.parser.doris;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.wx.parser.doris.entity.*;
import com.wx.parser.info.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import com.wx.parser.doris.antlr4.*;
import com.wx.parser.doris.antlr4.DorisParser.*;
import com.wx.parser.doris.exceptions.AnalysisException;
import com.wx.parser.doris.exceptions.ParseException;
import com.wx.parser.utils.ParserUtils;

import java.math.BigInteger;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class DorisVisitor extends DorisParserBaseVisitor<Object> {
    @SuppressWarnings("unchecked")
    protected <T> T typedVisit(ParseTree ctx) {
        return (T) ctx.accept(this);
    }

    /**
     * Override the default behavior for all visit methods. This will only return a non-null result
     * when the context has only one child. This is done because there is no generic method to
     * combine the results of the context children. In all other cases null is returned.
     */
    @Override
    public Object visitChildren(RuleNode node) {
        if (node.getChildCount() == 1) {
            return node.getChild(0).accept(this);
        } else {
            return null;
        }
    }

    @Override
    public Info visitSingleStatement(DorisParser.SingleStatementContext ctx) {
        return ParserUtils.withOrigin(ctx, () -> (Info) visit(ctx.statement()));
    }

    @Override
    public Info visitQuery(QueryContext ctx) {
        return ParserUtils.withOrigin(ctx, () -> {
            Info query = info(ctx.queryTerm());
            query = withCte(query, ctx.cte());
            return withQueryOrganization(query, ctx.queryOrganization());
        });
    }

    @Override
    public Info visitRegularQuerySpecification(RegularQuerySpecificationContext ctx) {
        return ParserUtils.withOrigin(ctx, () -> {
            SelectClauseContext selectCtx = ctx.selectClause();
            Info selectInfo;
            if (ctx.fromClause() == null) {
                SelectColumnClauseContext columnCtx = selectCtx.selectColumnClause();
                if (columnCtx.EXCEPT() != null) {
                    throw new ParseException("select-except cannot be used in one row relation", selectCtx);
                }
                selectInfo = withOneRowRelation(columnCtx);
            } else {
                Info relation = visitFromClause(ctx.fromClause());
                selectInfo = withSelectQuerySpecification(
                        ctx,
                        relation,
                        selectCtx,
                        Optional.ofNullable(ctx.whereClause()),
                        Optional.ofNullable(ctx.aggClause()),
                        Optional.ofNullable(ctx.havingClause())
                );
            }
            selectInfo = withQueryOrganization(selectInfo, ctx.queryOrganization());
            return withSelectHint(selectInfo, selectCtx.selectHint());
        });
    }

    @Override
    public Info visitInlineTable(InlineTableContext ctx) {
        List<Info> exprsList = ctx.rowConstructor().stream()
                .map(this::visitRowConstructor)
                .map(Info.class::cast)
                .collect(ImmutableList.toImmutableList());
        return reduceToLogicalPlanTree(0, exprsList.size() - 1, exprsList, "ALL");
    }

    @Override
    public Info visitSubquery(SubqueryContext ctx) {
        return ParserUtils.withOrigin(ctx, () -> info(ctx.query()));
    }

    @Override
    public SubQueryAlias visitAliasQuery(AliasQueryContext ctx) {
        return ParserUtils.withOrigin(ctx, () -> {
            Info info = info(ctx.query());
            Optional<List<String>> columnNames = optionalVisit(ctx.columnAliases(), () ->
                    ctx.columnAliases().identifier().stream()
                            .map(RuleContext::getText)
                            .collect(ImmutableList.toImmutableList())
            );
            return new SubQueryAlias(ImmutableList.of(ctx.identifier().getText()), columnNames, info);
        });
    }

    @Override
    public Info visitSetOperation(SetOperationContext ctx) {
        return ParserUtils.withOrigin(ctx, () -> {

            if (ctx.UNION() != null) {
                String qualifier = getQualifier(ctx);
                List<QueryTermContext> contexts = Lists.newArrayList(ctx.right);
                QueryTermContext current = ctx.left;
                while (true) {
                    if (current instanceof SetOperationContext
                            && Objects.equals(getQualifier((SetOperationContext) current), qualifier)
                            && ((SetOperationContext) current).UNION() != null) {
                        contexts.add(((SetOperationContext) current).right);
                        current = ((SetOperationContext) current).left;
                    } else {
                        contexts.add(current);
                        break;
                    }
                }
                Collections.reverse(contexts);
                List<Info> logicalPlans = contexts.stream().map(this::info).collect(Collectors.toList());
                return reduceToLogicalPlanTree(0, logicalPlans.size() - 1, logicalPlans, qualifier);
            } else {
                Info leftQuery = info(ctx.left);
                Info rightQuery = info(ctx.right);
                String qualifier = getQualifier(ctx);

                List<Info> newChildren = ImmutableList.of(leftQuery, rightQuery);
                Info info;
                if (ctx.UNION() != null) {
                    info = new UnionInfo(qualifier, newChildren);
                } else if (ctx.EXCEPT() != null) {
                    info = new ExceptInfo(qualifier, newChildren);
                } else if (ctx.INTERSECT() != null) {
                    info = new IntersectInfo(qualifier, newChildren);
                } else {
                    throw new ParseException("not support", ctx);
                }
                return info;
            }
        });
    }

    @Override
    public Info visitStatementDefault(StatementDefaultContext ctx) {
        Info info = info(ctx.query());
        if (ctx.outFileClause() != null) {
            info = withOutFile(info, ctx.outFileClause());
        }
        return withExplain(info, ctx.explain());
    }

    @Override
    public Info visitCreateTable(CreateTableContext ctx) {
        String ctlName = null;
        String dbName = null;
        String tableName = null;
        List<String> nameParts = visitMultipartIdentifier(ctx.name);
        if (nameParts.size() == 1) {
            tableName = nameParts.get(0);
        } else if (nameParts.size() == 2) {
            dbName = nameParts.get(0);
            tableName = nameParts.get(1);
        } else if (nameParts.size() == 3) {
            ctlName = nameParts.get(0);
            dbName = nameParts.get(1);
            tableName = nameParts.get(2);
        } else {
            throw new AnalysisException("nameParts in create table should be [ctl.][db.]tbl");
        }
        String keysType = null;
        if (ctx.DUPLICATE() != null) {
            keysType = ctx.DUPLICATE().getText();
        } else if (ctx.AGGREGATE() != null) {
            keysType = ctx.AGGREGATE().getText();
        } else if (ctx.UNIQUE() != null) {
            keysType = ctx.UNIQUE().getText();
        }
        String engineName = ctx.engine != null ? ctx.engine.getText().toLowerCase() : "OLAP";
        boolean isHash = ctx.HASH() != null || ctx.RANDOM() == null;
        int bucketNum = 10;
        if (isHash && ctx.INTEGER_VALUE() != null) {
            bucketNum = Integer.parseInt(ctx.INTEGER_VALUE().getText());
        }
        DistributionDescriptor desc = new DistributionDescriptor(isHash, ctx.AUTO() != null,
                bucketNum, ctx.HASH() != null ? visitIdentifierList(ctx.hashKeys) : null);
        Map<String, String> properties = ctx.propertyClause() != null
                // NOTICE: we should not generate immutable map here, because it will be modified when analyzing.
                ? Maps.newHashMap(visitPropertyClause(ctx.propertyClause())) : Maps.newHashMap();
        String partitionType = null;
        if (ctx.PARTITION() != null) {
            partitionType = ctx.RANGE() != null ? "RANGE" : "LIST";
        }

        if (ctx.columnDefs() != null) {
            if (ctx.AS() != null) {
                throw new AnalysisException("Should not define the entire column in CTAS");
            }
            return new CreateTableInfo(null,
                    ctx.EXISTS() != null,
                    ctlName,
                    dbName,
                    tableName,
                    visitColumnDefs(ctx.columnDefs()),
                    ctx.indexDefs() != null ? visitIndexDefs(ctx.indexDefs()) : null,
                    null,
                    engineName,
                    keysType,
                    ctx.keys != null ? visitIdentifierList(ctx.keys) : ImmutableList.of(),
                    "",
                    partitionType,
                    ctx.partitionKeys != null ? visitIdentifierList(ctx.partitionKeys) : null,
                    ctx.partitions != null ? visitPartitionsDef(ctx.partitions) : null,
                    desc,
                    ctx.rollupDefs() != null ? visitRollupDefs(ctx.rollupDefs()) : ImmutableList.of(),
                    properties);
        } else if (ctx.AS() != null) {
            return new CreateTableInfo(visitQuery(ctx.query()),
                    ctx.EXISTS() != null,
                    ctlName,
                    dbName,
                    tableName,
                    null,
                    null,
                    ctx.ctasCols != null ? visitIdentifierList(ctx.ctasCols) : null,
                    engineName,
                    keysType,
                    ctx.keys != null ? visitIdentifierList(ctx.keys) : ImmutableList.of(),
                    "",
                    partitionType,
                    ctx.partitionKeys != null ? visitIdentifierList(ctx.partitionKeys) : null,
                    ctx.partitions != null ? visitPartitionsDef(ctx.partitions) : null,
                    desc,
                    ctx.rollupDefs() != null ? visitRollupDefs(ctx.rollupDefs()) : ImmutableList.of(),
                    properties);
        } else {
            throw new AnalysisException("Should contain at least one column in a table");
        }
    }

    @Override
    public Info visitInsertIntoQuery(InsertIntoQueryContext ctx) {
        boolean isOverwrite = ctx.INTO() == null;
        List<String> tableName;
        if (null != ctx.tableName) {
            tableName = visitMultipartIdentifier(ctx.tableName);
        } else {
            throw new ParseException("tableName and tableId cannot both be null");
        }
        String labelName = ctx.labelName == null ? null : ctx.labelName.getText();
        List<String> colNames = ctx.cols == null ? ImmutableList.of() : visitIdentifierList(ctx.cols);
        List<String> partitions = ctx.partition == null ? ImmutableList.of() : visitIdentifierList(ctx.partition);
        InsertIntoInfo insertIntoInfo = new InsertIntoInfo(tableName, colNames, labelName, partitions, isOverwrite, visitQuery(ctx.query()));
        if (ctx.explain() != null) {
            return withExplain(insertIntoInfo, ctx.explain());
        }
        return insertIntoInfo;
    }

    @Override
    public Info visitUpdate(UpdateContext ctx) {
        Info query = new TableInfo(visitMultipartIdentifier(ctx.tableName));
        query = withTableAlias(query, ctx.tableAlias());
        if (ctx.fromClause() != null) {
            query = visitFromClause(ctx.fromClause());
        }
        Info filter = withFilter(query, Optional.of(ctx.whereClause()));
        String tableAlias = null;
        if (ctx.tableAlias().strictIdentifier() != null) {
            tableAlias = ctx.tableAlias().getText();
        }
        return withExplain(new UpdateInfo(visitMultipartIdentifier(ctx.tableName),
                visitUpdateAssignmentSeq(ctx.updateAssignmentSeq()), tableAlias, query, filter), ctx.explain());
    }

    @Override
    public Info visitDelete(DeleteContext ctx) {
        List<String> tableName = visitMultipartIdentifier(ctx.tableName);
        List<String> partitions = ctx.partition == null ? ImmutableList.of() : visitIdentifierList(ctx.partition);
        Info query = withTableAlias(new TableInfo(visitMultipartIdentifier(ctx.tableName)), ctx.tableAlias());
        if (ctx.USING() != null) {
            query = withRelations(query, ctx.relation());
        }
        query = withFilter(query, Optional.of(ctx.whereClause()));
        String tableAlias = null;
        if (ctx.tableAlias().strictIdentifier() != null) {
            tableAlias = ctx.tableAlias().getText();
        }
        return withExplain(new DeleteInfo(tableName, partitions, tableAlias, query), ctx.explain());
    }


    @Override
    public Info visitTableName(TableNameContext ctx) {
        List<String> tableId = visitMultipartIdentifier(ctx.multipartIdentifier());
        List<String> partitionNames = new ArrayList<>();
        boolean isTempPart = false;
        if (ctx.specifiedPartition() != null) {
            isTempPart = ctx.specifiedPartition().TEMPORARY() != null;
            if (ctx.specifiedPartition().identifier() != null) {
                partitionNames.add(ctx.specifiedPartition().identifier().getText());
            } else {
                partitionNames.addAll(visitIdentifierList(ctx.specifiedPartition().identifierList()));
            }
        }

        List<Long> tabletIdLists = new ArrayList<>();
        if (ctx.tabletList() != null) {
            ctx.tabletList().tabletIdList.stream().forEach(tabletToken -> {
                tabletIdLists.add(Long.parseLong(tabletToken.getText()));
            });
        }

        final List<String> relationHints;
        if (ctx.relationHint() != null) {
            relationHints = typedVisit(ctx.relationHint());
        } else {
            relationHints = ImmutableList.of();
        }

        TableSample tableSample = ctx.sample() == null ? null : (TableSample) visit(ctx.sample());
        Info checkedRelation = new TableInfo(tableId, partitionNames, tabletIdLists, isTempPart, relationHints, tableSample);
        Info plan = withTableAlias(checkedRelation, ctx.tableAlias());
        for (LateralViewContext lateralViewContext : ctx.lateralView()) {
            plan = withGenerate(plan, lateralViewContext);
        }
        return plan;
    }

    @Override
    public Info visitAliasedQuery(AliasedQueryContext ctx) {
        if (ctx.tableAlias().getText().equals("")) {
            throw new ParseException("Every derived table must have its own alias", ctx);
        }
        Info info = withTableAlias(visitQuery(ctx.query()), ctx.tableAlias());
        for (LateralViewContext lateralViewContext : ctx.lateralView()) {
            info = withGenerate(info, lateralViewContext);
        }
        return info;
    }

    @Override
    public Info visitTableValuedFunction(TableValuedFunctionContext ctx) {
        return ParserUtils.withOrigin(ctx, () -> {
            String functionName = ctx.tvfName.getText();

            Map<String, String> map = visitPropertyItemList(ctx.properties);
            Info relation = new UnboundTVFRelationInfo(functionName, map);
            return withTableAlias(relation, ctx.tableAlias());
        });
    }

    @Override
    public Object visitSample(SampleContext ctx) {
        long seek = ctx.seed == null ? -1L : Long.parseLong(ctx.seed.getText());
        DorisParser.SampleMethodContext sampleContext = ctx.sampleMethod();
        if (sampleContext instanceof SampleByPercentileContext) {
            SampleByPercentileContext sampleByPercentileContext = (SampleByPercentileContext) sampleContext;
            long percent = Long.parseLong(sampleByPercentileContext.INTEGER_VALUE().getText());
            return new TableSample(percent, true, seek);
        }
        SampleByRowsContext sampleByRowsContext = (SampleByRowsContext) sampleContext;
        long rows = Long.parseLong(sampleByRowsContext.ROWS().getText());
        return new TableSample(rows, false, seek);
    }

    @Override
    public Map<String, String> visitPropertyClause(PropertyClauseContext ctx) {
        return ctx == null ? ImmutableMap.of() : visitPropertyItemList(ctx.fileProperties);
    }

    @Override
    public Map<String, String> visitPropertyItemList(PropertyItemListContext ctx) {
        if (ctx == null || ctx.properties == null) {
            return ImmutableMap.of();
        }
        ImmutableMap.Builder<String, String> propertiesMap = ImmutableMap.builder();
        for (PropertyItemContext argument : ctx.properties) {
            String key = parsePropertyKey(argument.key);
            String value = parsePropertyValue(argument.value);
            propertiesMap.put(key, value);
        }
        return propertiesMap.build();
    }

    @Override
    public List<String> visitMultipartIdentifier(MultipartIdentifierContext ctx) {
        return ctx.parts.stream()
                .map(RuleContext::getText)
                .collect(ImmutableList.toImmutableList());
    }/**
     * Create a Sequence of Strings for a parenthesis enclosed alias list.
     */
    @Override
    public List<String> visitIdentifierList(IdentifierListContext ctx) {
        return visitIdentifierSeq(ctx.identifierSeq());
    }

    /**
     * Create a Sequence of Strings for an identifier list.
     */
    @Override
    public List<String> visitIdentifierSeq(IdentifierSeqContext ctx) {
        return ctx.ident.stream()
                .map(RuleContext::getText)
                .collect(ImmutableList.toImmutableList());
    }

    @Override
    public String visitIdentifierOrText(IdentifierOrTextContext ctx) {
        if (ctx.STRING_LITERAL() != null) {
            return ctx.STRING_LITERAL().getText().substring(1, ctx.STRING_LITERAL().getText().length() - 1);
        } else {
            return ctx.errorCapturingIdentifier().getText();
        }
    }

    @Override
    public List<String> visitNamedExpressionSeq(NamedExpressionSeqContext namedCtx) {
        return visit(namedCtx.namedExpression(), String.class);
    }

    @Override
    public Info visitFromClause(FromClauseContext ctx) {
        return ParserUtils.withOrigin(ctx, () -> withRelations(null, ctx.relation()));
    }

    @Override
    public Info visitRelation(RelationContext ctx) {
        return info(ctx.relationPrimary());
    }

    @Override
    public List<Expression.EqualTo> visitUpdateAssignmentSeq(UpdateAssignmentSeqContext ctx) {
        return ctx.assignments.stream()
                .map(this::visitUpdateAssignment)
                .collect(Collectors.toList());
    }

    @Override
    public Expression.EqualTo visitUpdateAssignment(UpdateAssignmentContext ctx) {
        return new Expression.EqualTo(
                new Expression.Unbound(visitMultipartIdentifier(ctx.multipartIdentifier())),
                getCondition(ctx.expression()));
    }

    /**
     * Create a comparison expression. This compares two expressions. The following comparison
     * operators are supported:
     * - Equal: '=' or '=='
     * - Null-safe Equal: '<=>'
     * - Not Equal: '<>' or '!='
     * - Less than: '<'
     * - Less then or Equal: '<='
     * - Greater than: '>'
     * - Greater then or Equal: '>='
     */
    @Override
    public Expression visitComparison(ComparisonContext ctx) {
        return ParserUtils.withOrigin(ctx, () -> {
            Expression left = getCondition(ctx.left);
            Expression right = getCondition(ctx.right);
            TerminalNode operator = (TerminalNode) ctx.comparisonOperator().getChild(0);
            switch (operator.getSymbol().getType()) {
                case DorisParser.EQ:
                    return new Expression.EqualTo(left, right);
                case DorisParser.NEQ:
                    return new Expression.Not(new Expression.EqualTo(left, right));
                case DorisParser.LT:
                    return new Expression.LessThan(left, right);
                case DorisParser.GT:
                    return new Expression.GreaterThan(left, right);
                case DorisParser.LTE:
                    return new Expression.LessThanEqual(left, right);
                case DorisParser.GTE:
                    return new Expression.GreaterThanEqual(left, right);
                case DorisParser.NSEQ:
                    return new Expression.NullSafeEqual(left, right);
                default:
                    throw new ParseException("Unsupported comparison expression: "
                            + operator.getSymbol().getText(), ctx);
            }
        });
    }

    /**
     * Create a not expression.
     * format: NOT Expression
     * for example:
     * not 1
     * not 1=1
     */
    @Override
    public Expression visitLogicalNot(LogicalNotContext ctx) {
        return ParserUtils.withOrigin(ctx, () -> getCondition(ctx.booleanExpression()));
    }

    @Override
    public Expression visitLogicalBinary(LogicalBinaryContext ctx) {
        return ParserUtils.withOrigin(ctx, () -> {
            // Collect all similar left hand contexts.
            List<BooleanExpressionContext> contexts = Lists.newArrayList(ctx.right);
            BooleanExpressionContext current = ctx.left;
            while (true) {
                if (current instanceof LogicalBinaryContext
                        && ((LogicalBinaryContext) current).operator.getType() == ctx.operator.getType()) {
                    contexts.add(((LogicalBinaryContext) current).right);
                    current = ((LogicalBinaryContext) current).left;
                } else {
                    contexts.add(current);
                    break;
                }
            }
            // Reverse the contexts to have them in the same sequence as in the SQL statement & turn them
            // into expressions.
            Collections.reverse(contexts);
            List<Expression> expressions = contexts.stream().map(this::getCondition).collect(Collectors.toList());
            // Create a balanced tree.
            return reduceToExpressionTree(0, expressions.size() - 1, expressions, ctx);
        });
    }

    @Override
    public Expression visitLambdaExpression(LambdaExpressionContext ctx) {
        ImmutableList<String> args = ctx.args.stream()
                .map(RuleContext::getText)
                .collect(ImmutableList.toImmutableList());
        Expression body = (Expression) visit(ctx.body);
        return new Expression.Lambda(args, body);
    }

    /**
     * Create a predicated expression. A predicated expression is a normal expression with a
     * predicate attached to it, for example:
     * {{{
     * a + 1 IS NULL
     * }}}
     */
    @Override
    public Expression visitPredicated(PredicatedContext ctx) {
        return ParserUtils.withOrigin(ctx, () -> {
            Expression e = getCondition(ctx.valueExpression());
            return ctx.predicate() == null ? e : withPredicate(e, ctx.predicate());
        });
    }

    @Override
    public Expression visitArithmeticUnary(ArithmeticUnaryContext ctx) {
        return ParserUtils.withOrigin(ctx, () -> {
            Expression e = typedVisit(ctx.valueExpression());
            switch (ctx.operator.getType()) {
                case DorisParser.PLUS:
                    return e;
                case DorisParser.SUBTRACT:
                    Expression.IntegerLiteral zero = new Expression.IntegerLiteral(0);
                    return new Expression.Subtract(zero, e);
                case DorisParser.TILDE:
                    return new Expression.BitNot(e);
                default:
                    throw new ParseException("Unsupported arithmetic unary type: " + ctx.operator.getText(), ctx);
            }
        });
    }

    @Override
    public Expression visitBitOperation(BitOperationContext ctx) {
        return ParserUtils.withOrigin(ctx, () -> {
            Expression left = getCondition(ctx.left);
            Expression right = getCondition(ctx.right);
            if (ctx.operator.getType() == DorisParser.BITAND) {
                return new Expression.BitAnd(left, right);
            } else if (ctx.operator.getType() == DorisParser.BITOR) {
                return new Expression.BitOr(left, right);
            } else if (ctx.operator.getType() == DorisParser.BITXOR) {
                return new Expression.BitXor(left, right);
            }
            throw new ParseException(" not supported", ctx);
        });
    }

    @Override
    public Expression visitArithmeticBinary(ArithmeticBinaryContext ctx) {
        return ParserUtils.withOrigin(ctx, () -> {
            Expression left = getCondition(ctx.left);
            Expression right = getCondition(ctx.right);

            int type = ctx.operator.getType();
            if (left instanceof Expression.Interval) {
                Expression.Interval interval = (Expression.Interval) left;
                return new Expression.TimestampArithmetic("+", ImmutableList.of(right, interval.getValue()), interval.getTimeUnit(), true);
            }

            if (right instanceof Expression.Interval) {
                String operator = "";
                if (type == DorisParser.PLUS) {
                    operator = "+";
                } else if (type == DorisParser.SUBTRACT) {
                    operator = "-";
                }
                Expression.Interval interval = (Expression.Interval) right;
                return new Expression.TimestampArithmetic(operator, ImmutableList.of(left, interval.getValue()), interval.getTimeUnit(), false);
            }

            return ParserUtils.withOrigin(ctx, () -> {
                switch (type) {
                    case DorisParser.ASTERISK:
                        return new Expression.Multiply(left, right);
                    case DorisParser.SLASH:
                        return new Expression.Divide(left, right);
                    case DorisParser.MOD:
                        return new Expression.Mod(left, right);
                    case DorisParser.PLUS:
                        return new Expression.Add(left, right);
                    case DorisParser.SUBTRACT:
                        return new Expression.Subtract(left, right);
                    case DorisParser.DIV:
                        return new Expression.IntegralDivide(left, right);
                    case DorisParser.HAT:
                        return new Expression.BitXor(left, right);
                    case DorisParser.PIPE:
                        return new Expression.BitOr(left, right);
                    case DorisParser.AMPERSAND:
                        return new Expression.BitAnd(left, right);
                    default:
                        throw new ParseException(
                                "Unsupported arithmetic binary type: " + ctx.operator.getText(), ctx);
                }
            });
        });
    }

    @Override
    public String visitDecimalLiteral(DecimalLiteralContext ctx) {
        return ctx.getText();
    }

    @Override
    public List<String> visitPrimitiveDataType(PrimitiveDataTypeContext ctx) {
        return ParserUtils.withOrigin(ctx, () -> {
            String dataType = ctx.primitiveColType().type.getText().toLowerCase(Locale.ROOT);
            List<String> l = Lists.newArrayList(dataType);
            ctx.INTEGER_VALUE().stream().map(ParseTree::getText).forEach(l::add);
            return l.stream().map(String::toUpperCase).collect(Collectors.toList());
        });
    }

    @Override
    public List<String> visitComplexDataType(ComplexDataTypeContext ctx) {
        return (List<String>) ParserUtils.withOrigin(ctx, () -> {
            switch (ctx.complex.getType()) {
                case DorisParser.ARRAY:
                    return Collections.singletonList(ctx.dataType(0).getText());
                case DorisParser.MAP:
                    return Collections.singletonList(ctx.dataType(0).getText()).add(ctx.dataType(1).getText());
                case DorisParser.STRUCT:
                    return Collections.addAll(visitComplexColTypeList(ctx.complexColTypeList()).stream().map(StructField::toString).collect(Collectors.toList()));
                default:
                    return Collections.emptyList();
            }
        });
    }

    @Override
    public List<StructField> visitComplexColTypeList(ComplexColTypeListContext ctx) {
        return ctx.complexColType().stream().map(this::visitComplexColType).collect(ImmutableList.toImmutableList());
    }

    @Override
    public StructField visitComplexColType(ComplexColTypeContext ctx) {
        String comment;
        if (ctx.commentSpec() != null) {
            comment = ctx.commentSpec().STRING_LITERAL().getText();
            comment = ParserUtils.escapeBackSlash(comment.substring(1, comment.length() - 1));
        } else {
            comment = "";
        }
        return new StructField(ctx.identifier().getText(), typedVisit(ctx.dataType()), true, comment);
    }

    @Override
    public Object visitCollate(CollateContext ctx) {
        return visit(ctx.primaryExpression());
    }

    @Override
    public Expression visitInterval(IntervalContext ctx) {
        return new Expression.Interval(getCondition(ctx.value), visitUnitIdentifier(ctx.unit));
    }

    @Override
    public String visitUnitIdentifier(UnitIdentifierContext ctx) {
        return ctx.getText();
    }

    @Override
    public Expression visitTypeConstructor(TypeConstructorContext ctx) {
        String value = ctx.STRING_LITERAL().getText();
        value = value.substring(1, value.length() - 1);
        String type = ctx.type.getText().toUpperCase();
        return new Expression.DateLiteral(value, type);
    }

    @Override
    public Expression visitDereference(DereferenceContext ctx) {
        return ParserUtils.withOrigin(ctx, () -> {
            Expression e = getCondition(ctx.base);
            if (e instanceof Expression.Unbound) {
                Expression.Unbound unboundAttribute = (Expression.Unbound) e;
                List<String> nameParts = Lists.newArrayList(unboundAttribute.getNameParts());
                nameParts.add(ctx.fieldName.getText());
                return new Expression.Unbound(nameParts);
            } else {
                // todo: base is an expression, may be not a table name.
                throw new ParseException("Unsupported dereference expression: " + ctx.getText(), ctx);
            }
        });
    }

    @Override
    public Expression visitElementAt(ElementAtContext ctx) {
        return new Expression.ElementAt(typedVisit(ctx.value), typedVisit(ctx.index));
    }

    @Override
    public Expression visitArraySlice(ArraySliceContext ctx) {
        if (ctx.end != null) {
            return new Expression.ArraySlice(typedVisit(ctx.value), typedVisit(ctx.begin), typedVisit(ctx.end));
        } else {
            return new Expression.ArraySlice(typedVisit(ctx.value), typedVisit(ctx.begin));
        }
    }

    @Override
    public Expression visitColumnReference(ColumnReferenceContext ctx) {
        // todo: handle quoted and unquoted
        return new Expression.Unbound(ImmutableList.of(ctx.getText()));
    }

    /**
     * Create a NULL literal expression.
     */
    @Override
    public Expression visitNullLiteral(NullLiteralContext ctx) {
        return new Expression.NullLiteral();
    }

    @Override
    public Expression visitBooleanLiteral(BooleanLiteralContext ctx) {
        return new Expression.BooleanLiteral(Boolean.parseBoolean(ctx.getText()));
    }

    @Override
    public Expression visitIntegerLiteral(IntegerLiteralContext ctx) {
        BigInteger bigInt = new BigInteger(ctx.getText());
        if (BigInteger.valueOf(bigInt.byteValue()).equals(bigInt)) {
            return new Expression.TinyIntLiteral(bigInt.byteValue());
        } else if (BigInteger.valueOf(bigInt.shortValue()).equals(bigInt)) {
            return new Expression.SmallIntLiteral(bigInt.shortValue());
        } else if (BigInteger.valueOf(bigInt.intValue()).equals(bigInt)) {
            return new Expression.IntegerLiteral(bigInt.intValue());
        } else if (BigInteger.valueOf(bigInt.longValue()).equals(bigInt)) {
            return new Expression.BigIntLiteral(bigInt.longValueExact());
        } else {
            return new Expression.LargeIntLiteral(bigInt);
        }
    }

    @Override
    public Expression visitStringLiteral(StringLiteralContext ctx) {
        String txt = ctx.STRING_LITERAL().getText();
        String s = txt.substring(1, txt.length() - 1);
        s = ParserUtils.escapeBackSlash(s).replace("''", "'").replace("\"\"", "\"");
        return new Expression.VarcharLiteral(s);
    }

    @Override
    public Expression visitArrayLiteral(ArrayLiteralContext ctx) {
        List<Expression> items = ctx.items.stream().<Expression>map(this::typedVisit).collect(Collectors.toList());
        return new Expression.ArrayLiteral(items);
    }

    @Override
    public Expression visitMapLiteral(MapLiteralContext ctx) {
        List<Expression> items = ctx.items.stream().<Expression>map(this::typedVisit).collect(Collectors.toList());
        if (items.size() % 2 != 0) {
            throw new ParseException("map can't be odd parameters, need even parameters", ctx);
        }
        List<Expression> keys = Lists.newArrayList();
        List<Expression> values = Lists.newArrayList();
        for (int i = 0; i < items.size(); i++) {
            if (i % 2 == 0) {
                keys.add(items.get(i));
            } else {
                values.add(items.get(i));
            }
        }
        return new Expression.MapLiteral(keys, values);
    }

    @Override
    public Expression visitStructLiteral(StructLiteralContext ctx) {
        List<Expression> fields = ctx.items.stream().<Expression>map(this::typedVisit).collect(Collectors.toList());
        return new Expression.StructLiteral(fields);
    }

    @Override
    public Expression visitParenthesizedExpression(ParenthesizedExpressionContext ctx) {
        return getCondition(ctx.expression());
    }

    @Override
    public List<ColumnDefinition> visitColumnDefs(ColumnDefsContext ctx) {
        return ctx.cols.stream().map(this::visitColumnDef).collect(Collectors.toList());
    }

    @Override
    public ColumnDefinition visitColumnDef(ColumnDefContext ctx) {
        String colName = ctx.colName.getText();
        List<String> colType = ctx.type instanceof PrimitiveDataTypeContext
                ? visitPrimitiveDataType(((PrimitiveDataTypeContext) ctx.type))
                : visitComplexDataType(((ComplexDataTypeContext) ctx.type));
        boolean isKey = ctx.KEY() != null;
        boolean isNotNull = ctx.NOT() != null;
        String aggTypeString = ctx.aggType != null ? ctx.aggType.getText() : null;
        String defaultValue = "";
        if (ctx.DEFAULT() != null) {
            if (ctx.INTEGER_VALUE() != null) {
                defaultValue = ctx.INTEGER_VALUE().getText();
            } else if (ctx.stringValue != null) {
                defaultValue = toStringValue(ctx.stringValue.getText());
            } else if (ctx.nullValue != null) {
                defaultValue = "NULL";
            } else if (ctx.CURRENT_TIMESTAMP() != null) {
                defaultValue = "CURRENT_TIMESTAMP";
            }
        }
        String aggType = "";
        if (aggTypeString != null) {
            try {
                aggType = aggTypeString.toUpperCase();
            } catch (Exception e) {
                throw new AnalysisException(String.format("Aggregate type %s is unsupported", aggTypeString),
                        e.getCause());
            }
        }
        String comment = ctx.comment != null ? ctx.comment.getText() : "";
        return new ColumnDefinition(colName, colType, isKey, aggType, !isNotNull, defaultValue, comment);
    }

    @Override
    public List<IndexDefinition> visitIndexDefs(IndexDefsContext ctx) {
        return ctx.indexes.stream().map(this::visitIndexDef).collect(Collectors.toList());
    }

    @Override
    public IndexDefinition visitIndexDef(IndexDefContext ctx) {
        String indexName = ctx.indexName.getText();
        List<String> indexCols = visitIdentifierList(ctx.cols);
        boolean isUseBitmap = ctx.USING() != null;
        String comment = ctx.comment.getText();
        return new IndexDefinition(indexName, indexCols, isUseBitmap, comment);
    }

    @Override
    public List<PartitionDefinition> visitPartitionsDef(PartitionsDefContext ctx) {
        return ctx.partitions.stream()
                .map(p -> ((PartitionDefinition) visit(p)).withProperties(visitPropertyClause(p.properties)))
                .collect(Collectors.toList());
    }

    @Override
    public PartitionDefinition visitLessThanPartitionDef(LessThanPartitionDefContext ctx) {
        String partitionName = ctx.partitionName.getText();
        if (ctx.MAXVALUE() == null) {
            List<Expression> lessThanValues = visitConstantSeq(ctx.constantSeq());
            return new PartitionDefinition.LessThanPartition(partitionName, lessThanValues);
        } else {
            return new PartitionDefinition.LessThanPartition(partitionName, ImmutableList.of(new Expression.MaxValue()));
        }
    }

    @Override
    public PartitionDefinition visitFixedPartitionDef(FixedPartitionDefContext ctx) {
        String partitionName = ctx.partitionName.getText();
        List<Expression> lowerBounds = visitConstantSeq(ctx.lower);
        List<Expression> upperBounds = visitConstantSeq(ctx.upper);
        return new PartitionDefinition.FixedRangePartition(partitionName, lowerBounds, upperBounds);
    }

    @Override
    public PartitionDefinition visitStepPartitionDef(StepPartitionDefContext ctx) {
        List<Expression> fromExpression = visitConstantSeq(ctx.from);
        List<Expression> toExpression = visitConstantSeq(ctx.to);
        return new PartitionDefinition.StepPartition(fromExpression, toExpression, Long.parseLong(ctx.unitsAmount.getText()),
                ctx.unit != null ? ctx.unit.getText() : null);
    }

    @Override
    public PartitionDefinition visitInPartitionDef(InPartitionDefContext ctx) {
        List<List<Expression>> values;
        if (ctx.constants == null) {
            values = ctx.constantSeqs.stream().map(this::visitConstantSeq)
                    .collect(Collectors.toList());
        } else {
            values = visitConstantSeq(ctx.constants).stream().map(ImmutableList::of)
                    .collect(Collectors.toList());
        }
        return new PartitionDefinition.InPartition(ctx.partitionName.getText(), values);
    }

    @Override
    public List<Expression> visitConstantSeq(ConstantSeqContext ctx) {
        return ctx.values.stream()
                .map(this::visitPartitionValueDef)
                .collect(Collectors.toList());
    }

    @Override
    public Expression visitPartitionValueDef(PartitionValueDefContext ctx) {
        if (ctx.INTEGER_VALUE() != null) {
            return Expression.Literal.of(ctx.INTEGER_VALUE().getText());
        } else if (ctx.STRING_LITERAL() != null) {
            return Expression.Literal.of(toStringValue(ctx.STRING_LITERAL().getText()));
        } else if (ctx.MAXVALUE() != null) {
            return new Expression.MaxValue();
        }
        throw new AnalysisException("Unsupported partition value: " + ctx.getText());
    }

    @Override
    public List<RollupDefinition> visitRollupDefs(RollupDefsContext ctx) {
        return ctx.rollups.stream().map(this::visitRollupDef).collect(Collectors.toList());
    }

    @Override
    public RollupDefinition visitRollupDef(RollupDefContext ctx) {
        String rollupName = ctx.rollupName.getText();
        List<String> rollupCols = visitIdentifierList(ctx.rollupCols);
        List<String> dupKeys = ctx.dupKeys == null ? ImmutableList.of() : visitIdentifierList(ctx.dupKeys);
        Map<String, String> properties = ctx.properties == null ? Maps.newHashMap()
                : visitPropertyClause(ctx.properties);
        return new RollupDefinition(rollupName, rollupCols, dupKeys, properties);
    }

    @Override
    public Expression visitSubqueryExpression(SubqueryExpressionContext subQueryExprCtx) {
        return ParserUtils.withOrigin(subQueryExprCtx, () -> new Expression.ScalarSubQuery(typedVisit(subQueryExprCtx.query())));
    }

    @Override
    public Expression visitExist(ExistContext context) {
        return ParserUtils.withOrigin(context, () -> new Expression.Exists(typedVisit(context.query()), false));
    }

    @Override
    public Expression visitIsnull(IsnullContext context) {
        return ParserUtils.withOrigin(context, () -> new Expression.IsNull(typedVisit(context.valueExpression())));
    }

    @Override
    public Expression visitIs_not_null_pred(Is_not_null_predContext context) {
        return ParserUtils.withOrigin(context, () -> new Expression.Not(new Expression.IsNull(typedVisit(context.valueExpression()))));
    }










    private Expression getCondition(ParserRuleContext ctx) {
        return typedVisit(ctx);
    }

    private <T> List<T> visit(List<? extends ParserRuleContext> contexts, Class<T> clazz) {
        return contexts.stream()
                .filter(Objects::nonNull)
                .map(this::visit)
                .map(clazz::cast)
                .collect(ImmutableList.toImmutableList());
    }

    private Info info(ParserRuleContext tree) {
        return (Info) tree.accept(this);
    }

    /* ********************************************************************************************
     * Info parsing
     * ******************************************************************************************** */
    private Info withRelations(Info info, List<RelationContext> relations) {
        Info left = info;
        for (RelationContext relation : relations) {
            // build left deep join tree
            Info right = visitRelation(relation);
            left = (left == null) ? right :
                    new JoinInfo("CROSS_JOIN", "", "", left, right);
            left = withJoinRelations(left, relation);
            // TODO: pivot and lateral view
        }
        return left;
    }

    private Info withSelectHint(Info info, SelectHintContext hintContext) {
        if (hintContext == null) {
            return info;
        }
        Map<String, SelectHint> hints = Maps.newLinkedHashMap();
        for (HintStatementContext hintStatement : hintContext.hintStatements) {
            String hintName = hintStatement.hintName.getText().toLowerCase(Locale.ROOT);
            switch (hintName) {
                case "set_var":
                    Map<String, Optional<String>> parameters = Maps.newLinkedHashMap();
                    for (HintAssignmentContext kv : hintStatement.parameters) {
                        String parameterName = visitIdentifierOrText(kv.key);
                        Optional<String> value = Optional.empty();
                        if (kv.constantValue != null) {
                            value = Optional.ofNullable(kv.constantValue.getText());
                        } else if (kv.identifierValue != null) {
                            // maybe we should throw exception when the identifierValue is quoted identifier
                            value = Optional.ofNullable(kv.identifierValue.getText());
                        }
                        parameters.put(parameterName, value);
                    }
                    hints.put(hintName, new SelectHint(hintName, null, parameters));
                    break;
                case "leading":
                    List<String> leadingParameters = new ArrayList<String>();
                    for (HintAssignmentContext kv : hintStatement.parameters) {
                        String parameterName = visitIdentifierOrText(kv.key);
                        leadingParameters.add(parameterName);
                    }
                    hints.put(hintName, new SelectHint(hintName, leadingParameters, null));
                    break;
                default:
                    break;
            }
        }
        return new SelectHintInfo(hints, info);
    }

    /**
     * Add a regular (SELECT) query specification to a logical plan. The query specification
     * is the core of the logical plan, this is where sourcing (FROM clause), projection (SELECT),
     * aggregation (GROUP BY ... HAVING ...) and filtering (WHERE) takes place.
     *
     * <p>Note that query hints are ignored (both by the parser and the builder).
     */
    private Info withSelectQuerySpecification(
            ParserRuleContext ctx,
            Info inputRelation,
            SelectClauseContext selectClause,
            Optional<WhereClauseContext> whereClause,
            Optional<AggClauseContext> aggClause,
            Optional<HavingClauseContext> havingClause) {
        return ParserUtils.withOrigin(ctx, () -> {
            // from -> where -> group by -> having -> select
            Info filter = withFilter(inputRelation, whereClause);
            SelectColumnClauseContext selectColumnCtx = selectClause.selectColumnClause();
            Info aggregate = withAggregate(filter, selectColumnCtx, aggClause);
            boolean isDistinct = (selectClause.DISTINCT() != null);
            if (havingClause.isPresent()) {
                Info project;
                if (selectColumnCtx.EXCEPT() != null) {
                    List<String> expressions = getNamedExpressions(selectColumnCtx.namedExpressionSeq());
                    project = new SelectInfo(ImmutableList.of(), expressions, isDistinct, inputRelation, aggregate);
                } else {
                    List<String> projects = getNamedExpressions(selectColumnCtx.namedExpressionSeq());
                    project = new SelectInfo(projects, ImmutableList.of(), isDistinct, inputRelation, aggregate);
                }
                return new HavingInfo(havingClause.get().booleanExpression().getText(), project);
            } else {
                Info having = withHaving(aggregate, havingClause);
                return withProjection(having, selectColumnCtx, aggClause, isDistinct, inputRelation);
            }
        });
    }

    /**
     * Create an aliased table reference. This is typically used in FROM clauses.
     */
    private Info withTableAlias(Info info, TableAliasContext ctx) {
        if (ctx.strictIdentifier() == null) {
            return info;
        }
        return ParserUtils.withOrigin(ctx.strictIdentifier(), () -> {
            String alias = ctx.strictIdentifier().getText();
            if (null != ctx.identifierList()) {
                throw new ParseException("Do not implemented", ctx);
                // TODO: multi-colName
            }
            return new SubQueryAliasInfo(alias, info);
        });
    }

    /**
     * process lateral view
     */
    private Info withGenerate(Info info, LateralViewContext ctx) {
        if (ctx.LATERAL() == null) {
            return info;
        }
        String generateName = ctx.tableName.getText();
        String columnName = ctx.columnName.getText();
        String functionName = ctx.functionName.getText();
        List<String> arguments = ctx.expression().stream()
                .<String>map(this::typedVisit)
                .collect(ImmutableList.toImmutableList());
        return new GenerateInfo(generateName, columnName, functionName, arguments, info);
    }

    private Info withProjection(Info input, SelectColumnClauseContext selectCtx,
                                       Optional<AggClauseContext> aggCtx, boolean isDistinct, Info inputRelation) {
        return ParserUtils.withOrigin(selectCtx, () -> {
            if (aggCtx.isPresent()) {
                return input;
            } else {
                if (selectCtx.EXCEPT() != null) {
                    List<String> expressions = getNamedExpressions(selectCtx.namedExpressionSeq());
                    return new SelectInfo(ImmutableList.of(), expressions, isDistinct, inputRelation, input);
                } else {
                    List<String> projects = getNamedExpressions(selectCtx.namedExpressionSeq());
                    return new SelectInfo(projects, Collections.emptyList(), isDistinct, inputRelation, input);
                }
            }
        });
    }

    private Info withFilter(Info input, Optional<WhereClauseContext> whereCtx) {
        if (whereCtx.isPresent()) {
            return input.optionalMap(whereCtx, () ->
                    new FilterInfo(getCondition(whereCtx.get().booleanExpression())));
        }
        return null;
    }

    private Info withAggregate(Info input, SelectColumnClauseContext selectCtx,
                                      Optional<AggClauseContext> aggCtx) {
        if (input != null) {
            return input.optionalMap(aggCtx, () -> {
                GroupingElementContext groupingElementContext = aggCtx.get().groupingElement();
                List<String> namedExpressions = getNamedExpressions(selectCtx.namedExpressionSeq());
                return new AggregateInfo(groupingElementContext.getText(), namedExpressions, input);
            });
        }
        return null;
    }

    private Info withHaving(Info input, Optional<HavingClauseContext> havingCtx) {
        if (input != null) {
            return input.optionalMap(havingCtx, () ->
                    new HavingInfo(havingCtx.get().booleanExpression().getText(), input));
        }
        return null;
    }

    private Info withJoinRelations(Info input, RelationContext ctx) {
        Info last = input;
        for (JoinRelationContext join : ctx.joinRelation()) {
            String joinType;
            if (join.joinType().CROSS() != null) {
                joinType = "CROSS_JOIN";
            } else if (join.joinType().FULL() != null) {
                joinType = "FULL_JOIN";
            } else if (join.joinType().SEMI() != null) {
                if (join.joinType().LEFT() != null) {
                    joinType = "LEFT_SEMI";
                } else {
                    joinType = "RIGHT_SEMI";
                }
            } else if (join.joinType().ANTI() != null) {
                if (join.joinType().LEFT() != null) {
                    joinType = "LEFT_ANTI";
                } else {
                    joinType = "RIGHT_ANTI";
                }
            } else if (join.joinType().LEFT() != null) {
                joinType = "LEFT_OUTER_JOIN";
            } else if (join.joinType().RIGHT() != null) {
                joinType = "RIGHT_OUTER_JOIN";
            } else if (join.joinType().INNER() != null) {
                joinType = "INNER_JOIN";
            } else if (join.joinCriteria() != null) {
                joinType = "INNER_JOIN";
            } else {
                joinType = "CROSS_JOIN";
            }
            String joinHint = join.joinHint() == null ? "" : join.joinHint().getText();
            // TODO: natural join, lateral join, union join
            JoinCriteriaContext joinCriteria = join.joinCriteria();
            String condition = "";
            List<String> ids = null;
            if (joinCriteria != null) {
                if (join.joinType().CROSS() != null) {
                    throw new ParseException("Cross join can't be used with ON clause", joinCriteria);
                }
                if (joinCriteria.booleanExpression() != null) {
                    condition = joinCriteria.booleanExpression().getText();
                } else if (joinCriteria.USING() != null) {
                    ids = visitIdentifierList(joinCriteria.identifierList());
                }
            }
            if (ids == null) {
                last = new JoinInfo(joinType, joinHint, condition, last, info(join.relationPrimary()));
            } else {
                last = new UsingJoinInfo(joinType, joinHint, condition, last, info(join.relationPrimary()), ids);
            }
        }
        return last;
    }

    private UnboundOneRowRelationInfo withOneRowRelation(SelectColumnClauseContext selectCtx) {
        return ParserUtils.withOrigin(selectCtx, () -> {
            // fromClause does not exists.
            List<String> projects = getNamedExpressions(selectCtx.namedExpressionSeq());
            return new UnboundOneRowRelationInfo(projects);
        });
    }

    private Info withExplain(Info info, ExplainContext ctx) {
        if (ctx == null) {
            return info;
        }
        return ParserUtils.withOrigin(ctx, () -> {
            ExplainLevel explainLevel = ExplainLevel.NORMAL;

            if (ctx.planType() != null) {
                if (ctx.level == null || !ctx.level.getText().equalsIgnoreCase("plan")) {
                    throw new ParseException("Only explain plan can use plan type: " + ctx.planType().getText(), ctx);
                }
            }

            if (ctx.level != null) {
                if (!ctx.level.getText().equalsIgnoreCase("plan")) {
                    explainLevel = ExplainLevel.valueOf(ctx.level.getText().toUpperCase(Locale.ROOT));
                } else {
                    explainLevel = parseExplainPlanType(ctx.planType());
                }
            }
            return new ExplainInfo(explainLevel, info);
        });
    }

    private Info withOutFile(Info info, OutFileClauseContext ctx) {
        if (ctx == null) {
            return info;
        }
        String filePath = "file://";
        String format = "csv";
        if (ctx.filePath != null) {
            filePath = ctx.filePath.getText();
        }
        if (ctx.format != null) {
            format = ctx.format.getText();
        }

        Map<String, String> properties = ImmutableMap.of();
        if (ctx.propertyClause() != null) {
            properties = visitPropertyClause(ctx.propertyClause());
        }
        return new OutFileInfo(filePath, format, properties, info);
    }

    /**
     * process CTE and store the results in a logical plan node LogicalCTE
     */
    private Info withCte(Info info, CteContext ctx) {
        if (ctx == null) {
            return info;
        }
        return new CTEInfo((List) visit(ctx.aliasQuery(), SubQueryAlias.class), info);
    }

    private Info withQueryOrganization(Info info, QueryOrganizationContext ctx) {
        if (ctx == null) {
            return info;
        }
        Optional<SortClauseContext> sortClauseContext = Optional.ofNullable(ctx.sortClause());
        Optional<LimitClauseContext> limitClauseContext = Optional.ofNullable(ctx.limitClause());
        Info sort = withSort(info, sortClauseContext);
        return withLimit(sort, limitClauseContext);
    }
    private Info withSort(Info info, Optional<SortClauseContext> sortCtx) {
        return info.optionalMap(sortCtx, () -> {
            List<OrderKey> orderKeys = sortCtx.get().sortItem()
                    .stream()
                    .map(item -> new OrderKey(item.expression().getText(), Objects.isNull(item.DESC()), Objects.nonNull(item.FIRST())))
                    .collect(Collectors.toList());
            if (info instanceof SelectInfo) {
                SelectInfo selectInfo = (SelectInfo) info;
                selectInfo.setSortInfo(new SortInfo(orderKeys));
                return selectInfo;
            } else {
                return null;
            }
        });
    }

    private Info withLimit(Info info, Optional<LimitClauseContext> limitCtx) {
        return info.optionalMap(limitCtx, () -> {
            long limit = Long.parseLong(limitCtx.get().limit.getText());
            if (limit < 0) {
                throw new ParseException("Limit requires non-negative number", limitCtx.get());
            }
            long offset = 0;
            Token offsetToken = limitCtx.get().offset;
            if (offsetToken != null) {
                offset = Long.parseLong(offsetToken.getText());
            }
            if (info instanceof SelectInfo) {
                SelectInfo selectInfo = (SelectInfo) info;
                selectInfo.setLimitInfo(new LimitInfo(limit, offset));
                return selectInfo;
            } else {
                return null;
            }
        });
    }

    private List<String> getNamedExpressions(NamedExpressionSeqContext namedCtx) {
        return ParserUtils.withOrigin(namedCtx, () -> namedCtx.namedExpression()
                .stream()
                .map(NamedExpressionContext::expression)
                .map(ExpressionContext::getText)
                .collect(Collectors.toList()));
    }

    private String getQualifier(SetOperationContext ctx) {
        if ((ctx.setQuantifier() != null) && (ctx.setQuantifier().DISTINCT() != null)) {
            return ctx.setQuantifier().DISTINCT().getText().toUpperCase();
        }
        return "ALL";
    }

    private Info logicalPlanCombiner(Info left, Info right, String qualifier) {
        return new UnionInfo(qualifier, ImmutableList.of(left, right));
    }

    private Info reduceToLogicalPlanTree(int low, int high,
                                                List<Info> logicalPlans, String qualifier) {
        switch (high - low) {
            case 0:
                return logicalPlans.get(low);
            case 1:
                return logicalPlanCombiner(logicalPlans.get(low), logicalPlans.get(high), qualifier);
            default:
                int mid = low + (high - low) / 2;
                return logicalPlanCombiner(
                        reduceToLogicalPlanTree(low, mid, logicalPlans, qualifier),
                        reduceToLogicalPlanTree(mid + 1, high, logicalPlans, qualifier),
                        qualifier
                );
        }
    }

    private String parsePropertyKey(PropertyKeyContext item) {
        if (item.constant() != null) {
            return parseConstant(item.constant());
        }
        return item.getText();
    }

    private String parsePropertyValue(PropertyValueContext item) {
        if (item.constant() != null) {
            return parseConstant(item.constant());
        }
        return item.getText();
    }

    private String parseConstant(ConstantContext context) {
        Object constant = visit(context);
//        if (constant instanceof Literal && ((Literal) constant).isStringLikeLiteral()) {
//            return ((Literal) constant).getStringValue();
//        }
        return context.getText();
    }

    private ExplainLevel parseExplainPlanType(PlanTypeContext planTypeContext) {
        if (planTypeContext == null || planTypeContext.ALL() != null) {
            return ExplainLevel.ALL_PLAN;
        }
        if (planTypeContext.PHYSICAL() != null || planTypeContext.OPTIMIZED() != null) {
            return ExplainLevel.OPTIMIZED_PLAN;
        }
        if (planTypeContext.REWRITTEN() != null || planTypeContext.LOGICAL() != null) {
            return ExplainLevel.REWRITTEN_PLAN;
        }
        if (planTypeContext.ANALYZED() != null) {
            return ExplainLevel.ANALYZED_PLAN;
        }
        if (planTypeContext.PARSED() != null) {
            return ExplainLevel.PARSED_PLAN;
        }
        if (planTypeContext.SHAPE() != null) {
            return ExplainLevel.SHAPE_PLAN;
        }
        if (planTypeContext.MEMO() != null) {
            return ExplainLevel.MEMO_PLAN;
        }
        return ExplainLevel.ALL_PLAN;
    }

    /**
     * deal with optional expressions
     */
    private <T, C> Optional<C> optionalVisit(T ctx, Supplier<C> func) {
        return Optional.ofNullable(ctx).map(a -> func.get());
    }





    /* ********************************************************************************************
     * Condition parsing
     * ******************************************************************************************** */
    /**
     * match predicate type and generate different predicates.
     *
     * @param ctx PredicateContext
     * @param valueExpression valueExpression
     * @return Expression
     */
    private Expression withPredicate(Expression valueExpression, PredicateContext ctx) {
        return ParserUtils.withOrigin(ctx, () -> {
            Expression outExpression;
            switch (ctx.kind.getType()) {
                case DorisParser.BETWEEN:
                    outExpression = new Expression.And(
                            new Expression.GreaterThanEqual(valueExpression, getCondition(ctx.lower)),
                            new Expression.LessThanEqual(valueExpression, getCondition(ctx.upper))
                    );
                    break;
                case DorisParser.LIKE:
                    outExpression = new Expression.Like(
                            valueExpression,
                            getCondition(ctx.pattern)
                    );
                    break;
                case DorisParser.RLIKE:
                case DorisParser.REGEXP:
                    outExpression = new Expression.Regexp(
                            valueExpression,
                            getCondition(ctx.pattern)
                    );
                    break;
                case DorisParser.IN:
                    if (ctx.query() == null) {
                        outExpression = new Expression.InPredicate(
                                valueExpression,
                                withInList(ctx)
                        );
                    } else {
                        outExpression = new Expression.InSubQuery(
                                valueExpression,
                                new Expression.ListQuery(typedVisit(ctx.query())),
                                ctx.NOT() != null
                        );
                    }
                    break;
                case DorisParser.NULL:
                    outExpression = new Expression.IsNull(valueExpression);
                    break;
                case DorisParser.MATCH:
                case DorisParser.MATCH_ANY:
                    outExpression = new Expression.MatchAny(
                            valueExpression,
                            getCondition(ctx.pattern)
                    );
                    break;
                case DorisParser.MATCH_ALL:
                    outExpression = new Expression.MatchAll(
                            valueExpression,
                            getCondition(ctx.pattern)
                    );
                    break;
                case DorisParser.MATCH_PHRASE:
                    outExpression = new Expression.MatchPhrase(
                            valueExpression,
                            getCondition(ctx.pattern)
                    );
                    break;
                default:
                    throw new ParseException("Unsupported predicate type: " + ctx.kind.getText(), ctx);
            }
            return ctx.NOT() != null ? new Expression.Not(outExpression) : outExpression;
        });
    }

    public List<Expression> withInList(PredicateContext ctx) {
        return ctx.expression().stream().map(this::getCondition).collect(ImmutableList.toImmutableList());
    }

    private Expression expressionCombiner(Expression left, Expression right, LogicalBinaryContext ctx) {
        switch (ctx.operator.getType()) {
            case DorisParser.LOGICALAND:
            case DorisParser.AND:
                return new Expression.And(left, right);
            case DorisParser.OR:
                return new Expression.Or(left, right);
            default:
                throw new ParseException("Unsupported logical binary type: " + ctx.operator.getText(), ctx);
        }
    }

    private Expression reduceToExpressionTree(int low, int high,
                                              List<Expression> expressions, LogicalBinaryContext ctx) {
        switch (high - low) {
            case 0:
                return expressions.get(low);
            case 1:
                return expressionCombiner(expressions.get(low), expressions.get(high), ctx);
            default:
                int mid = low + (high - low) / 2;
                return expressionCombiner(
                        reduceToExpressionTree(low, mid, expressions, ctx),
                        reduceToExpressionTree(mid + 1, high, expressions, ctx),
                        ctx
                );
        }
    }

    private String toStringValue(String literal) {
        return literal.substring(1, literal.length() - 1);
    }
}
