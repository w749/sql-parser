package com.wx.parser.doris;

import com.google.common.collect.ImmutableList;
import lombok.*;
import com.wx.parser.info.Info;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class Expression {
    @Getter
    @ToString
    @AllArgsConstructor
    public static abstract class ComparisonCondition extends Expression {
        private List<Expression> children;
        private String symbol;
    }

    /**
     * binary arithmetic operator. Such as +, -, *, /.
     */
    @Getter
    @ToString
    @AllArgsConstructor
    public static abstract class BinaryArithmetic extends Expression {
        private List<Expression> children;
        private String symbol;
    }

    @Getter
    @ToString
    @AllArgsConstructor
    public static abstract class Match extends Expression {
        private List<Expression> children;
        private String symbol;
    }

    @Getter
    @ToString
    @AllArgsConstructor
    public static abstract class SubQuery extends Expression {
        private final Info info;
    }

    @Getter
    @ToString
    @AllArgsConstructor
    public static abstract class Function extends Expression {
        private final String name;
        private final List<Expression> children;
    }

    /**
     * All data type literal expression in Nereids.
     * TODO: Increase the implementation of sub expression. such as Integer.
     */
    @Getter
    @ToString
    @AllArgsConstructor
    public static abstract class Literal extends Expression {
        private final String dataType;
        /**
         * Get literal according to value type
         */
        public static Literal of(Object value) {
            if (value == null) {
                return new NullLiteral();
            } else if (value instanceof Byte) {
                return new TinyIntLiteral((Byte) value);
            } else if (value instanceof Short) {
                return new SmallIntLiteral((Short) value);
            } else if (value instanceof Integer) {
                return new IntegerLiteral((Integer) value);
            } else if (value instanceof Long) {
                return new BigIntLiteral((Long) value);
            } else if (value instanceof BigInteger) {
                return new LargeIntLiteral((BigInteger) value);
            } else if (value instanceof Float) {
                return new FloatLiteral((Float) value);
            } else if (value instanceof Double) {
                return new DoubleLiteral((Double) value);
            } else if (value instanceof BigDecimal) {
                return new DecimalLiteral((BigDecimal) value);
            } else if (value instanceof Boolean) {
                return BooleanLiteral.of((Boolean) value);
            } else if (value instanceof String) {
                return new StringLiteral((String) value);
            } else {
                throw new RuntimeException();
            }
        }
    }





    @Getter
    @ToString
    @AllArgsConstructor
    public static class And extends Expression {
        private final Expression left;
        private final Expression right;
    }

    @Getter
    @ToString
    @AllArgsConstructor

    public static class Or extends Expression {
        private final Expression left;
        private final Expression right;
    }

    @Getter
    @ToString
    @AllArgsConstructor
    public static class Not extends Expression {
        private final Expression expression;
    }

    @Getter
    @ToString
    @AllArgsConstructor
    public static class IsNull extends Expression {
        private final Expression expression;
    }

    @Getter
    @ToString
    @AllArgsConstructor
    public static class Lambda extends Expression {
        private final List<String> args;
        private final Expression body;
    }

    @Getter
    @ToString
    @AllArgsConstructor
    @RequiredArgsConstructor
    public static class Like extends Expression {
        private String name = "LIKE";
        private final Expression left;
        private final Expression right;
    }

    @Getter
    @ToString
    @AllArgsConstructor
    @RequiredArgsConstructor
    public static class Regexp extends Expression {
        private String name = "REGEXP";
        private final Expression left;
        private final Expression right;
    }

    @Getter
    @ToString
    @AllArgsConstructor
    public static class InPredicate extends Expression {
        private final Expression compareExpr;
        private final List<Expression> options;
    }

    @Getter
    @ToString
    @AllArgsConstructor
    public static class InSubQuery extends Expression {
        private final Expression compareExpr;
        private final ListQuery listQuery;
        private final boolean isNot;
    }

    @Getter
    @ToString
    @AllArgsConstructor
    public static class TimestampArithmetic extends Expression {
        private final String operator;
        private final List<Expression> children;
        private final Interval.TimeUnit timeUnit;
        private final boolean intervalFirst;
    }

    @Getter
    @ToString
    @AllArgsConstructor
    public static class Interval extends Expression {
        private final Expression value;
        private final TimeUnit timeUnit;

        public Interval(Expression value, String desc) {
            this.value = value;
            this.timeUnit = TimeUnit.valueOf(desc.toUpperCase());
        }

        /**
         * Supported time unit.
         */
        public enum TimeUnit {
            YEAR("YEAR", false),
            MONTH("MONTH", false),
            WEEK("WEEK", false),
            DAY("DAY", false),
            HOUR("HOUR", true),
            MINUTE("MINUTE", true),
            SECOND("SECOND", true);

            private final String description;

            private final boolean isDateTimeUnit;

            TimeUnit(String description, boolean isDateTimeUnit) {
                this.description = description;
                this.isDateTimeUnit = isDateTimeUnit;
            }

            public boolean isDateTimeUnit() {
                return isDateTimeUnit;
            }

            @Override
            public String toString() {
                return description;
            }
        }
    }

    @Getter
    @ToString(callSuper = true)
    public static class ListQuery extends SubQuery {
        public ListQuery(Info info) {
            super(info);
        }
    }

    @Getter
    @ToString(callSuper = true)
    public static class Exists extends SubQuery {
        private final boolean isNot;
        public Exists(Info info, boolean isNot) {
            super(info);
            this.isNot = isNot;
        }
    }

    /**
     * A subquery that will return only one row and one column.
     */
    @Getter
    @ToString(callSuper = true)
    public static class ScalarSubQuery extends SubQuery {
        public ScalarSubQuery(Info info) {
            super(info);
        }
    }

    /**
     * Equal to expression: a = b.
     */
    @Getter
    @ToString(callSuper = true)
    public static class EqualTo extends ComparisonCondition {
        public EqualTo(Expression left, Expression right) {
            super(ImmutableList.of(left, right), "=");
        }
    }

    /**
     * Less than to expression: a < b.
     */
    @Getter
    @ToString(callSuper = true)
    public static class LessThan extends ComparisonCondition {
        public LessThan(Expression left, Expression right) {
            super(ImmutableList.of(left, right), "<");
        }
    }

    /**
     * Greater than to expression: a > b.
     */
    @Getter
    @ToString(callSuper = true)
    public static class GreaterThan extends ComparisonCondition {
        public GreaterThan(Expression left, Expression right) {
            super(ImmutableList.of(left, right), ">");
        }
    }

    /**
     * Greater than and equal expression: a >= b.
     */
    @Getter
    @ToString(callSuper = true)
    public static class GreaterThanEqual extends ComparisonCondition {
        public GreaterThanEqual(Expression left, Expression right) {
            super(ImmutableList.of(left, right), ">=");
        }
    }

    /**
     * Less than and equal expression: a <= b.
     */
    @Getter
    @ToString(callSuper = true)
    public static class LessThanEqual extends ComparisonCondition {
        public LessThanEqual(Expression left, Expression right) {
            super(ImmutableList.of(left, right), "<=");
        }
    }

    /**
     * Null safe equal expression: a <=> b.
     * Unlike normal equal to expression, null <=> null is true.
     */
    @Getter
    @ToString(callSuper = true)
    public static class NullSafeEqual extends ComparisonCondition {
        public NullSafeEqual(Expression left, Expression right) {
            super(ImmutableList.of(left, right), "<=>");
        }
    }

    /**
     * like expression: a MATCH_ANY 'hello'.
     */
    @Getter
    @ToString(callSuper = true)
    public static class MatchAny extends Match {
        public MatchAny(Expression left, Expression right) {
            super(ImmutableList.of(left, right), "MATCH_ANY");
        }
    }

    /**
     * like expression: a MATCH_ALL 'hello'.
     */
    @Getter
    @ToString(callSuper = true)
    public static class MatchAll extends Match {
        public MatchAll(Expression left, Expression right) {
            super(ImmutableList.of(left, right), "MATCH_ALL");
        }
    }

    /**
     * like expression: a MATCH_PHRASE 'hello'.
     */
    @Getter
    @ToString(callSuper = true)
    public static class MatchPhrase extends Match {
        public MatchPhrase(Expression left, Expression right) {
            super(ImmutableList.of(left, right), "MATCH_PHRASE");
        }
    }

    /**
     * Represents Integer literal
     */
    @ToString(callSuper = true)
    public static class IntegerLiteral extends Literal {
        private final int value;
        public IntegerLiteral(int value) {
            super("INTEGER");
            this.value = value;
        }
    }

    /**
     * tiny int type literal
     */
    @Getter
    @ToString(callSuper = true)
    public static class TinyIntLiteral extends Literal {
        private final byte value;
        public TinyIntLiteral(byte value) {
            super("TINYINT");
            this.value = value;
        }
    }

    /**
     * small int type literal
     */
    @Getter
    @ToString(callSuper = true)
    public static class SmallIntLiteral extends Literal {
        private final int value;
        public SmallIntLiteral(int value) {
            super("SMALLINT");
            this.value = value;
        }
    }

    /**
     * large int type literal
     */
    @Getter
    @ToString(callSuper = true)
    public static class LargeIntLiteral extends Literal {
        private final BigInteger value;
        public LargeIntLiteral(BigInteger value) {
            super("LARGEINT");
            this.value = value;
        }
    }

    /**
     * Represents Bigint literal
     */
    @Getter
    @ToString(callSuper = true)
    public static class BigIntLiteral extends Literal {
        private final long value;
        public BigIntLiteral(long value) {
            super("BIGINT");
            this.value = value;
        }
    }

    /**
     * float type literal
     */
    @Getter
    @ToString(callSuper = true)
    public static class FloatLiteral extends Literal {
        private final float value;
        public FloatLiteral(float value) {
            super("FLOAT");
            this.value = value;
        }
    }

    /**
     * Double literal
     */
    @Getter
    @ToString(callSuper = true)
    public static class DoubleLiteral extends Literal {
        private final double value;
        public DoubleLiteral(double value) {
            super("DOUBLE");
            this.value = value;
        }
    }

    /**
     * decimal type literal
     */
    @Getter
    @ToString(callSuper = true)
    public static class DecimalLiteral extends Literal {
        private final BigDecimal value;
        public DecimalLiteral(BigDecimal value) {
            super("DECIMAL");
            this.value = value;
        }
    }

    /**
     * Represents Boolean literal
     */
    @Getter
    @ToString(callSuper = true)
    public static class BooleanLiteral extends Literal {
        private final boolean value;
        public BooleanLiteral(boolean value) {
            super("BOOLEAN");
            this.value = value;
        }
    }

    /**
     * Date literal.
     */
    @Getter
    @ToString(callSuper = true)
    public static class DateLiteral extends Literal {
        private final String value;
        public DateLiteral(String value, String dataType) {
            super(dataType);
            this.value = value;
        }
    }

    /**
     * NULL literal.
     */
    @Getter
    @ToString(callSuper = true)
    public static class NullLiteral extends Literal {
        public NullLiteral() {
            super("NULL");
        }
    }

    /**
     * Varchar literal.
     */
    @Getter
    @ToString(callSuper = true)
    public static class VarcharLiteral extends Literal {
        private final String value;
        public VarcharLiteral(String value) {
            super("VARCHAR");
            this.value = value;
        }
    }

    /**
     * Represents String literal
     */
    @Getter
    @ToString(callSuper = true)
    public static class StringLiteral extends Literal {
        private final String value;
        public StringLiteral(String value) {
            super("STRING");
            this.value = value;
        }
    }

    /**
     * Represents String literal
     */
    @Getter
    @ToString(callSuper = true)
    public static class MaxValue extends Literal {
        public MaxValue() {
            super("MAX_VALUE");
        }
    }

    @Getter
    @ToString(callSuper = true)
    public static class ArrayLiteral extends Literal {
        private final List<Expression> items;
        public ArrayLiteral(List<Expression> items) {
            super("ARRAY");
            this.items = items;
        }
    }

    @Getter
    @ToString(callSuper = true)
    public static class StructLiteral extends Literal {
        private final List<Expression> items;
        public StructLiteral(List<Expression> items) {
            super("STRUCT");
            this.items = items;
        }
    }

    @Getter
    @ToString(callSuper = true)
    public static class MapLiteral extends Literal {
        private final List<Expression> keys;
        private final List<Expression> values;
        public MapLiteral(List<Expression> keys, List<Expression> values) {
            super("MAP");
            this.keys = keys;
            this.values = values;
        }
    }






    /**
     * Add Expression.
     */
    @Getter
    @ToString(callSuper = true)
    public static class Add extends BinaryArithmetic {
        public Add(Expression left, Expression right) {
            super(ImmutableList.of(left, right), "+");
        }
    }

    /**
     * Subtract Expression. BinaryExpression.
     */
    @Getter
    @ToString(callSuper = true)
    public static class Subtract extends BinaryArithmetic {
        public Subtract(Expression left, Expression right) {
            super(ImmutableList.of(left, right), "-");
        }
    }

    /**
     * Multiply Expression.
     */
    @Getter
    @ToString(callSuper = true)
    public static class Multiply extends BinaryArithmetic {
        public Multiply(Expression left, Expression right) {
            super(ImmutableList.of(left, right), "*");
        }
    }

    /**
     * Divide Expression.
     */
    @Getter
    @ToString(callSuper = true)
    public static class Divide extends BinaryArithmetic {
        public Divide(Expression left, Expression right) {
            super(ImmutableList.of(left, right), "/");
        }
    }

    /**
     * Mod Expression.
     */
    @Getter
    @ToString(callSuper = true)
    public static class Mod extends BinaryArithmetic {
        public Mod(Expression left, Expression right) {
            super(ImmutableList.of(left, right), "%");
        }
    }

    /**
     * A DIV B
     */
    @Getter
    @ToString(callSuper = true)
    public static class IntegralDivide extends BinaryArithmetic {
        public IntegralDivide(Expression left, Expression right) {
            super(ImmutableList.of(left, right), "DIV");
        }
    }

    /**
     * bit xor
     */
    @Getter
    @ToString(callSuper = true)
    public static class BitAnd extends BinaryArithmetic {
        public BitAnd(Expression left, Expression right) {
            super(ImmutableList.of(left, right), "&");
        }
    }

    /**
     * bit xor
     */
    @Getter
    @ToString(callSuper = true)
    public static class BitOr extends BinaryArithmetic {
        public BitOr(Expression left, Expression right) {
            super(ImmutableList.of(left, right), "|");
        }
    }

    /**
     * bit xor
     */
    @Getter
    @ToString(callSuper = true)
    public static class BitXor extends BinaryArithmetic {
        public BitXor(Expression left, Expression right) {
            super(ImmutableList.of(left, right), "^");
        }
    }

    /**
     * bit not
     */
    @Getter
    @ToString(callSuper = true)
    public static class BitNot extends BinaryArithmetic {
        public BitNot(Expression child) {
            super(ImmutableList.of(child), "~");
        }
    }








    @Getter
    @ToString(callSuper = true)
    public static class ElementAt extends Function {
        public ElementAt(Expression arg0, Expression arg1) {
            super("element_at", ImmutableList.of(arg0, arg1));
        }
    }

    @Getter
    @ToString(callSuper = true)
    public static class ArraySlice extends Function {
        public ArraySlice(Expression arg0, Expression arg1) {
            super("array_slice", ImmutableList.of(arg0, arg1));
        }
        public ArraySlice(Expression arg0, Expression arg1, Expression arg2) {
            super("array_slice", ImmutableList.of(arg0, arg1, arg2));
        }
    }



    @Getter
    @ToString
    @AllArgsConstructor
    public static class Unbound extends Expression {
        private final List<String> nameParts;
    }
}
