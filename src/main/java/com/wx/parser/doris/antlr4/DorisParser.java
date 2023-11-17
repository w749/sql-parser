// Generated from com\wx\parser\doris\antlr4\DorisParser.g4 by ANTLR 4.7
package com.wx.parser.doris.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DorisParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, LEFT_PAREN=2, RIGHT_PAREN=3, COMMA=4, DOT=5, LEFT_BRACKET=6, 
		RIGHT_BRACKET=7, LEFT_BRACE=8, RIGHT_BRACE=9, ACCOUNT_LOCK=10, ACCOUNT_UNLOCK=11, 
		ADD=12, ADDDATE=13, ADMIN=14, AFTER=15, AGG_STATE=16, AGGREGATE=17, ALIAS=18, 
		ALL=19, ALTER=20, ANALYZE=21, ANALYZED=22, AND=23, ANTI=24, APPEND=25, 
		ARRAY=26, AS=27, ASC=28, AT=29, AUTHORS=30, AUTO=31, AUTO_INCREMENT=32, 
		BACKEND=33, BACKENDS=34, BACKUP=35, BEGIN=36, BETWEEN=37, BIGINT=38, BIN=39, 
		BINLOG=40, BITAND=41, BITMAP=42, BITMAP_UNION=43, BITOR=44, BITXOR=45, 
		BLOB=46, BOOLEAN=47, BRIEF=48, BROKER=49, BUCKETS=50, BUILD=51, BUILTIN=52, 
		BY=53, CACHED=54, CANCEL=55, CASE=56, CAST=57, CATALOG=58, CATALOGS=59, 
		CHAIN=60, CHAR=61, CHARSET=62, CHECK=63, CLEAN=64, CLUSTER=65, CLUSTERS=66, 
		COLLATE=67, COLLATION=68, COLUMN=69, COLUMNS=70, COMMENT=71, COMMIT=72, 
		COMMITTED=73, COMPACT=74, COMPLETE=75, CONFIG=76, CONNECTION=77, CONNECTION_ID=78, 
		CONSISTENT=79, CONVERT=80, COPY=81, COUNT=82, CREATE=83, CREATION=84, 
		CRON=85, CROSS=86, CUBE=87, CURRENT=88, CURRENT_CATALOG=89, CURRENT_TIMESTAMP=90, 
		CURRENT_USER=91, DATA=92, DATABASE=93, DATABASES=94, DATE=95, DATE_ADD=96, 
		DATE_CEIL=97, DATE_DIFF=98, DATE_FLOOR=99, DATE_SUB=100, DATEADD=101, 
		DATEDIFF=102, DATETIME=103, DATETIMEV2=104, DATEV2=105, DATETIMEV1=106, 
		DATEV1=107, DAY=108, DAYS_ADD=109, DAYS_SUB=110, DECIMAL=111, DECIMALV2=112, 
		DECIMALV3=113, DECOMMISSION=114, DEFAULT=115, DEFERRED=116, DELETE=117, 
		DEMAND=118, DESC=119, DESCRIBE=120, DIAGNOSE=121, DISK=122, DISTINCT=123, 
		DISTINCTPC=124, DISTINCTPCSA=125, DISTINCTROW=126, DISTRIBUTED=127, DISTRIBUTION=128, 
		DIV=129, DO=130, DORIS_INTERNAL_TABLE_ID=131, DOUBLE=132, DROP=133, DROPP=134, 
		DUPLICATE=135, DYNAMIC=136, ELSE=137, ENABLE=138, ENCRYPTKEY=139, ENCRYPTKEYS=140, 
		END=141, ENDS=142, ENGINE=143, ENGINES=144, ENTER=145, ERRORS=146, EVENTS=147, 
		EVERY=148, EXCEPT=149, EXCLUDE=150, EXECUTE=151, EXISTS=152, EXPIRED=153, 
		EXPLAIN=154, EXPORT=155, EXTENDED=156, EXTERNAL=157, EXTRACT=158, FAILED_LOGIN_ATTEMPTS=159, 
		FALSE=160, FAST=161, FEATURE=162, FIELDS=163, FILE=164, FILTER=165, FIRST=166, 
		FLOAT=167, FOLLOWER=168, FOLLOWING=169, FOR=170, FORCE=171, FORMAT=172, 
		FREE=173, FROM=174, FRONTEND=175, FRONTENDS=176, FULL=177, FUNCTION=178, 
		FUNCTIONS=179, GLOBAL=180, GRANT=181, GRANTS=182, GRAPH=183, GROUP=184, 
		GROUPING=185, GROUPS=186, HASH=187, HAVING=188, HDFS=189, HELP=190, HISTOGRAM=191, 
		HLL=192, HLL_UNION=193, HOSTNAME=194, HOUR=195, HUB=196, IDENTIFIED=197, 
		IF=198, IGNORE=199, IMMEDIATE=200, IN=201, INCREMENTAL=202, INDEX=203, 
		INDEXES=204, INFILE=205, INNER=206, INSERT=207, INSTALL=208, INT=209, 
		INTEGER=210, INTERMEDIATE=211, INTERSECT=212, INTERVAL=213, INTO=214, 
		INVERTED=215, IPV4=216, IPV6=217, IS=218, IS_NOT_NULL_PRED=219, IS_NULL_PRED=220, 
		ISNULL=221, ISOLATION=222, JOB=223, JOBS=224, JOIN=225, JSON=226, JSONB=227, 
		KEY=228, KEYS=229, KILL=230, LABEL=231, LARGEINT=232, LAST=233, LATERAL=234, 
		LDAP=235, LDAP_ADMIN_PASSWORD=236, LEFT=237, LESS=238, LEVEL=239, LIKE=240, 
		LIMIT=241, LINES=242, LINK=243, LIST=244, LOAD=245, LOCAL=246, LOCATION=247, 
		LOCK=248, LOGICAL=249, LOW_PRIORITY=250, MAP=251, MATCH=252, MATCH_ALL=253, 
		MATCH_ANY=254, MATCH_ELEMENT_EQ=255, MATCH_ELEMENT_GE=256, MATCH_ELEMENT_GT=257, 
		MATCH_ELEMENT_LE=258, MATCH_ELEMENT_LT=259, MATCH_PHRASE=260, MATERIALIZED=261, 
		MAX=262, MAXVALUE=263, MEMO=264, MERGE=265, MIGRATE=266, MIGRATIONS=267, 
		MIN=268, MINUS=269, MINUTE=270, MODIFY=271, MONTH=272, MTMV=273, NAME=274, 
		NAMES=275, NATURAL=276, NEGATIVE=277, NEVER=278, NEXT=279, NGRAM_BF=280, 
		NO=281, NON_NULLABLE=282, NOT=283, NULL=284, NULLS=285, OBSERVER=286, 
		OF=287, OFFSET=288, ON=289, ONLY=290, OPEN=291, OPTIMIZED=292, OR=293, 
		ORDER=294, OUTER=295, OUTFILE=296, OVER=297, OVERWRITE=298, PARAMETER=299, 
		PARSED=300, PARTITION=301, PARTITIONS=302, PASSWORD=303, PASSWORD_EXPIRE=304, 
		PASSWORD_HISTORY=305, PASSWORD_LOCK_TIME=306, PASSWORD_REUSE=307, PATH=308, 
		PAUSE=309, PERCENT=310, PERIOD=311, PERMISSIVE=312, PHYSICAL=313, PLAN=314, 
		PLUGIN=315, PLUGINS=316, POLICY=317, PRECEDING=318, PREPARE=319, PROC=320, 
		PROCEDURE=321, PROCESSLIST=322, PROFILE=323, PROPERTIES=324, PROPERTY=325, 
		QUANTILE_STATE=326, QUANTILE_UNION=327, QUERY=328, QUOTA=329, RANDOM=330, 
		RANGE=331, READ=332, REAL=333, REBALANCE=334, RECOVER=335, RECYCLE=336, 
		REFRESH=337, REGEXP=338, RELEASE=339, RENAME=340, REPAIR=341, REPEATABLE=342, 
		REPLACE=343, REPLACE_IF_NOT_NULL=344, REPLICA=345, REPOSITORIES=346, REPOSITORY=347, 
		RESOURCE=348, RESOURCES=349, RESTORE=350, RESTRICTIVE=351, RESUME=352, 
		RETURNS=353, REVOKE=354, REWRITTEN=355, RIGHT=356, RLIKE=357, ROLE=358, 
		ROLES=359, ROLLBACK=360, ROLLUP=361, ROUTINE=362, ROW=363, ROWS=364, S3=365, 
		SAMPLE=366, SCHEDULER=367, SCHEMA=368, SCHEMAS=369, SECOND=370, SELECT=371, 
		SEMI=372, SERIALIZABLE=373, SESSION=374, SET=375, SETS=376, SHAPE=377, 
		SHOW=378, SIGNED=379, SKEW=380, SMALLINT=381, SNAPSHOT=382, SONAME=383, 
		SPLIT=384, SQL_BLOCK_RULE=385, START=386, STARTS=387, STATS=388, STATUS=389, 
		STOP=390, STORAGE=391, STREAM=392, STREAMING=393, STRING=394, STRUCT=395, 
		SUBDATE=396, SUM=397, SUPERUSER=398, SWITCH=399, SYNC=400, SYSTEM=401, 
		TABLE=402, TABLES=403, TABLESAMPLE=404, TABLET=405, TABLETS=406, TASK=407, 
		TASKS=408, TEMPORARY=409, TERMINATED=410, TEXT=411, THAN=412, THEN=413, 
		TIME=414, TIMESTAMP=415, TIMESTAMPADD=416, TIMESTAMPDIFF=417, TINYINT=418, 
		TO=419, TRANSACTION=420, TRASH=421, TREE=422, TRIGGERS=423, TRIM=424, 
		TRUE=425, TRUNCATE=426, TYPE=427, TYPECAST=428, TYPES=429, UNBOUNDED=430, 
		UNCOMMITTED=431, UNINSTALL=432, UNION=433, UNIQUE=434, UNLOCK=435, UNSIGNED=436, 
		UPDATE=437, USE=438, USER=439, USING=440, VALUE=441, VALUES=442, VARCHAR=443, 
		VARIABLES=444, VERBOSE=445, VERSION=446, VIEW=447, WARNINGS=448, WEEK=449, 
		WHEN=450, WHERE=451, WHITELIST=452, WITH=453, WORK=454, WORKLOAD=455, 
		WRITE=456, YEAR=457, EQ=458, NSEQ=459, NEQ=460, LT=461, LTE=462, GT=463, 
		GTE=464, PLUS=465, SUBTRACT=466, ASTERISK=467, SLASH=468, MOD=469, TILDE=470, 
		AMPERSAND=471, LOGICALAND=472, LOGICALNOT=473, PIPE=474, DOUBLEPIPES=475, 
		HAT=476, COLON=477, ARROW=478, HINT_START=479, HINT_END=480, ATSIGN=481, 
		DOUBLEATSIGN=482, STRING_LITERAL=483, LEADING_STRING=484, BIGINT_LITERAL=485, 
		SMALLINT_LITERAL=486, TINYINT_LITERAL=487, INTEGER_VALUE=488, EXPONENT_VALUE=489, 
		DECIMAL_VALUE=490, BIGDECIMAL_LITERAL=491, IDENTIFIER=492, BACKQUOTED_IDENTIFIER=493, 
		SIMPLE_COMMENT=494, BRACKETED_COMMENT=495, WS=496, UNRECOGNIZED=497;
	public static final int
		RULE_multiStatements = 0, RULE_singleStatement = 1, RULE_statement = 2, 
		RULE_dataDesc = 3, RULE_identifierOrText = 4, RULE_userIdentify = 5, RULE_explain = 6, 
		RULE_planType = 7, RULE_mergeType = 8, RULE_preFilterClause = 9, RULE_deleteOnClause = 10, 
		RULE_sequenceColClause = 11, RULE_colFromPath = 12, RULE_colMappingList = 13, 
		RULE_mappingExpr = 14, RULE_withRemoteStorageSystem = 15, RULE_resourceDesc = 16, 
		RULE_mysqlDataDesc = 17, RULE_skipLines = 18, RULE_outFileClause = 19, 
		RULE_query = 20, RULE_queryTerm = 21, RULE_setQuantifier = 22, RULE_queryPrimary = 23, 
		RULE_querySpecification = 24, RULE_cte = 25, RULE_aliasQuery = 26, RULE_columnAliases = 27, 
		RULE_selectClause = 28, RULE_selectColumnClause = 29, RULE_whereClause = 30, 
		RULE_fromClause = 31, RULE_relation = 32, RULE_joinRelation = 33, RULE_joinHint = 34, 
		RULE_relationHint = 35, RULE_aggClause = 36, RULE_groupingElement = 37, 
		RULE_groupingSet = 38, RULE_havingClause = 39, RULE_selectHint = 40, RULE_hintStatement = 41, 
		RULE_hintAssignment = 42, RULE_updateAssignment = 43, RULE_updateAssignmentSeq = 44, 
		RULE_lateralView = 45, RULE_queryOrganization = 46, RULE_sortClause = 47, 
		RULE_sortItem = 48, RULE_limitClause = 49, RULE_partitionClause = 50, 
		RULE_joinType = 51, RULE_joinCriteria = 52, RULE_identifierList = 53, 
		RULE_identifierSeq = 54, RULE_relationPrimary = 55, RULE_propertyClause = 56, 
		RULE_propertyItemList = 57, RULE_propertyItem = 58, RULE_propertyKey = 59, 
		RULE_propertyValue = 60, RULE_tableAlias = 61, RULE_multipartIdentifier = 62, 
		RULE_columnDefs = 63, RULE_columnDef = 64, RULE_indexDefs = 65, RULE_indexDef = 66, 
		RULE_partitionsDef = 67, RULE_partitionDef = 68, RULE_lessThanPartitionDef = 69, 
		RULE_fixedPartitionDef = 70, RULE_stepPartitionDef = 71, RULE_inPartitionDef = 72, 
		RULE_constantSeq = 73, RULE_partitionValueDef = 74, RULE_rollupDefs = 75, 
		RULE_rollupDef = 76, RULE_aggTypeDef = 77, RULE_tabletList = 78, RULE_inlineTable = 79, 
		RULE_namedExpression = 80, RULE_namedExpressionSeq = 81, RULE_expression = 82, 
		RULE_lambdaExpression = 83, RULE_booleanExpression = 84, RULE_rowConstructor = 85, 
		RULE_predicate = 86, RULE_valueExpression = 87, RULE_datetimeUnit = 88, 
		RULE_primaryExpression = 89, RULE_functionIdentifier = 90, RULE_functionNameIdentifier = 91, 
		RULE_windowSpec = 92, RULE_windowFrame = 93, RULE_frameUnits = 94, RULE_frameBoundary = 95, 
		RULE_qualifiedName = 96, RULE_specifiedPartition = 97, RULE_constant = 98, 
		RULE_comparisonOperator = 99, RULE_booleanValue = 100, RULE_whenClause = 101, 
		RULE_interval = 102, RULE_unitIdentifier = 103, RULE_dataType = 104, RULE_primitiveColType = 105, 
		RULE_complexColTypeList = 106, RULE_complexColType = 107, RULE_commentSpec = 108, 
		RULE_sample = 109, RULE_sampleMethod = 110, RULE_errorCapturingIdentifier = 111, 
		RULE_errorCapturingIdentifierExtra = 112, RULE_identifier = 113, RULE_strictIdentifier = 114, 
		RULE_quotedIdentifier = 115, RULE_number = 116, RULE_nonReserved = 117;
	public static final String[] ruleNames = {
		"multiStatements", "singleStatement", "statement", "dataDesc", "identifierOrText", 
		"userIdentify", "explain", "planType", "mergeType", "preFilterClause", 
		"deleteOnClause", "sequenceColClause", "colFromPath", "colMappingList", 
		"mappingExpr", "withRemoteStorageSystem", "resourceDesc", "mysqlDataDesc", 
		"skipLines", "outFileClause", "query", "queryTerm", "setQuantifier", "queryPrimary", 
		"querySpecification", "cte", "aliasQuery", "columnAliases", "selectClause", 
		"selectColumnClause", "whereClause", "fromClause", "relation", "joinRelation", 
		"joinHint", "relationHint", "aggClause", "groupingElement", "groupingSet", 
		"havingClause", "selectHint", "hintStatement", "hintAssignment", "updateAssignment", 
		"updateAssignmentSeq", "lateralView", "queryOrganization", "sortClause", 
		"sortItem", "limitClause", "partitionClause", "joinType", "joinCriteria", 
		"identifierList", "identifierSeq", "relationPrimary", "propertyClause", 
		"propertyItemList", "propertyItem", "propertyKey", "propertyValue", "tableAlias", 
		"multipartIdentifier", "columnDefs", "columnDef", "indexDefs", "indexDef", 
		"partitionsDef", "partitionDef", "lessThanPartitionDef", "fixedPartitionDef", 
		"stepPartitionDef", "inPartitionDef", "constantSeq", "partitionValueDef", 
		"rollupDefs", "rollupDef", "aggTypeDef", "tabletList", "inlineTable", 
		"namedExpression", "namedExpressionSeq", "expression", "lambdaExpression", 
		"booleanExpression", "rowConstructor", "predicate", "valueExpression", 
		"datetimeUnit", "primaryExpression", "functionIdentifier", "functionNameIdentifier", 
		"windowSpec", "windowFrame", "frameUnits", "frameBoundary", "qualifiedName", 
		"specifiedPartition", "constant", "comparisonOperator", "booleanValue", 
		"whenClause", "interval", "unitIdentifier", "dataType", "primitiveColType", 
		"complexColTypeList", "complexColType", "commentSpec", "sample", "sampleMethod", 
		"errorCapturingIdentifier", "errorCapturingIdentifierExtra", "identifier", 
		"strictIdentifier", "quotedIdentifier", "number", "nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "','", "'.'", "'['", "']'", "'{'", "'}'", "'ACCOUNT_LOCK'", 
		"'ACCOUNT_UNLOCK'", "'ADD'", "'ADDDATE'", "'ADMIN'", "'AFTER'", "'AGG_STATE'", 
		"'AGGREGATE'", "'ALIAS'", "'ALL'", "'ALTER'", "'ANALYZE'", "'ANALYZED'", 
		"'AND'", "'ANTI'", "'APPEND'", "'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORS'", 
		"'AUTO'", "'AUTO_INCREMENT'", "'BACKEND'", "'BACKENDS'", "'BACKUP'", "'BEGIN'", 
		"'BETWEEN'", "'BIGINT'", "'BIN'", "'BINLOG'", "'BITAND'", "'BITMAP'", 
		"'BITMAP_UNION'", "'BITOR'", "'BITXOR'", "'BLOB'", "'BOOLEAN'", "'BRIEF'", 
		"'BROKER'", "'BUCKETS'", "'BUILD'", "'BUILTIN'", "'BY'", "'CACHED'", "'CANCEL'", 
		"'CASE'", "'CAST'", "'CATALOG'", "'CATALOGS'", "'CHAIN'", null, "'CHARSET'", 
		"'CHECK'", "'CLEAN'", "'CLUSTER'", "'CLUSTERS'", "'COLLATE'", "'COLLATION'", 
		"'COLUMN'", "'COLUMNS'", "'COMMENT'", "'COMMIT'", "'COMMITTED'", "'COMPACT'", 
		"'COMPLETE'", "'CONFIG'", "'CONNECTION'", "'CONNECTION_ID'", "'CONSISTENT'", 
		"'CONVERT'", "'COPY'", "'COUNT'", "'CREATE'", "'CREATION'", "'CRON'", 
		"'CROSS'", "'CUBE'", "'CURRENT'", "'CURRENT_CATALOG'", "'CURRENT_TIMESTAMP'", 
		"'CURRENT_USER'", "'DATA'", "'DATABASE'", "'DATABASES'", "'DATE'", "'DATE_ADD'", 
		"'DATE_CEIL'", "'DATE_DIFF'", "'DATE_FLOOR'", "'DATE_SUB'", "'DATEADD'", 
		"'DATEDIFF'", "'DATETIME'", "'DATETIMEV2'", "'DATEV2'", "'DATETIMEV1'", 
		"'DATEV1'", "'DAY'", "'DAYS_ADD'", "'DAYS_SUB'", "'DECIMAL'", "'DECIMALV2'", 
		"'DECIMALV3'", "'DECOMMISSION'", "'DEFAULT'", "'DEFERRED'", "'DELETE'", 
		"'DEMAND'", "'DESC'", "'DESCRIBE'", "'DIAGNOSE'", "'DISK'", "'DISTINCT'", 
		"'DISTINCTPC'", "'DISTINCTPCSA'", "'DISTINCTROW'", "'DISTRIBUTED'", "'DISTRIBUTION'", 
		"'DIV'", "'DO'", "'DORIS_INTERNAL_TABLE_ID'", "'DOUBLE'", "'DROP'", "'DROPP'", 
		"'DUPLICATE'", "'DYNAMIC'", "'ELSE'", "'ENABLE'", "'ENCRYPTKEY'", "'ENCRYPTKEYS'", 
		"'END'", "'ENDS'", "'ENGINE'", "'ENGINES'", "'ENTER'", "'ERRORS'", "'EVENTS'", 
		"'EVERY'", "'EXCEPT'", "'EXCLUDE'", "'EXECUTE'", "'EXISTS'", "'EXPIRED'", 
		"'EXPLAIN'", "'EXPORT'", "'EXTENDED'", "'EXTERNAL'", "'EXTRACT'", "'FAILED_LOGIN_ATTEMPTS'", 
		"'FALSE'", "'FAST'", "'FEATURE'", "'FIELDS'", "'FILE'", "'FILTER'", "'FIRST'", 
		"'FLOAT'", "'FOLLOWER'", "'FOLLOWING'", "'FOR'", "'FORCE'", "'FORMAT'", 
		"'FREE'", "'FROM'", "'FRONTEND'", "'FRONTENDS'", "'FULL'", "'FUNCTION'", 
		"'FUNCTIONS'", "'GLOBAL'", "'GRANT'", "'GRANTS'", "'GRAPH'", "'GROUP'", 
		"'GROUPING'", "'GROUPS'", "'HASH'", "'HAVING'", "'HDFS'", "'HELP'", "'HISTOGRAM'", 
		"'HLL'", "'HLL_UNION'", "'HOSTNAME'", "'HOUR'", "'HUB'", "'IDENTIFIED'", 
		"'IF'", "'IGNORE'", "'IMMEDIATE'", "'IN'", "'INCREMENTAL'", "'INDEX'", 
		"'INDEXES'", "'INFILE'", "'INNER'", "'INSERT'", "'INSTALL'", "'INT'", 
		"'INTEGER'", "'INTERMEDIATE'", "'INTERSECT'", "'INTERVAL'", "'INTO'", 
		"'INVERTED'", "'IPV4'", "'IPV6'", "'IS'", "'IS_NOT_NULL_PRED'", "'IS_NULL_PRED'", 
		"'ISNULL'", "'ISOLATION'", "'JOB'", "'JOBS'", "'JOIN'", "'JSON'", "'JSONB'", 
		"'KEY'", "'KEYS'", "'KILL'", "'LABEL'", "'LARGEINT'", "'LAST'", "'LATERAL'", 
		"'LDAP'", "'LDAP_ADMIN_PASSWORD'", "'LEFT'", "'LESS'", "'LEVEL'", "'LIKE'", 
		"'LIMIT'", "'LINES'", "'LINK'", "'LIST'", "'LOAD'", "'LOCAL'", "'LOCATION'", 
		"'LOCK'", "'LOGICAL'", "'LOW_PRIORITY'", "'MAP'", "'MATCH'", "'MATCH_ALL'", 
		"'MATCH_ANY'", "'ELEMENT_EQ'", "'ELEMENT_GE'", "'ELEMENT_GT'", "'ELEMENT_LE'", 
		"'ELEMENT_LT'", "'MATCH_PHRASE'", "'MATERIALIZED'", "'MAX'", "'MAXVALUE'", 
		"'MEMO'", "'MERGE'", "'MIGRATE'", "'MIGRATIONS'", "'MIN'", "'MINUS'", 
		"'MINUTE'", "'MODIFY'", "'MONTH'", "'MTMV'", "'NAME'", "'NAMES'", "'NATURAL'", 
		"'NEGATIVE'", "'NEVER'", "'NEXT'", "'NGRAM_BF'", "'NO'", "'NON_NULLABLE'", 
		"'NOT'", "'NULL'", "'NULLS'", "'OBSERVER'", "'OF'", "'OFFSET'", "'ON'", 
		"'ONLY'", "'OPEN'", "'OPTIMIZED'", "'OR'", "'ORDER'", "'OUTER'", "'OUTFILE'", 
		"'OVER'", "'OVERWRITE'", "'PARAMETER'", "'PARSED'", "'PARTITION'", "'PARTITIONS'", 
		"'PASSWORD'", "'PASSWORD_EXPIRE'", "'PASSWORD_HISTORY'", "'PASSWORD_LOCK_TIME'", 
		"'PASSWORD_REUSE'", "'PATH'", "'PAUSE'", "'PERCENT'", "'PERIOD'", "'PERMISSIVE'", 
		"'PHYSICAL'", "'PLAN'", "'PLUGIN'", "'PLUGINS'", "'POLICY'", "'PRECEDING'", 
		"'PREPARE'", "'PROC'", "'PROCEDURE'", "'PROCESSLIST'", "'PROFILE'", "'PROPERTIES'", 
		"'PROPERTY'", "'QUANTILE_STATE'", "'QUANTILE_UNION'", "'QUERY'", "'QUOTA'", 
		"'RANDOM'", "'RANGE'", "'READ'", "'REAL'", "'REBALANCE'", "'RECOVER'", 
		"'RECYCLE'", "'REFRESH'", "'REGEXP'", "'RELEASE'", "'RENAME'", "'REPAIR'", 
		"'REPEATABLE'", "'REPLACE'", "'REPLACE_IF_NOT_NULL'", "'REPLICA'", "'REPOSITORIES'", 
		"'REPOSITORY'", "'RESOURCE'", "'RESOURCES'", "'RESTORE'", "'RESTRICTIVE'", 
		"'RESUME'", "'RETURNS'", "'REVOKE'", "'REWRITTEN'", "'RIGHT'", "'RLIKE'", 
		"'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROUTINE'", "'ROW'", "'ROWS'", 
		"'S3'", "'SAMPLE'", "'SCHEDULER'", "'SCHEMA'", "'SCHEMAS'", "'SECOND'", 
		"'SELECT'", "'SEMI'", "'SERIALIZABLE'", "'SESSION'", "'SET'", "'SETS'", 
		"'SHAPE'", "'SHOW'", "'SIGNED'", "'SKEW'", "'SMALLINT'", "'SNAPSHOT'", 
		"'SONAME'", "'SPLIT'", "'SQL_BLOCK_RULE'", "'START'", "'STARTS'", "'STATS'", 
		"'STATUS'", "'STOP'", "'STORAGE'", "'STREAM'", "'STREAMING'", "'STRING'", 
		"'STRUCT'", "'SUBDATE'", "'SUM'", "'SUPERUSER'", "'SWITCH'", "'SYNC'", 
		"'SYSTEM'", "'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TABLET'", "'TABLETS'", 
		"'TASK'", "'TASKS'", "'TEMPORARY'", "'TERMINATED'", "'TEXT'", "'THAN'", 
		"'THEN'", "'TIME'", "'TIMESTAMP'", "'TIMESTAMPADD'", "'TIMESTAMPDIFF'", 
		"'TINYINT'", "'TO'", "'TRANSACTION'", "'TRASH'", "'TREE'", "'TRIGGERS'", 
		"'TRIM'", "'TRUE'", "'TRUNCATE'", "'TYPE'", "'TYPE_CAST'", "'TYPES'", 
		"'UNBOUNDED'", "'UNCOMMITTED'", "'UNINSTALL'", "'UNION'", "'UNIQUE'", 
		"'UNLOCK'", "'UNSIGNED'", "'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALUE'", 
		"'VALUES'", "'VARCHAR'", "'VARIABLES'", "'VERBOSE'", "'VERSION'", "'VIEW'", 
		"'WARNINGS'", "'WEEK'", "'WHEN'", "'WHERE'", "'WHITELIST'", "'WITH'", 
		"'WORK'", "'WORKLOAD'", "'WRITE'", "'YEAR'", null, "'<=>'", null, "'<'", 
		null, "'>'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'&'", "'&&'", 
		"'!'", "'|'", "'||'", "'^'", "':'", "'->'", "'/*+'", "'*/'", "'@'", "'@@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEMICOLON", "LEFT_PAREN", "RIGHT_PAREN", "COMMA", "DOT", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "ACCOUNT_LOCK", "ACCOUNT_UNLOCK", 
		"ADD", "ADDDATE", "ADMIN", "AFTER", "AGG_STATE", "AGGREGATE", "ALIAS", 
		"ALL", "ALTER", "ANALYZE", "ANALYZED", "AND", "ANTI", "APPEND", "ARRAY", 
		"AS", "ASC", "AT", "AUTHORS", "AUTO", "AUTO_INCREMENT", "BACKEND", "BACKENDS", 
		"BACKUP", "BEGIN", "BETWEEN", "BIGINT", "BIN", "BINLOG", "BITAND", "BITMAP", 
		"BITMAP_UNION", "BITOR", "BITXOR", "BLOB", "BOOLEAN", "BRIEF", "BROKER", 
		"BUCKETS", "BUILD", "BUILTIN", "BY", "CACHED", "CANCEL", "CASE", "CAST", 
		"CATALOG", "CATALOGS", "CHAIN", "CHAR", "CHARSET", "CHECK", "CLEAN", "CLUSTER", 
		"CLUSTERS", "COLLATE", "COLLATION", "COLUMN", "COLUMNS", "COMMENT", "COMMIT", 
		"COMMITTED", "COMPACT", "COMPLETE", "CONFIG", "CONNECTION", "CONNECTION_ID", 
		"CONSISTENT", "CONVERT", "COPY", "COUNT", "CREATE", "CREATION", "CRON", 
		"CROSS", "CUBE", "CURRENT", "CURRENT_CATALOG", "CURRENT_TIMESTAMP", "CURRENT_USER", 
		"DATA", "DATABASE", "DATABASES", "DATE", "DATE_ADD", "DATE_CEIL", "DATE_DIFF", 
		"DATE_FLOOR", "DATE_SUB", "DATEADD", "DATEDIFF", "DATETIME", "DATETIMEV2", 
		"DATEV2", "DATETIMEV1", "DATEV1", "DAY", "DAYS_ADD", "DAYS_SUB", "DECIMAL", 
		"DECIMALV2", "DECIMALV3", "DECOMMISSION", "DEFAULT", "DEFERRED", "DELETE", 
		"DEMAND", "DESC", "DESCRIBE", "DIAGNOSE", "DISK", "DISTINCT", "DISTINCTPC", 
		"DISTINCTPCSA", "DISTINCTROW", "DISTRIBUTED", "DISTRIBUTION", "DIV", "DO", 
		"DORIS_INTERNAL_TABLE_ID", "DOUBLE", "DROP", "DROPP", "DUPLICATE", "DYNAMIC", 
		"ELSE", "ENABLE", "ENCRYPTKEY", "ENCRYPTKEYS", "END", "ENDS", "ENGINE", 
		"ENGINES", "ENTER", "ERRORS", "EVENTS", "EVERY", "EXCEPT", "EXCLUDE", 
		"EXECUTE", "EXISTS", "EXPIRED", "EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", 
		"EXTRACT", "FAILED_LOGIN_ATTEMPTS", "FALSE", "FAST", "FEATURE", "FIELDS", 
		"FILE", "FILTER", "FIRST", "FLOAT", "FOLLOWER", "FOLLOWING", "FOR", "FORCE", 
		"FORMAT", "FREE", "FROM", "FRONTEND", "FRONTENDS", "FULL", "FUNCTION", 
		"FUNCTIONS", "GLOBAL", "GRANT", "GRANTS", "GRAPH", "GROUP", "GROUPING", 
		"GROUPS", "HASH", "HAVING", "HDFS", "HELP", "HISTOGRAM", "HLL", "HLL_UNION", 
		"HOSTNAME", "HOUR", "HUB", "IDENTIFIED", "IF", "IGNORE", "IMMEDIATE", 
		"IN", "INCREMENTAL", "INDEX", "INDEXES", "INFILE", "INNER", "INSERT", 
		"INSTALL", "INT", "INTEGER", "INTERMEDIATE", "INTERSECT", "INTERVAL", 
		"INTO", "INVERTED", "IPV4", "IPV6", "IS", "IS_NOT_NULL_PRED", "IS_NULL_PRED", 
		"ISNULL", "ISOLATION", "JOB", "JOBS", "JOIN", "JSON", "JSONB", "KEY", 
		"KEYS", "KILL", "LABEL", "LARGEINT", "LAST", "LATERAL", "LDAP", "LDAP_ADMIN_PASSWORD", 
		"LEFT", "LESS", "LEVEL", "LIKE", "LIMIT", "LINES", "LINK", "LIST", "LOAD", 
		"LOCAL", "LOCATION", "LOCK", "LOGICAL", "LOW_PRIORITY", "MAP", "MATCH", 
		"MATCH_ALL", "MATCH_ANY", "MATCH_ELEMENT_EQ", "MATCH_ELEMENT_GE", "MATCH_ELEMENT_GT", 
		"MATCH_ELEMENT_LE", "MATCH_ELEMENT_LT", "MATCH_PHRASE", "MATERIALIZED", 
		"MAX", "MAXVALUE", "MEMO", "MERGE", "MIGRATE", "MIGRATIONS", "MIN", "MINUS", 
		"MINUTE", "MODIFY", "MONTH", "MTMV", "NAME", "NAMES", "NATURAL", "NEGATIVE", 
		"NEVER", "NEXT", "NGRAM_BF", "NO", "NON_NULLABLE", "NOT", "NULL", "NULLS", 
		"OBSERVER", "OF", "OFFSET", "ON", "ONLY", "OPEN", "OPTIMIZED", "OR", "ORDER", 
		"OUTER", "OUTFILE", "OVER", "OVERWRITE", "PARAMETER", "PARSED", "PARTITION", 
		"PARTITIONS", "PASSWORD", "PASSWORD_EXPIRE", "PASSWORD_HISTORY", "PASSWORD_LOCK_TIME", 
		"PASSWORD_REUSE", "PATH", "PAUSE", "PERCENT", "PERIOD", "PERMISSIVE", 
		"PHYSICAL", "PLAN", "PLUGIN", "PLUGINS", "POLICY", "PRECEDING", "PREPARE", 
		"PROC", "PROCEDURE", "PROCESSLIST", "PROFILE", "PROPERTIES", "PROPERTY", 
		"QUANTILE_STATE", "QUANTILE_UNION", "QUERY", "QUOTA", "RANDOM", "RANGE", 
		"READ", "REAL", "REBALANCE", "RECOVER", "RECYCLE", "REFRESH", "REGEXP", 
		"RELEASE", "RENAME", "REPAIR", "REPEATABLE", "REPLACE", "REPLACE_IF_NOT_NULL", 
		"REPLICA", "REPOSITORIES", "REPOSITORY", "RESOURCE", "RESOURCES", "RESTORE", 
		"RESTRICTIVE", "RESUME", "RETURNS", "REVOKE", "REWRITTEN", "RIGHT", "RLIKE", 
		"ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROUTINE", "ROW", "ROWS", "S3", 
		"SAMPLE", "SCHEDULER", "SCHEMA", "SCHEMAS", "SECOND", "SELECT", "SEMI", 
		"SERIALIZABLE", "SESSION", "SET", "SETS", "SHAPE", "SHOW", "SIGNED", "SKEW", 
		"SMALLINT", "SNAPSHOT", "SONAME", "SPLIT", "SQL_BLOCK_RULE", "START", 
		"STARTS", "STATS", "STATUS", "STOP", "STORAGE", "STREAM", "STREAMING", 
		"STRING", "STRUCT", "SUBDATE", "SUM", "SUPERUSER", "SWITCH", "SYNC", "SYSTEM", 
		"TABLE", "TABLES", "TABLESAMPLE", "TABLET", "TABLETS", "TASK", "TASKS", 
		"TEMPORARY", "TERMINATED", "TEXT", "THAN", "THEN", "TIME", "TIMESTAMP", 
		"TIMESTAMPADD", "TIMESTAMPDIFF", "TINYINT", "TO", "TRANSACTION", "TRASH", 
		"TREE", "TRIGGERS", "TRIM", "TRUE", "TRUNCATE", "TYPE", "TYPECAST", "TYPES", 
		"UNBOUNDED", "UNCOMMITTED", "UNINSTALL", "UNION", "UNIQUE", "UNLOCK", 
		"UNSIGNED", "UPDATE", "USE", "USER", "USING", "VALUE", "VALUES", "VARCHAR", 
		"VARIABLES", "VERBOSE", "VERSION", "VIEW", "WARNINGS", "WEEK", "WHEN", 
		"WHERE", "WHITELIST", "WITH", "WORK", "WORKLOAD", "WRITE", "YEAR", "EQ", 
		"NSEQ", "NEQ", "LT", "LTE", "GT", "GTE", "PLUS", "SUBTRACT", "ASTERISK", 
		"SLASH", "MOD", "TILDE", "AMPERSAND", "LOGICALAND", "LOGICALNOT", "PIPE", 
		"DOUBLEPIPES", "HAT", "COLON", "ARROW", "HINT_START", "HINT_END", "ATSIGN", 
		"DOUBLEATSIGN", "STRING_LITERAL", "LEADING_STRING", "BIGINT_LITERAL", 
		"SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", "EXPONENT_VALUE", 
		"DECIMAL_VALUE", "BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", 
		"SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DorisParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public boolean doris_legacy_SQL_syntax = true;

	public DorisParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MultiStatementsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DorisParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(DorisParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(DorisParser.SEMICOLON, i);
		}
		public MultiStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterMultiStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitMultiStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitMultiStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiStatementsContext multiStatements() throws RecognitionException {
		MultiStatementsContext _localctx = new MultiStatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_multiStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(236);
				statement();
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(237);
					match(SEMICOLON);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LEFT_PAREN || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (CREATE - 83)) | (1L << (DELETE - 83)) | (1L << (DESC - 83)) | (1L << (DESCRIBE - 83)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (EXPLAIN - 154)) | (1L << (EXPORT - 154)) | (1L << (INSERT - 154)))) != 0) || _la==LOAD || _la==SELECT || ((((_la - 437)) & ~0x3f) == 0 && ((1L << (_la - 437)) & ((1L << (UPDATE - 437)) | (1L << (VALUES - 437)) | (1L << (WITH - 437)))) != 0) );
			setState(247);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DorisParser.EOF, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(DorisParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(DorisParser.SEMICOLON, i);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			statement();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(250);
				match(SEMICOLON);
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public MultipartIdentifierContext name;
		public IdentifierListContext ctasCols;
		public IdentifierContext engine;
		public IdentifierListContext keys;
		public IdentifierListContext partitionKeys;
		public PartitionsDefContext partitions;
		public IdentifierListContext hashKeys;
		public TerminalNode CREATE() { return getToken(DorisParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(DorisParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(DorisParser.IF, 0); }
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(DorisParser.EXISTS, 0); }
		public TerminalNode ENGINE() { return getToken(DorisParser.ENGINE, 0); }
		public TerminalNode EQ() { return getToken(DorisParser.EQ, 0); }
		public TerminalNode KEY() { return getToken(DorisParser.KEY, 0); }
		public TerminalNode COMMENT() { return getToken(DorisParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public List<TerminalNode> BY() { return getTokens(DorisParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(DorisParser.BY, i);
		}
		public List<TerminalNode> LEFT_PAREN() { return getTokens(DorisParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(DorisParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(DorisParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(DorisParser.RIGHT_PAREN, i);
		}
		public TerminalNode DISTRIBUTED() { return getToken(DorisParser.DISTRIBUTED, 0); }
		public TerminalNode ROLLUP() { return getToken(DorisParser.ROLLUP, 0); }
		public RollupDefsContext rollupDefs() {
			return getRuleContext(RollupDefsContext.class,0);
		}
		public PropertyClauseContext propertyClause() {
			return getRuleContext(PropertyClauseContext.class,0);
		}
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ColumnDefsContext columnDefs() {
			return getRuleContext(ColumnDefsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AGGREGATE() { return getToken(DorisParser.AGGREGATE, 0); }
		public TerminalNode UNIQUE() { return getToken(DorisParser.UNIQUE, 0); }
		public TerminalNode DUPLICATE() { return getToken(DorisParser.DUPLICATE, 0); }
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public TerminalNode RANGE() { return getToken(DorisParser.RANGE, 0); }
		public TerminalNode LIST() { return getToken(DorisParser.LIST, 0); }
		public TerminalNode HASH() { return getToken(DorisParser.HASH, 0); }
		public TerminalNode RANDOM() { return getToken(DorisParser.RANDOM, 0); }
		public TerminalNode BUCKETS() { return getToken(DorisParser.BUCKETS, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public TerminalNode AUTO() { return getToken(DorisParser.AUTO, 0); }
		public IndexDefsContext indexDefs() {
			return getRuleContext(IndexDefsContext.class,0);
		}
		public PartitionsDefContext partitionsDef() {
			return getRuleContext(PartitionsDefContext.class,0);
		}
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadContext extends StatementContext {
		public IdentifierContext lableName;
		public DataDescContext dataDesc;
		public List<DataDescContext> dataDescs = new ArrayList<DataDescContext>();
		public PropertyItemListContext properties;
		public TerminalNode LOAD() { return getToken(DorisParser.LOAD, 0); }
		public TerminalNode LABEL() { return getToken(DorisParser.LABEL, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(DorisParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(DorisParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(DorisParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(DorisParser.RIGHT_PAREN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<DataDescContext> dataDesc() {
			return getRuleContexts(DataDescContext.class);
		}
		public DataDescContext dataDesc(int i) {
			return getRuleContext(DataDescContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public WithRemoteStorageSystemContext withRemoteStorageSystem() {
			return getRuleContext(WithRemoteStorageSystemContext.class,0);
		}
		public TerminalNode PROPERTIES() { return getToken(DorisParser.PROPERTIES, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public PropertyItemListContext propertyItemList() {
			return getRuleContext(PropertyItemListContext.class,0);
		}
		public LoadContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterLoad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitLoad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitLoad(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExplainContext explain() {
			return getRuleContext(ExplainContext.class,0);
		}
		public OutFileClauseContext outFileClause() {
			return getRuleContext(OutFileClauseContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoQueryContext extends StatementContext {
		public MultipartIdentifierContext tableName;
		public IdentifierListContext partition;
		public IdentifierContext labelName;
		public IdentifierListContext cols;
		public IdentifierSeqContext hints;
		public TerminalNode INSERT() { return getToken(DorisParser.INSERT, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode INTO() { return getToken(DorisParser.INTO, 0); }
		public TerminalNode OVERWRITE() { return getToken(DorisParser.OVERWRITE, 0); }
		public TerminalNode TABLE() { return getToken(DorisParser.TABLE, 0); }
		public ExplainContext explain() {
			return getRuleContext(ExplainContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public TerminalNode WITH() { return getToken(DorisParser.WITH, 0); }
		public TerminalNode LABEL() { return getToken(DorisParser.LABEL, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(DorisParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(DorisParser.RIGHT_BRACKET, 0); }
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public InsertIntoQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterInsertIntoQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitInsertIntoQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitInsertIntoQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResourceLoadContext extends StatementContext {
		public IdentifierContext lableName;
		public DataDescContext dataDesc;
		public List<DataDescContext> dataDescs = new ArrayList<DataDescContext>();
		public PropertyItemListContext properties;
		public TerminalNode LOAD() { return getToken(DorisParser.LOAD, 0); }
		public TerminalNode LABEL() { return getToken(DorisParser.LABEL, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(DorisParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(DorisParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(DorisParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(DorisParser.RIGHT_PAREN, i);
		}
		public ResourceDescContext resourceDesc() {
			return getRuleContext(ResourceDescContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<DataDescContext> dataDesc() {
			return getRuleContexts(DataDescContext.class);
		}
		public DataDescContext dataDesc(int i) {
			return getRuleContext(DataDescContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public TerminalNode PROPERTIES() { return getToken(DorisParser.PROPERTIES, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public PropertyItemListContext propertyItemList() {
			return getRuleContext(PropertyItemListContext.class,0);
		}
		public ResourceLoadContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterResourceLoad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitResourceLoad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitResourceLoad(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateContext extends StatementContext {
		public MultipartIdentifierContext tableName;
		public TerminalNode UPDATE() { return getToken(DorisParser.UPDATE, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TerminalNode SET() { return getToken(DorisParser.SET, 0); }
		public UpdateAssignmentSeqContext updateAssignmentSeq() {
			return getRuleContext(UpdateAssignmentSeqContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExplainContext explain() {
			return getRuleContext(ExplainContext.class,0);
		}
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public UpdateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteContext extends StatementContext {
		public MultipartIdentifierContext tableName;
		public IdentifierListContext partition;
		public TerminalNode DELETE() { return getToken(DorisParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(DorisParser.FROM, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExplainContext explain() {
			return getRuleContext(ExplainContext.class,0);
		}
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public TerminalNode USING() { return getToken(DorisParser.USING, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public DeleteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExportContext extends StatementContext {
		public MultipartIdentifierContext tableName;
		public IdentifierListContext partition;
		public Token filePath;
		public TerminalNode EXPORT() { return getToken(DorisParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(DorisParser.TABLE, 0); }
		public TerminalNode TO() { return getToken(DorisParser.TO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public PropertyClauseContext propertyClause() {
			return getRuleContext(PropertyClauseContext.class,0);
		}
		public WithRemoteStorageSystemContext withRemoteStorageSystem() {
			return getRuleContext(WithRemoteStorageSystemContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ExportContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitExport(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateRowPolicyContext extends StatementContext {
		public IdentifierContext name;
		public MultipartIdentifierContext table;
		public Token type;
		public UserIdentifyContext user;
		public IdentifierContext roleName;
		public TerminalNode CREATE() { return getToken(DorisParser.CREATE, 0); }
		public TerminalNode ROW() { return getToken(DorisParser.ROW, 0); }
		public TerminalNode POLICY() { return getToken(DorisParser.POLICY, 0); }
		public TerminalNode ON() { return getToken(DorisParser.ON, 0); }
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public TerminalNode TO() { return getToken(DorisParser.TO, 0); }
		public TerminalNode USING() { return getToken(DorisParser.USING, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RESTRICTIVE() { return getToken(DorisParser.RESTRICTIVE, 0); }
		public TerminalNode PERMISSIVE() { return getToken(DorisParser.PERMISSIVE, 0); }
		public TerminalNode ROLE() { return getToken(DorisParser.ROLE, 0); }
		public TerminalNode IF() { return getToken(DorisParser.IF, 0); }
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(DorisParser.EXISTS, 0); }
		public UserIdentifyContext userIdentify() {
			return getRuleContext(UserIdentifyContext.class,0);
		}
		public CreateRowPolicyContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCreateRowPolicy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCreateRowPolicy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCreateRowPolicy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MysqlLoadContext extends StatementContext {
		public PropertyItemListContext properties;
		public TerminalNode LOAD() { return getToken(DorisParser.LOAD, 0); }
		public MysqlDataDescContext mysqlDataDesc() {
			return getRuleContext(MysqlDataDescContext.class,0);
		}
		public TerminalNode PROPERTIES() { return getToken(DorisParser.PROPERTIES, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public PropertyItemListContext propertyItemList() {
			return getRuleContext(PropertyItemListContext.class,0);
		}
		public MysqlLoadContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterMysqlLoad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitMysqlLoad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitMysqlLoad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (DESC - 119)) | (1L << (DESCRIBE - 119)) | (1L << (EXPLAIN - 119)))) != 0)) {
					{
					setState(258);
					explain();
					}
				}

				setState(261);
				query();
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTO) {
					{
					setState(262);
					outFileClause();
					}
				}

				}
				break;
			case 2:
				_localctx = new CreateRowPolicyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(CREATE);
				setState(266);
				match(ROW);
				setState(267);
				match(POLICY);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(268);
					match(IF);
					setState(269);
					match(NOT);
					setState(270);
					match(EXISTS);
					}
				}

				setState(273);
				((CreateRowPolicyContext)_localctx).name = identifier();
				setState(274);
				match(ON);
				setState(275);
				((CreateRowPolicyContext)_localctx).table = multipartIdentifier();
				setState(276);
				match(AS);
				setState(277);
				((CreateRowPolicyContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PERMISSIVE || _la==RESTRICTIVE) ) {
					((CreateRowPolicyContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(278);
				match(TO);
				setState(282);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_BRACE:
				case RIGHT_BRACE:
				case ADDDATE:
				case AFTER:
				case AGG_STATE:
				case AGGREGATE:
				case ALIAS:
				case ANALYZED:
				case ARRAY:
				case AT:
				case AUTHORS:
				case BACKENDS:
				case BACKUP:
				case BEGIN:
				case BIN:
				case BITAND:
				case BITMAP:
				case BITMAP_UNION:
				case BITOR:
				case BITXOR:
				case BLOB:
				case BOOLEAN:
				case BRIEF:
				case BROKER:
				case BUCKETS:
				case BUILD:
				case BUILTIN:
				case CACHED:
				case CATALOG:
				case CATALOGS:
				case CHAIN:
				case CHAR:
				case CHARSET:
				case CHECK:
				case CLUSTER:
				case CLUSTERS:
				case COLLATION:
				case COLUMNS:
				case COMMENT:
				case COMMIT:
				case COMMITTED:
				case COMPACT:
				case COMPLETE:
				case CONFIG:
				case CONNECTION:
				case CONNECTION_ID:
				case CONSISTENT:
				case CONVERT:
				case COPY:
				case COUNT:
				case CREATION:
				case CRON:
				case CURRENT_CATALOG:
				case CURRENT_TIMESTAMP:
				case DATA:
				case DATE:
				case DATE_ADD:
				case DATE_CEIL:
				case DATE_DIFF:
				case DATE_FLOOR:
				case DATE_SUB:
				case DATEADD:
				case DATEDIFF:
				case DATETIME:
				case DATETIMEV2:
				case DATEV2:
				case DATETIMEV1:
				case DATEV1:
				case DAY:
				case DAYS_ADD:
				case DAYS_SUB:
				case DECIMAL:
				case DECIMALV2:
				case DECIMALV3:
				case DEFERRED:
				case DEMAND:
				case DIAGNOSE:
				case DISTINCTPC:
				case DISTINCTPCSA:
				case DO:
				case DORIS_INTERNAL_TABLE_ID:
				case DYNAMIC:
				case ENABLE:
				case ENCRYPTKEY:
				case ENCRYPTKEYS:
				case END:
				case ENDS:
				case ENGINE:
				case ENGINES:
				case ERRORS:
				case EVENTS:
				case EVERY:
				case EXCLUDE:
				case EXPIRED:
				case EXTERNAL:
				case FAILED_LOGIN_ATTEMPTS:
				case FAST:
				case FEATURE:
				case FIELDS:
				case FILE:
				case FILTER:
				case FIRST:
				case FORMAT:
				case FREE:
				case FRONTENDS:
				case FUNCTION:
				case GLOBAL:
				case GRAPH:
				case GROUPING:
				case GROUPS:
				case HASH:
				case HDFS:
				case HELP:
				case HISTOGRAM:
				case HLL_UNION:
				case HOSTNAME:
				case HOUR:
				case HUB:
				case IDENTIFIED:
				case IGNORE:
				case IMMEDIATE:
				case INCREMENTAL:
				case INDEXES:
				case INVERTED:
				case IS_NOT_NULL_PRED:
				case IS_NULL_PRED:
				case ISNULL:
				case ISOLATION:
				case JOB:
				case JOBS:
				case JSON:
				case JSONB:
				case LABEL:
				case LAST:
				case LDAP:
				case LDAP_ADMIN_PASSWORD:
				case LESS:
				case LEVEL:
				case LINES:
				case LINK:
				case LOCAL:
				case LOCATION:
				case LOCK:
				case LOGICAL:
				case MAP:
				case MATERIALIZED:
				case MAX:
				case MEMO:
				case MERGE:
				case MIGRATE:
				case MIGRATIONS:
				case MIN:
				case MINUTE:
				case MODIFY:
				case MONTH:
				case MTMV:
				case NAME:
				case NAMES:
				case NEGATIVE:
				case NEVER:
				case NEXT:
				case NGRAM_BF:
				case NO:
				case NON_NULLABLE:
				case NULLS:
				case OF:
				case OFFSET:
				case ONLY:
				case OPEN:
				case OPTIMIZED:
				case PARAMETER:
				case PARSED:
				case PASSWORD:
				case PASSWORD_EXPIRE:
				case PASSWORD_HISTORY:
				case PASSWORD_LOCK_TIME:
				case PASSWORD_REUSE:
				case PATH:
				case PAUSE:
				case PERCENT:
				case PERIOD:
				case PERMISSIVE:
				case PHYSICAL:
				case PLAN:
				case PLUGIN:
				case PLUGINS:
				case POLICY:
				case PROC:
				case PROCESSLIST:
				case PROFILE:
				case PROPERTIES:
				case PROPERTY:
				case QUANTILE_STATE:
				case QUANTILE_UNION:
				case QUERY:
				case QUOTA:
				case RANDOM:
				case RECOVER:
				case RECYCLE:
				case REFRESH:
				case REPEATABLE:
				case REPLACE:
				case REPLACE_IF_NOT_NULL:
				case REPOSITORIES:
				case REPOSITORY:
				case RESOURCE:
				case RESOURCES:
				case RESTORE:
				case RESTRICTIVE:
				case RESUME:
				case RETURNS:
				case REWRITTEN:
				case RLIKE:
				case ROLLBACK:
				case ROLLUP:
				case ROUTINE:
				case S3:
				case SAMPLE:
				case SCHEDULER:
				case SCHEMA:
				case SECOND:
				case SERIALIZABLE:
				case SESSION:
				case SHAPE:
				case SKEW:
				case SNAPSHOT:
				case SONAME:
				case SPLIT:
				case START:
				case STARTS:
				case STATS:
				case STATUS:
				case STOP:
				case STORAGE:
				case STREAM:
				case STREAMING:
				case STRING:
				case STRUCT:
				case SUBDATE:
				case SUM:
				case TABLES:
				case TASK:
				case TASKS:
				case TEMPORARY:
				case TEXT:
				case THAN:
				case TIME:
				case TIMESTAMP:
				case TIMESTAMPADD:
				case TIMESTAMPDIFF:
				case TRANSACTION:
				case TREE:
				case TRIGGERS:
				case TRUNCATE:
				case TYPE:
				case TYPES:
				case UNCOMMITTED:
				case UNLOCK:
				case USER:
				case VALUE:
				case VARCHAR:
				case VARIABLES:
				case VERBOSE:
				case VERSION:
				case VIEW:
				case WARNINGS:
				case WEEK:
				case WORK:
				case YEAR:
				case STRING_LITERAL:
				case LEADING_STRING:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(279);
					((CreateRowPolicyContext)_localctx).user = userIdentify();
					}
					break;
				case ROLE:
					{
					setState(280);
					match(ROLE);
					setState(281);
					((CreateRowPolicyContext)_localctx).roleName = identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(284);
				match(USING);
				setState(285);
				match(LEFT_PAREN);
				setState(286);
				booleanExpression(0);
				setState(287);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				match(CREATE);
				setState(290);
				match(TABLE);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(291);
					match(IF);
					setState(292);
					match(NOT);
					setState(293);
					match(EXISTS);
					}
				}

				setState(296);
				((CreateTableContext)_localctx).name = multipartIdentifier();
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(297);
						((CreateTableContext)_localctx).ctasCols = identifierList();
						}
						break;
					}
					}
					break;
				case 2:
					{
					{
					setState(300);
					match(LEFT_PAREN);
					setState(301);
					columnDefs();
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INDEX) {
						{
						setState(302);
						indexDefs();
						}
					}

					setState(305);
					match(RIGHT_PAREN);
					}
					}
					break;
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENGINE) {
					{
					setState(309);
					match(ENGINE);
					setState(310);
					match(EQ);
					setState(311);
					((CreateTableContext)_localctx).engine = identifier();
					}
				}

				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AGGREGATE || _la==DUPLICATE || _la==UNIQUE) {
					{
					setState(314);
					_la = _input.LA(1);
					if ( !(_la==AGGREGATE || _la==DUPLICATE || _la==UNIQUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(315);
					match(KEY);
					setState(316);
					((CreateTableContext)_localctx).keys = identifierList();
					}
				}

				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(319);
					match(COMMENT);
					setState(320);
					match(STRING_LITERAL);
					}
				}

				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(323);
					match(PARTITION);
					setState(324);
					match(BY);
					setState(325);
					_la = _input.LA(1);
					if ( !(_la==LIST || _la==RANGE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(326);
					((CreateTableContext)_localctx).partitionKeys = identifierList();
					setState(327);
					match(LEFT_PAREN);
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FROM || _la==PARTITION) {
						{
						setState(328);
						((CreateTableContext)_localctx).partitions = partitionsDef();
						}
					}

					setState(331);
					match(RIGHT_PAREN);
					}
				}

				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTRIBUTED) {
					{
					setState(335);
					match(DISTRIBUTED);
					setState(336);
					match(BY);
					setState(340);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case HASH:
						{
						setState(337);
						match(HASH);
						setState(338);
						((CreateTableContext)_localctx).hashKeys = identifierList();
						}
						break;
					case RANDOM:
						{
						setState(339);
						match(RANDOM);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(345);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BUCKETS:
						{
						setState(342);
						match(BUCKETS);
						setState(343);
						match(INTEGER_VALUE);
						}
						break;
					case AUTO:
						{
						setState(344);
						match(AUTO);
						}
						break;
					case EOF:
					case SEMICOLON:
					case LEFT_PAREN:
					case AS:
					case CREATE:
					case DELETE:
					case DESC:
					case DESCRIBE:
					case EXPLAIN:
					case EXPORT:
					case INSERT:
					case LOAD:
					case PROPERTIES:
					case ROLLUP:
					case SELECT:
					case UPDATE:
					case VALUES:
					case WITH:
						break;
					default:
						break;
					}
					}
				}

				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROLLUP) {
					{
					setState(349);
					match(ROLLUP);
					setState(350);
					match(LEFT_PAREN);
					setState(351);
					rollupDefs();
					setState(352);
					match(RIGHT_PAREN);
					}
				}

				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROPERTIES) {
					{
					setState(356);
					propertyClause();
					}
				}

				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(359);
					match(AS);
					setState(360);
					query();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertIntoQueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (DESC - 119)) | (1L << (DESCRIBE - 119)) | (1L << (EXPLAIN - 119)))) != 0)) {
					{
					setState(363);
					explain();
					}
				}

				setState(366);
				match(INSERT);
				setState(370);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTO:
					{
					setState(367);
					match(INTO);
					}
					break;
				case OVERWRITE:
					{
					setState(368);
					match(OVERWRITE);
					setState(369);
					match(TABLE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				{
				setState(372);
				((InsertIntoQueryContext)_localctx).tableName = multipartIdentifier();
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(373);
					match(PARTITION);
					setState(374);
					((InsertIntoQueryContext)_localctx).partition = identifierList();
					}
				}

				setState(380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(377);
					match(WITH);
					setState(378);
					match(LABEL);
					setState(379);
					((InsertIntoQueryContext)_localctx).labelName = identifier();
					}
					break;
				}
				setState(383);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(382);
					((InsertIntoQueryContext)_localctx).cols = identifierList();
					}
					break;
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_BRACKET) {
					{
					setState(385);
					match(LEFT_BRACKET);
					setState(386);
					((InsertIntoQueryContext)_localctx).hints = identifierSeq();
					setState(387);
					match(RIGHT_BRACKET);
					}
				}

				setState(391);
				query();
				}
				break;
			case 5:
				_localctx = new UpdateContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (DESC - 119)) | (1L << (DESCRIBE - 119)) | (1L << (EXPLAIN - 119)))) != 0)) {
					{
					setState(393);
					explain();
					}
				}

				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(396);
					cte();
					}
				}

				setState(399);
				match(UPDATE);
				setState(400);
				((UpdateContext)_localctx).tableName = multipartIdentifier();
				setState(401);
				tableAlias();
				setState(402);
				match(SET);
				setState(403);
				updateAssignmentSeq();
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(404);
					fromClause();
					}
				}

				setState(407);
				whereClause();
				}
				break;
			case 6:
				_localctx = new DeleteContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (DESC - 119)) | (1L << (DESCRIBE - 119)) | (1L << (EXPLAIN - 119)))) != 0)) {
					{
					setState(409);
					explain();
					}
				}

				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(412);
					cte();
					}
				}

				setState(415);
				match(DELETE);
				setState(416);
				match(FROM);
				setState(417);
				((DeleteContext)_localctx).tableName = multipartIdentifier();
				setState(418);
				tableAlias();
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(419);
					match(PARTITION);
					setState(420);
					((DeleteContext)_localctx).partition = identifierList();
					}
				}

				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(423);
					match(USING);
					setState(424);
					relation();
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(425);
						match(COMMA);
						setState(426);
						relation();
						}
						}
						setState(431);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(434);
					whereClause();
					}
				}

				}
				break;
			case 7:
				_localctx = new LoadContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(437);
				match(LOAD);
				setState(438);
				match(LABEL);
				setState(439);
				((LoadContext)_localctx).lableName = identifier();
				setState(440);
				match(LEFT_PAREN);
				setState(441);
				((LoadContext)_localctx).dataDesc = dataDesc();
				((LoadContext)_localctx).dataDescs.add(((LoadContext)_localctx).dataDesc);
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(442);
					match(COMMA);
					setState(443);
					((LoadContext)_localctx).dataDesc = dataDesc();
					((LoadContext)_localctx).dataDescs.add(((LoadContext)_localctx).dataDesc);
					}
					}
					setState(448);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(449);
				match(RIGHT_PAREN);
				setState(451);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(450);
					withRemoteStorageSystem();
					}
					break;
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROPERTIES) {
					{
					setState(453);
					match(PROPERTIES);
					setState(454);
					match(LEFT_PAREN);
					setState(455);
					((LoadContext)_localctx).properties = propertyItemList();
					setState(456);
					match(RIGHT_PAREN);
					}
				}

				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(460);
					commentSpec();
					}
				}

				}
				break;
			case 8:
				_localctx = new ResourceLoadContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(463);
				match(LOAD);
				setState(464);
				match(LABEL);
				setState(465);
				((ResourceLoadContext)_localctx).lableName = identifier();
				setState(466);
				match(LEFT_PAREN);
				setState(467);
				((ResourceLoadContext)_localctx).dataDesc = dataDesc();
				((ResourceLoadContext)_localctx).dataDescs.add(((ResourceLoadContext)_localctx).dataDesc);
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(468);
					match(COMMA);
					setState(469);
					((ResourceLoadContext)_localctx).dataDesc = dataDesc();
					((ResourceLoadContext)_localctx).dataDescs.add(((ResourceLoadContext)_localctx).dataDesc);
					}
					}
					setState(474);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(475);
				match(RIGHT_PAREN);
				setState(476);
				resourceDesc();
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROPERTIES) {
					{
					setState(477);
					match(PROPERTIES);
					setState(478);
					match(LEFT_PAREN);
					setState(479);
					((ResourceLoadContext)_localctx).properties = propertyItemList();
					setState(480);
					match(RIGHT_PAREN);
					}
				}

				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(484);
					commentSpec();
					}
				}

				}
				break;
			case 9:
				_localctx = new MysqlLoadContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(487);
				match(LOAD);
				setState(488);
				mysqlDataDesc();
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROPERTIES) {
					{
					setState(489);
					match(PROPERTIES);
					setState(490);
					match(LEFT_PAREN);
					setState(491);
					((MysqlLoadContext)_localctx).properties = propertyItemList();
					setState(492);
					match(RIGHT_PAREN);
					}
				}

				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(496);
					commentSpec();
					}
				}

				}
				break;
			case 10:
				_localctx = new ExportContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(499);
				match(EXPORT);
				setState(500);
				match(TABLE);
				setState(501);
				((ExportContext)_localctx).tableName = multipartIdentifier();
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(502);
					match(PARTITION);
					setState(503);
					((ExportContext)_localctx).partition = identifierList();
					}
				}

				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(506);
					whereClause();
					}
				}

				setState(509);
				match(TO);
				setState(510);
				((ExportContext)_localctx).filePath = match(STRING_LITERAL);
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROPERTIES) {
					{
					setState(511);
					propertyClause();
					}
				}

				setState(515);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(514);
					withRemoteStorageSystem();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataDescContext extends ParserRuleContext {
		public Token STRING_LITERAL;
		public List<Token> filePaths = new ArrayList<Token>();
		public List<Token> filePath = new ArrayList<Token>();
		public MultipartIdentifierContext tableName;
		public IdentifierListContext partition;
		public Token comma;
		public Token separator;
		public IdentifierContext format;
		public IdentifierListContext columns;
		public ColFromPathContext columnsFromPath;
		public ColMappingListContext columnMapping;
		public PreFilterClauseContext preFilter;
		public WhereClauseContext where;
		public DeleteOnClauseContext deleteOn;
		public SequenceColClauseContext sequenceColumn;
		public TerminalNode DATA() { return getToken(DorisParser.DATA, 0); }
		public TerminalNode INFILE() { return getToken(DorisParser.INFILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode INTO() { return getToken(DorisParser.INTO, 0); }
		public List<TerminalNode> TABLE() { return getTokens(DorisParser.TABLE); }
		public TerminalNode TABLE(int i) {
			return getToken(DorisParser.TABLE, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(DorisParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(DorisParser.STRING_LITERAL, i);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public MergeTypeContext mergeType() {
			return getRuleContext(MergeTypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public TerminalNode COLUMNS() { return getToken(DorisParser.COLUMNS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(DorisParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(DorisParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(DorisParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(DorisParser.BY, i);
		}
		public TerminalNode LINES() { return getToken(DorisParser.LINES, 0); }
		public TerminalNode FORMAT() { return getToken(DorisParser.FORMAT, 0); }
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public PropertyClauseContext propertyClause() {
			return getRuleContext(PropertyClauseContext.class,0);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColFromPathContext colFromPath() {
			return getRuleContext(ColFromPathContext.class,0);
		}
		public ColMappingListContext colMappingList() {
			return getRuleContext(ColMappingListContext.class,0);
		}
		public PreFilterClauseContext preFilterClause() {
			return getRuleContext(PreFilterClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteOnClauseContext deleteOnClause() {
			return getRuleContext(DeleteOnClauseContext.class,0);
		}
		public SequenceColClauseContext sequenceColClause() {
			return getRuleContext(SequenceColClauseContext.class,0);
		}
		public TerminalNode WITH() { return getToken(DorisParser.WITH, 0); }
		public TerminalNode FROM() { return getToken(DorisParser.FROM, 0); }
		public DataDescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDesc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDataDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDataDesc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDataDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataDescContext dataDesc() throws RecognitionException {
		DataDescContext _localctx = new DataDescContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dataDesc);
		int _la;
		try {
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==APPEND || _la==DELETE || _la==MERGE || _la==WITH) {
					{
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(519);
						match(WITH);
						}
					}

					setState(522);
					mergeType();
					}
				}

				setState(525);
				match(DATA);
				setState(526);
				match(INFILE);
				setState(527);
				match(LEFT_PAREN);
				setState(528);
				((DataDescContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				((DataDescContext)_localctx).filePaths.add(((DataDescContext)_localctx).STRING_LITERAL);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(529);
					match(COMMA);
					setState(530);
					((DataDescContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
					((DataDescContext)_localctx).filePath.add(((DataDescContext)_localctx).STRING_LITERAL);
					}
					}
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(536);
				match(RIGHT_PAREN);
				setState(537);
				match(INTO);
				setState(538);
				match(TABLE);
				setState(539);
				((DataDescContext)_localctx).tableName = multipartIdentifier();
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(540);
					match(PARTITION);
					setState(541);
					((DataDescContext)_localctx).partition = identifierList();
					}
				}

				setState(548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(544);
					match(COLUMNS);
					setState(545);
					match(TERMINATED);
					setState(546);
					match(BY);
					setState(547);
					((DataDescContext)_localctx).comma = match(STRING_LITERAL);
					}
					break;
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINES) {
					{
					setState(550);
					match(LINES);
					setState(551);
					match(TERMINATED);
					setState(552);
					match(BY);
					setState(553);
					((DataDescContext)_localctx).separator = match(STRING_LITERAL);
					}
				}

				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FORMAT) {
					{
					setState(556);
					match(FORMAT);
					setState(557);
					match(AS);
					setState(558);
					((DataDescContext)_localctx).format = identifier();
					}
				}

				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(561);
					((DataDescContext)_localctx).columns = identifierList();
					}
				}

				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMNS) {
					{
					setState(564);
					((DataDescContext)_localctx).columnsFromPath = colFromPath();
					}
				}

				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET) {
					{
					setState(567);
					((DataDescContext)_localctx).columnMapping = colMappingList();
					}
				}

				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRECEDING) {
					{
					setState(570);
					((DataDescContext)_localctx).preFilter = preFilterClause();
					}
				}

				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(573);
					((DataDescContext)_localctx).where = whereClause();
					}
				}

				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DELETE) {
					{
					setState(576);
					((DataDescContext)_localctx).deleteOn = deleteOnClause();
					}
				}

				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(579);
					((DataDescContext)_localctx).sequenceColumn = sequenceColClause();
					}
				}

				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROPERTIES) {
					{
					setState(582);
					propertyClause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==APPEND || _la==DELETE || _la==MERGE || _la==WITH) {
					{
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(585);
						match(WITH);
						}
					}

					setState(588);
					mergeType();
					}
				}

				setState(591);
				match(DATA);
				setState(592);
				match(FROM);
				setState(593);
				match(TABLE);
				setState(594);
				((DataDescContext)_localctx).tableName = multipartIdentifier();
				setState(595);
				match(INTO);
				setState(596);
				match(TABLE);
				setState(597);
				((DataDescContext)_localctx).tableName = multipartIdentifier();
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(598);
					match(PARTITION);
					setState(599);
					((DataDescContext)_localctx).partition = identifierList();
					}
				}

				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET) {
					{
					setState(602);
					((DataDescContext)_localctx).columnMapping = colMappingList();
					}
				}

				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(605);
					((DataDescContext)_localctx).where = whereClause();
					}
				}

				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DELETE) {
					{
					setState(608);
					((DataDescContext)_localctx).deleteOn = deleteOnClause();
					}
				}

				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROPERTIES) {
					{
					setState(611);
					propertyClause();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierOrTextContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public TerminalNode LEADING_STRING() { return getToken(DorisParser.LEADING_STRING, 0); }
		public IdentifierOrTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIdentifierOrText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIdentifierOrText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIdentifierOrText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierOrTextContext identifierOrText() throws RecognitionException {
		IdentifierOrTextContext _localctx = new IdentifierOrTextContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identifierOrText);
		try {
			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
			case RIGHT_BRACE:
			case ADDDATE:
			case AFTER:
			case AGG_STATE:
			case AGGREGATE:
			case ALIAS:
			case ANALYZED:
			case ARRAY:
			case AT:
			case AUTHORS:
			case BACKENDS:
			case BACKUP:
			case BEGIN:
			case BIN:
			case BITAND:
			case BITMAP:
			case BITMAP_UNION:
			case BITOR:
			case BITXOR:
			case BLOB:
			case BOOLEAN:
			case BRIEF:
			case BROKER:
			case BUCKETS:
			case BUILD:
			case BUILTIN:
			case CACHED:
			case CATALOG:
			case CATALOGS:
			case CHAIN:
			case CHAR:
			case CHARSET:
			case CHECK:
			case CLUSTER:
			case CLUSTERS:
			case COLLATION:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETE:
			case CONFIG:
			case CONNECTION:
			case CONNECTION_ID:
			case CONSISTENT:
			case CONVERT:
			case COPY:
			case COUNT:
			case CREATION:
			case CRON:
			case CURRENT_CATALOG:
			case CURRENT_TIMESTAMP:
			case DATA:
			case DATE:
			case DATE_ADD:
			case DATE_CEIL:
			case DATE_DIFF:
			case DATE_FLOOR:
			case DATE_SUB:
			case DATEADD:
			case DATEDIFF:
			case DATETIME:
			case DATETIMEV2:
			case DATEV2:
			case DATETIMEV1:
			case DATEV1:
			case DAY:
			case DAYS_ADD:
			case DAYS_SUB:
			case DECIMAL:
			case DECIMALV2:
			case DECIMALV3:
			case DEFERRED:
			case DEMAND:
			case DIAGNOSE:
			case DISTINCTPC:
			case DISTINCTPCSA:
			case DO:
			case DORIS_INTERNAL_TABLE_ID:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTKEY:
			case ENCRYPTKEYS:
			case END:
			case ENDS:
			case ENGINE:
			case ENGINES:
			case ERRORS:
			case EVENTS:
			case EVERY:
			case EXCLUDE:
			case EXPIRED:
			case EXTERNAL:
			case FAILED_LOGIN_ATTEMPTS:
			case FAST:
			case FEATURE:
			case FIELDS:
			case FILE:
			case FILTER:
			case FIRST:
			case FORMAT:
			case FREE:
			case FRONTENDS:
			case FUNCTION:
			case GLOBAL:
			case GRAPH:
			case GROUPING:
			case GROUPS:
			case HASH:
			case HDFS:
			case HELP:
			case HISTOGRAM:
			case HLL_UNION:
			case HOSTNAME:
			case HOUR:
			case HUB:
			case IDENTIFIED:
			case IGNORE:
			case IMMEDIATE:
			case INCREMENTAL:
			case INDEXES:
			case INVERTED:
			case IS_NOT_NULL_PRED:
			case IS_NULL_PRED:
			case ISNULL:
			case ISOLATION:
			case JOB:
			case JOBS:
			case JSON:
			case JSONB:
			case LABEL:
			case LAST:
			case LDAP:
			case LDAP_ADMIN_PASSWORD:
			case LESS:
			case LEVEL:
			case LINES:
			case LINK:
			case LOCAL:
			case LOCATION:
			case LOCK:
			case LOGICAL:
			case MAP:
			case MATERIALIZED:
			case MAX:
			case MEMO:
			case MERGE:
			case MIGRATE:
			case MIGRATIONS:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MTMV:
			case NAME:
			case NAMES:
			case NEGATIVE:
			case NEVER:
			case NEXT:
			case NGRAM_BF:
			case NO:
			case NON_NULLABLE:
			case NULLS:
			case OF:
			case OFFSET:
			case ONLY:
			case OPEN:
			case OPTIMIZED:
			case PARAMETER:
			case PARSED:
			case PASSWORD:
			case PASSWORD_EXPIRE:
			case PASSWORD_HISTORY:
			case PASSWORD_LOCK_TIME:
			case PASSWORD_REUSE:
			case PATH:
			case PAUSE:
			case PERCENT:
			case PERIOD:
			case PERMISSIVE:
			case PHYSICAL:
			case PLAN:
			case PLUGIN:
			case PLUGINS:
			case POLICY:
			case PROC:
			case PROCESSLIST:
			case PROFILE:
			case PROPERTIES:
			case PROPERTY:
			case QUANTILE_STATE:
			case QUANTILE_UNION:
			case QUERY:
			case QUOTA:
			case RANDOM:
			case RECOVER:
			case RECYCLE:
			case REFRESH:
			case REPEATABLE:
			case REPLACE:
			case REPLACE_IF_NOT_NULL:
			case REPOSITORIES:
			case REPOSITORY:
			case RESOURCE:
			case RESOURCES:
			case RESTORE:
			case RESTRICTIVE:
			case RESUME:
			case RETURNS:
			case REWRITTEN:
			case RLIKE:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case S3:
			case SAMPLE:
			case SCHEDULER:
			case SCHEMA:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SHAPE:
			case SKEW:
			case SNAPSHOT:
			case SONAME:
			case SPLIT:
			case START:
			case STARTS:
			case STATS:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STREAMING:
			case STRING:
			case STRUCT:
			case SUBDATE:
			case SUM:
			case TABLES:
			case TASK:
			case TASKS:
			case TEMPORARY:
			case TEXT:
			case THAN:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TRANSACTION:
			case TREE:
			case TRIGGERS:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNCOMMITTED:
			case UNLOCK:
			case USER:
			case VALUE:
			case VARCHAR:
			case VARIABLES:
			case VERBOSE:
			case VERSION:
			case VIEW:
			case WARNINGS:
			case WEEK:
			case WORK:
			case YEAR:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				errorCapturingIdentifier();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				match(STRING_LITERAL);
				}
				break;
			case LEADING_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(618);
				match(LEADING_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserIdentifyContext extends ParserRuleContext {
		public IdentifierOrTextContext user;
		public IdentifierOrTextContext host;
		public List<IdentifierOrTextContext> identifierOrText() {
			return getRuleContexts(IdentifierOrTextContext.class);
		}
		public IdentifierOrTextContext identifierOrText(int i) {
			return getRuleContext(IdentifierOrTextContext.class,i);
		}
		public TerminalNode AT() { return getToken(DorisParser.AT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public UserIdentifyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userIdentify; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterUserIdentify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitUserIdentify(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitUserIdentify(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserIdentifyContext userIdentify() throws RecognitionException {
		UserIdentifyContext _localctx = new UserIdentifyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_userIdentify);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			((UserIdentifyContext)_localctx).user = identifierOrText();
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(622);
				match(AT);
				setState(628);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_BRACE:
				case RIGHT_BRACE:
				case ADDDATE:
				case AFTER:
				case AGG_STATE:
				case AGGREGATE:
				case ALIAS:
				case ANALYZED:
				case ARRAY:
				case AT:
				case AUTHORS:
				case BACKENDS:
				case BACKUP:
				case BEGIN:
				case BIN:
				case BITAND:
				case BITMAP:
				case BITMAP_UNION:
				case BITOR:
				case BITXOR:
				case BLOB:
				case BOOLEAN:
				case BRIEF:
				case BROKER:
				case BUCKETS:
				case BUILD:
				case BUILTIN:
				case CACHED:
				case CATALOG:
				case CATALOGS:
				case CHAIN:
				case CHAR:
				case CHARSET:
				case CHECK:
				case CLUSTER:
				case CLUSTERS:
				case COLLATION:
				case COLUMNS:
				case COMMENT:
				case COMMIT:
				case COMMITTED:
				case COMPACT:
				case COMPLETE:
				case CONFIG:
				case CONNECTION:
				case CONNECTION_ID:
				case CONSISTENT:
				case CONVERT:
				case COPY:
				case COUNT:
				case CREATION:
				case CRON:
				case CURRENT_CATALOG:
				case CURRENT_TIMESTAMP:
				case DATA:
				case DATE:
				case DATE_ADD:
				case DATE_CEIL:
				case DATE_DIFF:
				case DATE_FLOOR:
				case DATE_SUB:
				case DATEADD:
				case DATEDIFF:
				case DATETIME:
				case DATETIMEV2:
				case DATEV2:
				case DATETIMEV1:
				case DATEV1:
				case DAY:
				case DAYS_ADD:
				case DAYS_SUB:
				case DECIMAL:
				case DECIMALV2:
				case DECIMALV3:
				case DEFERRED:
				case DEMAND:
				case DIAGNOSE:
				case DISTINCTPC:
				case DISTINCTPCSA:
				case DO:
				case DORIS_INTERNAL_TABLE_ID:
				case DYNAMIC:
				case ENABLE:
				case ENCRYPTKEY:
				case ENCRYPTKEYS:
				case END:
				case ENDS:
				case ENGINE:
				case ENGINES:
				case ERRORS:
				case EVENTS:
				case EVERY:
				case EXCLUDE:
				case EXPIRED:
				case EXTERNAL:
				case FAILED_LOGIN_ATTEMPTS:
				case FAST:
				case FEATURE:
				case FIELDS:
				case FILE:
				case FILTER:
				case FIRST:
				case FORMAT:
				case FREE:
				case FRONTENDS:
				case FUNCTION:
				case GLOBAL:
				case GRAPH:
				case GROUPING:
				case GROUPS:
				case HASH:
				case HDFS:
				case HELP:
				case HISTOGRAM:
				case HLL_UNION:
				case HOSTNAME:
				case HOUR:
				case HUB:
				case IDENTIFIED:
				case IGNORE:
				case IMMEDIATE:
				case INCREMENTAL:
				case INDEXES:
				case INVERTED:
				case IS_NOT_NULL_PRED:
				case IS_NULL_PRED:
				case ISNULL:
				case ISOLATION:
				case JOB:
				case JOBS:
				case JSON:
				case JSONB:
				case LABEL:
				case LAST:
				case LDAP:
				case LDAP_ADMIN_PASSWORD:
				case LESS:
				case LEVEL:
				case LINES:
				case LINK:
				case LOCAL:
				case LOCATION:
				case LOCK:
				case LOGICAL:
				case MAP:
				case MATERIALIZED:
				case MAX:
				case MEMO:
				case MERGE:
				case MIGRATE:
				case MIGRATIONS:
				case MIN:
				case MINUTE:
				case MODIFY:
				case MONTH:
				case MTMV:
				case NAME:
				case NAMES:
				case NEGATIVE:
				case NEVER:
				case NEXT:
				case NGRAM_BF:
				case NO:
				case NON_NULLABLE:
				case NULLS:
				case OF:
				case OFFSET:
				case ONLY:
				case OPEN:
				case OPTIMIZED:
				case PARAMETER:
				case PARSED:
				case PASSWORD:
				case PASSWORD_EXPIRE:
				case PASSWORD_HISTORY:
				case PASSWORD_LOCK_TIME:
				case PASSWORD_REUSE:
				case PATH:
				case PAUSE:
				case PERCENT:
				case PERIOD:
				case PERMISSIVE:
				case PHYSICAL:
				case PLAN:
				case PLUGIN:
				case PLUGINS:
				case POLICY:
				case PROC:
				case PROCESSLIST:
				case PROFILE:
				case PROPERTIES:
				case PROPERTY:
				case QUANTILE_STATE:
				case QUANTILE_UNION:
				case QUERY:
				case QUOTA:
				case RANDOM:
				case RECOVER:
				case RECYCLE:
				case REFRESH:
				case REPEATABLE:
				case REPLACE:
				case REPLACE_IF_NOT_NULL:
				case REPOSITORIES:
				case REPOSITORY:
				case RESOURCE:
				case RESOURCES:
				case RESTORE:
				case RESTRICTIVE:
				case RESUME:
				case RETURNS:
				case REWRITTEN:
				case RLIKE:
				case ROLLBACK:
				case ROLLUP:
				case ROUTINE:
				case S3:
				case SAMPLE:
				case SCHEDULER:
				case SCHEMA:
				case SECOND:
				case SERIALIZABLE:
				case SESSION:
				case SHAPE:
				case SKEW:
				case SNAPSHOT:
				case SONAME:
				case SPLIT:
				case START:
				case STARTS:
				case STATS:
				case STATUS:
				case STOP:
				case STORAGE:
				case STREAM:
				case STREAMING:
				case STRING:
				case STRUCT:
				case SUBDATE:
				case SUM:
				case TABLES:
				case TASK:
				case TASKS:
				case TEMPORARY:
				case TEXT:
				case THAN:
				case TIME:
				case TIMESTAMP:
				case TIMESTAMPADD:
				case TIMESTAMPDIFF:
				case TRANSACTION:
				case TREE:
				case TRIGGERS:
				case TRUNCATE:
				case TYPE:
				case TYPES:
				case UNCOMMITTED:
				case UNLOCK:
				case USER:
				case VALUE:
				case VARCHAR:
				case VARIABLES:
				case VERBOSE:
				case VERSION:
				case VIEW:
				case WARNINGS:
				case WEEK:
				case WORK:
				case YEAR:
				case STRING_LITERAL:
				case LEADING_STRING:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(623);
					((UserIdentifyContext)_localctx).host = identifierOrText();
					}
					break;
				case LEFT_PAREN:
					{
					setState(624);
					match(LEFT_PAREN);
					setState(625);
					((UserIdentifyContext)_localctx).host = identifierOrText();
					setState(626);
					match(RIGHT_PAREN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplainContext extends ParserRuleContext {
		public Token level;
		public TerminalNode EXPLAIN() { return getToken(DorisParser.EXPLAIN, 0); }
		public TerminalNode DESC() { return getToken(DorisParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(DorisParser.DESCRIBE, 0); }
		public PlanTypeContext planType() {
			return getRuleContext(PlanTypeContext.class,0);
		}
		public TerminalNode VERBOSE() { return getToken(DorisParser.VERBOSE, 0); }
		public TerminalNode TREE() { return getToken(DorisParser.TREE, 0); }
		public TerminalNode GRAPH() { return getToken(DorisParser.GRAPH, 0); }
		public TerminalNode PLAN() { return getToken(DorisParser.PLAN, 0); }
		public ExplainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplainContext explain() throws RecognitionException {
		ExplainContext _localctx = new ExplainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_explain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXPLAIN:
				{
				setState(632);
				match(EXPLAIN);
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL || _la==ANALYZED || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (LOGICAL - 249)) | (1L << (MEMO - 249)) | (1L << (OPTIMIZED - 249)) | (1L << (PARSED - 249)))) != 0) || _la==PHYSICAL || _la==REWRITTEN || _la==SHAPE) {
					{
					setState(633);
					planType();
					}
				}

				}
				break;
			case DESC:
				{
				setState(636);
				match(DESC);
				}
				break;
			case DESCRIBE:
				{
				setState(637);
				match(DESCRIBE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GRAPH || _la==PLAN || _la==TREE || _la==VERBOSE) {
				{
				setState(640);
				((ExplainContext)_localctx).level = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GRAPH || _la==PLAN || _la==TREE || _la==VERBOSE) ) {
					((ExplainContext)_localctx).level = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlanTypeContext extends ParserRuleContext {
		public TerminalNode PARSED() { return getToken(DorisParser.PARSED, 0); }
		public TerminalNode ANALYZED() { return getToken(DorisParser.ANALYZED, 0); }
		public TerminalNode REWRITTEN() { return getToken(DorisParser.REWRITTEN, 0); }
		public TerminalNode LOGICAL() { return getToken(DorisParser.LOGICAL, 0); }
		public TerminalNode OPTIMIZED() { return getToken(DorisParser.OPTIMIZED, 0); }
		public TerminalNode PHYSICAL() { return getToken(DorisParser.PHYSICAL, 0); }
		public TerminalNode SHAPE() { return getToken(DorisParser.SHAPE, 0); }
		public TerminalNode MEMO() { return getToken(DorisParser.MEMO, 0); }
		public TerminalNode ALL() { return getToken(DorisParser.ALL, 0); }
		public PlanTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_planType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPlanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPlanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPlanType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlanTypeContext planType() throws RecognitionException {
		PlanTypeContext _localctx = new PlanTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_planType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==ANALYZED || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (LOGICAL - 249)) | (1L << (MEMO - 249)) | (1L << (OPTIMIZED - 249)) | (1L << (PARSED - 249)))) != 0) || _la==PHYSICAL || _la==REWRITTEN || _la==SHAPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MergeTypeContext extends ParserRuleContext {
		public TerminalNode APPEND() { return getToken(DorisParser.APPEND, 0); }
		public TerminalNode DELETE() { return getToken(DorisParser.DELETE, 0); }
		public TerminalNode MERGE() { return getToken(DorisParser.MERGE, 0); }
		public MergeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterMergeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitMergeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitMergeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeTypeContext mergeType() throws RecognitionException {
		MergeTypeContext _localctx = new MergeTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mergeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_la = _input.LA(1);
			if ( !(_la==APPEND || _la==DELETE || _la==MERGE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreFilterClauseContext extends ParserRuleContext {
		public TerminalNode PRECEDING() { return getToken(DorisParser.PRECEDING, 0); }
		public TerminalNode FILTER() { return getToken(DorisParser.FILTER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PreFilterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preFilterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPreFilterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPreFilterClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPreFilterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreFilterClauseContext preFilterClause() throws RecognitionException {
		PreFilterClauseContext _localctx = new PreFilterClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_preFilterClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(PRECEDING);
			setState(648);
			match(FILTER);
			setState(649);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteOnClauseContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(DorisParser.DELETE, 0); }
		public TerminalNode ON() { return getToken(DorisParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeleteOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteOnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDeleteOnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDeleteOnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDeleteOnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteOnClauseContext deleteOnClause() throws RecognitionException {
		DeleteOnClauseContext _localctx = new DeleteOnClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_deleteOnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(DELETE);
			setState(652);
			match(ON);
			setState(653);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceColClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(DorisParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(DorisParser.BY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SequenceColClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceColClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSequenceColClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSequenceColClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSequenceColClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceColClauseContext sequenceColClause() throws RecognitionException {
		SequenceColClauseContext _localctx = new SequenceColClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sequenceColClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(ORDER);
			setState(656);
			match(BY);
			setState(657);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColFromPathContext extends ParserRuleContext {
		public TerminalNode COLUMNS() { return getToken(DorisParser.COLUMNS, 0); }
		public TerminalNode FROM() { return getToken(DorisParser.FROM, 0); }
		public TerminalNode PATH() { return getToken(DorisParser.PATH, 0); }
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ColFromPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colFromPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterColFromPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitColFromPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitColFromPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColFromPathContext colFromPath() throws RecognitionException {
		ColFromPathContext _localctx = new ColFromPathContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_colFromPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(COLUMNS);
			setState(660);
			match(FROM);
			setState(661);
			match(PATH);
			setState(662);
			match(AS);
			setState(663);
			identifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColMappingListContext extends ParserRuleContext {
		public MappingExprContext mappingExpr;
		public List<MappingExprContext> mappingSet = new ArrayList<MappingExprContext>();
		public TerminalNode SET() { return getToken(DorisParser.SET, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<MappingExprContext> mappingExpr() {
			return getRuleContexts(MappingExprContext.class);
		}
		public MappingExprContext mappingExpr(int i) {
			return getRuleContext(MappingExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public ColMappingListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colMappingList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterColMappingList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitColMappingList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitColMappingList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColMappingListContext colMappingList() throws RecognitionException {
		ColMappingListContext _localctx = new ColMappingListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_colMappingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(SET);
			setState(666);
			match(LEFT_PAREN);
			setState(667);
			((ColMappingListContext)_localctx).mappingExpr = mappingExpr();
			((ColMappingListContext)_localctx).mappingSet.add(((ColMappingListContext)_localctx).mappingExpr);
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(668);
				match(COMMA);
				setState(669);
				((ColMappingListContext)_localctx).mappingExpr = mappingExpr();
				((ColMappingListContext)_localctx).mappingSet.add(((ColMappingListContext)_localctx).mappingExpr);
				}
				}
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(675);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingExprContext extends ParserRuleContext {
		public IdentifierContext mappingCol;
		public TerminalNode EQ() { return getToken(DorisParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MappingExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterMappingExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitMappingExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitMappingExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingExprContext mappingExpr() throws RecognitionException {
		MappingExprContext _localctx = new MappingExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mappingExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(677);
			((MappingExprContext)_localctx).mappingCol = identifier();
			setState(678);
			match(EQ);
			setState(679);
			expression();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithRemoteStorageSystemContext extends ParserRuleContext {
		public PropertyItemListContext brokerProperties;
		public IdentifierOrTextContext brokerName;
		public TerminalNode WITH() { return getToken(DorisParser.WITH, 0); }
		public TerminalNode S3() { return getToken(DorisParser.S3, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public PropertyItemListContext propertyItemList() {
			return getRuleContext(PropertyItemListContext.class,0);
		}
		public TerminalNode HDFS() { return getToken(DorisParser.HDFS, 0); }
		public TerminalNode LOCAL() { return getToken(DorisParser.LOCAL, 0); }
		public TerminalNode BROKER() { return getToken(DorisParser.BROKER, 0); }
		public IdentifierOrTextContext identifierOrText() {
			return getRuleContext(IdentifierOrTextContext.class,0);
		}
		public WithRemoteStorageSystemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withRemoteStorageSystem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterWithRemoteStorageSystem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitWithRemoteStorageSystem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitWithRemoteStorageSystem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithRemoteStorageSystemContext withRemoteStorageSystem() throws RecognitionException {
		WithRemoteStorageSystemContext _localctx = new WithRemoteStorageSystemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_withRemoteStorageSystem);
		try {
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				match(WITH);
				setState(682);
				match(S3);
				setState(683);
				match(LEFT_PAREN);
				setState(684);
				((WithRemoteStorageSystemContext)_localctx).brokerProperties = propertyItemList();
				setState(685);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				match(WITH);
				setState(688);
				match(HDFS);
				setState(689);
				match(LEFT_PAREN);
				setState(690);
				((WithRemoteStorageSystemContext)_localctx).brokerProperties = propertyItemList();
				setState(691);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(693);
				match(WITH);
				setState(694);
				match(LOCAL);
				setState(695);
				match(LEFT_PAREN);
				setState(696);
				((WithRemoteStorageSystemContext)_localctx).brokerProperties = propertyItemList();
				setState(697);
				match(RIGHT_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(699);
				match(WITH);
				setState(700);
				match(BROKER);
				setState(701);
				((WithRemoteStorageSystemContext)_localctx).brokerName = identifierOrText();
				setState(706);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(702);
					match(LEFT_PAREN);
					setState(703);
					((WithRemoteStorageSystemContext)_localctx).brokerProperties = propertyItemList();
					setState(704);
					match(RIGHT_PAREN);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceDescContext extends ParserRuleContext {
		public IdentifierOrTextContext resourceName;
		public TerminalNode WITH() { return getToken(DorisParser.WITH, 0); }
		public TerminalNode RESOURCE() { return getToken(DorisParser.RESOURCE, 0); }
		public IdentifierOrTextContext identifierOrText() {
			return getRuleContext(IdentifierOrTextContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public PropertyItemListContext propertyItemList() {
			return getRuleContext(PropertyItemListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public ResourceDescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceDesc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterResourceDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitResourceDesc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitResourceDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceDescContext resourceDesc() throws RecognitionException {
		ResourceDescContext _localctx = new ResourceDescContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_resourceDesc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(WITH);
			setState(711);
			match(RESOURCE);
			setState(712);
			((ResourceDescContext)_localctx).resourceName = identifierOrText();
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(713);
				match(LEFT_PAREN);
				setState(714);
				propertyItemList();
				setState(715);
				match(RIGHT_PAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MysqlDataDescContext extends ParserRuleContext {
		public Token filePath;
		public MultipartIdentifierContext tableName;
		public IdentifierListContext partition;
		public Token comma;
		public Token separator;
		public IdentifierListContext columns;
		public TerminalNode DATA() { return getToken(DorisParser.DATA, 0); }
		public TerminalNode INFILE() { return getToken(DorisParser.INFILE, 0); }
		public TerminalNode INTO() { return getToken(DorisParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(DorisParser.TABLE, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(DorisParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(DorisParser.STRING_LITERAL, i);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(DorisParser.LOCAL, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public TerminalNode COLUMNS() { return getToken(DorisParser.COLUMNS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(DorisParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(DorisParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(DorisParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(DorisParser.BY, i);
		}
		public TerminalNode LINES() { return getToken(DorisParser.LINES, 0); }
		public SkipLinesContext skipLines() {
			return getRuleContext(SkipLinesContext.class,0);
		}
		public ColMappingListContext colMappingList() {
			return getRuleContext(ColMappingListContext.class,0);
		}
		public PropertyClauseContext propertyClause() {
			return getRuleContext(PropertyClauseContext.class,0);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public MysqlDataDescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mysqlDataDesc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterMysqlDataDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitMysqlDataDesc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitMysqlDataDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MysqlDataDescContext mysqlDataDesc() throws RecognitionException {
		MysqlDataDescContext _localctx = new MysqlDataDescContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mysqlDataDesc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(DATA);
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL) {
				{
				setState(720);
				match(LOCAL);
				setState(721);
				booleanValue();
				}
			}

			setState(724);
			match(INFILE);
			setState(725);
			((MysqlDataDescContext)_localctx).filePath = match(STRING_LITERAL);
			setState(726);
			match(INTO);
			setState(727);
			match(TABLE);
			setState(728);
			((MysqlDataDescContext)_localctx).tableName = multipartIdentifier();
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(729);
				match(PARTITION);
				setState(730);
				((MysqlDataDescContext)_localctx).partition = identifierList();
				}
			}

			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMNS) {
				{
				setState(733);
				match(COLUMNS);
				setState(734);
				match(TERMINATED);
				setState(735);
				match(BY);
				setState(736);
				((MysqlDataDescContext)_localctx).comma = match(STRING_LITERAL);
				}
			}

			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINES) {
				{
				setState(739);
				match(LINES);
				setState(740);
				match(TERMINATED);
				setState(741);
				match(BY);
				setState(742);
				((MysqlDataDescContext)_localctx).separator = match(STRING_LITERAL);
				}
			}

			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(745);
				skipLines();
				}
			}

			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(748);
				((MysqlDataDescContext)_localctx).columns = identifierList();
				}
				break;
			}
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SET) {
				{
				setState(751);
				colMappingList();
				}
			}

			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(754);
				propertyClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkipLinesContext extends ParserRuleContext {
		public Token lines;
		public TerminalNode IGNORE() { return getToken(DorisParser.IGNORE, 0); }
		public TerminalNode LINES() { return getToken(DorisParser.LINES, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public TerminalNode ROWS() { return getToken(DorisParser.ROWS, 0); }
		public SkipLinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipLines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSkipLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSkipLines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSkipLines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipLinesContext skipLines() throws RecognitionException {
		SkipLinesContext _localctx = new SkipLinesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_skipLines);
		try {
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				match(IGNORE);
				setState(758);
				((SkipLinesContext)_localctx).lines = match(INTEGER_VALUE);
				setState(759);
				match(LINES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				match(IGNORE);
				setState(761);
				((SkipLinesContext)_localctx).lines = match(INTEGER_VALUE);
				setState(762);
				match(ROWS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutFileClauseContext extends ParserRuleContext {
		public ConstantContext filePath;
		public IdentifierContext format;
		public TerminalNode INTO() { return getToken(DorisParser.INTO, 0); }
		public TerminalNode OUTFILE() { return getToken(DorisParser.OUTFILE, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode FORMAT() { return getToken(DorisParser.FORMAT, 0); }
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public PropertyClauseContext propertyClause() {
			return getRuleContext(PropertyClauseContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OutFileClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outFileClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterOutFileClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitOutFileClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitOutFileClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutFileClauseContext outFileClause() throws RecognitionException {
		OutFileClauseContext _localctx = new OutFileClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_outFileClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(INTO);
			setState(766);
			match(OUTFILE);
			setState(767);
			((OutFileClauseContext)_localctx).filePath = constant();
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORMAT) {
				{
				setState(768);
				match(FORMAT);
				setState(769);
				match(AS);
				setState(770);
				((OutFileClauseContext)_localctx).format = identifier();
				}
			}

			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROPERTIES) {
				{
				setState(773);
				propertyClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(776);
				cte();
				}
			}

			setState(779);
			queryTerm(0);
			setState(780);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode UNION() { return getToken(DorisParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(DorisParser.EXCEPT, 0); }
		public TerminalNode INTERSECT() { return getToken(DorisParser.INTERSECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(783);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(793);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
					((SetOperationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
					setState(785);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(786);
					((SetOperationContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXCEPT || _la==INTERSECT || _la==UNION) ) {
						((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(788);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT || _la==DISTINCTROW) {
						{
						setState(787);
						setQuantifier();
						}
					}

					setState(790);
					((SetOperationContext)_localctx).right = queryTerm(2);
					}
					} 
				}
				setState(795);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(DorisParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(DorisParser.ALL, 0); }
		public TerminalNode DISTINCTROW() { return getToken(DorisParser.DISTINCTROW, 0); }
		public TerminalNode EXCEPT() { return getToken(DorisParser.EXCEPT, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_setQuantifier);
		try {
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				match(DISTINCT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				match(ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(798);
				match(DISTINCTROW);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(799);
				match(ALL);
				setState(800);
				match(EXCEPT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValuesTableContext extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public ValuesTableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterValuesTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitValuesTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitValuesTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_queryPrimary);
		try {
			setState(809);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				querySpecification();
				}
				break;
			case LEFT_PAREN:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				match(LEFT_PAREN);
				setState(805);
				query();
				setState(806);
				match(RIGHT_PAREN);
				}
				break;
			case VALUES:
				_localctx = new ValuesTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(808);
				inlineTable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggClauseContext aggClause() {
			return getRuleContext(AggClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterRegularQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitRegularQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitRegularQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_querySpecification);
		try {
			_localctx = new RegularQuerySpecificationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			selectClause();
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(812);
				fromClause();
				}
				break;
			}
			setState(816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(815);
				whereClause();
				}
				break;
			}
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(818);
				aggClause();
				}
				break;
			}
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(821);
				havingClause();
				}
				break;
			}
			setState(824);
			if (!(doris_legacy_SQL_syntax)) throw new FailedPredicateException(this, "doris_legacy_SQL_syntax");
			setState(825);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CteContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(DorisParser.WITH, 0); }
		public List<AliasQueryContext> aliasQuery() {
			return getRuleContexts(AliasQueryContext.class);
		}
		public AliasQueryContext aliasQuery(int i) {
			return getRuleContext(AliasQueryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(WITH);
			setState(828);
			aliasQuery();
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(829);
				match(COMMA);
				setState(830);
				aliasQuery();
				}
				}
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasQueryContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public AliasQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterAliasQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitAliasQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitAliasQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasQueryContext aliasQuery() throws RecognitionException {
		AliasQueryContext _localctx = new AliasQueryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_aliasQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			identifier();
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(837);
				columnAliases();
				}
			}

			setState(840);
			match(AS);
			setState(841);
			match(LEFT_PAREN);
			setState(842);
			query();
			setState(843);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnAliasesContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public ColumnAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterColumnAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitColumnAliases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitColumnAliases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasesContext columnAliases() throws RecognitionException {
		ColumnAliasesContext _localctx = new ColumnAliasesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_columnAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(LEFT_PAREN);
			setState(846);
			identifier();
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(847);
				match(COMMA);
				setState(848);
				identifier();
				}
				}
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(854);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(DorisParser.SELECT, 0); }
		public SelectColumnClauseContext selectColumnClause() {
			return getRuleContext(SelectColumnClauseContext.class,0);
		}
		public SelectHintContext selectHint() {
			return getRuleContext(SelectHintContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(DorisParser.DISTINCT, 0); }
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(SELECT);
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HINT_START) {
				{
				setState(857);
				selectHint();
				}
			}

			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(860);
				match(DISTINCT);
				}
			}

			setState(863);
			selectColumnClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectColumnClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(DorisParser.ASTERISK, 0); }
		public TerminalNode EXCEPT() { return getToken(DorisParser.EXCEPT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public SelectColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectColumnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSelectColumnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSelectColumnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSelectColumnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectColumnClauseContext selectColumnClause() throws RecognitionException {
		SelectColumnClauseContext _localctx = new SelectColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_selectColumnClause);
		try {
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				namedExpressionSeq();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(866);
				match(ASTERISK);
				setState(867);
				match(EXCEPT);
				setState(868);
				match(LEFT_PAREN);
				setState(869);
				namedExpressionSeq();
				setState(870);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(DorisParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(WHERE);
			setState(875);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(DorisParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(FROM);
			setState(878);
			relation();
			setState(883);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(879);
					match(COMMA);
					setState(880);
					relation();
					}
					} 
				}
				setState(885);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			relationPrimary();
			setState(890);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(887);
					joinRelation();
					}
					} 
				}
				setState(892);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(DorisParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinHintContext joinHint() {
			return getRuleContext(JoinHintContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_joinRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(893);
			joinType();
			}
			setState(894);
			match(JOIN);
			setState(896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET || _la==HINT_START) {
				{
				setState(895);
				joinHint();
				}
			}

			setState(898);
			((JoinRelationContext)_localctx).right = relationPrimary();
			setState(900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(899);
				joinCriteria();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinHintContext extends ParserRuleContext {
		public JoinHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinHint; }
	 
		public JoinHintContext() { }
		public void copyFrom(JoinHintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommentJoinHintContext extends JoinHintContext {
		public TerminalNode HINT_START() { return getToken(DorisParser.HINT_START, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode HINT_END() { return getToken(DorisParser.HINT_END, 0); }
		public CommentJoinHintContext(JoinHintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCommentJoinHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCommentJoinHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCommentJoinHint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketJoinHintContext extends JoinHintContext {
		public TerminalNode LEFT_BRACKET() { return getToken(DorisParser.LEFT_BRACKET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(DorisParser.RIGHT_BRACKET, 0); }
		public BracketJoinHintContext(JoinHintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterBracketJoinHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitBracketJoinHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitBracketJoinHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinHintContext joinHint() throws RecognitionException {
		JoinHintContext _localctx = new JoinHintContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_joinHint);
		try {
			setState(910);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACKET:
				_localctx = new BracketJoinHintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(902);
				match(LEFT_BRACKET);
				setState(903);
				identifier();
				setState(904);
				match(RIGHT_BRACKET);
				}
				break;
			case HINT_START:
				_localctx = new CommentJoinHintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(906);
				match(HINT_START);
				setState(907);
				identifier();
				setState(908);
				match(HINT_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationHintContext extends ParserRuleContext {
		public RelationHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationHint; }
	 
		public RelationHintContext() { }
		public void copyFrom(RelationHintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BracketRelationHintContext extends RelationHintContext {
		public TerminalNode LEFT_BRACKET() { return getToken(DorisParser.LEFT_BRACKET, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(DorisParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public BracketRelationHintContext(RelationHintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterBracketRelationHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitBracketRelationHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitBracketRelationHint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentRelationHintContext extends RelationHintContext {
		public TerminalNode HINT_START() { return getToken(DorisParser.HINT_START, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode HINT_END() { return getToken(DorisParser.HINT_END, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public CommentRelationHintContext(RelationHintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCommentRelationHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCommentRelationHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCommentRelationHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationHintContext relationHint() throws RecognitionException {
		RelationHintContext _localctx = new RelationHintContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_relationHint);
		int _la;
		try {
			setState(934);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACKET:
				_localctx = new BracketRelationHintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(912);
				match(LEFT_BRACKET);
				setState(913);
				identifier();
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(914);
					match(COMMA);
					setState(915);
					identifier();
					}
					}
					setState(920);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(921);
				match(RIGHT_BRACKET);
				}
				break;
			case HINT_START:
				_localctx = new CommentRelationHintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(923);
				match(HINT_START);
				setState(924);
				identifier();
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(925);
					match(COMMA);
					setState(926);
					identifier();
					}
					}
					setState(931);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(932);
				match(HINT_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(DorisParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(DorisParser.BY, 0); }
		public GroupingElementContext groupingElement() {
			return getRuleContext(GroupingElementContext.class,0);
		}
		public AggClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterAggClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitAggClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitAggClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggClauseContext aggClause() throws RecognitionException {
		AggClauseContext _localctx = new AggClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_aggClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(GROUP);
			setState(937);
			match(BY);
			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(938);
				groupingElement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingElementContext extends ParserRuleContext {
		public TerminalNode ROLLUP() { return getToken(DorisParser.ROLLUP, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public TerminalNode CUBE() { return getToken(DorisParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(DorisParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(DorisParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterGroupingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitGroupingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitGroupingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_groupingElement);
		int _la;
		try {
			int _alt;
			setState(988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				match(ROLLUP);
				setState(942);
				match(LEFT_PAREN);
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << RIGHT_BRACE) | (1L << ADD) | (1L << ADDDATE) | (1L << AFTER) | (1L << AGG_STATE) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ANALYZED) | (1L << ARRAY) | (1L << AT) | (1L << AUTHORS) | (1L << BACKENDS) | (1L << BACKUP) | (1L << BEGIN) | (1L << BIN) | (1L << BITAND) | (1L << BITMAP) | (1L << BITMAP_UNION) | (1L << BITOR) | (1L << BITXOR) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BRIEF) | (1L << BROKER) | (1L << BUCKETS) | (1L << BUILD) | (1L << BUILTIN) | (1L << CACHED) | (1L << CASE) | (1L << CAST) | (1L << CATALOG) | (1L << CATALOGS) | (1L << CHAIN) | (1L << CHAR) | (1L << CHARSET) | (1L << CHECK))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLUSTER - 65)) | (1L << (CLUSTERS - 65)) | (1L << (COLLATION - 65)) | (1L << (COLUMNS - 65)) | (1L << (COMMENT - 65)) | (1L << (COMMIT - 65)) | (1L << (COMMITTED - 65)) | (1L << (COMPACT - 65)) | (1L << (COMPLETE - 65)) | (1L << (CONFIG - 65)) | (1L << (CONNECTION - 65)) | (1L << (CONNECTION_ID - 65)) | (1L << (CONSISTENT - 65)) | (1L << (CONVERT - 65)) | (1L << (COPY - 65)) | (1L << (COUNT - 65)) | (1L << (CREATION - 65)) | (1L << (CRON - 65)) | (1L << (CURRENT_CATALOG - 65)) | (1L << (CURRENT_TIMESTAMP - 65)) | (1L << (CURRENT_USER - 65)) | (1L << (DATA - 65)) | (1L << (DATABASE - 65)) | (1L << (DATE - 65)) | (1L << (DATE_ADD - 65)) | (1L << (DATE_CEIL - 65)) | (1L << (DATE_DIFF - 65)) | (1L << (DATE_FLOOR - 65)) | (1L << (DATE_SUB - 65)) | (1L << (DATEADD - 65)) | (1L << (DATEDIFF - 65)) | (1L << (DATETIME - 65)) | (1L << (DATETIMEV2 - 65)) | (1L << (DATEV2 - 65)) | (1L << (DATETIMEV1 - 65)) | (1L << (DATEV1 - 65)) | (1L << (DAY - 65)) | (1L << (DAYS_ADD - 65)) | (1L << (DAYS_SUB - 65)) | (1L << (DECIMAL - 65)) | (1L << (DECIMALV2 - 65)) | (1L << (DECIMALV3 - 65)) | (1L << (DEFERRED - 65)) | (1L << (DEMAND - 65)) | (1L << (DIAGNOSE - 65)) | (1L << (DISTINCTPC - 65)) | (1L << (DISTINCTPCSA - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (DO - 130)) | (1L << (DORIS_INTERNAL_TABLE_ID - 130)) | (1L << (DYNAMIC - 130)) | (1L << (ENABLE - 130)) | (1L << (ENCRYPTKEY - 130)) | (1L << (ENCRYPTKEYS - 130)) | (1L << (END - 130)) | (1L << (ENDS - 130)) | (1L << (ENGINE - 130)) | (1L << (ENGINES - 130)) | (1L << (ERRORS - 130)) | (1L << (EVENTS - 130)) | (1L << (EVERY - 130)) | (1L << (EXCLUDE - 130)) | (1L << (EXISTS - 130)) | (1L << (EXPIRED - 130)) | (1L << (EXTERNAL - 130)) | (1L << (EXTRACT - 130)) | (1L << (FAILED_LOGIN_ATTEMPTS - 130)) | (1L << (FALSE - 130)) | (1L << (FAST - 130)) | (1L << (FEATURE - 130)) | (1L << (FIELDS - 130)) | (1L << (FILE - 130)) | (1L << (FILTER - 130)) | (1L << (FIRST - 130)) | (1L << (FORMAT - 130)) | (1L << (FREE - 130)) | (1L << (FRONTENDS - 130)) | (1L << (FUNCTION - 130)) | (1L << (GLOBAL - 130)) | (1L << (GRAPH - 130)) | (1L << (GROUPING - 130)) | (1L << (GROUPS - 130)) | (1L << (HASH - 130)) | (1L << (HDFS - 130)) | (1L << (HELP - 130)) | (1L << (HISTOGRAM - 130)) | (1L << (HLL_UNION - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (HOSTNAME - 194)) | (1L << (HOUR - 194)) | (1L << (HUB - 194)) | (1L << (IDENTIFIED - 194)) | (1L << (IF - 194)) | (1L << (IGNORE - 194)) | (1L << (IMMEDIATE - 194)) | (1L << (INCREMENTAL - 194)) | (1L << (INDEXES - 194)) | (1L << (INTERVAL - 194)) | (1L << (INVERTED - 194)) | (1L << (IS_NOT_NULL_PRED - 194)) | (1L << (IS_NULL_PRED - 194)) | (1L << (ISNULL - 194)) | (1L << (ISOLATION - 194)) | (1L << (JOB - 194)) | (1L << (JOBS - 194)) | (1L << (JSON - 194)) | (1L << (JSONB - 194)) | (1L << (KEY - 194)) | (1L << (LABEL - 194)) | (1L << (LAST - 194)) | (1L << (LDAP - 194)) | (1L << (LDAP_ADMIN_PASSWORD - 194)) | (1L << (LEFT - 194)) | (1L << (LESS - 194)) | (1L << (LEVEL - 194)) | (1L << (LIKE - 194)) | (1L << (LINES - 194)) | (1L << (LINK - 194)) | (1L << (LOCAL - 194)) | (1L << (LOCATION - 194)) | (1L << (LOCK - 194)) | (1L << (LOGICAL - 194)) | (1L << (MAP - 194)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (MATERIALIZED - 261)) | (1L << (MAX - 261)) | (1L << (MEMO - 261)) | (1L << (MERGE - 261)) | (1L << (MIGRATE - 261)) | (1L << (MIGRATIONS - 261)) | (1L << (MIN - 261)) | (1L << (MINUTE - 261)) | (1L << (MODIFY - 261)) | (1L << (MONTH - 261)) | (1L << (MTMV - 261)) | (1L << (NAME - 261)) | (1L << (NAMES - 261)) | (1L << (NEGATIVE - 261)) | (1L << (NEVER - 261)) | (1L << (NEXT - 261)) | (1L << (NGRAM_BF - 261)) | (1L << (NO - 261)) | (1L << (NON_NULLABLE - 261)) | (1L << (NOT - 261)) | (1L << (NULL - 261)) | (1L << (NULLS - 261)) | (1L << (OF - 261)) | (1L << (OFFSET - 261)) | (1L << (ONLY - 261)) | (1L << (OPEN - 261)) | (1L << (OPTIMIZED - 261)) | (1L << (PARAMETER - 261)) | (1L << (PARSED - 261)) | (1L << (PASSWORD - 261)) | (1L << (PASSWORD_EXPIRE - 261)) | (1L << (PASSWORD_HISTORY - 261)) | (1L << (PASSWORD_LOCK_TIME - 261)) | (1L << (PASSWORD_REUSE - 261)) | (1L << (PATH - 261)) | (1L << (PAUSE - 261)) | (1L << (PERCENT - 261)) | (1L << (PERIOD - 261)) | (1L << (PERMISSIVE - 261)) | (1L << (PHYSICAL - 261)) | (1L << (PLAN - 261)) | (1L << (PLUGIN - 261)) | (1L << (PLUGINS - 261)) | (1L << (POLICY - 261)) | (1L << (PROC - 261)) | (1L << (PROCESSLIST - 261)) | (1L << (PROFILE - 261)) | (1L << (PROPERTIES - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (PROPERTY - 325)) | (1L << (QUANTILE_STATE - 325)) | (1L << (QUANTILE_UNION - 325)) | (1L << (QUERY - 325)) | (1L << (QUOTA - 325)) | (1L << (RANDOM - 325)) | (1L << (RECOVER - 325)) | (1L << (RECYCLE - 325)) | (1L << (REFRESH - 325)) | (1L << (REGEXP - 325)) | (1L << (REPEATABLE - 325)) | (1L << (REPLACE - 325)) | (1L << (REPLACE_IF_NOT_NULL - 325)) | (1L << (REPOSITORIES - 325)) | (1L << (REPOSITORY - 325)) | (1L << (RESOURCE - 325)) | (1L << (RESOURCES - 325)) | (1L << (RESTORE - 325)) | (1L << (RESTRICTIVE - 325)) | (1L << (RESUME - 325)) | (1L << (RETURNS - 325)) | (1L << (REWRITTEN - 325)) | (1L << (RIGHT - 325)) | (1L << (RLIKE - 325)) | (1L << (ROLLBACK - 325)) | (1L << (ROLLUP - 325)) | (1L << (ROUTINE - 325)) | (1L << (S3 - 325)) | (1L << (SAMPLE - 325)) | (1L << (SCHEDULER - 325)) | (1L << (SCHEMA - 325)) | (1L << (SECOND - 325)) | (1L << (SERIALIZABLE - 325)) | (1L << (SESSION - 325)) | (1L << (SHAPE - 325)) | (1L << (SKEW - 325)) | (1L << (SNAPSHOT - 325)) | (1L << (SONAME - 325)) | (1L << (SPLIT - 325)) | (1L << (START - 325)) | (1L << (STARTS - 325)) | (1L << (STATS - 325)))) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (STATUS - 389)) | (1L << (STOP - 389)) | (1L << (STORAGE - 389)) | (1L << (STREAM - 389)) | (1L << (STREAMING - 389)) | (1L << (STRING - 389)) | (1L << (STRUCT - 389)) | (1L << (SUBDATE - 389)) | (1L << (SUM - 389)) | (1L << (TABLES - 389)) | (1L << (TASK - 389)) | (1L << (TASKS - 389)) | (1L << (TEMPORARY - 389)) | (1L << (TEXT - 389)) | (1L << (THAN - 389)) | (1L << (TIME - 389)) | (1L << (TIMESTAMP - 389)) | (1L << (TIMESTAMPADD - 389)) | (1L << (TIMESTAMPDIFF - 389)) | (1L << (TRANSACTION - 389)) | (1L << (TREE - 389)) | (1L << (TRIGGERS - 389)) | (1L << (TRIM - 389)) | (1L << (TRUE - 389)) | (1L << (TRUNCATE - 389)) | (1L << (TYPE - 389)) | (1L << (TYPES - 389)) | (1L << (UNCOMMITTED - 389)) | (1L << (UNLOCK - 389)) | (1L << (USER - 389)) | (1L << (VALUE - 389)) | (1L << (VARCHAR - 389)) | (1L << (VARIABLES - 389)) | (1L << (VERBOSE - 389)) | (1L << (VERSION - 389)) | (1L << (VIEW - 389)) | (1L << (WARNINGS - 389)) | (1L << (WEEK - 389)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (WORK - 454)) | (1L << (YEAR - 454)) | (1L << (PLUS - 454)) | (1L << (SUBTRACT - 454)) | (1L << (ASTERISK - 454)) | (1L << (TILDE - 454)) | (1L << (LOGICALNOT - 454)) | (1L << (ATSIGN - 454)) | (1L << (DOUBLEATSIGN - 454)) | (1L << (STRING_LITERAL - 454)) | (1L << (INTEGER_VALUE - 454)) | (1L << (EXPONENT_VALUE - 454)) | (1L << (DECIMAL_VALUE - 454)) | (1L << (IDENTIFIER - 454)) | (1L << (BACKQUOTED_IDENTIFIER - 454)))) != 0)) {
					{
					setState(943);
					expression();
					setState(948);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(944);
						match(COMMA);
						setState(945);
						expression();
						}
						}
						setState(950);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(953);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(954);
				match(CUBE);
				setState(955);
				match(LEFT_PAREN);
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << RIGHT_BRACE) | (1L << ADD) | (1L << ADDDATE) | (1L << AFTER) | (1L << AGG_STATE) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ANALYZED) | (1L << ARRAY) | (1L << AT) | (1L << AUTHORS) | (1L << BACKENDS) | (1L << BACKUP) | (1L << BEGIN) | (1L << BIN) | (1L << BITAND) | (1L << BITMAP) | (1L << BITMAP_UNION) | (1L << BITOR) | (1L << BITXOR) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BRIEF) | (1L << BROKER) | (1L << BUCKETS) | (1L << BUILD) | (1L << BUILTIN) | (1L << CACHED) | (1L << CASE) | (1L << CAST) | (1L << CATALOG) | (1L << CATALOGS) | (1L << CHAIN) | (1L << CHAR) | (1L << CHARSET) | (1L << CHECK))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLUSTER - 65)) | (1L << (CLUSTERS - 65)) | (1L << (COLLATION - 65)) | (1L << (COLUMNS - 65)) | (1L << (COMMENT - 65)) | (1L << (COMMIT - 65)) | (1L << (COMMITTED - 65)) | (1L << (COMPACT - 65)) | (1L << (COMPLETE - 65)) | (1L << (CONFIG - 65)) | (1L << (CONNECTION - 65)) | (1L << (CONNECTION_ID - 65)) | (1L << (CONSISTENT - 65)) | (1L << (CONVERT - 65)) | (1L << (COPY - 65)) | (1L << (COUNT - 65)) | (1L << (CREATION - 65)) | (1L << (CRON - 65)) | (1L << (CURRENT_CATALOG - 65)) | (1L << (CURRENT_TIMESTAMP - 65)) | (1L << (CURRENT_USER - 65)) | (1L << (DATA - 65)) | (1L << (DATABASE - 65)) | (1L << (DATE - 65)) | (1L << (DATE_ADD - 65)) | (1L << (DATE_CEIL - 65)) | (1L << (DATE_DIFF - 65)) | (1L << (DATE_FLOOR - 65)) | (1L << (DATE_SUB - 65)) | (1L << (DATEADD - 65)) | (1L << (DATEDIFF - 65)) | (1L << (DATETIME - 65)) | (1L << (DATETIMEV2 - 65)) | (1L << (DATEV2 - 65)) | (1L << (DATETIMEV1 - 65)) | (1L << (DATEV1 - 65)) | (1L << (DAY - 65)) | (1L << (DAYS_ADD - 65)) | (1L << (DAYS_SUB - 65)) | (1L << (DECIMAL - 65)) | (1L << (DECIMALV2 - 65)) | (1L << (DECIMALV3 - 65)) | (1L << (DEFERRED - 65)) | (1L << (DEMAND - 65)) | (1L << (DIAGNOSE - 65)) | (1L << (DISTINCTPC - 65)) | (1L << (DISTINCTPCSA - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (DO - 130)) | (1L << (DORIS_INTERNAL_TABLE_ID - 130)) | (1L << (DYNAMIC - 130)) | (1L << (ENABLE - 130)) | (1L << (ENCRYPTKEY - 130)) | (1L << (ENCRYPTKEYS - 130)) | (1L << (END - 130)) | (1L << (ENDS - 130)) | (1L << (ENGINE - 130)) | (1L << (ENGINES - 130)) | (1L << (ERRORS - 130)) | (1L << (EVENTS - 130)) | (1L << (EVERY - 130)) | (1L << (EXCLUDE - 130)) | (1L << (EXISTS - 130)) | (1L << (EXPIRED - 130)) | (1L << (EXTERNAL - 130)) | (1L << (EXTRACT - 130)) | (1L << (FAILED_LOGIN_ATTEMPTS - 130)) | (1L << (FALSE - 130)) | (1L << (FAST - 130)) | (1L << (FEATURE - 130)) | (1L << (FIELDS - 130)) | (1L << (FILE - 130)) | (1L << (FILTER - 130)) | (1L << (FIRST - 130)) | (1L << (FORMAT - 130)) | (1L << (FREE - 130)) | (1L << (FRONTENDS - 130)) | (1L << (FUNCTION - 130)) | (1L << (GLOBAL - 130)) | (1L << (GRAPH - 130)) | (1L << (GROUPING - 130)) | (1L << (GROUPS - 130)) | (1L << (HASH - 130)) | (1L << (HDFS - 130)) | (1L << (HELP - 130)) | (1L << (HISTOGRAM - 130)) | (1L << (HLL_UNION - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (HOSTNAME - 194)) | (1L << (HOUR - 194)) | (1L << (HUB - 194)) | (1L << (IDENTIFIED - 194)) | (1L << (IF - 194)) | (1L << (IGNORE - 194)) | (1L << (IMMEDIATE - 194)) | (1L << (INCREMENTAL - 194)) | (1L << (INDEXES - 194)) | (1L << (INTERVAL - 194)) | (1L << (INVERTED - 194)) | (1L << (IS_NOT_NULL_PRED - 194)) | (1L << (IS_NULL_PRED - 194)) | (1L << (ISNULL - 194)) | (1L << (ISOLATION - 194)) | (1L << (JOB - 194)) | (1L << (JOBS - 194)) | (1L << (JSON - 194)) | (1L << (JSONB - 194)) | (1L << (KEY - 194)) | (1L << (LABEL - 194)) | (1L << (LAST - 194)) | (1L << (LDAP - 194)) | (1L << (LDAP_ADMIN_PASSWORD - 194)) | (1L << (LEFT - 194)) | (1L << (LESS - 194)) | (1L << (LEVEL - 194)) | (1L << (LIKE - 194)) | (1L << (LINES - 194)) | (1L << (LINK - 194)) | (1L << (LOCAL - 194)) | (1L << (LOCATION - 194)) | (1L << (LOCK - 194)) | (1L << (LOGICAL - 194)) | (1L << (MAP - 194)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (MATERIALIZED - 261)) | (1L << (MAX - 261)) | (1L << (MEMO - 261)) | (1L << (MERGE - 261)) | (1L << (MIGRATE - 261)) | (1L << (MIGRATIONS - 261)) | (1L << (MIN - 261)) | (1L << (MINUTE - 261)) | (1L << (MODIFY - 261)) | (1L << (MONTH - 261)) | (1L << (MTMV - 261)) | (1L << (NAME - 261)) | (1L << (NAMES - 261)) | (1L << (NEGATIVE - 261)) | (1L << (NEVER - 261)) | (1L << (NEXT - 261)) | (1L << (NGRAM_BF - 261)) | (1L << (NO - 261)) | (1L << (NON_NULLABLE - 261)) | (1L << (NOT - 261)) | (1L << (NULL - 261)) | (1L << (NULLS - 261)) | (1L << (OF - 261)) | (1L << (OFFSET - 261)) | (1L << (ONLY - 261)) | (1L << (OPEN - 261)) | (1L << (OPTIMIZED - 261)) | (1L << (PARAMETER - 261)) | (1L << (PARSED - 261)) | (1L << (PASSWORD - 261)) | (1L << (PASSWORD_EXPIRE - 261)) | (1L << (PASSWORD_HISTORY - 261)) | (1L << (PASSWORD_LOCK_TIME - 261)) | (1L << (PASSWORD_REUSE - 261)) | (1L << (PATH - 261)) | (1L << (PAUSE - 261)) | (1L << (PERCENT - 261)) | (1L << (PERIOD - 261)) | (1L << (PERMISSIVE - 261)) | (1L << (PHYSICAL - 261)) | (1L << (PLAN - 261)) | (1L << (PLUGIN - 261)) | (1L << (PLUGINS - 261)) | (1L << (POLICY - 261)) | (1L << (PROC - 261)) | (1L << (PROCESSLIST - 261)) | (1L << (PROFILE - 261)) | (1L << (PROPERTIES - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (PROPERTY - 325)) | (1L << (QUANTILE_STATE - 325)) | (1L << (QUANTILE_UNION - 325)) | (1L << (QUERY - 325)) | (1L << (QUOTA - 325)) | (1L << (RANDOM - 325)) | (1L << (RECOVER - 325)) | (1L << (RECYCLE - 325)) | (1L << (REFRESH - 325)) | (1L << (REGEXP - 325)) | (1L << (REPEATABLE - 325)) | (1L << (REPLACE - 325)) | (1L << (REPLACE_IF_NOT_NULL - 325)) | (1L << (REPOSITORIES - 325)) | (1L << (REPOSITORY - 325)) | (1L << (RESOURCE - 325)) | (1L << (RESOURCES - 325)) | (1L << (RESTORE - 325)) | (1L << (RESTRICTIVE - 325)) | (1L << (RESUME - 325)) | (1L << (RETURNS - 325)) | (1L << (REWRITTEN - 325)) | (1L << (RIGHT - 325)) | (1L << (RLIKE - 325)) | (1L << (ROLLBACK - 325)) | (1L << (ROLLUP - 325)) | (1L << (ROUTINE - 325)) | (1L << (S3 - 325)) | (1L << (SAMPLE - 325)) | (1L << (SCHEDULER - 325)) | (1L << (SCHEMA - 325)) | (1L << (SECOND - 325)) | (1L << (SERIALIZABLE - 325)) | (1L << (SESSION - 325)) | (1L << (SHAPE - 325)) | (1L << (SKEW - 325)) | (1L << (SNAPSHOT - 325)) | (1L << (SONAME - 325)) | (1L << (SPLIT - 325)) | (1L << (START - 325)) | (1L << (STARTS - 325)) | (1L << (STATS - 325)))) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (STATUS - 389)) | (1L << (STOP - 389)) | (1L << (STORAGE - 389)) | (1L << (STREAM - 389)) | (1L << (STREAMING - 389)) | (1L << (STRING - 389)) | (1L << (STRUCT - 389)) | (1L << (SUBDATE - 389)) | (1L << (SUM - 389)) | (1L << (TABLES - 389)) | (1L << (TASK - 389)) | (1L << (TASKS - 389)) | (1L << (TEMPORARY - 389)) | (1L << (TEXT - 389)) | (1L << (THAN - 389)) | (1L << (TIME - 389)) | (1L << (TIMESTAMP - 389)) | (1L << (TIMESTAMPADD - 389)) | (1L << (TIMESTAMPDIFF - 389)) | (1L << (TRANSACTION - 389)) | (1L << (TREE - 389)) | (1L << (TRIGGERS - 389)) | (1L << (TRIM - 389)) | (1L << (TRUE - 389)) | (1L << (TRUNCATE - 389)) | (1L << (TYPE - 389)) | (1L << (TYPES - 389)) | (1L << (UNCOMMITTED - 389)) | (1L << (UNLOCK - 389)) | (1L << (USER - 389)) | (1L << (VALUE - 389)) | (1L << (VARCHAR - 389)) | (1L << (VARIABLES - 389)) | (1L << (VERBOSE - 389)) | (1L << (VERSION - 389)) | (1L << (VIEW - 389)) | (1L << (WARNINGS - 389)) | (1L << (WEEK - 389)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (WORK - 454)) | (1L << (YEAR - 454)) | (1L << (PLUS - 454)) | (1L << (SUBTRACT - 454)) | (1L << (ASTERISK - 454)) | (1L << (TILDE - 454)) | (1L << (LOGICALNOT - 454)) | (1L << (ATSIGN - 454)) | (1L << (DOUBLEATSIGN - 454)) | (1L << (STRING_LITERAL - 454)) | (1L << (INTEGER_VALUE - 454)) | (1L << (EXPONENT_VALUE - 454)) | (1L << (DECIMAL_VALUE - 454)) | (1L << (IDENTIFIER - 454)) | (1L << (BACKQUOTED_IDENTIFIER - 454)))) != 0)) {
					{
					setState(956);
					expression();
					setState(961);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(957);
						match(COMMA);
						setState(958);
						expression();
						}
						}
						setState(963);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(966);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(967);
				match(GROUPING);
				setState(968);
				match(SETS);
				setState(969);
				match(LEFT_PAREN);
				setState(970);
				groupingSet();
				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(971);
					match(COMMA);
					setState(972);
					groupingSet();
					}
					}
					setState(977);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(978);
				match(RIGHT_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(980);
				expression();
				setState(985);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(981);
						match(COMMA);
						setState(982);
						expression();
						}
						} 
					}
					setState(987);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_groupingSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(LEFT_PAREN);
			setState(999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << RIGHT_BRACE) | (1L << ADD) | (1L << ADDDATE) | (1L << AFTER) | (1L << AGG_STATE) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ANALYZED) | (1L << ARRAY) | (1L << AT) | (1L << AUTHORS) | (1L << BACKENDS) | (1L << BACKUP) | (1L << BEGIN) | (1L << BIN) | (1L << BITAND) | (1L << BITMAP) | (1L << BITMAP_UNION) | (1L << BITOR) | (1L << BITXOR) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BRIEF) | (1L << BROKER) | (1L << BUCKETS) | (1L << BUILD) | (1L << BUILTIN) | (1L << CACHED) | (1L << CASE) | (1L << CAST) | (1L << CATALOG) | (1L << CATALOGS) | (1L << CHAIN) | (1L << CHAR) | (1L << CHARSET) | (1L << CHECK))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLUSTER - 65)) | (1L << (CLUSTERS - 65)) | (1L << (COLLATION - 65)) | (1L << (COLUMNS - 65)) | (1L << (COMMENT - 65)) | (1L << (COMMIT - 65)) | (1L << (COMMITTED - 65)) | (1L << (COMPACT - 65)) | (1L << (COMPLETE - 65)) | (1L << (CONFIG - 65)) | (1L << (CONNECTION - 65)) | (1L << (CONNECTION_ID - 65)) | (1L << (CONSISTENT - 65)) | (1L << (CONVERT - 65)) | (1L << (COPY - 65)) | (1L << (COUNT - 65)) | (1L << (CREATION - 65)) | (1L << (CRON - 65)) | (1L << (CURRENT_CATALOG - 65)) | (1L << (CURRENT_TIMESTAMP - 65)) | (1L << (CURRENT_USER - 65)) | (1L << (DATA - 65)) | (1L << (DATABASE - 65)) | (1L << (DATE - 65)) | (1L << (DATE_ADD - 65)) | (1L << (DATE_CEIL - 65)) | (1L << (DATE_DIFF - 65)) | (1L << (DATE_FLOOR - 65)) | (1L << (DATE_SUB - 65)) | (1L << (DATEADD - 65)) | (1L << (DATEDIFF - 65)) | (1L << (DATETIME - 65)) | (1L << (DATETIMEV2 - 65)) | (1L << (DATEV2 - 65)) | (1L << (DATETIMEV1 - 65)) | (1L << (DATEV1 - 65)) | (1L << (DAY - 65)) | (1L << (DAYS_ADD - 65)) | (1L << (DAYS_SUB - 65)) | (1L << (DECIMAL - 65)) | (1L << (DECIMALV2 - 65)) | (1L << (DECIMALV3 - 65)) | (1L << (DEFERRED - 65)) | (1L << (DEMAND - 65)) | (1L << (DIAGNOSE - 65)) | (1L << (DISTINCTPC - 65)) | (1L << (DISTINCTPCSA - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (DO - 130)) | (1L << (DORIS_INTERNAL_TABLE_ID - 130)) | (1L << (DYNAMIC - 130)) | (1L << (ENABLE - 130)) | (1L << (ENCRYPTKEY - 130)) | (1L << (ENCRYPTKEYS - 130)) | (1L << (END - 130)) | (1L << (ENDS - 130)) | (1L << (ENGINE - 130)) | (1L << (ENGINES - 130)) | (1L << (ERRORS - 130)) | (1L << (EVENTS - 130)) | (1L << (EVERY - 130)) | (1L << (EXCLUDE - 130)) | (1L << (EXISTS - 130)) | (1L << (EXPIRED - 130)) | (1L << (EXTERNAL - 130)) | (1L << (EXTRACT - 130)) | (1L << (FAILED_LOGIN_ATTEMPTS - 130)) | (1L << (FALSE - 130)) | (1L << (FAST - 130)) | (1L << (FEATURE - 130)) | (1L << (FIELDS - 130)) | (1L << (FILE - 130)) | (1L << (FILTER - 130)) | (1L << (FIRST - 130)) | (1L << (FORMAT - 130)) | (1L << (FREE - 130)) | (1L << (FRONTENDS - 130)) | (1L << (FUNCTION - 130)) | (1L << (GLOBAL - 130)) | (1L << (GRAPH - 130)) | (1L << (GROUPING - 130)) | (1L << (GROUPS - 130)) | (1L << (HASH - 130)) | (1L << (HDFS - 130)) | (1L << (HELP - 130)) | (1L << (HISTOGRAM - 130)) | (1L << (HLL_UNION - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (HOSTNAME - 194)) | (1L << (HOUR - 194)) | (1L << (HUB - 194)) | (1L << (IDENTIFIED - 194)) | (1L << (IF - 194)) | (1L << (IGNORE - 194)) | (1L << (IMMEDIATE - 194)) | (1L << (INCREMENTAL - 194)) | (1L << (INDEXES - 194)) | (1L << (INTERVAL - 194)) | (1L << (INVERTED - 194)) | (1L << (IS_NOT_NULL_PRED - 194)) | (1L << (IS_NULL_PRED - 194)) | (1L << (ISNULL - 194)) | (1L << (ISOLATION - 194)) | (1L << (JOB - 194)) | (1L << (JOBS - 194)) | (1L << (JSON - 194)) | (1L << (JSONB - 194)) | (1L << (KEY - 194)) | (1L << (LABEL - 194)) | (1L << (LAST - 194)) | (1L << (LDAP - 194)) | (1L << (LDAP_ADMIN_PASSWORD - 194)) | (1L << (LEFT - 194)) | (1L << (LESS - 194)) | (1L << (LEVEL - 194)) | (1L << (LIKE - 194)) | (1L << (LINES - 194)) | (1L << (LINK - 194)) | (1L << (LOCAL - 194)) | (1L << (LOCATION - 194)) | (1L << (LOCK - 194)) | (1L << (LOGICAL - 194)) | (1L << (MAP - 194)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (MATERIALIZED - 261)) | (1L << (MAX - 261)) | (1L << (MEMO - 261)) | (1L << (MERGE - 261)) | (1L << (MIGRATE - 261)) | (1L << (MIGRATIONS - 261)) | (1L << (MIN - 261)) | (1L << (MINUTE - 261)) | (1L << (MODIFY - 261)) | (1L << (MONTH - 261)) | (1L << (MTMV - 261)) | (1L << (NAME - 261)) | (1L << (NAMES - 261)) | (1L << (NEGATIVE - 261)) | (1L << (NEVER - 261)) | (1L << (NEXT - 261)) | (1L << (NGRAM_BF - 261)) | (1L << (NO - 261)) | (1L << (NON_NULLABLE - 261)) | (1L << (NOT - 261)) | (1L << (NULL - 261)) | (1L << (NULLS - 261)) | (1L << (OF - 261)) | (1L << (OFFSET - 261)) | (1L << (ONLY - 261)) | (1L << (OPEN - 261)) | (1L << (OPTIMIZED - 261)) | (1L << (PARAMETER - 261)) | (1L << (PARSED - 261)) | (1L << (PASSWORD - 261)) | (1L << (PASSWORD_EXPIRE - 261)) | (1L << (PASSWORD_HISTORY - 261)) | (1L << (PASSWORD_LOCK_TIME - 261)) | (1L << (PASSWORD_REUSE - 261)) | (1L << (PATH - 261)) | (1L << (PAUSE - 261)) | (1L << (PERCENT - 261)) | (1L << (PERIOD - 261)) | (1L << (PERMISSIVE - 261)) | (1L << (PHYSICAL - 261)) | (1L << (PLAN - 261)) | (1L << (PLUGIN - 261)) | (1L << (PLUGINS - 261)) | (1L << (POLICY - 261)) | (1L << (PROC - 261)) | (1L << (PROCESSLIST - 261)) | (1L << (PROFILE - 261)) | (1L << (PROPERTIES - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (PROPERTY - 325)) | (1L << (QUANTILE_STATE - 325)) | (1L << (QUANTILE_UNION - 325)) | (1L << (QUERY - 325)) | (1L << (QUOTA - 325)) | (1L << (RANDOM - 325)) | (1L << (RECOVER - 325)) | (1L << (RECYCLE - 325)) | (1L << (REFRESH - 325)) | (1L << (REGEXP - 325)) | (1L << (REPEATABLE - 325)) | (1L << (REPLACE - 325)) | (1L << (REPLACE_IF_NOT_NULL - 325)) | (1L << (REPOSITORIES - 325)) | (1L << (REPOSITORY - 325)) | (1L << (RESOURCE - 325)) | (1L << (RESOURCES - 325)) | (1L << (RESTORE - 325)) | (1L << (RESTRICTIVE - 325)) | (1L << (RESUME - 325)) | (1L << (RETURNS - 325)) | (1L << (REWRITTEN - 325)) | (1L << (RIGHT - 325)) | (1L << (RLIKE - 325)) | (1L << (ROLLBACK - 325)) | (1L << (ROLLUP - 325)) | (1L << (ROUTINE - 325)) | (1L << (S3 - 325)) | (1L << (SAMPLE - 325)) | (1L << (SCHEDULER - 325)) | (1L << (SCHEMA - 325)) | (1L << (SECOND - 325)) | (1L << (SERIALIZABLE - 325)) | (1L << (SESSION - 325)) | (1L << (SHAPE - 325)) | (1L << (SKEW - 325)) | (1L << (SNAPSHOT - 325)) | (1L << (SONAME - 325)) | (1L << (SPLIT - 325)) | (1L << (START - 325)) | (1L << (STARTS - 325)) | (1L << (STATS - 325)))) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (STATUS - 389)) | (1L << (STOP - 389)) | (1L << (STORAGE - 389)) | (1L << (STREAM - 389)) | (1L << (STREAMING - 389)) | (1L << (STRING - 389)) | (1L << (STRUCT - 389)) | (1L << (SUBDATE - 389)) | (1L << (SUM - 389)) | (1L << (TABLES - 389)) | (1L << (TASK - 389)) | (1L << (TASKS - 389)) | (1L << (TEMPORARY - 389)) | (1L << (TEXT - 389)) | (1L << (THAN - 389)) | (1L << (TIME - 389)) | (1L << (TIMESTAMP - 389)) | (1L << (TIMESTAMPADD - 389)) | (1L << (TIMESTAMPDIFF - 389)) | (1L << (TRANSACTION - 389)) | (1L << (TREE - 389)) | (1L << (TRIGGERS - 389)) | (1L << (TRIM - 389)) | (1L << (TRUE - 389)) | (1L << (TRUNCATE - 389)) | (1L << (TYPE - 389)) | (1L << (TYPES - 389)) | (1L << (UNCOMMITTED - 389)) | (1L << (UNLOCK - 389)) | (1L << (USER - 389)) | (1L << (VALUE - 389)) | (1L << (VARCHAR - 389)) | (1L << (VARIABLES - 389)) | (1L << (VERBOSE - 389)) | (1L << (VERSION - 389)) | (1L << (VIEW - 389)) | (1L << (WARNINGS - 389)) | (1L << (WEEK - 389)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (WORK - 454)) | (1L << (YEAR - 454)) | (1L << (PLUS - 454)) | (1L << (SUBTRACT - 454)) | (1L << (ASTERISK - 454)) | (1L << (TILDE - 454)) | (1L << (LOGICALNOT - 454)) | (1L << (ATSIGN - 454)) | (1L << (DOUBLEATSIGN - 454)) | (1L << (STRING_LITERAL - 454)) | (1L << (INTEGER_VALUE - 454)) | (1L << (EXPONENT_VALUE - 454)) | (1L << (DECIMAL_VALUE - 454)) | (1L << (IDENTIFIER - 454)) | (1L << (BACKQUOTED_IDENTIFIER - 454)))) != 0)) {
				{
				setState(991);
				expression();
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(992);
					match(COMMA);
					setState(993);
					expression();
					}
					}
					setState(998);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1001);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(DorisParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			match(HAVING);
			setState(1004);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectHintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public TerminalNode HINT_START() { return getToken(DorisParser.HINT_START, 0); }
		public TerminalNode HINT_END() { return getToken(DorisParser.HINT_END, 0); }
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public SelectHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectHint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSelectHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSelectHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSelectHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectHintContext selectHint() throws RecognitionException {
		SelectHintContext _localctx = new SelectHintContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_selectHint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(HINT_START);
			setState(1007);
			((SelectHintContext)_localctx).hintStatement = hintStatement();
			((SelectHintContext)_localctx).hintStatements.add(((SelectHintContext)_localctx).hintStatement);
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << LEFT_BRACE) | (1L << RIGHT_BRACE) | (1L << ADDDATE) | (1L << AFTER) | (1L << AGG_STATE) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ANALYZED) | (1L << ARRAY) | (1L << AT) | (1L << AUTHORS) | (1L << BACKENDS) | (1L << BACKUP) | (1L << BEGIN) | (1L << BIN) | (1L << BITAND) | (1L << BITMAP) | (1L << BITMAP_UNION) | (1L << BITOR) | (1L << BITXOR) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BRIEF) | (1L << BROKER) | (1L << BUCKETS) | (1L << BUILD) | (1L << BUILTIN) | (1L << CACHED) | (1L << CATALOG) | (1L << CATALOGS) | (1L << CHAIN) | (1L << CHAR) | (1L << CHARSET) | (1L << CHECK))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLUSTER - 65)) | (1L << (CLUSTERS - 65)) | (1L << (COLLATION - 65)) | (1L << (COLUMNS - 65)) | (1L << (COMMENT - 65)) | (1L << (COMMIT - 65)) | (1L << (COMMITTED - 65)) | (1L << (COMPACT - 65)) | (1L << (COMPLETE - 65)) | (1L << (CONFIG - 65)) | (1L << (CONNECTION - 65)) | (1L << (CONNECTION_ID - 65)) | (1L << (CONSISTENT - 65)) | (1L << (CONVERT - 65)) | (1L << (COPY - 65)) | (1L << (COUNT - 65)) | (1L << (CREATION - 65)) | (1L << (CRON - 65)) | (1L << (CURRENT_CATALOG - 65)) | (1L << (CURRENT_TIMESTAMP - 65)) | (1L << (DATA - 65)) | (1L << (DATE - 65)) | (1L << (DATE_ADD - 65)) | (1L << (DATE_CEIL - 65)) | (1L << (DATE_DIFF - 65)) | (1L << (DATE_FLOOR - 65)) | (1L << (DATE_SUB - 65)) | (1L << (DATEADD - 65)) | (1L << (DATEDIFF - 65)) | (1L << (DATETIME - 65)) | (1L << (DATETIMEV2 - 65)) | (1L << (DATEV2 - 65)) | (1L << (DATETIMEV1 - 65)) | (1L << (DATEV1 - 65)) | (1L << (DAY - 65)) | (1L << (DAYS_ADD - 65)) | (1L << (DAYS_SUB - 65)) | (1L << (DECIMAL - 65)) | (1L << (DECIMALV2 - 65)) | (1L << (DECIMALV3 - 65)) | (1L << (DEFERRED - 65)) | (1L << (DEMAND - 65)) | (1L << (DIAGNOSE - 65)) | (1L << (DISTINCTPC - 65)) | (1L << (DISTINCTPCSA - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (DO - 130)) | (1L << (DORIS_INTERNAL_TABLE_ID - 130)) | (1L << (DYNAMIC - 130)) | (1L << (ENABLE - 130)) | (1L << (ENCRYPTKEY - 130)) | (1L << (ENCRYPTKEYS - 130)) | (1L << (END - 130)) | (1L << (ENDS - 130)) | (1L << (ENGINE - 130)) | (1L << (ENGINES - 130)) | (1L << (ERRORS - 130)) | (1L << (EVENTS - 130)) | (1L << (EVERY - 130)) | (1L << (EXCLUDE - 130)) | (1L << (EXPIRED - 130)) | (1L << (EXTERNAL - 130)) | (1L << (FAILED_LOGIN_ATTEMPTS - 130)) | (1L << (FAST - 130)) | (1L << (FEATURE - 130)) | (1L << (FIELDS - 130)) | (1L << (FILE - 130)) | (1L << (FILTER - 130)) | (1L << (FIRST - 130)) | (1L << (FORMAT - 130)) | (1L << (FREE - 130)) | (1L << (FRONTENDS - 130)) | (1L << (FUNCTION - 130)) | (1L << (GLOBAL - 130)) | (1L << (GRAPH - 130)) | (1L << (GROUPING - 130)) | (1L << (GROUPS - 130)) | (1L << (HASH - 130)) | (1L << (HDFS - 130)) | (1L << (HELP - 130)) | (1L << (HISTOGRAM - 130)) | (1L << (HLL_UNION - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (HOSTNAME - 194)) | (1L << (HOUR - 194)) | (1L << (HUB - 194)) | (1L << (IDENTIFIED - 194)) | (1L << (IGNORE - 194)) | (1L << (IMMEDIATE - 194)) | (1L << (INCREMENTAL - 194)) | (1L << (INDEXES - 194)) | (1L << (INVERTED - 194)) | (1L << (IS_NOT_NULL_PRED - 194)) | (1L << (IS_NULL_PRED - 194)) | (1L << (ISNULL - 194)) | (1L << (ISOLATION - 194)) | (1L << (JOB - 194)) | (1L << (JOBS - 194)) | (1L << (JSON - 194)) | (1L << (JSONB - 194)) | (1L << (LABEL - 194)) | (1L << (LAST - 194)) | (1L << (LDAP - 194)) | (1L << (LDAP_ADMIN_PASSWORD - 194)) | (1L << (LESS - 194)) | (1L << (LEVEL - 194)) | (1L << (LINES - 194)) | (1L << (LINK - 194)) | (1L << (LOCAL - 194)) | (1L << (LOCATION - 194)) | (1L << (LOCK - 194)) | (1L << (LOGICAL - 194)) | (1L << (MAP - 194)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (MATERIALIZED - 261)) | (1L << (MAX - 261)) | (1L << (MEMO - 261)) | (1L << (MERGE - 261)) | (1L << (MIGRATE - 261)) | (1L << (MIGRATIONS - 261)) | (1L << (MIN - 261)) | (1L << (MINUTE - 261)) | (1L << (MODIFY - 261)) | (1L << (MONTH - 261)) | (1L << (MTMV - 261)) | (1L << (NAME - 261)) | (1L << (NAMES - 261)) | (1L << (NEGATIVE - 261)) | (1L << (NEVER - 261)) | (1L << (NEXT - 261)) | (1L << (NGRAM_BF - 261)) | (1L << (NO - 261)) | (1L << (NON_NULLABLE - 261)) | (1L << (NULLS - 261)) | (1L << (OF - 261)) | (1L << (OFFSET - 261)) | (1L << (ONLY - 261)) | (1L << (OPEN - 261)) | (1L << (OPTIMIZED - 261)) | (1L << (PARAMETER - 261)) | (1L << (PARSED - 261)) | (1L << (PASSWORD - 261)) | (1L << (PASSWORD_EXPIRE - 261)) | (1L << (PASSWORD_HISTORY - 261)) | (1L << (PASSWORD_LOCK_TIME - 261)) | (1L << (PASSWORD_REUSE - 261)) | (1L << (PATH - 261)) | (1L << (PAUSE - 261)) | (1L << (PERCENT - 261)) | (1L << (PERIOD - 261)) | (1L << (PERMISSIVE - 261)) | (1L << (PHYSICAL - 261)) | (1L << (PLAN - 261)) | (1L << (PLUGIN - 261)) | (1L << (PLUGINS - 261)) | (1L << (POLICY - 261)) | (1L << (PROC - 261)) | (1L << (PROCESSLIST - 261)) | (1L << (PROFILE - 261)) | (1L << (PROPERTIES - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (PROPERTY - 325)) | (1L << (QUANTILE_STATE - 325)) | (1L << (QUANTILE_UNION - 325)) | (1L << (QUERY - 325)) | (1L << (QUOTA - 325)) | (1L << (RANDOM - 325)) | (1L << (RECOVER - 325)) | (1L << (RECYCLE - 325)) | (1L << (REFRESH - 325)) | (1L << (REPEATABLE - 325)) | (1L << (REPLACE - 325)) | (1L << (REPLACE_IF_NOT_NULL - 325)) | (1L << (REPOSITORIES - 325)) | (1L << (REPOSITORY - 325)) | (1L << (RESOURCE - 325)) | (1L << (RESOURCES - 325)) | (1L << (RESTORE - 325)) | (1L << (RESTRICTIVE - 325)) | (1L << (RESUME - 325)) | (1L << (RETURNS - 325)) | (1L << (REWRITTEN - 325)) | (1L << (RLIKE - 325)) | (1L << (ROLLBACK - 325)) | (1L << (ROLLUP - 325)) | (1L << (ROUTINE - 325)) | (1L << (S3 - 325)) | (1L << (SAMPLE - 325)) | (1L << (SCHEDULER - 325)) | (1L << (SCHEMA - 325)) | (1L << (SECOND - 325)) | (1L << (SERIALIZABLE - 325)) | (1L << (SESSION - 325)) | (1L << (SHAPE - 325)) | (1L << (SKEW - 325)) | (1L << (SNAPSHOT - 325)) | (1L << (SONAME - 325)) | (1L << (SPLIT - 325)) | (1L << (START - 325)) | (1L << (STARTS - 325)) | (1L << (STATS - 325)))) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (STATUS - 389)) | (1L << (STOP - 389)) | (1L << (STORAGE - 389)) | (1L << (STREAM - 389)) | (1L << (STREAMING - 389)) | (1L << (STRING - 389)) | (1L << (STRUCT - 389)) | (1L << (SUBDATE - 389)) | (1L << (SUM - 389)) | (1L << (TABLES - 389)) | (1L << (TASK - 389)) | (1L << (TASKS - 389)) | (1L << (TEMPORARY - 389)) | (1L << (TEXT - 389)) | (1L << (THAN - 389)) | (1L << (TIME - 389)) | (1L << (TIMESTAMP - 389)) | (1L << (TIMESTAMPADD - 389)) | (1L << (TIMESTAMPDIFF - 389)) | (1L << (TRANSACTION - 389)) | (1L << (TREE - 389)) | (1L << (TRIGGERS - 389)) | (1L << (TRUNCATE - 389)) | (1L << (TYPE - 389)) | (1L << (TYPES - 389)) | (1L << (UNCOMMITTED - 389)) | (1L << (UNLOCK - 389)) | (1L << (USER - 389)) | (1L << (VALUE - 389)) | (1L << (VARCHAR - 389)) | (1L << (VARIABLES - 389)) | (1L << (VERBOSE - 389)) | (1L << (VERSION - 389)) | (1L << (VIEW - 389)) | (1L << (WARNINGS - 389)) | (1L << (WEEK - 389)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (WORK - 454)) | (1L << (YEAR - 454)) | (1L << (IDENTIFIER - 454)) | (1L << (BACKQUOTED_IDENTIFIER - 454)))) != 0)) {
				{
				{
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1008);
					match(COMMA);
					}
				}

				setState(1011);
				((SelectHintContext)_localctx).hintStatement = hintStatement();
				((SelectHintContext)_localctx).hintStatements.add(((SelectHintContext)_localctx).hintStatement);
				}
				}
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1017);
			match(HINT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public HintAssignmentContext hintAssignment;
		public List<HintAssignmentContext> parameters = new ArrayList<HintAssignmentContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<HintAssignmentContext> hintAssignment() {
			return getRuleContexts(HintAssignmentContext.class);
		}
		public HintAssignmentContext hintAssignment(int i) {
			return getRuleContext(HintAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_hintStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			((HintStatementContext)_localctx).hintName = identifier();
			setState(1033);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(1020);
				match(LEFT_PAREN);
				setState(1021);
				((HintStatementContext)_localctx).hintAssignment = hintAssignment();
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).hintAssignment);
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << LEFT_BRACE) | (1L << RIGHT_BRACE) | (1L << ADDDATE) | (1L << AFTER) | (1L << AGG_STATE) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ANALYZED) | (1L << ARRAY) | (1L << AT) | (1L << AUTHORS) | (1L << BACKENDS) | (1L << BACKUP) | (1L << BEGIN) | (1L << BIN) | (1L << BITAND) | (1L << BITMAP) | (1L << BITMAP_UNION) | (1L << BITOR) | (1L << BITXOR) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BRIEF) | (1L << BROKER) | (1L << BUCKETS) | (1L << BUILD) | (1L << BUILTIN) | (1L << CACHED) | (1L << CATALOG) | (1L << CATALOGS) | (1L << CHAIN) | (1L << CHAR) | (1L << CHARSET) | (1L << CHECK))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLUSTER - 65)) | (1L << (CLUSTERS - 65)) | (1L << (COLLATION - 65)) | (1L << (COLUMNS - 65)) | (1L << (COMMENT - 65)) | (1L << (COMMIT - 65)) | (1L << (COMMITTED - 65)) | (1L << (COMPACT - 65)) | (1L << (COMPLETE - 65)) | (1L << (CONFIG - 65)) | (1L << (CONNECTION - 65)) | (1L << (CONNECTION_ID - 65)) | (1L << (CONSISTENT - 65)) | (1L << (CONVERT - 65)) | (1L << (COPY - 65)) | (1L << (COUNT - 65)) | (1L << (CREATION - 65)) | (1L << (CRON - 65)) | (1L << (CURRENT_CATALOG - 65)) | (1L << (CURRENT_TIMESTAMP - 65)) | (1L << (DATA - 65)) | (1L << (DATE - 65)) | (1L << (DATE_ADD - 65)) | (1L << (DATE_CEIL - 65)) | (1L << (DATE_DIFF - 65)) | (1L << (DATE_FLOOR - 65)) | (1L << (DATE_SUB - 65)) | (1L << (DATEADD - 65)) | (1L << (DATEDIFF - 65)) | (1L << (DATETIME - 65)) | (1L << (DATETIMEV2 - 65)) | (1L << (DATEV2 - 65)) | (1L << (DATETIMEV1 - 65)) | (1L << (DATEV1 - 65)) | (1L << (DAY - 65)) | (1L << (DAYS_ADD - 65)) | (1L << (DAYS_SUB - 65)) | (1L << (DECIMAL - 65)) | (1L << (DECIMALV2 - 65)) | (1L << (DECIMALV3 - 65)) | (1L << (DEFERRED - 65)) | (1L << (DEMAND - 65)) | (1L << (DIAGNOSE - 65)) | (1L << (DISTINCTPC - 65)) | (1L << (DISTINCTPCSA - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (DO - 130)) | (1L << (DORIS_INTERNAL_TABLE_ID - 130)) | (1L << (DYNAMIC - 130)) | (1L << (ENABLE - 130)) | (1L << (ENCRYPTKEY - 130)) | (1L << (ENCRYPTKEYS - 130)) | (1L << (END - 130)) | (1L << (ENDS - 130)) | (1L << (ENGINE - 130)) | (1L << (ENGINES - 130)) | (1L << (ERRORS - 130)) | (1L << (EVENTS - 130)) | (1L << (EVERY - 130)) | (1L << (EXCLUDE - 130)) | (1L << (EXPIRED - 130)) | (1L << (EXTERNAL - 130)) | (1L << (FAILED_LOGIN_ATTEMPTS - 130)) | (1L << (FAST - 130)) | (1L << (FEATURE - 130)) | (1L << (FIELDS - 130)) | (1L << (FILE - 130)) | (1L << (FILTER - 130)) | (1L << (FIRST - 130)) | (1L << (FORMAT - 130)) | (1L << (FREE - 130)) | (1L << (FRONTENDS - 130)) | (1L << (FUNCTION - 130)) | (1L << (GLOBAL - 130)) | (1L << (GRAPH - 130)) | (1L << (GROUPING - 130)) | (1L << (GROUPS - 130)) | (1L << (HASH - 130)) | (1L << (HDFS - 130)) | (1L << (HELP - 130)) | (1L << (HISTOGRAM - 130)) | (1L << (HLL_UNION - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (HOSTNAME - 194)) | (1L << (HOUR - 194)) | (1L << (HUB - 194)) | (1L << (IDENTIFIED - 194)) | (1L << (IGNORE - 194)) | (1L << (IMMEDIATE - 194)) | (1L << (INCREMENTAL - 194)) | (1L << (INDEXES - 194)) | (1L << (INVERTED - 194)) | (1L << (IS_NOT_NULL_PRED - 194)) | (1L << (IS_NULL_PRED - 194)) | (1L << (ISNULL - 194)) | (1L << (ISOLATION - 194)) | (1L << (JOB - 194)) | (1L << (JOBS - 194)) | (1L << (JSON - 194)) | (1L << (JSONB - 194)) | (1L << (LABEL - 194)) | (1L << (LAST - 194)) | (1L << (LDAP - 194)) | (1L << (LDAP_ADMIN_PASSWORD - 194)) | (1L << (LESS - 194)) | (1L << (LEVEL - 194)) | (1L << (LINES - 194)) | (1L << (LINK - 194)) | (1L << (LOCAL - 194)) | (1L << (LOCATION - 194)) | (1L << (LOCK - 194)) | (1L << (LOGICAL - 194)) | (1L << (MAP - 194)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (MATERIALIZED - 261)) | (1L << (MAX - 261)) | (1L << (MEMO - 261)) | (1L << (MERGE - 261)) | (1L << (MIGRATE - 261)) | (1L << (MIGRATIONS - 261)) | (1L << (MIN - 261)) | (1L << (MINUTE - 261)) | (1L << (MODIFY - 261)) | (1L << (MONTH - 261)) | (1L << (MTMV - 261)) | (1L << (NAME - 261)) | (1L << (NAMES - 261)) | (1L << (NEGATIVE - 261)) | (1L << (NEVER - 261)) | (1L << (NEXT - 261)) | (1L << (NGRAM_BF - 261)) | (1L << (NO - 261)) | (1L << (NON_NULLABLE - 261)) | (1L << (NULLS - 261)) | (1L << (OF - 261)) | (1L << (OFFSET - 261)) | (1L << (ONLY - 261)) | (1L << (OPEN - 261)) | (1L << (OPTIMIZED - 261)) | (1L << (PARAMETER - 261)) | (1L << (PARSED - 261)) | (1L << (PASSWORD - 261)) | (1L << (PASSWORD_EXPIRE - 261)) | (1L << (PASSWORD_HISTORY - 261)) | (1L << (PASSWORD_LOCK_TIME - 261)) | (1L << (PASSWORD_REUSE - 261)) | (1L << (PATH - 261)) | (1L << (PAUSE - 261)) | (1L << (PERCENT - 261)) | (1L << (PERIOD - 261)) | (1L << (PERMISSIVE - 261)) | (1L << (PHYSICAL - 261)) | (1L << (PLAN - 261)) | (1L << (PLUGIN - 261)) | (1L << (PLUGINS - 261)) | (1L << (POLICY - 261)) | (1L << (PROC - 261)) | (1L << (PROCESSLIST - 261)) | (1L << (PROFILE - 261)) | (1L << (PROPERTIES - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (PROPERTY - 325)) | (1L << (QUANTILE_STATE - 325)) | (1L << (QUANTILE_UNION - 325)) | (1L << (QUERY - 325)) | (1L << (QUOTA - 325)) | (1L << (RANDOM - 325)) | (1L << (RECOVER - 325)) | (1L << (RECYCLE - 325)) | (1L << (REFRESH - 325)) | (1L << (REPEATABLE - 325)) | (1L << (REPLACE - 325)) | (1L << (REPLACE_IF_NOT_NULL - 325)) | (1L << (REPOSITORIES - 325)) | (1L << (REPOSITORY - 325)) | (1L << (RESOURCE - 325)) | (1L << (RESOURCES - 325)) | (1L << (RESTORE - 325)) | (1L << (RESTRICTIVE - 325)) | (1L << (RESUME - 325)) | (1L << (RETURNS - 325)) | (1L << (REWRITTEN - 325)) | (1L << (RLIKE - 325)) | (1L << (ROLLBACK - 325)) | (1L << (ROLLUP - 325)) | (1L << (ROUTINE - 325)) | (1L << (S3 - 325)) | (1L << (SAMPLE - 325)) | (1L << (SCHEDULER - 325)) | (1L << (SCHEMA - 325)) | (1L << (SECOND - 325)) | (1L << (SERIALIZABLE - 325)) | (1L << (SESSION - 325)) | (1L << (SHAPE - 325)) | (1L << (SKEW - 325)) | (1L << (SNAPSHOT - 325)) | (1L << (SONAME - 325)) | (1L << (SPLIT - 325)) | (1L << (START - 325)) | (1L << (STARTS - 325)) | (1L << (STATS - 325)))) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (STATUS - 389)) | (1L << (STOP - 389)) | (1L << (STORAGE - 389)) | (1L << (STREAM - 389)) | (1L << (STREAMING - 389)) | (1L << (STRING - 389)) | (1L << (STRUCT - 389)) | (1L << (SUBDATE - 389)) | (1L << (SUM - 389)) | (1L << (TABLES - 389)) | (1L << (TASK - 389)) | (1L << (TASKS - 389)) | (1L << (TEMPORARY - 389)) | (1L << (TEXT - 389)) | (1L << (THAN - 389)) | (1L << (TIME - 389)) | (1L << (TIMESTAMP - 389)) | (1L << (TIMESTAMPADD - 389)) | (1L << (TIMESTAMPDIFF - 389)) | (1L << (TRANSACTION - 389)) | (1L << (TREE - 389)) | (1L << (TRIGGERS - 389)) | (1L << (TRUNCATE - 389)) | (1L << (TYPE - 389)) | (1L << (TYPES - 389)) | (1L << (UNCOMMITTED - 389)) | (1L << (UNLOCK - 389)) | (1L << (USER - 389)) | (1L << (VALUE - 389)) | (1L << (VARCHAR - 389)) | (1L << (VARIABLES - 389)) | (1L << (VERBOSE - 389)) | (1L << (VERSION - 389)) | (1L << (VIEW - 389)) | (1L << (WARNINGS - 389)) | (1L << (WEEK - 389)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (WORK - 454)) | (1L << (YEAR - 454)) | (1L << (STRING_LITERAL - 454)) | (1L << (LEADING_STRING - 454)) | (1L << (IDENTIFIER - 454)) | (1L << (BACKQUOTED_IDENTIFIER - 454)))) != 0)) {
					{
					{
					setState(1023);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1022);
						match(COMMA);
						}
					}

					setState(1025);
					((HintStatementContext)_localctx).hintAssignment = hintAssignment();
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).hintAssignment);
					}
					}
					setState(1030);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1031);
				match(RIGHT_PAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintAssignmentContext extends ParserRuleContext {
		public IdentifierOrTextContext key;
		public ConstantContext constantValue;
		public IdentifierContext identifierValue;
		public IdentifierOrTextContext identifierOrText() {
			return getRuleContext(IdentifierOrTextContext.class,0);
		}
		public TerminalNode EQ() { return getToken(DorisParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public HintAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterHintAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitHintAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitHintAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintAssignmentContext hintAssignment() throws RecognitionException {
		HintAssignmentContext _localctx = new HintAssignmentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_hintAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			((HintAssignmentContext)_localctx).key = identifierOrText();
			setState(1041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1036);
				match(EQ);
				setState(1039);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1037);
					((HintAssignmentContext)_localctx).constantValue = constant();
					}
					break;
				case 2:
					{
					setState(1038);
					((HintAssignmentContext)_localctx).identifierValue = identifier();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateAssignmentContext extends ParserRuleContext {
		public MultipartIdentifierContext col;
		public TerminalNode EQ() { return getToken(DorisParser.EQ, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(DorisParser.DEFAULT, 0); }
		public UpdateAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterUpdateAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitUpdateAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitUpdateAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateAssignmentContext updateAssignment() throws RecognitionException {
		UpdateAssignmentContext _localctx = new UpdateAssignmentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_updateAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			((UpdateAssignmentContext)_localctx).col = multipartIdentifier();
			setState(1044);
			match(EQ);
			setState(1047);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
			case LEFT_BRACKET:
			case LEFT_BRACE:
			case RIGHT_BRACE:
			case ADD:
			case ADDDATE:
			case AFTER:
			case AGG_STATE:
			case AGGREGATE:
			case ALIAS:
			case ANALYZED:
			case ARRAY:
			case AT:
			case AUTHORS:
			case BACKENDS:
			case BACKUP:
			case BEGIN:
			case BIN:
			case BITAND:
			case BITMAP:
			case BITMAP_UNION:
			case BITOR:
			case BITXOR:
			case BLOB:
			case BOOLEAN:
			case BRIEF:
			case BROKER:
			case BUCKETS:
			case BUILD:
			case BUILTIN:
			case CACHED:
			case CASE:
			case CAST:
			case CATALOG:
			case CATALOGS:
			case CHAIN:
			case CHAR:
			case CHARSET:
			case CHECK:
			case CLUSTER:
			case CLUSTERS:
			case COLLATION:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETE:
			case CONFIG:
			case CONNECTION:
			case CONNECTION_ID:
			case CONSISTENT:
			case CONVERT:
			case COPY:
			case COUNT:
			case CREATION:
			case CRON:
			case CURRENT_CATALOG:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATABASE:
			case DATE:
			case DATE_ADD:
			case DATE_CEIL:
			case DATE_DIFF:
			case DATE_FLOOR:
			case DATE_SUB:
			case DATEADD:
			case DATEDIFF:
			case DATETIME:
			case DATETIMEV2:
			case DATEV2:
			case DATETIMEV1:
			case DATEV1:
			case DAY:
			case DAYS_ADD:
			case DAYS_SUB:
			case DECIMAL:
			case DECIMALV2:
			case DECIMALV3:
			case DEFERRED:
			case DEMAND:
			case DIAGNOSE:
			case DISTINCTPC:
			case DISTINCTPCSA:
			case DO:
			case DORIS_INTERNAL_TABLE_ID:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTKEY:
			case ENCRYPTKEYS:
			case END:
			case ENDS:
			case ENGINE:
			case ENGINES:
			case ERRORS:
			case EVENTS:
			case EVERY:
			case EXCLUDE:
			case EXISTS:
			case EXPIRED:
			case EXTERNAL:
			case EXTRACT:
			case FAILED_LOGIN_ATTEMPTS:
			case FALSE:
			case FAST:
			case FEATURE:
			case FIELDS:
			case FILE:
			case FILTER:
			case FIRST:
			case FORMAT:
			case FREE:
			case FRONTENDS:
			case FUNCTION:
			case GLOBAL:
			case GRAPH:
			case GROUPING:
			case GROUPS:
			case HASH:
			case HDFS:
			case HELP:
			case HISTOGRAM:
			case HLL_UNION:
			case HOSTNAME:
			case HOUR:
			case HUB:
			case IDENTIFIED:
			case IF:
			case IGNORE:
			case IMMEDIATE:
			case INCREMENTAL:
			case INDEXES:
			case INTERVAL:
			case INVERTED:
			case IS_NOT_NULL_PRED:
			case IS_NULL_PRED:
			case ISNULL:
			case ISOLATION:
			case JOB:
			case JOBS:
			case JSON:
			case JSONB:
			case KEY:
			case LABEL:
			case LAST:
			case LDAP:
			case LDAP_ADMIN_PASSWORD:
			case LEFT:
			case LESS:
			case LEVEL:
			case LIKE:
			case LINES:
			case LINK:
			case LOCAL:
			case LOCATION:
			case LOCK:
			case LOGICAL:
			case MAP:
			case MATERIALIZED:
			case MAX:
			case MEMO:
			case MERGE:
			case MIGRATE:
			case MIGRATIONS:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MTMV:
			case NAME:
			case NAMES:
			case NEGATIVE:
			case NEVER:
			case NEXT:
			case NGRAM_BF:
			case NO:
			case NON_NULLABLE:
			case NOT:
			case NULL:
			case NULLS:
			case OF:
			case OFFSET:
			case ONLY:
			case OPEN:
			case OPTIMIZED:
			case PARAMETER:
			case PARSED:
			case PASSWORD:
			case PASSWORD_EXPIRE:
			case PASSWORD_HISTORY:
			case PASSWORD_LOCK_TIME:
			case PASSWORD_REUSE:
			case PATH:
			case PAUSE:
			case PERCENT:
			case PERIOD:
			case PERMISSIVE:
			case PHYSICAL:
			case PLAN:
			case PLUGIN:
			case PLUGINS:
			case POLICY:
			case PROC:
			case PROCESSLIST:
			case PROFILE:
			case PROPERTIES:
			case PROPERTY:
			case QUANTILE_STATE:
			case QUANTILE_UNION:
			case QUERY:
			case QUOTA:
			case RANDOM:
			case RECOVER:
			case RECYCLE:
			case REFRESH:
			case REGEXP:
			case REPEATABLE:
			case REPLACE:
			case REPLACE_IF_NOT_NULL:
			case REPOSITORIES:
			case REPOSITORY:
			case RESOURCE:
			case RESOURCES:
			case RESTORE:
			case RESTRICTIVE:
			case RESUME:
			case RETURNS:
			case REWRITTEN:
			case RIGHT:
			case RLIKE:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case S3:
			case SAMPLE:
			case SCHEDULER:
			case SCHEMA:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SHAPE:
			case SKEW:
			case SNAPSHOT:
			case SONAME:
			case SPLIT:
			case START:
			case STARTS:
			case STATS:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STREAMING:
			case STRING:
			case STRUCT:
			case SUBDATE:
			case SUM:
			case TABLES:
			case TASK:
			case TASKS:
			case TEMPORARY:
			case TEXT:
			case THAN:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TRANSACTION:
			case TREE:
			case TRIGGERS:
			case TRIM:
			case TRUE:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNCOMMITTED:
			case UNLOCK:
			case USER:
			case VALUE:
			case VARCHAR:
			case VARIABLES:
			case VERBOSE:
			case VERSION:
			case VIEW:
			case WARNINGS:
			case WEEK:
			case WORK:
			case YEAR:
			case PLUS:
			case SUBTRACT:
			case ASTERISK:
			case TILDE:
			case LOGICALNOT:
			case ATSIGN:
			case DOUBLEATSIGN:
			case STRING_LITERAL:
			case INTEGER_VALUE:
			case EXPONENT_VALUE:
			case DECIMAL_VALUE:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				setState(1045);
				expression();
				}
				break;
			case DEFAULT:
				{
				setState(1046);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateAssignmentSeqContext extends ParserRuleContext {
		public UpdateAssignmentContext updateAssignment;
		public List<UpdateAssignmentContext> assignments = new ArrayList<UpdateAssignmentContext>();
		public List<UpdateAssignmentContext> updateAssignment() {
			return getRuleContexts(UpdateAssignmentContext.class);
		}
		public UpdateAssignmentContext updateAssignment(int i) {
			return getRuleContext(UpdateAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public UpdateAssignmentSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateAssignmentSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterUpdateAssignmentSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitUpdateAssignmentSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitUpdateAssignmentSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateAssignmentSeqContext updateAssignmentSeq() throws RecognitionException {
		UpdateAssignmentSeqContext _localctx = new UpdateAssignmentSeqContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_updateAssignmentSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			((UpdateAssignmentSeqContext)_localctx).updateAssignment = updateAssignment();
			((UpdateAssignmentSeqContext)_localctx).assignments.add(((UpdateAssignmentSeqContext)_localctx).updateAssignment);
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1050);
				match(COMMA);
				setState(1051);
				((UpdateAssignmentSeqContext)_localctx).updateAssignment = updateAssignment();
				((UpdateAssignmentSeqContext)_localctx).assignments.add(((UpdateAssignmentSeqContext)_localctx).updateAssignment);
				}
				}
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext functionName;
		public IdentifierContext tableName;
		public IdentifierContext columnName;
		public TerminalNode LATERAL() { return getToken(DorisParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(DorisParser.VIEW, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_lateralView);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			match(LATERAL);
			setState(1058);
			match(VIEW);
			setState(1059);
			((LateralViewContext)_localctx).functionName = identifier();
			setState(1060);
			match(LEFT_PAREN);
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << RIGHT_BRACE) | (1L << ADD) | (1L << ADDDATE) | (1L << AFTER) | (1L << AGG_STATE) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ANALYZED) | (1L << ARRAY) | (1L << AT) | (1L << AUTHORS) | (1L << BACKENDS) | (1L << BACKUP) | (1L << BEGIN) | (1L << BIN) | (1L << BITAND) | (1L << BITMAP) | (1L << BITMAP_UNION) | (1L << BITOR) | (1L << BITXOR) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BRIEF) | (1L << BROKER) | (1L << BUCKETS) | (1L << BUILD) | (1L << BUILTIN) | (1L << CACHED) | (1L << CASE) | (1L << CAST) | (1L << CATALOG) | (1L << CATALOGS) | (1L << CHAIN) | (1L << CHAR) | (1L << CHARSET) | (1L << CHECK))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLUSTER - 65)) | (1L << (CLUSTERS - 65)) | (1L << (COLLATION - 65)) | (1L << (COLUMNS - 65)) | (1L << (COMMENT - 65)) | (1L << (COMMIT - 65)) | (1L << (COMMITTED - 65)) | (1L << (COMPACT - 65)) | (1L << (COMPLETE - 65)) | (1L << (CONFIG - 65)) | (1L << (CONNECTION - 65)) | (1L << (CONNECTION_ID - 65)) | (1L << (CONSISTENT - 65)) | (1L << (CONVERT - 65)) | (1L << (COPY - 65)) | (1L << (COUNT - 65)) | (1L << (CREATION - 65)) | (1L << (CRON - 65)) | (1L << (CURRENT_CATALOG - 65)) | (1L << (CURRENT_TIMESTAMP - 65)) | (1L << (CURRENT_USER - 65)) | (1L << (DATA - 65)) | (1L << (DATABASE - 65)) | (1L << (DATE - 65)) | (1L << (DATE_ADD - 65)) | (1L << (DATE_CEIL - 65)) | (1L << (DATE_DIFF - 65)) | (1L << (DATE_FLOOR - 65)) | (1L << (DATE_SUB - 65)) | (1L << (DATEADD - 65)) | (1L << (DATEDIFF - 65)) | (1L << (DATETIME - 65)) | (1L << (DATETIMEV2 - 65)) | (1L << (DATEV2 - 65)) | (1L << (DATETIMEV1 - 65)) | (1L << (DATEV1 - 65)) | (1L << (DAY - 65)) | (1L << (DAYS_ADD - 65)) | (1L << (DAYS_SUB - 65)) | (1L << (DECIMAL - 65)) | (1L << (DECIMALV2 - 65)) | (1L << (DECIMALV3 - 65)) | (1L << (DEFERRED - 65)) | (1L << (DEMAND - 65)) | (1L << (DIAGNOSE - 65)) | (1L << (DISTINCTPC - 65)) | (1L << (DISTINCTPCSA - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (DO - 130)) | (1L << (DORIS_INTERNAL_TABLE_ID - 130)) | (1L << (DYNAMIC - 130)) | (1L << (ENABLE - 130)) | (1L << (ENCRYPTKEY - 130)) | (1L << (ENCRYPTKEYS - 130)) | (1L << (END - 130)) | (1L << (ENDS - 130)) | (1L << (ENGINE - 130)) | (1L << (ENGINES - 130)) | (1L << (ERRORS - 130)) | (1L << (EVENTS - 130)) | (1L << (EVERY - 130)) | (1L << (EXCLUDE - 130)) | (1L << (EXISTS - 130)) | (1L << (EXPIRED - 130)) | (1L << (EXTERNAL - 130)) | (1L << (EXTRACT - 130)) | (1L << (FAILED_LOGIN_ATTEMPTS - 130)) | (1L << (FALSE - 130)) | (1L << (FAST - 130)) | (1L << (FEATURE - 130)) | (1L << (FIELDS - 130)) | (1L << (FILE - 130)) | (1L << (FILTER - 130)) | (1L << (FIRST - 130)) | (1L << (FORMAT - 130)) | (1L << (FREE - 130)) | (1L << (FRONTENDS - 130)) | (1L << (FUNCTION - 130)) | (1L << (GLOBAL - 130)) | (1L << (GRAPH - 130)) | (1L << (GROUPING - 130)) | (1L << (GROUPS - 130)) | (1L << (HASH - 130)) | (1L << (HDFS - 130)) | (1L << (HELP - 130)) | (1L << (HISTOGRAM - 130)) | (1L << (HLL_UNION - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (HOSTNAME - 194)) | (1L << (HOUR - 194)) | (1L << (HUB - 194)) | (1L << (IDENTIFIED - 194)) | (1L << (IF - 194)) | (1L << (IGNORE - 194)) | (1L << (IMMEDIATE - 194)) | (1L << (INCREMENTAL - 194)) | (1L << (INDEXES - 194)) | (1L << (INTERVAL - 194)) | (1L << (INVERTED - 194)) | (1L << (IS_NOT_NULL_PRED - 194)) | (1L << (IS_NULL_PRED - 194)) | (1L << (ISNULL - 194)) | (1L << (ISOLATION - 194)) | (1L << (JOB - 194)) | (1L << (JOBS - 194)) | (1L << (JSON - 194)) | (1L << (JSONB - 194)) | (1L << (KEY - 194)) | (1L << (LABEL - 194)) | (1L << (LAST - 194)) | (1L << (LDAP - 194)) | (1L << (LDAP_ADMIN_PASSWORD - 194)) | (1L << (LEFT - 194)) | (1L << (LESS - 194)) | (1L << (LEVEL - 194)) | (1L << (LIKE - 194)) | (1L << (LINES - 194)) | (1L << (LINK - 194)) | (1L << (LOCAL - 194)) | (1L << (LOCATION - 194)) | (1L << (LOCK - 194)) | (1L << (LOGICAL - 194)) | (1L << (MAP - 194)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (MATERIALIZED - 261)) | (1L << (MAX - 261)) | (1L << (MEMO - 261)) | (1L << (MERGE - 261)) | (1L << (MIGRATE - 261)) | (1L << (MIGRATIONS - 261)) | (1L << (MIN - 261)) | (1L << (MINUTE - 261)) | (1L << (MODIFY - 261)) | (1L << (MONTH - 261)) | (1L << (MTMV - 261)) | (1L << (NAME - 261)) | (1L << (NAMES - 261)) | (1L << (NEGATIVE - 261)) | (1L << (NEVER - 261)) | (1L << (NEXT - 261)) | (1L << (NGRAM_BF - 261)) | (1L << (NO - 261)) | (1L << (NON_NULLABLE - 261)) | (1L << (NOT - 261)) | (1L << (NULL - 261)) | (1L << (NULLS - 261)) | (1L << (OF - 261)) | (1L << (OFFSET - 261)) | (1L << (ONLY - 261)) | (1L << (OPEN - 261)) | (1L << (OPTIMIZED - 261)) | (1L << (PARAMETER - 261)) | (1L << (PARSED - 261)) | (1L << (PASSWORD - 261)) | (1L << (PASSWORD_EXPIRE - 261)) | (1L << (PASSWORD_HISTORY - 261)) | (1L << (PASSWORD_LOCK_TIME - 261)) | (1L << (PASSWORD_REUSE - 261)) | (1L << (PATH - 261)) | (1L << (PAUSE - 261)) | (1L << (PERCENT - 261)) | (1L << (PERIOD - 261)) | (1L << (PERMISSIVE - 261)) | (1L << (PHYSICAL - 261)) | (1L << (PLAN - 261)) | (1L << (PLUGIN - 261)) | (1L << (PLUGINS - 261)) | (1L << (POLICY - 261)) | (1L << (PROC - 261)) | (1L << (PROCESSLIST - 261)) | (1L << (PROFILE - 261)) | (1L << (PROPERTIES - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (PROPERTY - 325)) | (1L << (QUANTILE_STATE - 325)) | (1L << (QUANTILE_UNION - 325)) | (1L << (QUERY - 325)) | (1L << (QUOTA - 325)) | (1L << (RANDOM - 325)) | (1L << (RECOVER - 325)) | (1L << (RECYCLE - 325)) | (1L << (REFRESH - 325)) | (1L << (REGEXP - 325)) | (1L << (REPEATABLE - 325)) | (1L << (REPLACE - 325)) | (1L << (REPLACE_IF_NOT_NULL - 325)) | (1L << (REPOSITORIES - 325)) | (1L << (REPOSITORY - 325)) | (1L << (RESOURCE - 325)) | (1L << (RESOURCES - 325)) | (1L << (RESTORE - 325)) | (1L << (RESTRICTIVE - 325)) | (1L << (RESUME - 325)) | (1L << (RETURNS - 325)) | (1L << (REWRITTEN - 325)) | (1L << (RIGHT - 325)) | (1L << (RLIKE - 325)) | (1L << (ROLLBACK - 325)) | (1L << (ROLLUP - 325)) | (1L << (ROUTINE - 325)) | (1L << (S3 - 325)) | (1L << (SAMPLE - 325)) | (1L << (SCHEDULER - 325)) | (1L << (SCHEMA - 325)) | (1L << (SECOND - 325)) | (1L << (SERIALIZABLE - 325)) | (1L << (SESSION - 325)) | (1L << (SHAPE - 325)) | (1L << (SKEW - 325)) | (1L << (SNAPSHOT - 325)) | (1L << (SONAME - 325)) | (1L << (SPLIT - 325)) | (1L << (START - 325)) | (1L << (STARTS - 325)) | (1L << (STATS - 325)))) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (STATUS - 389)) | (1L << (STOP - 389)) | (1L << (STORAGE - 389)) | (1L << (STREAM - 389)) | (1L << (STREAMING - 389)) | (1L << (STRING - 389)) | (1L << (STRUCT - 389)) | (1L << (SUBDATE - 389)) | (1L << (SUM - 389)) | (1L << (TABLES - 389)) | (1L << (TASK - 389)) | (1L << (TASKS - 389)) | (1L << (TEMPORARY - 389)) | (1L << (TEXT - 389)) | (1L << (THAN - 389)) | (1L << (TIME - 389)) | (1L << (TIMESTAMP - 389)) | (1L << (TIMESTAMPADD - 389)) | (1L << (TIMESTAMPDIFF - 389)) | (1L << (TRANSACTION - 389)) | (1L << (TREE - 389)) | (1L << (TRIGGERS - 389)) | (1L << (TRIM - 389)) | (1L << (TRUE - 389)) | (1L << (TRUNCATE - 389)) | (1L << (TYPE - 389)) | (1L << (TYPES - 389)) | (1L << (UNCOMMITTED - 389)) | (1L << (UNLOCK - 389)) | (1L << (USER - 389)) | (1L << (VALUE - 389)) | (1L << (VARCHAR - 389)) | (1L << (VARIABLES - 389)) | (1L << (VERBOSE - 389)) | (1L << (VERSION - 389)) | (1L << (VIEW - 389)) | (1L << (WARNINGS - 389)) | (1L << (WEEK - 389)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (WORK - 454)) | (1L << (YEAR - 454)) | (1L << (PLUS - 454)) | (1L << (SUBTRACT - 454)) | (1L << (ASTERISK - 454)) | (1L << (TILDE - 454)) | (1L << (LOGICALNOT - 454)) | (1L << (ATSIGN - 454)) | (1L << (DOUBLEATSIGN - 454)) | (1L << (STRING_LITERAL - 454)) | (1L << (INTEGER_VALUE - 454)) | (1L << (EXPONENT_VALUE - 454)) | (1L << (DECIMAL_VALUE - 454)) | (1L << (IDENTIFIER - 454)) | (1L << (BACKQUOTED_IDENTIFIER - 454)))) != 0)) {
				{
				setState(1061);
				expression();
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1062);
					match(COMMA);
					setState(1063);
					expression();
					}
					}
					setState(1068);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1071);
			match(RIGHT_PAREN);
			setState(1072);
			((LateralViewContext)_localctx).tableName = identifier();
			setState(1073);
			match(AS);
			setState(1074);
			((LateralViewContext)_localctx).columnName = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortClauseContext sortClause() {
			return getRuleContext(SortClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_queryOrganization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1076);
				sortClause();
				}
				break;
			}
			setState(1080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1079);
				limitClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(DorisParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(DorisParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public SortClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSortClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSortClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSortClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortClauseContext sortClause() throws RecognitionException {
		SortClauseContext _localctx = new SortClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_sortClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			match(ORDER);
			setState(1083);
			match(BY);
			setState(1084);
			sortItem();
			setState(1089);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1085);
					match(COMMA);
					setState(1086);
					sortItem();
					}
					} 
				}
				setState(1091);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(DorisParser.NULLS, 0); }
		public TerminalNode FIRST() { return getToken(DorisParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(DorisParser.LAST, 0); }
		public TerminalNode ASC() { return getToken(DorisParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(DorisParser.DESC, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			expression();
			setState(1094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1093);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1098);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1096);
				match(NULLS);
				setState(1097);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public Token limit;
		public Token offset;
		public TerminalNode LIMIT() { return getToken(DorisParser.LIMIT, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(DorisParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(DorisParser.INTEGER_VALUE, i);
		}
		public TerminalNode OFFSET() { return getToken(DorisParser.OFFSET, 0); }
		public TerminalNode COMMA() { return getToken(DorisParser.COMMA, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_limitClause);
		try {
			setState(1110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1100);
				match(LIMIT);
				setState(1101);
				((LimitClauseContext)_localctx).limit = match(INTEGER_VALUE);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1102);
				match(LIMIT);
				setState(1103);
				((LimitClauseContext)_localctx).limit = match(INTEGER_VALUE);
				setState(1104);
				match(OFFSET);
				setState(1105);
				((LimitClauseContext)_localctx).offset = match(INTEGER_VALUE);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1106);
				match(LIMIT);
				setState(1107);
				((LimitClauseContext)_localctx).offset = match(INTEGER_VALUE);
				setState(1108);
				match(COMMA);
				setState(1109);
				((LimitClauseContext)_localctx).limit = match(INTEGER_VALUE);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(DorisParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public PartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPartitionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPartitionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPartitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionClauseContext partitionClause() throws RecognitionException {
		PartitionClauseContext _localctx = new PartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_partitionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			match(PARTITION);
			setState(1113);
			match(BY);
			setState(1114);
			expression();
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1115);
				match(COMMA);
				setState(1116);
				expression();
				}
				}
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(DorisParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(DorisParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(DorisParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(DorisParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(DorisParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(DorisParser.FULL, 0); }
		public TerminalNode SEMI() { return getToken(DorisParser.SEMI, 0); }
		public TerminalNode ANTI() { return getToken(DorisParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_joinType);
		int _la;
		try {
			setState(1146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1122);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1125);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1126);
				match(LEFT);
				setState(1128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1127);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1130);
				match(RIGHT);
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1131);
					match(OUTER);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1134);
				match(FULL);
				setState(1136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1135);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1138);
				match(LEFT);
				setState(1139);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1140);
				match(RIGHT);
				setState(1141);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1142);
				match(LEFT);
				setState(1143);
				match(ANTI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1144);
				match(RIGHT);
				setState(1145);
				match(ANTI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(DorisParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(DorisParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_joinCriteria);
		try {
			setState(1152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1148);
				match(ON);
				setState(1149);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1150);
				match(USING);
				setState(1151);
				identifierList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			match(LEFT_PAREN);
			setState(1155);
			identifierSeq();
			setState(1156);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSeqContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> ident = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_identifierSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1159);
				match(COMMA);
				setState(1160);
				((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
				((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
				}
				}
				setState(1165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public IdentifierContext tvfName;
		public PropertyItemListContext properties;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PropertyItemListContext propertyItemList() {
			return getRuleContext(PropertyItemListContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SpecifiedPartitionContext specifiedPartition() {
			return getRuleContext(SpecifiedPartitionContext.class,0);
		}
		public TabletListContext tabletList() {
			return getRuleContext(TabletListContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public RelationHintContext relationHint() {
			return getRuleContext(RelationHintContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_relationPrimary);
		int _la;
		try {
			int _alt;
			setState(1204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1166);
				multipartIdentifier();
				setState(1168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1167);
					specifiedPartition();
					}
					break;
				}
				setState(1171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1170);
					tabletList();
					}
					break;
				}
				setState(1173);
				tableAlias();
				setState(1175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1174);
					sample();
					}
					break;
				}
				setState(1178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1177);
					relationHint();
					}
					break;
				}
				setState(1183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1180);
						lateralView();
						}
						} 
					}
					setState(1185);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1186);
				match(LEFT_PAREN);
				setState(1187);
				query();
				setState(1188);
				match(RIGHT_PAREN);
				setState(1189);
				tableAlias();
				setState(1193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1190);
						lateralView();
						}
						} 
					}
					setState(1195);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1196);
				((TableValuedFunctionContext)_localctx).tvfName = identifier();
				setState(1197);
				match(LEFT_PAREN);
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << RIGHT_BRACE) | (1L << ADDDATE) | (1L << AFTER) | (1L << AGG_STATE) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ANALYZED) | (1L << ARRAY) | (1L << AT) | (1L << AUTHORS) | (1L << BACKENDS) | (1L << BACKUP) | (1L << BEGIN) | (1L << BIN) | (1L << BITAND) | (1L << BITMAP) | (1L << BITMAP_UNION) | (1L << BITOR) | (1L << BITXOR) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BRIEF) | (1L << BROKER) | (1L << BUCKETS) | (1L << BUILD) | (1L << BUILTIN) | (1L << CACHED) | (1L << CATALOG) | (1L << CATALOGS) | (1L << CHAIN) | (1L << CHAR) | (1L << CHARSET) | (1L << CHECK))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLUSTER - 65)) | (1L << (CLUSTERS - 65)) | (1L << (COLLATION - 65)) | (1L << (COLUMNS - 65)) | (1L << (COMMENT - 65)) | (1L << (COMMIT - 65)) | (1L << (COMMITTED - 65)) | (1L << (COMPACT - 65)) | (1L << (COMPLETE - 65)) | (1L << (CONFIG - 65)) | (1L << (CONNECTION - 65)) | (1L << (CONNECTION_ID - 65)) | (1L << (CONSISTENT - 65)) | (1L << (CONVERT - 65)) | (1L << (COPY - 65)) | (1L << (COUNT - 65)) | (1L << (CREATION - 65)) | (1L << (CRON - 65)) | (1L << (CURRENT_CATALOG - 65)) | (1L << (CURRENT_TIMESTAMP - 65)) | (1L << (DATA - 65)) | (1L << (DATE - 65)) | (1L << (DATE_ADD - 65)) | (1L << (DATE_CEIL - 65)) | (1L << (DATE_DIFF - 65)) | (1L << (DATE_FLOOR - 65)) | (1L << (DATE_SUB - 65)) | (1L << (DATEADD - 65)) | (1L << (DATEDIFF - 65)) | (1L << (DATETIME - 65)) | (1L << (DATETIMEV2 - 65)) | (1L << (DATEV2 - 65)) | (1L << (DATETIMEV1 - 65)) | (1L << (DATEV1 - 65)) | (1L << (DAY - 65)) | (1L << (DAYS_ADD - 65)) | (1L << (DAYS_SUB - 65)) | (1L << (DECIMAL - 65)) | (1L << (DECIMALV2 - 65)) | (1L << (DECIMALV3 - 65)) | (1L << (DEFERRED - 65)) | (1L << (DEMAND - 65)) | (1L << (DIAGNOSE - 65)) | (1L << (DISTINCTPC - 65)) | (1L << (DISTINCTPCSA - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (DO - 130)) | (1L << (DORIS_INTERNAL_TABLE_ID - 130)) | (1L << (DYNAMIC - 130)) | (1L << (ENABLE - 130)) | (1L << (ENCRYPTKEY - 130)) | (1L << (ENCRYPTKEYS - 130)) | (1L << (END - 130)) | (1L << (ENDS - 130)) | (1L << (ENGINE - 130)) | (1L << (ENGINES - 130)) | (1L << (ERRORS - 130)) | (1L << (EVENTS - 130)) | (1L << (EVERY - 130)) | (1L << (EXCLUDE - 130)) | (1L << (EXPIRED - 130)) | (1L << (EXTERNAL - 130)) | (1L << (FAILED_LOGIN_ATTEMPTS - 130)) | (1L << (FALSE - 130)) | (1L << (FAST - 130)) | (1L << (FEATURE - 130)) | (1L << (FIELDS - 130)) | (1L << (FILE - 130)) | (1L << (FILTER - 130)) | (1L << (FIRST - 130)) | (1L << (FORMAT - 130)) | (1L << (FREE - 130)) | (1L << (FRONTENDS - 130)) | (1L << (FUNCTION - 130)) | (1L << (GLOBAL - 130)) | (1L << (GRAPH - 130)) | (1L << (GROUPING - 130)) | (1L << (GROUPS - 130)) | (1L << (HASH - 130)) | (1L << (HDFS - 130)) | (1L << (HELP - 130)) | (1L << (HISTOGRAM - 130)) | (1L << (HLL_UNION - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (HOSTNAME - 194)) | (1L << (HOUR - 194)) | (1L << (HUB - 194)) | (1L << (IDENTIFIED - 194)) | (1L << (IGNORE - 194)) | (1L << (IMMEDIATE - 194)) | (1L << (INCREMENTAL - 194)) | (1L << (INDEXES - 194)) | (1L << (INVERTED - 194)) | (1L << (IS_NOT_NULL_PRED - 194)) | (1L << (IS_NULL_PRED - 194)) | (1L << (ISNULL - 194)) | (1L << (ISOLATION - 194)) | (1L << (JOB - 194)) | (1L << (JOBS - 194)) | (1L << (JSON - 194)) | (1L << (JSONB - 194)) | (1L << (LABEL - 194)) | (1L << (LAST - 194)) | (1L << (LDAP - 194)) | (1L << (LDAP_ADMIN_PASSWORD - 194)) | (1L << (LESS - 194)) | (1L << (LEVEL - 194)) | (1L << (LINES - 194)) | (1L << (LINK - 194)) | (1L << (LOCAL - 194)) | (1L << (LOCATION - 194)) | (1L << (LOCK - 194)) | (1L << (LOGICAL - 194)) | (1L << (MAP - 194)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (MATERIALIZED - 261)) | (1L << (MAX - 261)) | (1L << (MEMO - 261)) | (1L << (MERGE - 261)) | (1L << (MIGRATE - 261)) | (1L << (MIGRATIONS - 261)) | (1L << (MIN - 261)) | (1L << (MINUTE - 261)) | (1L << (MODIFY - 261)) | (1L << (MONTH - 261)) | (1L << (MTMV - 261)) | (1L << (NAME - 261)) | (1L << (NAMES - 261)) | (1L << (NEGATIVE - 261)) | (1L << (NEVER - 261)) | (1L << (NEXT - 261)) | (1L << (NGRAM_BF - 261)) | (1L << (NO - 261)) | (1L << (NON_NULLABLE - 261)) | (1L << (NULL - 261)) | (1L << (NULLS - 261)) | (1L << (OF - 261)) | (1L << (OFFSET - 261)) | (1L << (ONLY - 261)) | (1L << (OPEN - 261)) | (1L << (OPTIMIZED - 261)) | (1L << (PARAMETER - 261)) | (1L << (PARSED - 261)) | (1L << (PASSWORD - 261)) | (1L << (PASSWORD_EXPIRE - 261)) | (1L << (PASSWORD_HISTORY - 261)) | (1L << (PASSWORD_LOCK_TIME - 261)) | (1L << (PASSWORD_REUSE - 261)) | (1L << (PATH - 261)) | (1L << (PAUSE - 261)) | (1L << (PERCENT - 261)) | (1L << (PERIOD - 261)) | (1L << (PERMISSIVE - 261)) | (1L << (PHYSICAL - 261)) | (1L << (PLAN - 261)) | (1L << (PLUGIN - 261)) | (1L << (PLUGINS - 261)) | (1L << (POLICY - 261)) | (1L << (PROC - 261)) | (1L << (PROCESSLIST - 261)) | (1L << (PROFILE - 261)) | (1L << (PROPERTIES - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (PROPERTY - 325)) | (1L << (QUANTILE_STATE - 325)) | (1L << (QUANTILE_UNION - 325)) | (1L << (QUERY - 325)) | (1L << (QUOTA - 325)) | (1L << (RANDOM - 325)) | (1L << (RECOVER - 325)) | (1L << (RECYCLE - 325)) | (1L << (REFRESH - 325)) | (1L << (REPEATABLE - 325)) | (1L << (REPLACE - 325)) | (1L << (REPLACE_IF_NOT_NULL - 325)) | (1L << (REPOSITORIES - 325)) | (1L << (REPOSITORY - 325)) | (1L << (RESOURCE - 325)) | (1L << (RESOURCES - 325)) | (1L << (RESTORE - 325)) | (1L << (RESTRICTIVE - 325)) | (1L << (RESUME - 325)) | (1L << (RETURNS - 325)) | (1L << (REWRITTEN - 325)) | (1L << (RLIKE - 325)) | (1L << (ROLLBACK - 325)) | (1L << (ROLLUP - 325)) | (1L << (ROUTINE - 325)) | (1L << (S3 - 325)) | (1L << (SAMPLE - 325)) | (1L << (SCHEDULER - 325)) | (1L << (SCHEMA - 325)) | (1L << (SECOND - 325)) | (1L << (SERIALIZABLE - 325)) | (1L << (SESSION - 325)) | (1L << (SHAPE - 325)) | (1L << (SKEW - 325)) | (1L << (SNAPSHOT - 325)) | (1L << (SONAME - 325)) | (1L << (SPLIT - 325)) | (1L << (START - 325)) | (1L << (STARTS - 325)) | (1L << (STATS - 325)))) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (STATUS - 389)) | (1L << (STOP - 389)) | (1L << (STORAGE - 389)) | (1L << (STREAM - 389)) | (1L << (STREAMING - 389)) | (1L << (STRING - 389)) | (1L << (STRUCT - 389)) | (1L << (SUBDATE - 389)) | (1L << (SUM - 389)) | (1L << (TABLES - 389)) | (1L << (TASK - 389)) | (1L << (TASKS - 389)) | (1L << (TEMPORARY - 389)) | (1L << (TEXT - 389)) | (1L << (THAN - 389)) | (1L << (TIME - 389)) | (1L << (TIMESTAMP - 389)) | (1L << (TIMESTAMPADD - 389)) | (1L << (TIMESTAMPDIFF - 389)) | (1L << (TRANSACTION - 389)) | (1L << (TREE - 389)) | (1L << (TRIGGERS - 389)) | (1L << (TRUE - 389)) | (1L << (TRUNCATE - 389)) | (1L << (TYPE - 389)) | (1L << (TYPES - 389)) | (1L << (UNCOMMITTED - 389)) | (1L << (UNLOCK - 389)) | (1L << (USER - 389)) | (1L << (VALUE - 389)) | (1L << (VARCHAR - 389)) | (1L << (VARIABLES - 389)) | (1L << (VERBOSE - 389)) | (1L << (VERSION - 389)) | (1L << (VIEW - 389)) | (1L << (WARNINGS - 389)) | (1L << (WEEK - 389)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (WORK - 454)) | (1L << (YEAR - 454)) | (1L << (SUBTRACT - 454)) | (1L << (STRING_LITERAL - 454)) | (1L << (INTEGER_VALUE - 454)) | (1L << (EXPONENT_VALUE - 454)) | (1L << (DECIMAL_VALUE - 454)) | (1L << (IDENTIFIER - 454)) | (1L << (BACKQUOTED_IDENTIFIER - 454)))) != 0)) {
					{
					setState(1198);
					((TableValuedFunctionContext)_localctx).properties = propertyItemList();
					}
				}

				setState(1201);
				match(RIGHT_PAREN);
				setState(1202);
				tableAlias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyClauseContext extends ParserRuleContext {
		public PropertyItemListContext fileProperties;
		public TerminalNode PROPERTIES() { return getToken(DorisParser.PROPERTIES, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public PropertyItemListContext propertyItemList() {
			return getRuleContext(PropertyItemListContext.class,0);
		}
		public PropertyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPropertyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPropertyClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPropertyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyClauseContext propertyClause() throws RecognitionException {
		PropertyClauseContext _localctx = new PropertyClauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_propertyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			match(PROPERTIES);
			setState(1207);
			match(LEFT_PAREN);
			setState(1208);
			((PropertyClauseContext)_localctx).fileProperties = propertyItemList();
			setState(1209);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyItemListContext extends ParserRuleContext {
		public PropertyItemContext propertyItem;
		public List<PropertyItemContext> properties = new ArrayList<PropertyItemContext>();
		public List<PropertyItemContext> propertyItem() {
			return getRuleContexts(PropertyItemContext.class);
		}
		public PropertyItemContext propertyItem(int i) {
			return getRuleContext(PropertyItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public PropertyItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPropertyItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPropertyItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPropertyItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyItemListContext propertyItemList() throws RecognitionException {
		PropertyItemListContext _localctx = new PropertyItemListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_propertyItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			((PropertyItemListContext)_localctx).propertyItem = propertyItem();
			((PropertyItemListContext)_localctx).properties.add(((PropertyItemListContext)_localctx).propertyItem);
			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1212);
				match(COMMA);
				setState(1213);
				((PropertyItemListContext)_localctx).propertyItem = propertyItem();
				((PropertyItemListContext)_localctx).properties.add(((PropertyItemListContext)_localctx).propertyItem);
				}
				}
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyItemContext extends ParserRuleContext {
		public PropertyKeyContext key;
		public PropertyValueContext value;
		public TerminalNode EQ() { return getToken(DorisParser.EQ, 0); }
		public PropertyKeyContext propertyKey() {
			return getRuleContext(PropertyKeyContext.class,0);
		}
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public PropertyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPropertyItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPropertyItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPropertyItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyItemContext propertyItem() throws RecognitionException {
		PropertyItemContext _localctx = new PropertyItemContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_propertyItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			((PropertyItemContext)_localctx).key = propertyKey();
			setState(1220);
			match(EQ);
			setState(1221);
			((PropertyItemContext)_localctx).value = propertyValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyKeyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyKeyContext propertyKey() throws RecognitionException {
		PropertyKeyContext _localctx = new PropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_propertyKey);
		try {
			setState(1225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1223);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1224);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyValueContext propertyValue() throws RecognitionException {
		PropertyValueContext _localctx = new PropertyValueContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_propertyValue);
		try {
			setState(1229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1227);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1228);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_tableAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1231);
					match(AS);
					}
				}

				setState(1234);
				strictIdentifier();
				setState(1236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1235);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipartIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> parts = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(DorisParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DorisParser.DOT, i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(1245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1241);
					match(DOT);
					setState(1242);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(1247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnDefsContext extends ParserRuleContext {
		public ColumnDefContext columnDef;
		public List<ColumnDefContext> cols = new ArrayList<ColumnDefContext>();
		public List<ColumnDefContext> columnDef() {
			return getRuleContexts(ColumnDefContext.class);
		}
		public ColumnDefContext columnDef(int i) {
			return getRuleContext(ColumnDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public ColumnDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterColumnDefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitColumnDefs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitColumnDefs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefsContext columnDefs() throws RecognitionException {
		ColumnDefsContext _localctx = new ColumnDefsContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_columnDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			((ColumnDefsContext)_localctx).columnDef = columnDef();
			((ColumnDefsContext)_localctx).cols.add(((ColumnDefsContext)_localctx).columnDef);
			setState(1253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1249);
				match(COMMA);
				setState(1250);
				((ColumnDefsContext)_localctx).columnDef = columnDef();
				((ColumnDefsContext)_localctx).cols.add(((ColumnDefsContext)_localctx).columnDef);
				}
				}
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnDefContext extends ParserRuleContext {
		public IdentifierContext colName;
		public DataTypeContext type;
		public AggTypeDefContext aggType;
		public Token nullValue;
		public Token stringValue;
		public NumberContext precision;
		public Token comment;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode KEY() { return getToken(DorisParser.KEY, 0); }
		public List<TerminalNode> NULL() { return getTokens(DorisParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(DorisParser.NULL, i);
		}
		public TerminalNode DEFAULT() { return getToken(DorisParser.DEFAULT, 0); }
		public TerminalNode COMMENT() { return getToken(DorisParser.COMMENT, 0); }
		public AggTypeDefContext aggTypeDef() {
			return getRuleContext(AggTypeDefContext.class,0);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(DorisParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(DorisParser.STRING_LITERAL, i);
		}
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(DorisParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ColumnDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterColumnDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitColumnDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitColumnDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefContext columnDef() throws RecognitionException {
		ColumnDefContext _localctx = new ColumnDefContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_columnDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			((ColumnDefContext)_localctx).colName = identifier();
			setState(1257);
			((ColumnDefContext)_localctx).type = dataType();
			setState(1259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY) {
				{
				setState(1258);
				match(KEY);
				}
			}

			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BITMAP_UNION || _la==HLL_UNION || _la==MAX || _la==MIN || ((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (QUANTILE_UNION - 327)) | (1L << (REPLACE - 327)) | (1L << (REPLACE_IF_NOT_NULL - 327)))) != 0) || _la==SUM) {
				{
				setState(1261);
				((ColumnDefContext)_localctx).aggType = aggTypeDef();
				}
			}

			setState(1267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				{
				setState(1264);
				match(NOT);
				setState(1265);
				match(NULL);
				}
				}
				break;
			case NULL:
				{
				setState(1266);
				match(NULL);
				}
				break;
			case RIGHT_PAREN:
			case COMMA:
			case COMMENT:
			case DEFAULT:
			case INDEX:
				break;
			default:
				break;
			}
			setState(1282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1269);
				match(DEFAULT);
				setState(1280);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NULL:
					{
					setState(1270);
					((ColumnDefContext)_localctx).nullValue = match(NULL);
					}
					break;
				case INTEGER_VALUE:
					{
					setState(1271);
					match(INTEGER_VALUE);
					}
					break;
				case STRING_LITERAL:
					{
					setState(1272);
					((ColumnDefContext)_localctx).stringValue = match(STRING_LITERAL);
					}
					break;
				case CURRENT_TIMESTAMP:
					{
					setState(1273);
					match(CURRENT_TIMESTAMP);
					setState(1278);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT_PAREN) {
						{
						setState(1274);
						match(LEFT_PAREN);
						setState(1275);
						((ColumnDefContext)_localctx).precision = number();
						setState(1276);
						match(RIGHT_PAREN);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1284);
				match(COMMENT);
				setState(1285);
				((ColumnDefContext)_localctx).comment = match(STRING_LITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexDefsContext extends ParserRuleContext {
		public IndexDefContext indexDef;
		public List<IndexDefContext> indexes = new ArrayList<IndexDefContext>();
		public List<IndexDefContext> indexDef() {
			return getRuleContexts(IndexDefContext.class);
		}
		public IndexDefContext indexDef(int i) {
			return getRuleContext(IndexDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public IndexDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexDefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIndexDefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIndexDefs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIndexDefs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexDefsContext indexDefs() throws RecognitionException {
		IndexDefsContext _localctx = new IndexDefsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_indexDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			((IndexDefsContext)_localctx).indexDef = indexDef();
			((IndexDefsContext)_localctx).indexes.add(((IndexDefsContext)_localctx).indexDef);
			setState(1293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1289);
				match(COMMA);
				setState(1290);
				((IndexDefsContext)_localctx).indexDef = indexDef();
				((IndexDefsContext)_localctx).indexes.add(((IndexDefsContext)_localctx).indexDef);
				}
				}
				setState(1295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexDefContext extends ParserRuleContext {
		public IdentifierContext indexName;
		public IdentifierListContext cols;
		public Token comment;
		public TerminalNode INDEX() { return getToken(DorisParser.INDEX, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode USING() { return getToken(DorisParser.USING, 0); }
		public TerminalNode BITMAP() { return getToken(DorisParser.BITMAP, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public IndexDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIndexDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIndexDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIndexDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexDefContext indexDef() throws RecognitionException {
		IndexDefContext _localctx = new IndexDefContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_indexDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			match(INDEX);
			setState(1297);
			((IndexDefContext)_localctx).indexName = identifier();
			setState(1298);
			((IndexDefContext)_localctx).cols = identifierList();
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1299);
				match(USING);
				setState(1300);
				match(BITMAP);
				}
			}

			setState(1304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL) {
				{
				setState(1303);
				((IndexDefContext)_localctx).comment = match(STRING_LITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionsDefContext extends ParserRuleContext {
		public PartitionDefContext partitionDef;
		public List<PartitionDefContext> partitions = new ArrayList<PartitionDefContext>();
		public List<PartitionDefContext> partitionDef() {
			return getRuleContexts(PartitionDefContext.class);
		}
		public PartitionDefContext partitionDef(int i) {
			return getRuleContext(PartitionDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public PartitionsDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionsDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPartitionsDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPartitionsDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPartitionsDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionsDefContext partitionsDef() throws RecognitionException {
		PartitionsDefContext _localctx = new PartitionsDefContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_partitionsDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			((PartitionsDefContext)_localctx).partitionDef = partitionDef();
			((PartitionsDefContext)_localctx).partitions.add(((PartitionsDefContext)_localctx).partitionDef);
			setState(1311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1307);
				match(COMMA);
				setState(1308);
				((PartitionsDefContext)_localctx).partitionDef = partitionDef();
				((PartitionsDefContext)_localctx).partitions.add(((PartitionsDefContext)_localctx).partitionDef);
				}
				}
				setState(1313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionDefContext extends ParserRuleContext {
		public PropertyClauseContext properties;
		public LessThanPartitionDefContext lessThanPartitionDef() {
			return getRuleContext(LessThanPartitionDefContext.class,0);
		}
		public FixedPartitionDefContext fixedPartitionDef() {
			return getRuleContext(FixedPartitionDefContext.class,0);
		}
		public StepPartitionDefContext stepPartitionDef() {
			return getRuleContext(StepPartitionDefContext.class,0);
		}
		public InPartitionDefContext inPartitionDef() {
			return getRuleContext(InPartitionDefContext.class,0);
		}
		public PropertyClauseContext propertyClause() {
			return getRuleContext(PropertyClauseContext.class,0);
		}
		public PartitionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPartitionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPartitionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPartitionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionDefContext partitionDef() throws RecognitionException {
		PartitionDefContext _localctx = new PartitionDefContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_partitionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1314);
				lessThanPartitionDef();
				}
				break;
			case 2:
				{
				setState(1315);
				fixedPartitionDef();
				}
				break;
			case 3:
				{
				setState(1316);
				stepPartitionDef();
				}
				break;
			case 4:
				{
				setState(1317);
				inPartitionDef();
				}
				break;
			}
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROPERTIES) {
				{
				setState(1320);
				((PartitionDefContext)_localctx).properties = propertyClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LessThanPartitionDefContext extends ParserRuleContext {
		public IdentifierContext partitionName;
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public TerminalNode VALUES() { return getToken(DorisParser.VALUES, 0); }
		public TerminalNode LESS() { return getToken(DorisParser.LESS, 0); }
		public TerminalNode THAN() { return getToken(DorisParser.THAN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode MAXVALUE() { return getToken(DorisParser.MAXVALUE, 0); }
		public ConstantSeqContext constantSeq() {
			return getRuleContext(ConstantSeqContext.class,0);
		}
		public TerminalNode IF() { return getToken(DorisParser.IF, 0); }
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(DorisParser.EXISTS, 0); }
		public LessThanPartitionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanPartitionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterLessThanPartitionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitLessThanPartitionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitLessThanPartitionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessThanPartitionDefContext lessThanPartitionDef() throws RecognitionException {
		LessThanPartitionDefContext _localctx = new LessThanPartitionDefContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_lessThanPartitionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
			match(PARTITION);
			setState(1327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1324);
				match(IF);
				setState(1325);
				match(NOT);
				setState(1326);
				match(EXISTS);
				}
			}

			setState(1329);
			((LessThanPartitionDefContext)_localctx).partitionName = identifier();
			setState(1330);
			match(VALUES);
			setState(1331);
			match(LESS);
			setState(1332);
			match(THAN);
			setState(1335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAXVALUE:
				{
				setState(1333);
				match(MAXVALUE);
				}
				break;
			case LEFT_PAREN:
				{
				setState(1334);
				constantSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FixedPartitionDefContext extends ParserRuleContext {
		public IdentifierContext partitionName;
		public ConstantSeqContext lower;
		public ConstantSeqContext upper;
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public TerminalNode VALUES() { return getToken(DorisParser.VALUES, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(DorisParser.LEFT_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(DorisParser.COMMA, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ConstantSeqContext> constantSeq() {
			return getRuleContexts(ConstantSeqContext.class);
		}
		public ConstantSeqContext constantSeq(int i) {
			return getRuleContext(ConstantSeqContext.class,i);
		}
		public TerminalNode IF() { return getToken(DorisParser.IF, 0); }
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(DorisParser.EXISTS, 0); }
		public FixedPartitionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedPartitionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterFixedPartitionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitFixedPartitionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitFixedPartitionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixedPartitionDefContext fixedPartitionDef() throws RecognitionException {
		FixedPartitionDefContext _localctx = new FixedPartitionDefContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_fixedPartitionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			match(PARTITION);
			setState(1341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1338);
				match(IF);
				setState(1339);
				match(NOT);
				setState(1340);
				match(EXISTS);
				}
			}

			setState(1343);
			((FixedPartitionDefContext)_localctx).partitionName = identifier();
			setState(1344);
			match(VALUES);
			setState(1345);
			match(LEFT_BRACKET);
			setState(1346);
			((FixedPartitionDefContext)_localctx).lower = constantSeq();
			setState(1347);
			match(COMMA);
			setState(1348);
			((FixedPartitionDefContext)_localctx).upper = constantSeq();
			setState(1349);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StepPartitionDefContext extends ParserRuleContext {
		public ConstantSeqContext from;
		public ConstantSeqContext to;
		public Token unitsAmount;
		public DatetimeUnitContext unit;
		public TerminalNode FROM() { return getToken(DorisParser.FROM, 0); }
		public TerminalNode TO() { return getToken(DorisParser.TO, 0); }
		public TerminalNode INTERVAL() { return getToken(DorisParser.INTERVAL, 0); }
		public List<ConstantSeqContext> constantSeq() {
			return getRuleContexts(ConstantSeqContext.class);
		}
		public ConstantSeqContext constantSeq(int i) {
			return getRuleContext(ConstantSeqContext.class,i);
		}
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public StepPartitionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepPartitionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterStepPartitionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitStepPartitionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitStepPartitionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepPartitionDefContext stepPartitionDef() throws RecognitionException {
		StepPartitionDefContext _localctx = new StepPartitionDefContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_stepPartitionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1351);
			match(FROM);
			setState(1352);
			((StepPartitionDefContext)_localctx).from = constantSeq();
			setState(1353);
			match(TO);
			setState(1354);
			((StepPartitionDefContext)_localctx).to = constantSeq();
			setState(1355);
			match(INTERVAL);
			setState(1356);
			((StepPartitionDefContext)_localctx).unitsAmount = match(INTEGER_VALUE);
			setState(1358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DAY || _la==HOUR || _la==MINUTE || _la==MONTH || _la==SECOND || _la==WEEK || _la==YEAR) {
				{
				setState(1357);
				((StepPartitionDefContext)_localctx).unit = datetimeUnit();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InPartitionDefContext extends ParserRuleContext {
		public IdentifierContext partitionName;
		public ConstantSeqContext constantSeq;
		public List<ConstantSeqContext> constantSeqs = new ArrayList<ConstantSeqContext>();
		public ConstantSeqContext constants;
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public TerminalNode VALUES() { return getToken(DorisParser.VALUES, 0); }
		public TerminalNode IN() { return getToken(DorisParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(DorisParser.IF, 0); }
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(DorisParser.EXISTS, 0); }
		public List<ConstantSeqContext> constantSeq() {
			return getRuleContexts(ConstantSeqContext.class);
		}
		public ConstantSeqContext constantSeq(int i) {
			return getRuleContext(ConstantSeqContext.class,i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public InPartitionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inPartitionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterInPartitionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitInPartitionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitInPartitionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InPartitionDefContext inPartitionDef() throws RecognitionException {
		InPartitionDefContext _localctx = new InPartitionDefContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_inPartitionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			match(PARTITION);
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1361);
				match(IF);
				setState(1362);
				match(NOT);
				setState(1363);
				match(EXISTS);
				}
			}

			setState(1366);
			((InPartitionDefContext)_localctx).partitionName = identifier();
			setState(1367);
			match(VALUES);
			setState(1368);
			match(IN);
			setState(1381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				{
				setState(1369);
				match(LEFT_PAREN);
				setState(1370);
				((InPartitionDefContext)_localctx).constantSeq = constantSeq();
				((InPartitionDefContext)_localctx).constantSeqs.add(((InPartitionDefContext)_localctx).constantSeq);
				setState(1375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1371);
					match(COMMA);
					setState(1372);
					((InPartitionDefContext)_localctx).constantSeq = constantSeq();
					((InPartitionDefContext)_localctx).constantSeqs.add(((InPartitionDefContext)_localctx).constantSeq);
					}
					}
					setState(1377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1378);
				match(RIGHT_PAREN);
				}
				}
				break;
			case 2:
				{
				setState(1380);
				((InPartitionDefContext)_localctx).constants = constantSeq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantSeqContext extends ParserRuleContext {
		public PartitionValueDefContext partitionValueDef;
		public List<PartitionValueDefContext> values = new ArrayList<PartitionValueDefContext>();
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<PartitionValueDefContext> partitionValueDef() {
			return getRuleContexts(PartitionValueDefContext.class);
		}
		public PartitionValueDefContext partitionValueDef(int i) {
			return getRuleContext(PartitionValueDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public ConstantSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterConstantSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitConstantSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitConstantSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantSeqContext constantSeq() throws RecognitionException {
		ConstantSeqContext _localctx = new ConstantSeqContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_constantSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			match(LEFT_PAREN);
			setState(1384);
			((ConstantSeqContext)_localctx).partitionValueDef = partitionValueDef();
			((ConstantSeqContext)_localctx).values.add(((ConstantSeqContext)_localctx).partitionValueDef);
			setState(1389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1385);
				match(COMMA);
				setState(1386);
				((ConstantSeqContext)_localctx).partitionValueDef = partitionValueDef();
				((ConstantSeqContext)_localctx).values.add(((ConstantSeqContext)_localctx).partitionValueDef);
				}
				}
				setState(1391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1392);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValueDefContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public TerminalNode MAXVALUE() { return getToken(DorisParser.MAXVALUE, 0); }
		public PartitionValueDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionValueDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPartitionValueDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPartitionValueDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPartitionValueDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValueDefContext partitionValueDef() throws RecognitionException {
		PartitionValueDefContext _localctx = new PartitionValueDefContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_partitionValueDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394);
			_la = _input.LA(1);
			if ( !(_la==MAXVALUE || _la==STRING_LITERAL || _la==INTEGER_VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RollupDefsContext extends ParserRuleContext {
		public RollupDefContext rollupDef;
		public List<RollupDefContext> rollups = new ArrayList<RollupDefContext>();
		public List<RollupDefContext> rollupDef() {
			return getRuleContexts(RollupDefContext.class);
		}
		public RollupDefContext rollupDef(int i) {
			return getRuleContext(RollupDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public RollupDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollupDefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterRollupDefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitRollupDefs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitRollupDefs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollupDefsContext rollupDefs() throws RecognitionException {
		RollupDefsContext _localctx = new RollupDefsContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_rollupDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
			((RollupDefsContext)_localctx).rollupDef = rollupDef();
			((RollupDefsContext)_localctx).rollups.add(((RollupDefsContext)_localctx).rollupDef);
			setState(1401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1397);
				match(COMMA);
				setState(1398);
				((RollupDefsContext)_localctx).rollupDef = rollupDef();
				((RollupDefsContext)_localctx).rollups.add(((RollupDefsContext)_localctx).rollupDef);
				}
				}
				setState(1403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RollupDefContext extends ParserRuleContext {
		public IdentifierContext rollupName;
		public IdentifierListContext rollupCols;
		public IdentifierListContext dupKeys;
		public PropertyClauseContext properties;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public TerminalNode DUPLICATE() { return getToken(DorisParser.DUPLICATE, 0); }
		public TerminalNode KEY() { return getToken(DorisParser.KEY, 0); }
		public PropertyClauseContext propertyClause() {
			return getRuleContext(PropertyClauseContext.class,0);
		}
		public RollupDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollupDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterRollupDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitRollupDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitRollupDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollupDefContext rollupDef() throws RecognitionException {
		RollupDefContext _localctx = new RollupDefContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_rollupDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			((RollupDefContext)_localctx).rollupName = identifier();
			setState(1405);
			((RollupDefContext)_localctx).rollupCols = identifierList();
			setState(1409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DUPLICATE) {
				{
				setState(1406);
				match(DUPLICATE);
				setState(1407);
				match(KEY);
				setState(1408);
				((RollupDefContext)_localctx).dupKeys = identifierList();
				}
			}

			setState(1412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROPERTIES) {
				{
				setState(1411);
				((RollupDefContext)_localctx).properties = propertyClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggTypeDefContext extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(DorisParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(DorisParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(DorisParser.SUM, 0); }
		public TerminalNode REPLACE() { return getToken(DorisParser.REPLACE, 0); }
		public TerminalNode REPLACE_IF_NOT_NULL() { return getToken(DorisParser.REPLACE_IF_NOT_NULL, 0); }
		public TerminalNode HLL_UNION() { return getToken(DorisParser.HLL_UNION, 0); }
		public TerminalNode BITMAP_UNION() { return getToken(DorisParser.BITMAP_UNION, 0); }
		public TerminalNode QUANTILE_UNION() { return getToken(DorisParser.QUANTILE_UNION, 0); }
		public AggTypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggTypeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterAggTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitAggTypeDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitAggTypeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggTypeDefContext aggTypeDef() throws RecognitionException {
		AggTypeDefContext _localctx = new AggTypeDefContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_aggTypeDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			_la = _input.LA(1);
			if ( !(_la==BITMAP_UNION || _la==HLL_UNION || _la==MAX || _la==MIN || ((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (QUANTILE_UNION - 327)) | (1L << (REPLACE - 327)) | (1L << (REPLACE_IF_NOT_NULL - 327)))) != 0) || _la==SUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TabletListContext extends ParserRuleContext {
		public Token INTEGER_VALUE;
		public List<Token> tabletIdList = new ArrayList<Token>();
		public TerminalNode TABLET() { return getToken(DorisParser.TABLET, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(DorisParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(DorisParser.INTEGER_VALUE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public TabletListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabletList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterTabletList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitTabletList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitTabletList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabletListContext tabletList() throws RecognitionException {
		TabletListContext _localctx = new TabletListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_tabletList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			match(TABLET);
			setState(1417);
			match(LEFT_PAREN);
			setState(1418);
			((TabletListContext)_localctx).INTEGER_VALUE = match(INTEGER_VALUE);
			((TabletListContext)_localctx).tabletIdList.add(((TabletListContext)_localctx).INTEGER_VALUE);
			setState(1423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1419);
				match(COMMA);
				setState(1420);
				((TabletListContext)_localctx).INTEGER_VALUE = match(INTEGER_VALUE);
				((TabletListContext)_localctx).tabletIdList.add(((TabletListContext)_localctx).INTEGER_VALUE);
				}
				}
				setState(1425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1426);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(DorisParser.VALUES, 0); }
		public List<RowConstructorContext> rowConstructor() {
			return getRuleContexts(RowConstructorContext.class);
		}
		public RowConstructorContext rowConstructor(int i) {
			return getRuleContext(RowConstructorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			match(VALUES);
			setState(1429);
			rowConstructor();
			setState(1434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1430);
					match(COMMA);
					setState(1431);
					rowConstructor();
					}
					} 
				}
				setState(1436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierOrTextContext identifierOrText() {
			return getRuleContext(IdentifierOrTextContext.class,0);
		}
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_namedExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			expression();
			setState(1442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1438);
					match(AS);
					}
				}

				{
				setState(1441);
				identifierOrText();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			namedExpression();
			setState(1449);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1445);
					match(COMMA);
					setState(1446);
					namedExpression();
					}
					} 
				}
				setState(1451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_expression);
		try {
			setState(1454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1452);
				booleanExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1453);
				lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> args = new ArrayList<ErrorCapturingIdentifierContext>();
		public BooleanExpressionContext body;
		public TerminalNode ARROW() { return getToken(DorisParser.ARROW, 0); }
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_lambdaExpression);
		int _la;
		try {
			setState(1472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
			case RIGHT_BRACE:
			case ADDDATE:
			case AFTER:
			case AGG_STATE:
			case AGGREGATE:
			case ALIAS:
			case ANALYZED:
			case ARRAY:
			case AT:
			case AUTHORS:
			case BACKENDS:
			case BACKUP:
			case BEGIN:
			case BIN:
			case BITAND:
			case BITMAP:
			case BITMAP_UNION:
			case BITOR:
			case BITXOR:
			case BLOB:
			case BOOLEAN:
			case BRIEF:
			case BROKER:
			case BUCKETS:
			case BUILD:
			case BUILTIN:
			case CACHED:
			case CATALOG:
			case CATALOGS:
			case CHAIN:
			case CHAR:
			case CHARSET:
			case CHECK:
			case CLUSTER:
			case CLUSTERS:
			case COLLATION:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETE:
			case CONFIG:
			case CONNECTION:
			case CONNECTION_ID:
			case CONSISTENT:
			case CONVERT:
			case COPY:
			case COUNT:
			case CREATION:
			case CRON:
			case CURRENT_CATALOG:
			case CURRENT_TIMESTAMP:
			case DATA:
			case DATE:
			case DATE_ADD:
			case DATE_CEIL:
			case DATE_DIFF:
			case DATE_FLOOR:
			case DATE_SUB:
			case DATEADD:
			case DATEDIFF:
			case DATETIME:
			case DATETIMEV2:
			case DATEV2:
			case DATETIMEV1:
			case DATEV1:
			case DAY:
			case DAYS_ADD:
			case DAYS_SUB:
			case DECIMAL:
			case DECIMALV2:
			case DECIMALV3:
			case DEFERRED:
			case DEMAND:
			case DIAGNOSE:
			case DISTINCTPC:
			case DISTINCTPCSA:
			case DO:
			case DORIS_INTERNAL_TABLE_ID:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTKEY:
			case ENCRYPTKEYS:
			case END:
			case ENDS:
			case ENGINE:
			case ENGINES:
			case ERRORS:
			case EVENTS:
			case EVERY:
			case EXCLUDE:
			case EXPIRED:
			case EXTERNAL:
			case FAILED_LOGIN_ATTEMPTS:
			case FAST:
			case FEATURE:
			case FIELDS:
			case FILE:
			case FILTER:
			case FIRST:
			case FORMAT:
			case FREE:
			case FRONTENDS:
			case FUNCTION:
			case GLOBAL:
			case GRAPH:
			case GROUPING:
			case GROUPS:
			case HASH:
			case HDFS:
			case HELP:
			case HISTOGRAM:
			case HLL_UNION:
			case HOSTNAME:
			case HOUR:
			case HUB:
			case IDENTIFIED:
			case IGNORE:
			case IMMEDIATE:
			case INCREMENTAL:
			case INDEXES:
			case INVERTED:
			case IS_NOT_NULL_PRED:
			case IS_NULL_PRED:
			case ISNULL:
			case ISOLATION:
			case JOB:
			case JOBS:
			case JSON:
			case JSONB:
			case LABEL:
			case LAST:
			case LDAP:
			case LDAP_ADMIN_PASSWORD:
			case LESS:
			case LEVEL:
			case LINES:
			case LINK:
			case LOCAL:
			case LOCATION:
			case LOCK:
			case LOGICAL:
			case MAP:
			case MATERIALIZED:
			case MAX:
			case MEMO:
			case MERGE:
			case MIGRATE:
			case MIGRATIONS:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MTMV:
			case NAME:
			case NAMES:
			case NEGATIVE:
			case NEVER:
			case NEXT:
			case NGRAM_BF:
			case NO:
			case NON_NULLABLE:
			case NULLS:
			case OF:
			case OFFSET:
			case ONLY:
			case OPEN:
			case OPTIMIZED:
			case PARAMETER:
			case PARSED:
			case PASSWORD:
			case PASSWORD_EXPIRE:
			case PASSWORD_HISTORY:
			case PASSWORD_LOCK_TIME:
			case PASSWORD_REUSE:
			case PATH:
			case PAUSE:
			case PERCENT:
			case PERIOD:
			case PERMISSIVE:
			case PHYSICAL:
			case PLAN:
			case PLUGIN:
			case PLUGINS:
			case POLICY:
			case PROC:
			case PROCESSLIST:
			case PROFILE:
			case PROPERTIES:
			case PROPERTY:
			case QUANTILE_STATE:
			case QUANTILE_UNION:
			case QUERY:
			case QUOTA:
			case RANDOM:
			case RECOVER:
			case RECYCLE:
			case REFRESH:
			case REPEATABLE:
			case REPLACE:
			case REPLACE_IF_NOT_NULL:
			case REPOSITORIES:
			case REPOSITORY:
			case RESOURCE:
			case RESOURCES:
			case RESTORE:
			case RESTRICTIVE:
			case RESUME:
			case RETURNS:
			case REWRITTEN:
			case RLIKE:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case S3:
			case SAMPLE:
			case SCHEDULER:
			case SCHEMA:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SHAPE:
			case SKEW:
			case SNAPSHOT:
			case SONAME:
			case SPLIT:
			case START:
			case STARTS:
			case STATS:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STREAMING:
			case STRING:
			case STRUCT:
			case SUBDATE:
			case SUM:
			case TABLES:
			case TASK:
			case TASKS:
			case TEMPORARY:
			case TEXT:
			case THAN:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TRANSACTION:
			case TREE:
			case TRIGGERS:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNCOMMITTED:
			case UNLOCK:
			case USER:
			case VALUE:
			case VARCHAR:
			case VARIABLES:
			case VERBOSE:
			case VERSION:
			case VIEW:
			case WARNINGS:
			case WEEK:
			case WORK:
			case YEAR:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1456);
				((LambdaExpressionContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
				((LambdaExpressionContext)_localctx).args.add(((LambdaExpressionContext)_localctx).errorCapturingIdentifier);
				setState(1457);
				match(ARROW);
				setState(1458);
				((LambdaExpressionContext)_localctx).body = booleanExpression(0);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1460);
				match(LEFT_PAREN);
				setState(1461);
				((LambdaExpressionContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
				((LambdaExpressionContext)_localctx).args.add(((LambdaExpressionContext)_localctx).errorCapturingIdentifier);
				setState(1464); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1462);
					match(COMMA);
					setState(1463);
					((LambdaExpressionContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((LambdaExpressionContext)_localctx).args.add(((LambdaExpressionContext)_localctx).errorCapturingIdentifier);
					}
					}
					setState(1466); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(1468);
				match(RIGHT_PAREN);
				setState(1469);
				match(ARROW);
				setState(1470);
				((LambdaExpressionContext)_localctx).body = booleanExpression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExistContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(DorisParser.EXISTS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public ExistContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterExist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitExist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitExist(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode LOGICALNOT() { return getToken(DorisParser.LOGICALNOT, 0); }
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsnullContext extends BooleanExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode ISNULL() { return getToken(DorisParser.ISNULL, 0); }
		public TerminalNode IS_NULL_PRED() { return getToken(DorisParser.IS_NULL_PRED, 0); }
		public IsnullContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIsnull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIsnull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIsnull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Is_not_null_predContext extends BooleanExpressionContext {
		public TerminalNode IS_NOT_NULL_PRED() { return getToken(DorisParser.IS_NOT_NULL_PRED, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public Is_not_null_predContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIs_not_null_pred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIs_not_null_pred(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIs_not_null_pred(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(DorisParser.AND, 0); }
		public TerminalNode LOGICALAND() { return getToken(DorisParser.LOGICALAND, 0); }
		public TerminalNode OR() { return getToken(DorisParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoublePipesContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode DOUBLEPIPES() { return getToken(DorisParser.DOUBLEPIPES, 0); }
		public DoublePipesContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDoublePipes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDoublePipes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDoublePipes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 168;
		enterRecursionRule(_localctx, 168, RULE_booleanExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1475);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==LOGICALNOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1476);
				booleanExpression(8);
				}
				break;
			case 2:
				{
				_localctx = new ExistContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1477);
				match(EXISTS);
				setState(1478);
				match(LEFT_PAREN);
				setState(1479);
				query();
				setState(1480);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				_localctx = new IsnullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1482);
				_la = _input.LA(1);
				if ( !(_la==IS_NULL_PRED || _la==ISNULL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1483);
				match(LEFT_PAREN);
				setState(1484);
				valueExpression(0);
				setState(1485);
				match(RIGHT_PAREN);
				}
				break;
			case 4:
				{
				_localctx = new Is_not_null_predContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1487);
				match(IS_NOT_NULL_PRED);
				setState(1488);
				match(LEFT_PAREN);
				setState(1489);
				valueExpression(0);
				setState(1490);
				match(RIGHT_PAREN);
				}
				break;
			case 5:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1492);
				valueExpression(0);
				setState(1494);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1493);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1507);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1498);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1499);
						((LogicalBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==LOGICALAND) ) {
							((LogicalBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1500);
						((LogicalBinaryContext)_localctx).right = booleanExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1501);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1502);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1503);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new DoublePipesContext(new BooleanExpressionContext(_parentctx, _parentState));
						((DoublePipesContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1504);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1505);
						((DoublePipesContext)_localctx).operator = match(DOUBLEPIPES);
						setState(1506);
						((DoublePipesContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RowConstructorContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public RowConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowConstructorContext rowConstructor() throws RecognitionException {
		RowConstructorContext _localctx = new RowConstructorContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_rowConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			match(LEFT_PAREN);
			setState(1513);
			namedExpression();
			setState(1518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1514);
				match(COMMA);
				setState(1515);
				namedExpression();
				}
				}
				setState(1520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1521);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public TerminalNode AND() { return getToken(DorisParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(DorisParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(DorisParser.NOT, 0); }
		public TerminalNode LIKE() { return getToken(DorisParser.LIKE, 0); }
		public TerminalNode REGEXP() { return getToken(DorisParser.REGEXP, 0); }
		public TerminalNode RLIKE() { return getToken(DorisParser.RLIKE, 0); }
		public TerminalNode MATCH() { return getToken(DorisParser.MATCH, 0); }
		public TerminalNode MATCH_ANY() { return getToken(DorisParser.MATCH_ANY, 0); }
		public TerminalNode MATCH_ALL() { return getToken(DorisParser.MATCH_ALL, 0); }
		public TerminalNode MATCH_PHRASE() { return getToken(DorisParser.MATCH_PHRASE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode IN() { return getToken(DorisParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public TerminalNode IS() { return getToken(DorisParser.IS, 0); }
		public TerminalNode NULL() { return getToken(DorisParser.NULL, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_predicate);
		int _la;
		try {
			setState(1569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1523);
					match(NOT);
					}
				}

				setState(1526);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(1527);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(1528);
				match(AND);
				setState(1529);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1531);
					match(NOT);
					}
				}

				setState(1534);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==REGEXP || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1535);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1536);
					match(NOT);
					}
				}

				setState(1539);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & ((1L << (MATCH - 252)) | (1L << (MATCH_ALL - 252)) | (1L << (MATCH_ANY - 252)) | (1L << (MATCH_PHRASE - 252)))) != 0)) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1540);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1541);
					match(NOT);
					}
				}

				setState(1544);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1545);
				match(LEFT_PAREN);
				setState(1546);
				query();
				setState(1547);
				match(RIGHT_PAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1549);
					match(NOT);
					}
				}

				setState(1552);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1553);
				match(LEFT_PAREN);
				setState(1554);
				expression();
				setState(1559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1555);
					match(COMMA);
					setState(1556);
					expression();
					}
					}
					setState(1561);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1562);
				match(RIGHT_PAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1564);
				match(IS);
				setState(1566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1565);
					match(NOT);
					}
				}

				setState(1568);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitOperationContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(DorisParser.COMMA, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BITAND() { return getToken(DorisParser.BITAND, 0); }
		public TerminalNode BITOR() { return getToken(DorisParser.BITOR, 0); }
		public TerminalNode BITXOR() { return getToken(DorisParser.BITXOR, 0); }
		public BitOperationContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterBitOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitBitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitBitOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(DorisParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(DorisParser.SLASH, 0); }
		public TerminalNode MOD() { return getToken(DorisParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(DorisParser.PLUS, 0); }
		public TerminalNode SUBTRACT() { return getToken(DorisParser.SUBTRACT, 0); }
		public TerminalNode DIV() { return getToken(DorisParser.DIV, 0); }
		public TerminalNode HAT() { return getToken(DorisParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(DorisParser.PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(DorisParser.AMPERSAND, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode SUBTRACT() { return getToken(DorisParser.SUBTRACT, 0); }
		public TerminalNode PLUS() { return getToken(DorisParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(DorisParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1572);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1573);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 465)) & ~0x3f) == 0 && ((1L << (_la - 465)) & ((1L << (PLUS - 465)) | (1L << (SUBTRACT - 465)) | (1L << (TILDE - 465)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1574);
				valueExpression(5);
				}
				break;
			case 3:
				{
				_localctx = new BitOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1575);
				((BitOperationContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BITAND) | (1L << BITOR) | (1L << BITXOR))) != 0)) ) {
					((BitOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1576);
				match(LEFT_PAREN);
				setState(1577);
				((BitOperationContext)_localctx).left = valueExpression(0);
				setState(1578);
				match(COMMA);
				setState(1579);
				((BitOperationContext)_localctx).right = valueExpression(0);
				setState(1580);
				match(RIGHT_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1596);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1594);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1584);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1585);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 467)) & ~0x3f) == 0 && ((1L << (_la - 467)) & ((1L << (ASTERISK - 467)) | (1L << (SLASH - 467)) | (1L << (MOD - 467)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1586);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1587);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1588);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || ((((_la - 465)) & ~0x3f) == 0 && ((1L << (_la - 465)) & ((1L << (PLUS - 465)) | (1L << (SUBTRACT - 465)) | (1L << (AMPERSAND - 465)) | (1L << (PIPE - 465)) | (1L << (HAT - 465)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1589);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1590);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1591);
						comparisonOperator();
						setState(1592);
						((ComparisonContext)_localctx).right = valueExpression(3);
						}
						break;
					}
					} 
				}
				setState(1598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DatetimeUnitContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(DorisParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(DorisParser.MONTH, 0); }
		public TerminalNode WEEK() { return getToken(DorisParser.WEEK, 0); }
		public TerminalNode DAY() { return getToken(DorisParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(DorisParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(DorisParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(DorisParser.SECOND, 0); }
		public DatetimeUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetimeUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDatetimeUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDatetimeUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDatetimeUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatetimeUnitContext datetimeUnit() throws RecognitionException {
		DatetimeUnitContext _localctx = new DatetimeUnitContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_datetimeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1599);
			_la = _input.LA(1);
			if ( !(_la==DAY || _la==HOUR || _la==MINUTE || _la==MONTH || _la==SECOND || _la==WEEK || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DateCeilContext extends PrimaryExpressionContext {
		public Token name;
		public ValueExpressionContext timestamp;
		public ValueExpressionContext unitsAmount;
		public DatetimeUnitContext unit;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(DorisParser.COMMA, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode DATE_CEIL() { return getToken(DorisParser.DATE_CEIL, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode INTERVAL() { return getToken(DorisParser.INTERVAL, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public DateCeilContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDateCeil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDateCeil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDateCeil(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public TerminalNode DOT() { return getToken(DorisParser.DOT, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimestampaddContext extends PrimaryExpressionContext {
		public Token name;
		public DatetimeUnitContext unit;
		public ValueExpressionContext startTimestamp;
		public ValueExpressionContext endTimestamp;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode TIMESTAMPADD() { return getToken(DorisParser.TIMESTAMPADD, 0); }
		public TerminalNode DATEADD() { return getToken(DorisParser.DATEADD, 0); }
		public TimestampaddContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterTimestampadd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitTimestampadd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitTimestampadd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Date_subContext extends PrimaryExpressionContext {
		public Token name;
		public ValueExpressionContext timestamp;
		public ValueExpressionContext unitsAmount;
		public DatetimeUnitContext unit;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(DorisParser.COMMA, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode SUBDATE() { return getToken(DorisParser.SUBDATE, 0); }
		public TerminalNode DAYS_SUB() { return getToken(DorisParser.DAYS_SUB, 0); }
		public TerminalNode DATE_SUB() { return getToken(DorisParser.DATE_SUB, 0); }
		public TerminalNode INTERVAL() { return getToken(DorisParser.INTERVAL, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public Date_subContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDate_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDate_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDate_sub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(DorisParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode CAST() { return getToken(DorisParser.CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UserVariableContext extends PrimaryExpressionContext {
		public TerminalNode ATSIGN() { return getToken(DorisParser.ATSIGN, 0); }
		public IdentifierOrTextContext identifierOrText() {
			return getRuleContext(IdentifierOrTextContext.class,0);
		}
		public UserVariableContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterUserVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitUserVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitUserVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElementAtContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public TerminalNode LEFT_BRACKET() { return getToken(DorisParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(DorisParser.RIGHT_BRACKET, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ElementAtContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterElementAt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitElementAt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitElementAt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharFunctionContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> arguments = new ArrayList<ExpressionContext>();
		public IdentifierOrTextContext charSet;
		public TerminalNode CHAR() { return getToken(DorisParser.CHAR, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public TerminalNode USING() { return getToken(DorisParser.USING, 0); }
		public IdentifierOrTextContext identifierOrText() {
			return getRuleContext(IdentifierOrTextContext.class,0);
		}
		public CharFunctionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCharFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCharFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCharFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends PrimaryExpressionContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(DorisParser.CASE, 0); }
		public TerminalNode END() { return getToken(DorisParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DorisParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(DorisParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DorisParser.DOT, 0); }
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConvertTypeContext extends PrimaryExpressionContext {
		public ExpressionContext argument;
		public DataTypeContext type;
		public TerminalNode CONVERT() { return getToken(DorisParser.CONVERT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(DorisParser.COMMA, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ConvertTypeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterConvertType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitConvertType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitConvertType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimestampdiffContext extends PrimaryExpressionContext {
		public Token name;
		public DatetimeUnitContext unit;
		public ValueExpressionContext startTimestamp;
		public ValueExpressionContext endTimestamp;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode TIMESTAMPDIFF() { return getToken(DorisParser.TIMESTAMPDIFF, 0); }
		public TerminalNode DATEDIFF() { return getToken(DorisParser.DATEDIFF, 0); }
		public TimestampdiffContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterTimestampdiff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitTimestampdiff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitTimestampdiff(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConvertCharSetContext extends PrimaryExpressionContext {
		public ExpressionContext argument;
		public IdentifierOrTextContext charSet;
		public TerminalNode CONVERT() { return getToken(DorisParser.CONVERT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode USING() { return getToken(DorisParser.USING, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierOrTextContext identifierOrText() {
			return getRuleContext(IdentifierOrTextContext.class,0);
		}
		public ConvertCharSetContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterConvertCharSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitConvertCharSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitConvertCharSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EncryptKeyContext extends PrimaryExpressionContext {
		public IdentifierContext dbName;
		public IdentifierContext keyName;
		public TerminalNode KEY() { return getToken(DorisParser.KEY, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(DorisParser.DOT, 0); }
		public EncryptKeyContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterEncryptKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitEncryptKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitEncryptKey(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Date_addContext extends PrimaryExpressionContext {
		public Token name;
		public ValueExpressionContext timestamp;
		public ValueExpressionContext unitsAmount;
		public DatetimeUnitContext unit;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(DorisParser.COMMA, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ADDDATE() { return getToken(DorisParser.ADDDATE, 0); }
		public TerminalNode DAYS_ADD() { return getToken(DorisParser.DAYS_ADD, 0); }
		public TerminalNode DATE_ADD() { return getToken(DorisParser.DATE_ADD, 0); }
		public TerminalNode INTERVAL() { return getToken(DorisParser.INTERVAL, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public Date_addContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDate_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDate_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDate_add(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SystemVariableContext extends PrimaryExpressionContext {
		public Token kind;
		public TerminalNode DOUBLEATSIGN() { return getToken(DorisParser.DOUBLEATSIGN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DorisParser.DOT, 0); }
		public TerminalNode GLOBAL() { return getToken(DorisParser.GLOBAL, 0); }
		public TerminalNode SESSION() { return getToken(DorisParser.SESSION, 0); }
		public SystemVariableContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSystemVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSystemVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSystemVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CollateContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(DorisParser.COLLATE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public TerminalNode DEFAULT() { return getToken(DorisParser.DEFAULT, 0); }
		public CollateContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCollate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCollate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCollate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(DorisParser.EXTRACT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode FROM() { return getToken(DorisParser.FROM, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode DATE() { return getToken(DorisParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(DorisParser.TIMESTAMP, 0); }
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> arguments = new ArrayList<ExpressionContext>();
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode OVER() { return getToken(DorisParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public TerminalNode ORDER() { return getToken(DorisParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(DorisParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode DISTINCT() { return getToken(DorisParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(DorisParser.ALL, 0); }
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArraySliceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext begin;
		public ValueExpressionContext end;
		public TerminalNode LEFT_BRACKET() { return getToken(DorisParser.LEFT_BRACKET, 0); }
		public TerminalNode COLON() { return getToken(DorisParser.COLON, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(DorisParser.RIGHT_BRACKET, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ArraySliceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterArraySlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitArraySlice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitArraySlice(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DateFloorContext extends PrimaryExpressionContext {
		public Token name;
		public ValueExpressionContext timestamp;
		public ValueExpressionContext unitsAmount;
		public DatetimeUnitContext unit;
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(DorisParser.COMMA, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public TerminalNode DATE_FLOOR() { return getToken(DorisParser.DATE_FLOOR, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode INTERVAL() { return getToken(DorisParser.INTERVAL, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public DateFloorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDateFloor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDateFloor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDateFloor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(DorisParser.CASE, 0); }
		public TerminalNode END() { return getToken(DorisParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DorisParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 178;
		enterRecursionRule(_localctx, 178, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				_localctx = new TimestampdiffContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1602);
				((TimestampdiffContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DATEDIFF || _la==TIMESTAMPDIFF) ) {
					((TimestampdiffContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1603);
				match(LEFT_PAREN);
				setState(1604);
				((TimestampdiffContext)_localctx).unit = datetimeUnit();
				setState(1605);
				match(COMMA);
				setState(1606);
				((TimestampdiffContext)_localctx).startTimestamp = valueExpression(0);
				setState(1607);
				match(COMMA);
				setState(1608);
				((TimestampdiffContext)_localctx).endTimestamp = valueExpression(0);
				setState(1609);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new TimestampaddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1611);
				((TimestampaddContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DATEADD || _la==TIMESTAMPADD) ) {
					((TimestampaddContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1612);
				match(LEFT_PAREN);
				setState(1613);
				((TimestampaddContext)_localctx).unit = datetimeUnit();
				setState(1614);
				match(COMMA);
				setState(1615);
				((TimestampaddContext)_localctx).startTimestamp = valueExpression(0);
				setState(1616);
				match(COMMA);
				setState(1617);
				((TimestampaddContext)_localctx).endTimestamp = valueExpression(0);
				setState(1618);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				_localctx = new Date_addContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1620);
				((Date_addContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADDDATE || _la==DATE_ADD || _la==DAYS_ADD) ) {
					((Date_addContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1621);
				match(LEFT_PAREN);
				setState(1622);
				((Date_addContext)_localctx).timestamp = valueExpression(0);
				setState(1623);
				match(COMMA);
				setState(1629);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1624);
					match(INTERVAL);
					setState(1625);
					((Date_addContext)_localctx).unitsAmount = valueExpression(0);
					setState(1626);
					((Date_addContext)_localctx).unit = datetimeUnit();
					}
					break;
				case 2:
					{
					setState(1628);
					((Date_addContext)_localctx).unitsAmount = valueExpression(0);
					}
					break;
				}
				setState(1631);
				match(RIGHT_PAREN);
				}
				break;
			case 4:
				{
				_localctx = new Date_subContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1633);
				((Date_subContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DATE_SUB || _la==DAYS_SUB || _la==SUBDATE) ) {
					((Date_subContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1634);
				match(LEFT_PAREN);
				setState(1635);
				((Date_subContext)_localctx).timestamp = valueExpression(0);
				setState(1636);
				match(COMMA);
				setState(1642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1637);
					match(INTERVAL);
					setState(1638);
					((Date_subContext)_localctx).unitsAmount = valueExpression(0);
					setState(1639);
					((Date_subContext)_localctx).unit = datetimeUnit();
					}
					break;
				case 2:
					{
					setState(1641);
					((Date_subContext)_localctx).unitsAmount = valueExpression(0);
					}
					break;
				}
				setState(1644);
				match(RIGHT_PAREN);
				}
				break;
			case 5:
				{
				_localctx = new DateFloorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1646);
				((DateFloorContext)_localctx).name = match(DATE_FLOOR);
				setState(1647);
				match(LEFT_PAREN);
				setState(1648);
				((DateFloorContext)_localctx).timestamp = valueExpression(0);
				setState(1649);
				match(COMMA);
				setState(1655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1650);
					match(INTERVAL);
					setState(1651);
					((DateFloorContext)_localctx).unitsAmount = valueExpression(0);
					setState(1652);
					((DateFloorContext)_localctx).unit = datetimeUnit();
					}
					break;
				case 2:
					{
					setState(1654);
					((DateFloorContext)_localctx).unitsAmount = valueExpression(0);
					}
					break;
				}
				setState(1657);
				match(RIGHT_PAREN);
				}
				break;
			case 6:
				{
				_localctx = new DateCeilContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1659);
				((DateCeilContext)_localctx).name = match(DATE_CEIL);
				setState(1660);
				match(LEFT_PAREN);
				setState(1661);
				((DateCeilContext)_localctx).timestamp = valueExpression(0);
				setState(1662);
				match(COMMA);
				setState(1668);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1663);
					match(INTERVAL);
					setState(1664);
					((DateCeilContext)_localctx).unitsAmount = valueExpression(0);
					setState(1665);
					((DateCeilContext)_localctx).unit = datetimeUnit();
					}
					break;
				case 2:
					{
					setState(1667);
					((DateCeilContext)_localctx).unitsAmount = valueExpression(0);
					}
					break;
				}
				setState(1670);
				match(RIGHT_PAREN);
				}
				break;
			case 7:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1672);
				match(CASE);
				setState(1674); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1673);
					whenClause();
					}
					}
					setState(1676); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1678);
					match(ELSE);
					setState(1679);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1682);
				match(END);
				}
				break;
			case 8:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1684);
				match(CASE);
				setState(1685);
				((SimpleCaseContext)_localctx).value = expression();
				setState(1687); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1686);
					whenClause();
					}
					}
					setState(1689); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1691);
					match(ELSE);
					setState(1692);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1695);
				match(END);
				}
				break;
			case 9:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1697);
				((CastContext)_localctx).name = match(CAST);
				setState(1698);
				match(LEFT_PAREN);
				setState(1699);
				expression();
				setState(1700);
				match(AS);
				setState(1701);
				dataType();
				setState(1702);
				match(RIGHT_PAREN);
				}
				break;
			case 10:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1704);
				constant();
				}
				break;
			case 11:
				{
				_localctx = new IntervalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1705);
				interval();
				}
				break;
			case 12:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1706);
				match(ASTERISK);
				}
				break;
			case 13:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1707);
				qualifiedName();
				setState(1708);
				match(DOT);
				setState(1709);
				match(ASTERISK);
				}
				break;
			case 14:
				{
				_localctx = new CharFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1711);
				match(CHAR);
				setState(1712);
				match(LEFT_PAREN);
				setState(1713);
				((CharFunctionContext)_localctx).expression = expression();
				((CharFunctionContext)_localctx).arguments.add(((CharFunctionContext)_localctx).expression);
				setState(1718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1714);
					match(COMMA);
					setState(1715);
					((CharFunctionContext)_localctx).expression = expression();
					((CharFunctionContext)_localctx).arguments.add(((CharFunctionContext)_localctx).expression);
					}
					}
					setState(1720);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1721);
					match(USING);
					setState(1722);
					((CharFunctionContext)_localctx).charSet = identifierOrText();
					}
				}

				setState(1725);
				match(RIGHT_PAREN);
				}
				break;
			case 15:
				{
				_localctx = new ConvertCharSetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1727);
				match(CONVERT);
				setState(1728);
				match(LEFT_PAREN);
				setState(1729);
				((ConvertCharSetContext)_localctx).argument = expression();
				setState(1730);
				match(USING);
				setState(1731);
				((ConvertCharSetContext)_localctx).charSet = identifierOrText();
				setState(1732);
				match(RIGHT_PAREN);
				}
				break;
			case 16:
				{
				_localctx = new ConvertTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1734);
				match(CONVERT);
				setState(1735);
				match(LEFT_PAREN);
				setState(1736);
				((ConvertTypeContext)_localctx).argument = expression();
				setState(1737);
				match(COMMA);
				setState(1738);
				((ConvertTypeContext)_localctx).type = dataType();
				setState(1739);
				match(RIGHT_PAREN);
				}
				break;
			case 17:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1741);
				functionIdentifier();
				setState(1742);
				match(LEFT_PAREN);
				setState(1766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << RIGHT_BRACE) | (1L << ADD) | (1L << ADDDATE) | (1L << AFTER) | (1L << AGG_STATE) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ALL) | (1L << ANALYZED) | (1L << ARRAY) | (1L << AT) | (1L << AUTHORS) | (1L << BACKENDS) | (1L << BACKUP) | (1L << BEGIN) | (1L << BIN) | (1L << BITAND) | (1L << BITMAP) | (1L << BITMAP_UNION) | (1L << BITOR) | (1L << BITXOR) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BRIEF) | (1L << BROKER) | (1L << BUCKETS) | (1L << BUILD) | (1L << BUILTIN) | (1L << CACHED) | (1L << CASE) | (1L << CAST) | (1L << CATALOG) | (1L << CATALOGS) | (1L << CHAIN) | (1L << CHAR) | (1L << CHARSET) | (1L << CHECK))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLUSTER - 65)) | (1L << (CLUSTERS - 65)) | (1L << (COLLATION - 65)) | (1L << (COLUMNS - 65)) | (1L << (COMMENT - 65)) | (1L << (COMMIT - 65)) | (1L << (COMMITTED - 65)) | (1L << (COMPACT - 65)) | (1L << (COMPLETE - 65)) | (1L << (CONFIG - 65)) | (1L << (CONNECTION - 65)) | (1L << (CONNECTION_ID - 65)) | (1L << (CONSISTENT - 65)) | (1L << (CONVERT - 65)) | (1L << (COPY - 65)) | (1L << (COUNT - 65)) | (1L << (CREATION - 65)) | (1L << (CRON - 65)) | (1L << (CURRENT_CATALOG - 65)) | (1L << (CURRENT_TIMESTAMP - 65)) | (1L << (CURRENT_USER - 65)) | (1L << (DATA - 65)) | (1L << (DATABASE - 65)) | (1L << (DATE - 65)) | (1L << (DATE_ADD - 65)) | (1L << (DATE_CEIL - 65)) | (1L << (DATE_DIFF - 65)) | (1L << (DATE_FLOOR - 65)) | (1L << (DATE_SUB - 65)) | (1L << (DATEADD - 65)) | (1L << (DATEDIFF - 65)) | (1L << (DATETIME - 65)) | (1L << (DATETIMEV2 - 65)) | (1L << (DATEV2 - 65)) | (1L << (DATETIMEV1 - 65)) | (1L << (DATEV1 - 65)) | (1L << (DAY - 65)) | (1L << (DAYS_ADD - 65)) | (1L << (DAYS_SUB - 65)) | (1L << (DECIMAL - 65)) | (1L << (DECIMALV2 - 65)) | (1L << (DECIMALV3 - 65)) | (1L << (DEFERRED - 65)) | (1L << (DEMAND - 65)) | (1L << (DIAGNOSE - 65)) | (1L << (DISTINCT - 65)) | (1L << (DISTINCTPC - 65)) | (1L << (DISTINCTPCSA - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (DO - 130)) | (1L << (DORIS_INTERNAL_TABLE_ID - 130)) | (1L << (DYNAMIC - 130)) | (1L << (ENABLE - 130)) | (1L << (ENCRYPTKEY - 130)) | (1L << (ENCRYPTKEYS - 130)) | (1L << (END - 130)) | (1L << (ENDS - 130)) | (1L << (ENGINE - 130)) | (1L << (ENGINES - 130)) | (1L << (ERRORS - 130)) | (1L << (EVENTS - 130)) | (1L << (EVERY - 130)) | (1L << (EXCLUDE - 130)) | (1L << (EXISTS - 130)) | (1L << (EXPIRED - 130)) | (1L << (EXTERNAL - 130)) | (1L << (EXTRACT - 130)) | (1L << (FAILED_LOGIN_ATTEMPTS - 130)) | (1L << (FALSE - 130)) | (1L << (FAST - 130)) | (1L << (FEATURE - 130)) | (1L << (FIELDS - 130)) | (1L << (FILE - 130)) | (1L << (FILTER - 130)) | (1L << (FIRST - 130)) | (1L << (FORMAT - 130)) | (1L << (FREE - 130)) | (1L << (FRONTENDS - 130)) | (1L << (FUNCTION - 130)) | (1L << (GLOBAL - 130)) | (1L << (GRAPH - 130)) | (1L << (GROUPING - 130)) | (1L << (GROUPS - 130)) | (1L << (HASH - 130)) | (1L << (HDFS - 130)) | (1L << (HELP - 130)) | (1L << (HISTOGRAM - 130)) | (1L << (HLL_UNION - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (HOSTNAME - 194)) | (1L << (HOUR - 194)) | (1L << (HUB - 194)) | (1L << (IDENTIFIED - 194)) | (1L << (IF - 194)) | (1L << (IGNORE - 194)) | (1L << (IMMEDIATE - 194)) | (1L << (INCREMENTAL - 194)) | (1L << (INDEXES - 194)) | (1L << (INTERVAL - 194)) | (1L << (INVERTED - 194)) | (1L << (IS_NOT_NULL_PRED - 194)) | (1L << (IS_NULL_PRED - 194)) | (1L << (ISNULL - 194)) | (1L << (ISOLATION - 194)) | (1L << (JOB - 194)) | (1L << (JOBS - 194)) | (1L << (JSON - 194)) | (1L << (JSONB - 194)) | (1L << (KEY - 194)) | (1L << (LABEL - 194)) | (1L << (LAST - 194)) | (1L << (LDAP - 194)) | (1L << (LDAP_ADMIN_PASSWORD - 194)) | (1L << (LEFT - 194)) | (1L << (LESS - 194)) | (1L << (LEVEL - 194)) | (1L << (LIKE - 194)) | (1L << (LINES - 194)) | (1L << (LINK - 194)) | (1L << (LOCAL - 194)) | (1L << (LOCATION - 194)) | (1L << (LOCK - 194)) | (1L << (LOGICAL - 194)) | (1L << (MAP - 194)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (MATERIALIZED - 261)) | (1L << (MAX - 261)) | (1L << (MEMO - 261)) | (1L << (MERGE - 261)) | (1L << (MIGRATE - 261)) | (1L << (MIGRATIONS - 261)) | (1L << (MIN - 261)) | (1L << (MINUTE - 261)) | (1L << (MODIFY - 261)) | (1L << (MONTH - 261)) | (1L << (MTMV - 261)) | (1L << (NAME - 261)) | (1L << (NAMES - 261)) | (1L << (NEGATIVE - 261)) | (1L << (NEVER - 261)) | (1L << (NEXT - 261)) | (1L << (NGRAM_BF - 261)) | (1L << (NO - 261)) | (1L << (NON_NULLABLE - 261)) | (1L << (NOT - 261)) | (1L << (NULL - 261)) | (1L << (NULLS - 261)) | (1L << (OF - 261)) | (1L << (OFFSET - 261)) | (1L << (ONLY - 261)) | (1L << (OPEN - 261)) | (1L << (OPTIMIZED - 261)) | (1L << (PARAMETER - 261)) | (1L << (PARSED - 261)) | (1L << (PASSWORD - 261)) | (1L << (PASSWORD_EXPIRE - 261)) | (1L << (PASSWORD_HISTORY - 261)) | (1L << (PASSWORD_LOCK_TIME - 261)) | (1L << (PASSWORD_REUSE - 261)) | (1L << (PATH - 261)) | (1L << (PAUSE - 261)) | (1L << (PERCENT - 261)) | (1L << (PERIOD - 261)) | (1L << (PERMISSIVE - 261)) | (1L << (PHYSICAL - 261)) | (1L << (PLAN - 261)) | (1L << (PLUGIN - 261)) | (1L << (PLUGINS - 261)) | (1L << (POLICY - 261)) | (1L << (PROC - 261)) | (1L << (PROCESSLIST - 261)) | (1L << (PROFILE - 261)) | (1L << (PROPERTIES - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (PROPERTY - 325)) | (1L << (QUANTILE_STATE - 325)) | (1L << (QUANTILE_UNION - 325)) | (1L << (QUERY - 325)) | (1L << (QUOTA - 325)) | (1L << (RANDOM - 325)) | (1L << (RECOVER - 325)) | (1L << (RECYCLE - 325)) | (1L << (REFRESH - 325)) | (1L << (REGEXP - 325)) | (1L << (REPEATABLE - 325)) | (1L << (REPLACE - 325)) | (1L << (REPLACE_IF_NOT_NULL - 325)) | (1L << (REPOSITORIES - 325)) | (1L << (REPOSITORY - 325)) | (1L << (RESOURCE - 325)) | (1L << (RESOURCES - 325)) | (1L << (RESTORE - 325)) | (1L << (RESTRICTIVE - 325)) | (1L << (RESUME - 325)) | (1L << (RETURNS - 325)) | (1L << (REWRITTEN - 325)) | (1L << (RIGHT - 325)) | (1L << (RLIKE - 325)) | (1L << (ROLLBACK - 325)) | (1L << (ROLLUP - 325)) | (1L << (ROUTINE - 325)) | (1L << (S3 - 325)) | (1L << (SAMPLE - 325)) | (1L << (SCHEDULER - 325)) | (1L << (SCHEMA - 325)) | (1L << (SECOND - 325)) | (1L << (SERIALIZABLE - 325)) | (1L << (SESSION - 325)) | (1L << (SHAPE - 325)) | (1L << (SKEW - 325)) | (1L << (SNAPSHOT - 325)) | (1L << (SONAME - 325)) | (1L << (SPLIT - 325)) | (1L << (START - 325)) | (1L << (STARTS - 325)) | (1L << (STATS - 325)))) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (STATUS - 389)) | (1L << (STOP - 389)) | (1L << (STORAGE - 389)) | (1L << (STREAM - 389)) | (1L << (STREAMING - 389)) | (1L << (STRING - 389)) | (1L << (STRUCT - 389)) | (1L << (SUBDATE - 389)) | (1L << (SUM - 389)) | (1L << (TABLES - 389)) | (1L << (TASK - 389)) | (1L << (TASKS - 389)) | (1L << (TEMPORARY - 389)) | (1L << (TEXT - 389)) | (1L << (THAN - 389)) | (1L << (TIME - 389)) | (1L << (TIMESTAMP - 389)) | (1L << (TIMESTAMPADD - 389)) | (1L << (TIMESTAMPDIFF - 389)) | (1L << (TRANSACTION - 389)) | (1L << (TREE - 389)) | (1L << (TRIGGERS - 389)) | (1L << (TRIM - 389)) | (1L << (TRUE - 389)) | (1L << (TRUNCATE - 389)) | (1L << (TYPE - 389)) | (1L << (TYPES - 389)) | (1L << (UNCOMMITTED - 389)) | (1L << (UNLOCK - 389)) | (1L << (USER - 389)) | (1L << (VALUE - 389)) | (1L << (VARCHAR - 389)) | (1L << (VARIABLES - 389)) | (1L << (VERBOSE - 389)) | (1L << (VERSION - 389)) | (1L << (VIEW - 389)) | (1L << (WARNINGS - 389)) | (1L << (WEEK - 389)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (WORK - 454)) | (1L << (YEAR - 454)) | (1L << (PLUS - 454)) | (1L << (SUBTRACT - 454)) | (1L << (ASTERISK - 454)) | (1L << (TILDE - 454)) | (1L << (LOGICALNOT - 454)) | (1L << (ATSIGN - 454)) | (1L << (DOUBLEATSIGN - 454)) | (1L << (STRING_LITERAL - 454)) | (1L << (INTEGER_VALUE - 454)) | (1L << (EXPONENT_VALUE - 454)) | (1L << (DECIMAL_VALUE - 454)) | (1L << (IDENTIFIER - 454)) | (1L << (BACKQUOTED_IDENTIFIER - 454)))) != 0)) {
					{
					setState(1744);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(1743);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==DISTINCT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1746);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).arguments.add(((FunctionCallContext)_localctx).expression);
					setState(1751);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1747);
						match(COMMA);
						setState(1748);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).arguments.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(1753);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1764);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER) {
						{
						setState(1754);
						match(ORDER);
						setState(1755);
						match(BY);
						setState(1756);
						sortItem();
						setState(1761);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1757);
							match(COMMA);
							setState(1758);
							sortItem();
							}
							}
							setState(1763);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
				}

				setState(1768);
				match(RIGHT_PAREN);
				setState(1771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1769);
					match(OVER);
					setState(1770);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 18:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1773);
				match(LEFT_PAREN);
				setState(1774);
				query();
				setState(1775);
				match(RIGHT_PAREN);
				}
				break;
			case 19:
				{
				_localctx = new UserVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1777);
				match(ATSIGN);
				setState(1778);
				identifierOrText();
				}
				break;
			case 20:
				{
				_localctx = new SystemVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1779);
				match(DOUBLEATSIGN);
				setState(1782);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1780);
					((SystemVariableContext)_localctx).kind = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==GLOBAL || _la==SESSION) ) {
						((SystemVariableContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1781);
					match(DOT);
					}
					break;
				}
				setState(1784);
				identifier();
				}
				break;
			case 21:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1785);
				identifier();
				}
				break;
			case 22:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1786);
				match(LEFT_PAREN);
				setState(1787);
				expression();
				setState(1788);
				match(RIGHT_PAREN);
				}
				break;
			case 23:
				{
				_localctx = new EncryptKeyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1790);
				match(KEY);
				setState(1794);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1791);
					((EncryptKeyContext)_localctx).dbName = identifier();
					setState(1792);
					match(DOT);
					}
					break;
				}
				setState(1796);
				((EncryptKeyContext)_localctx).keyName = identifier();
				}
				break;
			case 24:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1797);
				match(EXTRACT);
				setState(1798);
				match(LEFT_PAREN);
				setState(1799);
				((ExtractContext)_localctx).field = identifier();
				setState(1800);
				match(FROM);
				setState(1802);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1801);
					_la = _input.LA(1);
					if ( !(_la==DATE || _la==TIMESTAMP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1804);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(1805);
				match(RIGHT_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1835);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1833);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
					case 1:
						{
						_localctx = new ElementAtContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((ElementAtContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1809);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1810);
						match(LEFT_BRACKET);
						setState(1811);
						((ElementAtContext)_localctx).index = valueExpression(0);
						setState(1812);
						match(RIGHT_BRACKET);
						}
						break;
					case 2:
						{
						_localctx = new ArraySliceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((ArraySliceContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1814);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1815);
						match(LEFT_BRACKET);
						setState(1816);
						((ArraySliceContext)_localctx).begin = valueExpression(0);
						setState(1817);
						match(COLON);
						setState(1819);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << RIGHT_BRACE) | (1L << ADD) | (1L << ADDDATE) | (1L << AFTER) | (1L << AGG_STATE) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ANALYZED) | (1L << ARRAY) | (1L << AT) | (1L << AUTHORS) | (1L << BACKENDS) | (1L << BACKUP) | (1L << BEGIN) | (1L << BIN) | (1L << BITAND) | (1L << BITMAP) | (1L << BITMAP_UNION) | (1L << BITOR) | (1L << BITXOR) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BRIEF) | (1L << BROKER) | (1L << BUCKETS) | (1L << BUILD) | (1L << BUILTIN) | (1L << CACHED) | (1L << CASE) | (1L << CAST) | (1L << CATALOG) | (1L << CATALOGS) | (1L << CHAIN) | (1L << CHAR) | (1L << CHARSET) | (1L << CHECK))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLUSTER - 65)) | (1L << (CLUSTERS - 65)) | (1L << (COLLATION - 65)) | (1L << (COLUMNS - 65)) | (1L << (COMMENT - 65)) | (1L << (COMMIT - 65)) | (1L << (COMMITTED - 65)) | (1L << (COMPACT - 65)) | (1L << (COMPLETE - 65)) | (1L << (CONFIG - 65)) | (1L << (CONNECTION - 65)) | (1L << (CONNECTION_ID - 65)) | (1L << (CONSISTENT - 65)) | (1L << (CONVERT - 65)) | (1L << (COPY - 65)) | (1L << (COUNT - 65)) | (1L << (CREATION - 65)) | (1L << (CRON - 65)) | (1L << (CURRENT_CATALOG - 65)) | (1L << (CURRENT_TIMESTAMP - 65)) | (1L << (CURRENT_USER - 65)) | (1L << (DATA - 65)) | (1L << (DATABASE - 65)) | (1L << (DATE - 65)) | (1L << (DATE_ADD - 65)) | (1L << (DATE_CEIL - 65)) | (1L << (DATE_DIFF - 65)) | (1L << (DATE_FLOOR - 65)) | (1L << (DATE_SUB - 65)) | (1L << (DATEADD - 65)) | (1L << (DATEDIFF - 65)) | (1L << (DATETIME - 65)) | (1L << (DATETIMEV2 - 65)) | (1L << (DATEV2 - 65)) | (1L << (DATETIMEV1 - 65)) | (1L << (DATEV1 - 65)) | (1L << (DAY - 65)) | (1L << (DAYS_ADD - 65)) | (1L << (DAYS_SUB - 65)) | (1L << (DECIMAL - 65)) | (1L << (DECIMALV2 - 65)) | (1L << (DECIMALV3 - 65)) | (1L << (DEFERRED - 65)) | (1L << (DEMAND - 65)) | (1L << (DIAGNOSE - 65)) | (1L << (DISTINCTPC - 65)) | (1L << (DISTINCTPCSA - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (DO - 130)) | (1L << (DORIS_INTERNAL_TABLE_ID - 130)) | (1L << (DYNAMIC - 130)) | (1L << (ENABLE - 130)) | (1L << (ENCRYPTKEY - 130)) | (1L << (ENCRYPTKEYS - 130)) | (1L << (END - 130)) | (1L << (ENDS - 130)) | (1L << (ENGINE - 130)) | (1L << (ENGINES - 130)) | (1L << (ERRORS - 130)) | (1L << (EVENTS - 130)) | (1L << (EVERY - 130)) | (1L << (EXCLUDE - 130)) | (1L << (EXPIRED - 130)) | (1L << (EXTERNAL - 130)) | (1L << (EXTRACT - 130)) | (1L << (FAILED_LOGIN_ATTEMPTS - 130)) | (1L << (FALSE - 130)) | (1L << (FAST - 130)) | (1L << (FEATURE - 130)) | (1L << (FIELDS - 130)) | (1L << (FILE - 130)) | (1L << (FILTER - 130)) | (1L << (FIRST - 130)) | (1L << (FORMAT - 130)) | (1L << (FREE - 130)) | (1L << (FRONTENDS - 130)) | (1L << (FUNCTION - 130)) | (1L << (GLOBAL - 130)) | (1L << (GRAPH - 130)) | (1L << (GROUPING - 130)) | (1L << (GROUPS - 130)) | (1L << (HASH - 130)) | (1L << (HDFS - 130)) | (1L << (HELP - 130)) | (1L << (HISTOGRAM - 130)) | (1L << (HLL_UNION - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (HOSTNAME - 194)) | (1L << (HOUR - 194)) | (1L << (HUB - 194)) | (1L << (IDENTIFIED - 194)) | (1L << (IF - 194)) | (1L << (IGNORE - 194)) | (1L << (IMMEDIATE - 194)) | (1L << (INCREMENTAL - 194)) | (1L << (INDEXES - 194)) | (1L << (INTERVAL - 194)) | (1L << (INVERTED - 194)) | (1L << (IS_NOT_NULL_PRED - 194)) | (1L << (IS_NULL_PRED - 194)) | (1L << (ISNULL - 194)) | (1L << (ISOLATION - 194)) | (1L << (JOB - 194)) | (1L << (JOBS - 194)) | (1L << (JSON - 194)) | (1L << (JSONB - 194)) | (1L << (KEY - 194)) | (1L << (LABEL - 194)) | (1L << (LAST - 194)) | (1L << (LDAP - 194)) | (1L << (LDAP_ADMIN_PASSWORD - 194)) | (1L << (LEFT - 194)) | (1L << (LESS - 194)) | (1L << (LEVEL - 194)) | (1L << (LIKE - 194)) | (1L << (LINES - 194)) | (1L << (LINK - 194)) | (1L << (LOCAL - 194)) | (1L << (LOCATION - 194)) | (1L << (LOCK - 194)) | (1L << (LOGICAL - 194)) | (1L << (MAP - 194)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (MATERIALIZED - 261)) | (1L << (MAX - 261)) | (1L << (MEMO - 261)) | (1L << (MERGE - 261)) | (1L << (MIGRATE - 261)) | (1L << (MIGRATIONS - 261)) | (1L << (MIN - 261)) | (1L << (MINUTE - 261)) | (1L << (MODIFY - 261)) | (1L << (MONTH - 261)) | (1L << (MTMV - 261)) | (1L << (NAME - 261)) | (1L << (NAMES - 261)) | (1L << (NEGATIVE - 261)) | (1L << (NEVER - 261)) | (1L << (NEXT - 261)) | (1L << (NGRAM_BF - 261)) | (1L << (NO - 261)) | (1L << (NON_NULLABLE - 261)) | (1L << (NULL - 261)) | (1L << (NULLS - 261)) | (1L << (OF - 261)) | (1L << (OFFSET - 261)) | (1L << (ONLY - 261)) | (1L << (OPEN - 261)) | (1L << (OPTIMIZED - 261)) | (1L << (PARAMETER - 261)) | (1L << (PARSED - 261)) | (1L << (PASSWORD - 261)) | (1L << (PASSWORD_EXPIRE - 261)) | (1L << (PASSWORD_HISTORY - 261)) | (1L << (PASSWORD_LOCK_TIME - 261)) | (1L << (PASSWORD_REUSE - 261)) | (1L << (PATH - 261)) | (1L << (PAUSE - 261)) | (1L << (PERCENT - 261)) | (1L << (PERIOD - 261)) | (1L << (PERMISSIVE - 261)) | (1L << (PHYSICAL - 261)) | (1L << (PLAN - 261)) | (1L << (PLUGIN - 261)) | (1L << (PLUGINS - 261)) | (1L << (POLICY - 261)) | (1L << (PROC - 261)) | (1L << (PROCESSLIST - 261)) | (1L << (PROFILE - 261)) | (1L << (PROPERTIES - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (PROPERTY - 325)) | (1L << (QUANTILE_STATE - 325)) | (1L << (QUANTILE_UNION - 325)) | (1L << (QUERY - 325)) | (1L << (QUOTA - 325)) | (1L << (RANDOM - 325)) | (1L << (RECOVER - 325)) | (1L << (RECYCLE - 325)) | (1L << (REFRESH - 325)) | (1L << (REGEXP - 325)) | (1L << (REPEATABLE - 325)) | (1L << (REPLACE - 325)) | (1L << (REPLACE_IF_NOT_NULL - 325)) | (1L << (REPOSITORIES - 325)) | (1L << (REPOSITORY - 325)) | (1L << (RESOURCE - 325)) | (1L << (RESOURCES - 325)) | (1L << (RESTORE - 325)) | (1L << (RESTRICTIVE - 325)) | (1L << (RESUME - 325)) | (1L << (RETURNS - 325)) | (1L << (REWRITTEN - 325)) | (1L << (RIGHT - 325)) | (1L << (RLIKE - 325)) | (1L << (ROLLBACK - 325)) | (1L << (ROLLUP - 325)) | (1L << (ROUTINE - 325)) | (1L << (S3 - 325)) | (1L << (SAMPLE - 325)) | (1L << (SCHEDULER - 325)) | (1L << (SCHEMA - 325)) | (1L << (SECOND - 325)) | (1L << (SERIALIZABLE - 325)) | (1L << (SESSION - 325)) | (1L << (SHAPE - 325)) | (1L << (SKEW - 325)) | (1L << (SNAPSHOT - 325)) | (1L << (SONAME - 325)) | (1L << (SPLIT - 325)) | (1L << (START - 325)) | (1L << (STARTS - 325)) | (1L << (STATS - 325)))) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (STATUS - 389)) | (1L << (STOP - 389)) | (1L << (STORAGE - 389)) | (1L << (STREAM - 389)) | (1L << (STREAMING - 389)) | (1L << (STRING - 389)) | (1L << (STRUCT - 389)) | (1L << (SUBDATE - 389)) | (1L << (SUM - 389)) | (1L << (TABLES - 389)) | (1L << (TASK - 389)) | (1L << (TASKS - 389)) | (1L << (TEMPORARY - 389)) | (1L << (TEXT - 389)) | (1L << (THAN - 389)) | (1L << (TIME - 389)) | (1L << (TIMESTAMP - 389)) | (1L << (TIMESTAMPADD - 389)) | (1L << (TIMESTAMPDIFF - 389)) | (1L << (TRANSACTION - 389)) | (1L << (TREE - 389)) | (1L << (TRIGGERS - 389)) | (1L << (TRIM - 389)) | (1L << (TRUE - 389)) | (1L << (TRUNCATE - 389)) | (1L << (TYPE - 389)) | (1L << (TYPES - 389)) | (1L << (UNCOMMITTED - 389)) | (1L << (UNLOCK - 389)) | (1L << (USER - 389)) | (1L << (VALUE - 389)) | (1L << (VARCHAR - 389)) | (1L << (VARIABLES - 389)) | (1L << (VERBOSE - 389)) | (1L << (VERSION - 389)) | (1L << (VIEW - 389)) | (1L << (WARNINGS - 389)) | (1L << (WEEK - 389)))) != 0) || ((((_la - 454)) & ~0x3f) == 0 && ((1L << (_la - 454)) & ((1L << (WORK - 454)) | (1L << (YEAR - 454)) | (1L << (PLUS - 454)) | (1L << (SUBTRACT - 454)) | (1L << (ASTERISK - 454)) | (1L << (TILDE - 454)) | (1L << (ATSIGN - 454)) | (1L << (DOUBLEATSIGN - 454)) | (1L << (STRING_LITERAL - 454)) | (1L << (INTEGER_VALUE - 454)) | (1L << (EXPONENT_VALUE - 454)) | (1L << (DECIMAL_VALUE - 454)) | (1L << (IDENTIFIER - 454)) | (1L << (BACKQUOTED_IDENTIFIER - 454)))) != 0)) {
							{
							setState(1818);
							((ArraySliceContext)_localctx).end = valueExpression(0);
							}
						}

						setState(1821);
						match(RIGHT_BRACKET);
						}
						break;
					case 3:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1823);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1824);
						match(DOT);
						setState(1825);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					case 4:
						{
						_localctx = new CollateContext(new PrimaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1826);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1827);
						match(COLLATE);
						setState(1831);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LEFT_BRACE:
						case RIGHT_BRACE:
						case ADDDATE:
						case AFTER:
						case AGG_STATE:
						case AGGREGATE:
						case ALIAS:
						case ANALYZED:
						case ARRAY:
						case AT:
						case AUTHORS:
						case BACKENDS:
						case BACKUP:
						case BEGIN:
						case BIN:
						case BITAND:
						case BITMAP:
						case BITMAP_UNION:
						case BITOR:
						case BITXOR:
						case BLOB:
						case BOOLEAN:
						case BRIEF:
						case BROKER:
						case BUCKETS:
						case BUILD:
						case BUILTIN:
						case CACHED:
						case CATALOG:
						case CATALOGS:
						case CHAIN:
						case CHAR:
						case CHARSET:
						case CHECK:
						case CLUSTER:
						case CLUSTERS:
						case COLLATION:
						case COLUMNS:
						case COMMENT:
						case COMMIT:
						case COMMITTED:
						case COMPACT:
						case COMPLETE:
						case CONFIG:
						case CONNECTION:
						case CONNECTION_ID:
						case CONSISTENT:
						case CONVERT:
						case COPY:
						case COUNT:
						case CREATION:
						case CRON:
						case CURRENT_CATALOG:
						case CURRENT_TIMESTAMP:
						case DATA:
						case DATE:
						case DATE_ADD:
						case DATE_CEIL:
						case DATE_DIFF:
						case DATE_FLOOR:
						case DATE_SUB:
						case DATEADD:
						case DATEDIFF:
						case DATETIME:
						case DATETIMEV2:
						case DATEV2:
						case DATETIMEV1:
						case DATEV1:
						case DAY:
						case DAYS_ADD:
						case DAYS_SUB:
						case DECIMAL:
						case DECIMALV2:
						case DECIMALV3:
						case DEFERRED:
						case DEMAND:
						case DIAGNOSE:
						case DISTINCTPC:
						case DISTINCTPCSA:
						case DO:
						case DORIS_INTERNAL_TABLE_ID:
						case DYNAMIC:
						case ENABLE:
						case ENCRYPTKEY:
						case ENCRYPTKEYS:
						case END:
						case ENDS:
						case ENGINE:
						case ENGINES:
						case ERRORS:
						case EVENTS:
						case EVERY:
						case EXCLUDE:
						case EXPIRED:
						case EXTERNAL:
						case FAILED_LOGIN_ATTEMPTS:
						case FAST:
						case FEATURE:
						case FIELDS:
						case FILE:
						case FILTER:
						case FIRST:
						case FORMAT:
						case FREE:
						case FRONTENDS:
						case FUNCTION:
						case GLOBAL:
						case GRAPH:
						case GROUPING:
						case GROUPS:
						case HASH:
						case HDFS:
						case HELP:
						case HISTOGRAM:
						case HLL_UNION:
						case HOSTNAME:
						case HOUR:
						case HUB:
						case IDENTIFIED:
						case IGNORE:
						case IMMEDIATE:
						case INCREMENTAL:
						case INDEXES:
						case INVERTED:
						case IS_NOT_NULL_PRED:
						case IS_NULL_PRED:
						case ISNULL:
						case ISOLATION:
						case JOB:
						case JOBS:
						case JSON:
						case JSONB:
						case LABEL:
						case LAST:
						case LDAP:
						case LDAP_ADMIN_PASSWORD:
						case LESS:
						case LEVEL:
						case LINES:
						case LINK:
						case LOCAL:
						case LOCATION:
						case LOCK:
						case LOGICAL:
						case MAP:
						case MATERIALIZED:
						case MAX:
						case MEMO:
						case MERGE:
						case MIGRATE:
						case MIGRATIONS:
						case MIN:
						case MINUTE:
						case MODIFY:
						case MONTH:
						case MTMV:
						case NAME:
						case NAMES:
						case NEGATIVE:
						case NEVER:
						case NEXT:
						case NGRAM_BF:
						case NO:
						case NON_NULLABLE:
						case NULLS:
						case OF:
						case OFFSET:
						case ONLY:
						case OPEN:
						case OPTIMIZED:
						case PARAMETER:
						case PARSED:
						case PASSWORD:
						case PASSWORD_EXPIRE:
						case PASSWORD_HISTORY:
						case PASSWORD_LOCK_TIME:
						case PASSWORD_REUSE:
						case PATH:
						case PAUSE:
						case PERCENT:
						case PERIOD:
						case PERMISSIVE:
						case PHYSICAL:
						case PLAN:
						case PLUGIN:
						case PLUGINS:
						case POLICY:
						case PROC:
						case PROCESSLIST:
						case PROFILE:
						case PROPERTIES:
						case PROPERTY:
						case QUANTILE_STATE:
						case QUANTILE_UNION:
						case QUERY:
						case QUOTA:
						case RANDOM:
						case RECOVER:
						case RECYCLE:
						case REFRESH:
						case REPEATABLE:
						case REPLACE:
						case REPLACE_IF_NOT_NULL:
						case REPOSITORIES:
						case REPOSITORY:
						case RESOURCE:
						case RESOURCES:
						case RESTORE:
						case RESTRICTIVE:
						case RESUME:
						case RETURNS:
						case REWRITTEN:
						case RLIKE:
						case ROLLBACK:
						case ROLLUP:
						case ROUTINE:
						case S3:
						case SAMPLE:
						case SCHEDULER:
						case SCHEMA:
						case SECOND:
						case SERIALIZABLE:
						case SESSION:
						case SHAPE:
						case SKEW:
						case SNAPSHOT:
						case SONAME:
						case SPLIT:
						case START:
						case STARTS:
						case STATS:
						case STATUS:
						case STOP:
						case STORAGE:
						case STREAM:
						case STREAMING:
						case STRING:
						case STRUCT:
						case SUBDATE:
						case SUM:
						case TABLES:
						case TASK:
						case TASKS:
						case TEMPORARY:
						case TEXT:
						case THAN:
						case TIME:
						case TIMESTAMP:
						case TIMESTAMPADD:
						case TIMESTAMPDIFF:
						case TRANSACTION:
						case TREE:
						case TRIGGERS:
						case TRUNCATE:
						case TYPE:
						case TYPES:
						case UNCOMMITTED:
						case UNLOCK:
						case USER:
						case VALUE:
						case VARCHAR:
						case VARIABLES:
						case VERBOSE:
						case VERSION:
						case VIEW:
						case WARNINGS:
						case WEEK:
						case WORK:
						case YEAR:
						case IDENTIFIER:
						case BACKQUOTED_IDENTIFIER:
							{
							setState(1828);
							identifier();
							}
							break;
						case STRING_LITERAL:
							{
							setState(1829);
							match(STRING_LITERAL);
							}
							break;
						case DEFAULT:
							{
							setState(1830);
							match(DEFAULT);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(1837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public IdentifierContext dbName;
		public FunctionNameIdentifierContext functionNameIdentifier() {
			return getRuleContext(FunctionNameIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DorisParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1838);
				((FunctionIdentifierContext)_localctx).dbName = identifier();
				setState(1839);
				match(DOT);
				}
				break;
			}
			setState(1843);
			functionNameIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(DorisParser.ADD, 0); }
		public TerminalNode CONNECTION_ID() { return getToken(DorisParser.CONNECTION_ID, 0); }
		public TerminalNode CURRENT_CATALOG() { return getToken(DorisParser.CURRENT_CATALOG, 0); }
		public TerminalNode CURRENT_USER() { return getToken(DorisParser.CURRENT_USER, 0); }
		public TerminalNode DATABASE() { return getToken(DorisParser.DATABASE, 0); }
		public TerminalNode IF() { return getToken(DorisParser.IF, 0); }
		public TerminalNode LEFT() { return getToken(DorisParser.LEFT, 0); }
		public TerminalNode LIKE() { return getToken(DorisParser.LIKE, 0); }
		public TerminalNode PASSWORD() { return getToken(DorisParser.PASSWORD, 0); }
		public TerminalNode REGEXP() { return getToken(DorisParser.REGEXP, 0); }
		public TerminalNode RIGHT() { return getToken(DorisParser.RIGHT, 0); }
		public TerminalNode SCHEMA() { return getToken(DorisParser.SCHEMA, 0); }
		public TerminalNode TRIM() { return getToken(DorisParser.TRIM, 0); }
		public TerminalNode USER() { return getToken(DorisParser.USER, 0); }
		public FunctionNameIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionNameIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterFunctionNameIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitFunctionNameIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitFunctionNameIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameIdentifierContext functionNameIdentifier() throws RecognitionException {
		FunctionNameIdentifierContext _localctx = new FunctionNameIdentifierContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_functionNameIdentifier);
		try {
			setState(1860);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1845);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1846);
				match(ADD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1847);
				match(CONNECTION_ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1848);
				match(CURRENT_CATALOG);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1849);
				match(CURRENT_USER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1850);
				match(DATABASE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1851);
				match(IF);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1852);
				match(LEFT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1853);
				match(LIKE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1854);
				match(PASSWORD);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1855);
				match(REGEXP);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1856);
				match(RIGHT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1857);
				match(SCHEMA);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1858);
				match(TRIM);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1859);
				match(USER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public SortClauseContext sortClause() {
			return getRuleContext(SortClauseContext.class,0);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterWindowSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitWindowSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitWindowSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_windowSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
			match(LEFT_PAREN);
			setState(1864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1863);
				partitionClause();
				}
			}

			setState(1867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1866);
				sortClause();
				}
			}

			setState(1870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(1869);
				windowFrame();
				}
			}

			setState(1872);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public FrameBoundaryContext start;
		public FrameBoundaryContext end;
		public FrameUnitsContext frameUnits() {
			return getRuleContext(FrameUnitsContext.class,0);
		}
		public List<FrameBoundaryContext> frameBoundary() {
			return getRuleContexts(FrameBoundaryContext.class);
		}
		public FrameBoundaryContext frameBoundary(int i) {
			return getRuleContext(FrameBoundaryContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(DorisParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(DorisParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_windowFrame);
		try {
			setState(1883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1874);
				frameUnits();
				setState(1875);
				((WindowFrameContext)_localctx).start = frameBoundary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1877);
				frameUnits();
				setState(1878);
				match(BETWEEN);
				setState(1879);
				((WindowFrameContext)_localctx).start = frameBoundary();
				setState(1880);
				match(AND);
				setState(1881);
				((WindowFrameContext)_localctx).end = frameBoundary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameUnitsContext extends ParserRuleContext {
		public TerminalNode ROWS() { return getToken(DorisParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(DorisParser.RANGE, 0); }
		public FrameUnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameUnits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterFrameUnits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitFrameUnits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitFrameUnits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameUnitsContext frameUnits() throws RecognitionException {
		FrameUnitsContext _localctx = new FrameUnitsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_frameUnits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1885);
			_la = _input.LA(1);
			if ( !(_la==RANGE || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundaryContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(DorisParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(DorisParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(DorisParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(DorisParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(DorisParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBoundary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterFrameBoundary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitFrameBoundary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitFrameBoundary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundaryContext frameBoundary() throws RecognitionException {
		FrameBoundaryContext _localctx = new FrameBoundaryContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_frameBoundary);
		int _la;
		try {
			setState(1894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1887);
				match(UNBOUNDED);
				setState(1888);
				((FrameBoundaryContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundaryContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1889);
				((FrameBoundaryContext)_localctx).boundType = match(CURRENT);
				setState(1890);
				match(ROW);
				}
				break;
			case LEFT_PAREN:
			case LEFT_BRACKET:
			case LEFT_BRACE:
			case RIGHT_BRACE:
			case ADD:
			case ADDDATE:
			case AFTER:
			case AGG_STATE:
			case AGGREGATE:
			case ALIAS:
			case ANALYZED:
			case ARRAY:
			case AT:
			case AUTHORS:
			case BACKENDS:
			case BACKUP:
			case BEGIN:
			case BIN:
			case BITAND:
			case BITMAP:
			case BITMAP_UNION:
			case BITOR:
			case BITXOR:
			case BLOB:
			case BOOLEAN:
			case BRIEF:
			case BROKER:
			case BUCKETS:
			case BUILD:
			case BUILTIN:
			case CACHED:
			case CASE:
			case CAST:
			case CATALOG:
			case CATALOGS:
			case CHAIN:
			case CHAR:
			case CHARSET:
			case CHECK:
			case CLUSTER:
			case CLUSTERS:
			case COLLATION:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETE:
			case CONFIG:
			case CONNECTION:
			case CONNECTION_ID:
			case CONSISTENT:
			case CONVERT:
			case COPY:
			case COUNT:
			case CREATION:
			case CRON:
			case CURRENT_CATALOG:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATABASE:
			case DATE:
			case DATE_ADD:
			case DATE_CEIL:
			case DATE_DIFF:
			case DATE_FLOOR:
			case DATE_SUB:
			case DATEADD:
			case DATEDIFF:
			case DATETIME:
			case DATETIMEV2:
			case DATEV2:
			case DATETIMEV1:
			case DATEV1:
			case DAY:
			case DAYS_ADD:
			case DAYS_SUB:
			case DECIMAL:
			case DECIMALV2:
			case DECIMALV3:
			case DEFERRED:
			case DEMAND:
			case DIAGNOSE:
			case DISTINCTPC:
			case DISTINCTPCSA:
			case DO:
			case DORIS_INTERNAL_TABLE_ID:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTKEY:
			case ENCRYPTKEYS:
			case END:
			case ENDS:
			case ENGINE:
			case ENGINES:
			case ERRORS:
			case EVENTS:
			case EVERY:
			case EXCLUDE:
			case EXISTS:
			case EXPIRED:
			case EXTERNAL:
			case EXTRACT:
			case FAILED_LOGIN_ATTEMPTS:
			case FALSE:
			case FAST:
			case FEATURE:
			case FIELDS:
			case FILE:
			case FILTER:
			case FIRST:
			case FORMAT:
			case FREE:
			case FRONTENDS:
			case FUNCTION:
			case GLOBAL:
			case GRAPH:
			case GROUPING:
			case GROUPS:
			case HASH:
			case HDFS:
			case HELP:
			case HISTOGRAM:
			case HLL_UNION:
			case HOSTNAME:
			case HOUR:
			case HUB:
			case IDENTIFIED:
			case IF:
			case IGNORE:
			case IMMEDIATE:
			case INCREMENTAL:
			case INDEXES:
			case INTERVAL:
			case INVERTED:
			case IS_NOT_NULL_PRED:
			case IS_NULL_PRED:
			case ISNULL:
			case ISOLATION:
			case JOB:
			case JOBS:
			case JSON:
			case JSONB:
			case KEY:
			case LABEL:
			case LAST:
			case LDAP:
			case LDAP_ADMIN_PASSWORD:
			case LEFT:
			case LESS:
			case LEVEL:
			case LIKE:
			case LINES:
			case LINK:
			case LOCAL:
			case LOCATION:
			case LOCK:
			case LOGICAL:
			case MAP:
			case MATERIALIZED:
			case MAX:
			case MEMO:
			case MERGE:
			case MIGRATE:
			case MIGRATIONS:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MTMV:
			case NAME:
			case NAMES:
			case NEGATIVE:
			case NEVER:
			case NEXT:
			case NGRAM_BF:
			case NO:
			case NON_NULLABLE:
			case NOT:
			case NULL:
			case NULLS:
			case OF:
			case OFFSET:
			case ONLY:
			case OPEN:
			case OPTIMIZED:
			case PARAMETER:
			case PARSED:
			case PASSWORD:
			case PASSWORD_EXPIRE:
			case PASSWORD_HISTORY:
			case PASSWORD_LOCK_TIME:
			case PASSWORD_REUSE:
			case PATH:
			case PAUSE:
			case PERCENT:
			case PERIOD:
			case PERMISSIVE:
			case PHYSICAL:
			case PLAN:
			case PLUGIN:
			case PLUGINS:
			case POLICY:
			case PROC:
			case PROCESSLIST:
			case PROFILE:
			case PROPERTIES:
			case PROPERTY:
			case QUANTILE_STATE:
			case QUANTILE_UNION:
			case QUERY:
			case QUOTA:
			case RANDOM:
			case RECOVER:
			case RECYCLE:
			case REFRESH:
			case REGEXP:
			case REPEATABLE:
			case REPLACE:
			case REPLACE_IF_NOT_NULL:
			case REPOSITORIES:
			case REPOSITORY:
			case RESOURCE:
			case RESOURCES:
			case RESTORE:
			case RESTRICTIVE:
			case RESUME:
			case RETURNS:
			case REWRITTEN:
			case RIGHT:
			case RLIKE:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case S3:
			case SAMPLE:
			case SCHEDULER:
			case SCHEMA:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SHAPE:
			case SKEW:
			case SNAPSHOT:
			case SONAME:
			case SPLIT:
			case START:
			case STARTS:
			case STATS:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STREAMING:
			case STRING:
			case STRUCT:
			case SUBDATE:
			case SUM:
			case TABLES:
			case TASK:
			case TASKS:
			case TEMPORARY:
			case TEXT:
			case THAN:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TRANSACTION:
			case TREE:
			case TRIGGERS:
			case TRIM:
			case TRUE:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNCOMMITTED:
			case UNLOCK:
			case USER:
			case VALUE:
			case VARCHAR:
			case VARIABLES:
			case VERBOSE:
			case VERSION:
			case VIEW:
			case WARNINGS:
			case WEEK:
			case WORK:
			case YEAR:
			case PLUS:
			case SUBTRACT:
			case ASTERISK:
			case TILDE:
			case LOGICALNOT:
			case ATSIGN:
			case DOUBLEATSIGN:
			case STRING_LITERAL:
			case INTEGER_VALUE:
			case EXPONENT_VALUE:
			case DECIMAL_VALUE:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1891);
				expression();
				setState(1892);
				((FrameBoundaryContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundaryContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(DorisParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DorisParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
			identifier();
			setState(1901);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1897);
					match(DOT);
					setState(1898);
					identifier();
					}
					} 
				}
				setState(1903);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecifiedPartitionContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(DorisParser.PARTITION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(DorisParser.TEMPORARY, 0); }
		public TerminalNode PARTITIONS() { return getToken(DorisParser.PARTITIONS, 0); }
		public SpecifiedPartitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifiedPartition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSpecifiedPartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSpecifiedPartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSpecifiedPartition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecifiedPartitionContext specifiedPartition() throws RecognitionException {
		SpecifiedPartitionContext _localctx = new SpecifiedPartitionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_specifiedPartition);
		int _la;
		try {
			setState(1917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(1904);
					match(TEMPORARY);
					}
				}

				setState(1907);
				match(PARTITION);
				setState(1910);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_BRACE:
				case RIGHT_BRACE:
				case ADDDATE:
				case AFTER:
				case AGG_STATE:
				case AGGREGATE:
				case ALIAS:
				case ANALYZED:
				case ARRAY:
				case AT:
				case AUTHORS:
				case BACKENDS:
				case BACKUP:
				case BEGIN:
				case BIN:
				case BITAND:
				case BITMAP:
				case BITMAP_UNION:
				case BITOR:
				case BITXOR:
				case BLOB:
				case BOOLEAN:
				case BRIEF:
				case BROKER:
				case BUCKETS:
				case BUILD:
				case BUILTIN:
				case CACHED:
				case CATALOG:
				case CATALOGS:
				case CHAIN:
				case CHAR:
				case CHARSET:
				case CHECK:
				case CLUSTER:
				case CLUSTERS:
				case COLLATION:
				case COLUMNS:
				case COMMENT:
				case COMMIT:
				case COMMITTED:
				case COMPACT:
				case COMPLETE:
				case CONFIG:
				case CONNECTION:
				case CONNECTION_ID:
				case CONSISTENT:
				case CONVERT:
				case COPY:
				case COUNT:
				case CREATION:
				case CRON:
				case CURRENT_CATALOG:
				case CURRENT_TIMESTAMP:
				case DATA:
				case DATE:
				case DATE_ADD:
				case DATE_CEIL:
				case DATE_DIFF:
				case DATE_FLOOR:
				case DATE_SUB:
				case DATEADD:
				case DATEDIFF:
				case DATETIME:
				case DATETIMEV2:
				case DATEV2:
				case DATETIMEV1:
				case DATEV1:
				case DAY:
				case DAYS_ADD:
				case DAYS_SUB:
				case DECIMAL:
				case DECIMALV2:
				case DECIMALV3:
				case DEFERRED:
				case DEMAND:
				case DIAGNOSE:
				case DISTINCTPC:
				case DISTINCTPCSA:
				case DO:
				case DORIS_INTERNAL_TABLE_ID:
				case DYNAMIC:
				case ENABLE:
				case ENCRYPTKEY:
				case ENCRYPTKEYS:
				case END:
				case ENDS:
				case ENGINE:
				case ENGINES:
				case ERRORS:
				case EVENTS:
				case EVERY:
				case EXCLUDE:
				case EXPIRED:
				case EXTERNAL:
				case FAILED_LOGIN_ATTEMPTS:
				case FAST:
				case FEATURE:
				case FIELDS:
				case FILE:
				case FILTER:
				case FIRST:
				case FORMAT:
				case FREE:
				case FRONTENDS:
				case FUNCTION:
				case GLOBAL:
				case GRAPH:
				case GROUPING:
				case GROUPS:
				case HASH:
				case HDFS:
				case HELP:
				case HISTOGRAM:
				case HLL_UNION:
				case HOSTNAME:
				case HOUR:
				case HUB:
				case IDENTIFIED:
				case IGNORE:
				case IMMEDIATE:
				case INCREMENTAL:
				case INDEXES:
				case INVERTED:
				case IS_NOT_NULL_PRED:
				case IS_NULL_PRED:
				case ISNULL:
				case ISOLATION:
				case JOB:
				case JOBS:
				case JSON:
				case JSONB:
				case LABEL:
				case LAST:
				case LDAP:
				case LDAP_ADMIN_PASSWORD:
				case LESS:
				case LEVEL:
				case LINES:
				case LINK:
				case LOCAL:
				case LOCATION:
				case LOCK:
				case LOGICAL:
				case MAP:
				case MATERIALIZED:
				case MAX:
				case MEMO:
				case MERGE:
				case MIGRATE:
				case MIGRATIONS:
				case MIN:
				case MINUTE:
				case MODIFY:
				case MONTH:
				case MTMV:
				case NAME:
				case NAMES:
				case NEGATIVE:
				case NEVER:
				case NEXT:
				case NGRAM_BF:
				case NO:
				case NON_NULLABLE:
				case NULLS:
				case OF:
				case OFFSET:
				case ONLY:
				case OPEN:
				case OPTIMIZED:
				case PARAMETER:
				case PARSED:
				case PASSWORD:
				case PASSWORD_EXPIRE:
				case PASSWORD_HISTORY:
				case PASSWORD_LOCK_TIME:
				case PASSWORD_REUSE:
				case PATH:
				case PAUSE:
				case PERCENT:
				case PERIOD:
				case PERMISSIVE:
				case PHYSICAL:
				case PLAN:
				case PLUGIN:
				case PLUGINS:
				case POLICY:
				case PROC:
				case PROCESSLIST:
				case PROFILE:
				case PROPERTIES:
				case PROPERTY:
				case QUANTILE_STATE:
				case QUANTILE_UNION:
				case QUERY:
				case QUOTA:
				case RANDOM:
				case RECOVER:
				case RECYCLE:
				case REFRESH:
				case REPEATABLE:
				case REPLACE:
				case REPLACE_IF_NOT_NULL:
				case REPOSITORIES:
				case REPOSITORY:
				case RESOURCE:
				case RESOURCES:
				case RESTORE:
				case RESTRICTIVE:
				case RESUME:
				case RETURNS:
				case REWRITTEN:
				case RLIKE:
				case ROLLBACK:
				case ROLLUP:
				case ROUTINE:
				case S3:
				case SAMPLE:
				case SCHEDULER:
				case SCHEMA:
				case SECOND:
				case SERIALIZABLE:
				case SESSION:
				case SHAPE:
				case SKEW:
				case SNAPSHOT:
				case SONAME:
				case SPLIT:
				case START:
				case STARTS:
				case STATS:
				case STATUS:
				case STOP:
				case STORAGE:
				case STREAM:
				case STREAMING:
				case STRING:
				case STRUCT:
				case SUBDATE:
				case SUM:
				case TABLES:
				case TASK:
				case TASKS:
				case TEMPORARY:
				case TEXT:
				case THAN:
				case TIME:
				case TIMESTAMP:
				case TIMESTAMPADD:
				case TIMESTAMPDIFF:
				case TRANSACTION:
				case TREE:
				case TRIGGERS:
				case TRUNCATE:
				case TYPE:
				case TYPES:
				case UNCOMMITTED:
				case UNLOCK:
				case USER:
				case VALUE:
				case VARCHAR:
				case VARIABLES:
				case VERBOSE:
				case VERSION:
				case VIEW:
				case WARNINGS:
				case WEEK:
				case WORK:
				case YEAR:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(1908);
					identifier();
					}
					break;
				case LEFT_PAREN:
					{
					setState(1909);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(1912);
					match(TEMPORARY);
					}
				}

				setState(1915);
				match(PARTITIONS);
				setState(1916);
				identifierList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructLiteralContext extends ConstantContext {
		public ConstantContext constant;
		public List<ConstantContext> items = new ArrayList<ConstantContext>();
		public TerminalNode LEFT_BRACE() { return getToken(DorisParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DorisParser.RIGHT_BRACE, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public StructLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterStructLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitStructLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitStructLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(DorisParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public Token type;
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public TerminalNode DATE() { return getToken(DorisParser.DATE, 0); }
		public TerminalNode DATEV1() { return getToken(DorisParser.DATEV1, 0); }
		public TerminalNode DATEV2() { return getToken(DorisParser.DATEV2, 0); }
		public TerminalNode TIMESTAMP() { return getToken(DorisParser.TIMESTAMP, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayLiteralContext extends ConstantContext {
		public ConstantContext constant;
		public List<ConstantContext> items = new ArrayList<ConstantContext>();
		public TerminalNode LEFT_BRACKET() { return getToken(DorisParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(DorisParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ArrayLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapLiteralContext extends ConstantContext {
		public ConstantContext constant;
		public List<ConstantContext> items = new ArrayList<ConstantContext>();
		public TerminalNode LEFT_BRACE() { return getToken(DorisParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DorisParser.RIGHT_BRACE, 0); }
		public List<TerminalNode> COLON() { return getTokens(DorisParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(DorisParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public MapLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterMapLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitMapLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitMapLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_constant);
		int _la;
		try {
			setState(1966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1919);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1920);
				((TypeConstructorContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (DATE - 95)) | (1L << (DATEV2 - 95)) | (1L << (DATEV1 - 95)))) != 0) || _la==TIMESTAMP) ) {
					((TypeConstructorContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1921);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1922);
				number();
				}
				break;
			case 4:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1923);
				booleanValue();
				}
				break;
			case 5:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1924);
				match(STRING_LITERAL);
				}
				break;
			case 6:
				_localctx = new ArrayLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1925);
				match(LEFT_BRACKET);
				setState(1927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_BRACKET || _la==LEFT_BRACE || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (DATE - 95)) | (1L << (DATEV2 - 95)) | (1L << (DATEV1 - 95)))) != 0) || _la==FALSE || _la==NULL || ((((_la - 415)) & ~0x3f) == 0 && ((1L << (_la - 415)) & ((1L << (TIMESTAMP - 415)) | (1L << (TRUE - 415)) | (1L << (SUBTRACT - 415)))) != 0) || ((((_la - 483)) & ~0x3f) == 0 && ((1L << (_la - 483)) & ((1L << (STRING_LITERAL - 483)) | (1L << (INTEGER_VALUE - 483)) | (1L << (EXPONENT_VALUE - 483)) | (1L << (DECIMAL_VALUE - 483)))) != 0)) {
					{
					setState(1926);
					((ArrayLiteralContext)_localctx).constant = constant();
					((ArrayLiteralContext)_localctx).items.add(((ArrayLiteralContext)_localctx).constant);
					}
				}

				setState(1933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1929);
					match(COMMA);
					setState(1930);
					((ArrayLiteralContext)_localctx).constant = constant();
					((ArrayLiteralContext)_localctx).items.add(((ArrayLiteralContext)_localctx).constant);
					}
					}
					setState(1935);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1936);
				match(RIGHT_BRACKET);
				}
				break;
			case 7:
				_localctx = new MapLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1937);
				match(LEFT_BRACE);
				setState(1942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_BRACKET || _la==LEFT_BRACE || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (DATE - 95)) | (1L << (DATEV2 - 95)) | (1L << (DATEV1 - 95)))) != 0) || _la==FALSE || _la==NULL || ((((_la - 415)) & ~0x3f) == 0 && ((1L << (_la - 415)) & ((1L << (TIMESTAMP - 415)) | (1L << (TRUE - 415)) | (1L << (SUBTRACT - 415)))) != 0) || ((((_la - 483)) & ~0x3f) == 0 && ((1L << (_la - 483)) & ((1L << (STRING_LITERAL - 483)) | (1L << (INTEGER_VALUE - 483)) | (1L << (EXPONENT_VALUE - 483)) | (1L << (DECIMAL_VALUE - 483)))) != 0)) {
					{
					setState(1938);
					((MapLiteralContext)_localctx).constant = constant();
					((MapLiteralContext)_localctx).items.add(((MapLiteralContext)_localctx).constant);
					setState(1939);
					match(COLON);
					setState(1940);
					((MapLiteralContext)_localctx).constant = constant();
					((MapLiteralContext)_localctx).items.add(((MapLiteralContext)_localctx).constant);
					}
				}

				setState(1951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1944);
					match(COMMA);
					setState(1945);
					((MapLiteralContext)_localctx).constant = constant();
					((MapLiteralContext)_localctx).items.add(((MapLiteralContext)_localctx).constant);
					setState(1946);
					match(COLON);
					setState(1947);
					((MapLiteralContext)_localctx).constant = constant();
					((MapLiteralContext)_localctx).items.add(((MapLiteralContext)_localctx).constant);
					}
					}
					setState(1953);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1954);
				match(RIGHT_BRACE);
				}
				break;
			case 8:
				_localctx = new StructLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1955);
				match(LEFT_BRACE);
				setState(1956);
				((StructLiteralContext)_localctx).constant = constant();
				((StructLiteralContext)_localctx).items.add(((StructLiteralContext)_localctx).constant);
				setState(1961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1957);
					match(COMMA);
					setState(1958);
					((StructLiteralContext)_localctx).constant = constant();
					((StructLiteralContext)_localctx).items.add(((StructLiteralContext)_localctx).constant);
					}
					}
					setState(1963);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1964);
				match(RIGHT_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(DorisParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(DorisParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(DorisParser.LT, 0); }
		public TerminalNode LTE() { return getToken(DorisParser.LTE, 0); }
		public TerminalNode GT() { return getToken(DorisParser.GT, 0); }
		public TerminalNode GTE() { return getToken(DorisParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(DorisParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
			_la = _input.LA(1);
			if ( !(((((_la - 458)) & ~0x3f) == 0 && ((1L << (_la - 458)) & ((1L << (EQ - 458)) | (1L << (NSEQ - 458)) | (1L << (NEQ - 458)) | (1L << (LT - 458)) | (1L << (LTE - 458)) | (1L << (GT - 458)) | (1L << (GTE - 458)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(DorisParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(DorisParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1970);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(DorisParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(DorisParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
			match(WHEN);
			setState(1973);
			((WhenClauseContext)_localctx).condition = expression();
			setState(1974);
			match(THEN);
			setState(1975);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public ExpressionContext value;
		public UnitIdentifierContext unit;
		public TerminalNode INTERVAL() { return getToken(DorisParser.INTERVAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnitIdentifierContext unitIdentifier() {
			return getRuleContext(UnitIdentifierContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1977);
			match(INTERVAL);
			setState(1978);
			((IntervalContext)_localctx).value = expression();
			setState(1979);
			((IntervalContext)_localctx).unit = unitIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitIdentifierContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(DorisParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(DorisParser.MONTH, 0); }
		public TerminalNode WEEK() { return getToken(DorisParser.WEEK, 0); }
		public TerminalNode DAY() { return getToken(DorisParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(DorisParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(DorisParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(DorisParser.SECOND, 0); }
		public UnitIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterUnitIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitUnitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitUnitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitIdentifierContext unitIdentifier() throws RecognitionException {
		UnitIdentifierContext _localctx = new UnitIdentifierContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_unitIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1981);
			_la = _input.LA(1);
			if ( !(_la==DAY || _la==HOUR || _la==MINUTE || _la==MONTH || _la==SECOND || _la==WEEK || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public TerminalNode LT() { return getToken(DorisParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(DorisParser.GT, 0); }
		public TerminalNode ARRAY() { return getToken(DorisParser.ARRAY, 0); }
		public TerminalNode COMMA() { return getToken(DorisParser.COMMA, 0); }
		public TerminalNode MAP() { return getToken(DorisParser.MAP, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(DorisParser.STRUCT, 0); }
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public PrimitiveColTypeContext primitiveColType() {
			return getRuleContext(PrimitiveColTypeContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(DorisParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(DorisParser.INTEGER_VALUE, i);
		}
		public TerminalNode ASTERISK() { return getToken(DorisParser.ASTERISK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_dataType);
		int _la;
		try {
			setState(2013);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1983);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(1984);
				match(LT);
				setState(1985);
				dataType();
				setState(1986);
				match(GT);
				}
				break;
			case MAP:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1988);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(1989);
				match(LT);
				setState(1990);
				dataType();
				setState(1991);
				match(COMMA);
				setState(1992);
				dataType();
				setState(1993);
				match(GT);
				}
				break;
			case STRUCT:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1995);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(1996);
				match(LT);
				setState(1997);
				complexColTypeList();
				setState(1998);
				match(GT);
				}
				break;
			case LEFT_PAREN:
			case RIGHT_PAREN:
			case COMMA:
			case AGG_STATE:
			case ALL:
			case BIGINT:
			case BITMAP:
			case BITMAP_UNION:
			case BOOLEAN:
			case CHAR:
			case COMMENT:
			case DATE:
			case DATETIME:
			case DATETIMEV2:
			case DATEV2:
			case DATETIMEV1:
			case DATEV1:
			case DECIMAL:
			case DECIMALV2:
			case DECIMALV3:
			case DEFAULT:
			case DOUBLE:
			case FLOAT:
			case HLL:
			case HLL_UNION:
			case INDEX:
			case INT:
			case INTEGER:
			case IPV4:
			case IPV6:
			case JSON:
			case JSONB:
			case KEY:
			case LARGEINT:
			case MAX:
			case MIN:
			case NOT:
			case NULL:
			case QUANTILE_STATE:
			case QUANTILE_UNION:
			case REPLACE:
			case REPLACE_IF_NOT_NULL:
			case SIGNED:
			case SMALLINT:
			case STRING:
			case SUM:
			case TEXT:
			case TIME:
			case TINYINT:
			case UNSIGNED:
			case VARCHAR:
			case GT:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2000);
				primitiveColType();
				setState(2011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(2001);
					match(LEFT_PAREN);
					setState(2002);
					_la = _input.LA(1);
					if ( !(_la==ASTERISK || _la==INTEGER_VALUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2007);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2003);
						match(COMMA);
						setState(2004);
						match(INTEGER_VALUE);
						}
						}
						setState(2009);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2010);
					match(RIGHT_PAREN);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveColTypeContext extends ParserRuleContext {
		public Token type;
		public TerminalNode TINYINT() { return getToken(DorisParser.TINYINT, 0); }
		public TerminalNode SMALLINT() { return getToken(DorisParser.SMALLINT, 0); }
		public TerminalNode INT() { return getToken(DorisParser.INT, 0); }
		public TerminalNode INTEGER() { return getToken(DorisParser.INTEGER, 0); }
		public TerminalNode SIGNED() { return getToken(DorisParser.SIGNED, 0); }
		public TerminalNode UNSIGNED() { return getToken(DorisParser.UNSIGNED, 0); }
		public TerminalNode BIGINT() { return getToken(DorisParser.BIGINT, 0); }
		public TerminalNode LARGEINT() { return getToken(DorisParser.LARGEINT, 0); }
		public TerminalNode BOOLEAN() { return getToken(DorisParser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(DorisParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(DorisParser.DOUBLE, 0); }
		public TerminalNode DATE() { return getToken(DorisParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(DorisParser.DATETIME, 0); }
		public TerminalNode TIME() { return getToken(DorisParser.TIME, 0); }
		public TerminalNode DATEV2() { return getToken(DorisParser.DATEV2, 0); }
		public TerminalNode DATETIMEV2() { return getToken(DorisParser.DATETIMEV2, 0); }
		public TerminalNode DATEV1() { return getToken(DorisParser.DATEV1, 0); }
		public TerminalNode DATETIMEV1() { return getToken(DorisParser.DATETIMEV1, 0); }
		public TerminalNode BITMAP() { return getToken(DorisParser.BITMAP, 0); }
		public TerminalNode QUANTILE_STATE() { return getToken(DorisParser.QUANTILE_STATE, 0); }
		public TerminalNode HLL() { return getToken(DorisParser.HLL, 0); }
		public TerminalNode AGG_STATE() { return getToken(DorisParser.AGG_STATE, 0); }
		public TerminalNode STRING() { return getToken(DorisParser.STRING, 0); }
		public TerminalNode JSON() { return getToken(DorisParser.JSON, 0); }
		public TerminalNode JSONB() { return getToken(DorisParser.JSONB, 0); }
		public TerminalNode TEXT() { return getToken(DorisParser.TEXT, 0); }
		public TerminalNode VARCHAR() { return getToken(DorisParser.VARCHAR, 0); }
		public TerminalNode CHAR() { return getToken(DorisParser.CHAR, 0); }
		public TerminalNode DECIMAL() { return getToken(DorisParser.DECIMAL, 0); }
		public TerminalNode DECIMALV2() { return getToken(DorisParser.DECIMALV2, 0); }
		public TerminalNode DECIMALV3() { return getToken(DorisParser.DECIMALV3, 0); }
		public TerminalNode IPV4() { return getToken(DorisParser.IPV4, 0); }
		public TerminalNode IPV6() { return getToken(DorisParser.IPV6, 0); }
		public TerminalNode ALL() { return getToken(DorisParser.ALL, 0); }
		public PrimitiveColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterPrimitiveColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitPrimitiveColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitPrimitiveColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveColTypeContext primitiveColType() throws RecognitionException {
		PrimitiveColTypeContext _localctx = new PrimitiveColTypeContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_primitiveColType);
		int _la;
		try {
			setState(2050);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
			case RIGHT_PAREN:
			case COMMA:
			case BITMAP_UNION:
			case COMMENT:
			case DEFAULT:
			case HLL_UNION:
			case INDEX:
			case KEY:
			case MAX:
			case MIN:
			case NOT:
			case NULL:
			case QUANTILE_UNION:
			case REPLACE:
			case REPLACE_IF_NOT_NULL:
			case SUM:
			case GT:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2016);
				((PrimitiveColTypeContext)_localctx).type = match(TINYINT);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2017);
				((PrimitiveColTypeContext)_localctx).type = match(SMALLINT);
				}
				break;
			case INT:
			case INTEGER:
			case SIGNED:
			case UNSIGNED:
				enterOuterAlt(_localctx, 4);
				{
				setState(2019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIGNED || _la==UNSIGNED) {
					{
					setState(2018);
					_la = _input.LA(1);
					if ( !(_la==SIGNED || _la==UNSIGNED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2021);
				((PrimitiveColTypeContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==INTEGER) ) {
					((PrimitiveColTypeContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2022);
				((PrimitiveColTypeContext)_localctx).type = match(BIGINT);
				}
				break;
			case LARGEINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(2023);
				((PrimitiveColTypeContext)_localctx).type = match(LARGEINT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 7);
				{
				setState(2024);
				((PrimitiveColTypeContext)_localctx).type = match(BOOLEAN);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 8);
				{
				setState(2025);
				((PrimitiveColTypeContext)_localctx).type = match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2026);
				((PrimitiveColTypeContext)_localctx).type = match(DOUBLE);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 10);
				{
				setState(2027);
				((PrimitiveColTypeContext)_localctx).type = match(DATE);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 11);
				{
				setState(2028);
				((PrimitiveColTypeContext)_localctx).type = match(DATETIME);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 12);
				{
				setState(2029);
				((PrimitiveColTypeContext)_localctx).type = match(TIME);
				}
				break;
			case DATEV2:
				enterOuterAlt(_localctx, 13);
				{
				setState(2030);
				((PrimitiveColTypeContext)_localctx).type = match(DATEV2);
				}
				break;
			case DATETIMEV2:
				enterOuterAlt(_localctx, 14);
				{
				setState(2031);
				((PrimitiveColTypeContext)_localctx).type = match(DATETIMEV2);
				}
				break;
			case DATEV1:
				enterOuterAlt(_localctx, 15);
				{
				setState(2032);
				((PrimitiveColTypeContext)_localctx).type = match(DATEV1);
				}
				break;
			case DATETIMEV1:
				enterOuterAlt(_localctx, 16);
				{
				setState(2033);
				((PrimitiveColTypeContext)_localctx).type = match(DATETIMEV1);
				}
				break;
			case BITMAP:
				enterOuterAlt(_localctx, 17);
				{
				setState(2034);
				((PrimitiveColTypeContext)_localctx).type = match(BITMAP);
				}
				break;
			case QUANTILE_STATE:
				enterOuterAlt(_localctx, 18);
				{
				setState(2035);
				((PrimitiveColTypeContext)_localctx).type = match(QUANTILE_STATE);
				}
				break;
			case HLL:
				enterOuterAlt(_localctx, 19);
				{
				setState(2036);
				((PrimitiveColTypeContext)_localctx).type = match(HLL);
				}
				break;
			case AGG_STATE:
				enterOuterAlt(_localctx, 20);
				{
				setState(2037);
				((PrimitiveColTypeContext)_localctx).type = match(AGG_STATE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 21);
				{
				setState(2038);
				((PrimitiveColTypeContext)_localctx).type = match(STRING);
				}
				break;
			case JSON:
				enterOuterAlt(_localctx, 22);
				{
				setState(2039);
				((PrimitiveColTypeContext)_localctx).type = match(JSON);
				}
				break;
			case JSONB:
				enterOuterAlt(_localctx, 23);
				{
				setState(2040);
				((PrimitiveColTypeContext)_localctx).type = match(JSONB);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 24);
				{
				setState(2041);
				((PrimitiveColTypeContext)_localctx).type = match(TEXT);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 25);
				{
				setState(2042);
				((PrimitiveColTypeContext)_localctx).type = match(VARCHAR);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 26);
				{
				setState(2043);
				((PrimitiveColTypeContext)_localctx).type = match(CHAR);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 27);
				{
				setState(2044);
				((PrimitiveColTypeContext)_localctx).type = match(DECIMAL);
				}
				break;
			case DECIMALV2:
				enterOuterAlt(_localctx, 28);
				{
				setState(2045);
				((PrimitiveColTypeContext)_localctx).type = match(DECIMALV2);
				}
				break;
			case DECIMALV3:
				enterOuterAlt(_localctx, 29);
				{
				setState(2046);
				((PrimitiveColTypeContext)_localctx).type = match(DECIMALV3);
				}
				break;
			case IPV4:
				enterOuterAlt(_localctx, 30);
				{
				setState(2047);
				((PrimitiveColTypeContext)_localctx).type = match(IPV4);
				}
				break;
			case IPV6:
				enterOuterAlt(_localctx, 31);
				{
				setState(2048);
				((PrimitiveColTypeContext)_localctx).type = match(IPV6);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 32);
				{
				setState(2049);
				((PrimitiveColTypeContext)_localctx).type = match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DorisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DorisParser.COMMA, i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2052);
			complexColType();
			setState(2057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2053);
				match(COMMA);
				setState(2054);
				complexColType();
				}
				}
				setState(2059);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(DorisParser.COLON, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2060);
			identifier();
			setState(2061);
			match(COLON);
			setState(2062);
			dataType();
			setState(2064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2063);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentSpecContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(DorisParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DorisParser.STRING_LITERAL, 0); }
		public CommentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterCommentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitCommentSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitCommentSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentSpecContext commentSpec() throws RecognitionException {
		CommentSpecContext _localctx = new CommentSpecContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_commentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
			match(COMMENT);
			setState(2067);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleContext extends ParserRuleContext {
		public Token seed;
		public TerminalNode TABLESAMPLE() { return getToken(DorisParser.TABLESAMPLE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DorisParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DorisParser.RIGHT_PAREN, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public TerminalNode REPEATABLE() { return getToken(DorisParser.REPEATABLE, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_sample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2069);
			match(TABLESAMPLE);
			setState(2070);
			match(LEFT_PAREN);
			setState(2072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER_VALUE) {
				{
				setState(2071);
				sampleMethod();
				}
			}

			setState(2074);
			match(RIGHT_PAREN);
			setState(2077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(2075);
				match(REPEATABLE);
				setState(2076);
				((SampleContext)_localctx).seed = match(INTEGER_VALUE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public TerminalNode ROWS() { return getToken(DorisParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token percentage;
		public TerminalNode PERCENT() { return getToken(DorisParser.PERCENT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_sampleMethod);
		try {
			setState(2083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2079);
				((SampleByPercentileContext)_localctx).percentage = match(INTEGER_VALUE);
				setState(2080);
				match(PERCENT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2081);
				match(INTEGER_VALUE);
				setState(2082);
				match(ROWS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterErrorCapturingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitErrorCapturingIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitErrorCapturingIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2085);
			identifier();
			setState(2086);
			errorCapturingIdentifierExtra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> SUBTRACT() { return getTokens(DorisParser.SUBTRACT); }
		public TerminalNode SUBTRACT(int i) {
			return getToken(DorisParser.SUBTRACT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterErrorIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitErrorIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitErrorIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterRealIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitRealIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitRealIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(2095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2090); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2088);
						match(SUBTRACT);
						setState(2089);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2092); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2097);
			strictIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(DorisParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_strictIdentifier);
		try {
			setState(2102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2099);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2100);
				quotedIdentifier();
				}
				break;
			case LEFT_BRACE:
			case RIGHT_BRACE:
			case ADDDATE:
			case AFTER:
			case AGG_STATE:
			case AGGREGATE:
			case ALIAS:
			case ANALYZED:
			case ARRAY:
			case AT:
			case AUTHORS:
			case BACKENDS:
			case BACKUP:
			case BEGIN:
			case BIN:
			case BITAND:
			case BITMAP:
			case BITMAP_UNION:
			case BITOR:
			case BITXOR:
			case BLOB:
			case BOOLEAN:
			case BRIEF:
			case BROKER:
			case BUCKETS:
			case BUILD:
			case BUILTIN:
			case CACHED:
			case CATALOG:
			case CATALOGS:
			case CHAIN:
			case CHAR:
			case CHARSET:
			case CHECK:
			case CLUSTER:
			case CLUSTERS:
			case COLLATION:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETE:
			case CONFIG:
			case CONNECTION:
			case CONNECTION_ID:
			case CONSISTENT:
			case CONVERT:
			case COPY:
			case COUNT:
			case CREATION:
			case CRON:
			case CURRENT_CATALOG:
			case CURRENT_TIMESTAMP:
			case DATA:
			case DATE:
			case DATE_ADD:
			case DATE_CEIL:
			case DATE_DIFF:
			case DATE_FLOOR:
			case DATE_SUB:
			case DATEADD:
			case DATEDIFF:
			case DATETIME:
			case DATETIMEV2:
			case DATEV2:
			case DATETIMEV1:
			case DATEV1:
			case DAY:
			case DAYS_ADD:
			case DAYS_SUB:
			case DECIMAL:
			case DECIMALV2:
			case DECIMALV3:
			case DEFERRED:
			case DEMAND:
			case DIAGNOSE:
			case DISTINCTPC:
			case DISTINCTPCSA:
			case DO:
			case DORIS_INTERNAL_TABLE_ID:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTKEY:
			case ENCRYPTKEYS:
			case END:
			case ENDS:
			case ENGINE:
			case ENGINES:
			case ERRORS:
			case EVENTS:
			case EVERY:
			case EXCLUDE:
			case EXPIRED:
			case EXTERNAL:
			case FAILED_LOGIN_ATTEMPTS:
			case FAST:
			case FEATURE:
			case FIELDS:
			case FILE:
			case FILTER:
			case FIRST:
			case FORMAT:
			case FREE:
			case FRONTENDS:
			case FUNCTION:
			case GLOBAL:
			case GRAPH:
			case GROUPING:
			case GROUPS:
			case HASH:
			case HDFS:
			case HELP:
			case HISTOGRAM:
			case HLL_UNION:
			case HOSTNAME:
			case HOUR:
			case HUB:
			case IDENTIFIED:
			case IGNORE:
			case IMMEDIATE:
			case INCREMENTAL:
			case INDEXES:
			case INVERTED:
			case IS_NOT_NULL_PRED:
			case IS_NULL_PRED:
			case ISNULL:
			case ISOLATION:
			case JOB:
			case JOBS:
			case JSON:
			case JSONB:
			case LABEL:
			case LAST:
			case LDAP:
			case LDAP_ADMIN_PASSWORD:
			case LESS:
			case LEVEL:
			case LINES:
			case LINK:
			case LOCAL:
			case LOCATION:
			case LOCK:
			case LOGICAL:
			case MAP:
			case MATERIALIZED:
			case MAX:
			case MEMO:
			case MERGE:
			case MIGRATE:
			case MIGRATIONS:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MTMV:
			case NAME:
			case NAMES:
			case NEGATIVE:
			case NEVER:
			case NEXT:
			case NGRAM_BF:
			case NO:
			case NON_NULLABLE:
			case NULLS:
			case OF:
			case OFFSET:
			case ONLY:
			case OPEN:
			case OPTIMIZED:
			case PARAMETER:
			case PARSED:
			case PASSWORD:
			case PASSWORD_EXPIRE:
			case PASSWORD_HISTORY:
			case PASSWORD_LOCK_TIME:
			case PASSWORD_REUSE:
			case PATH:
			case PAUSE:
			case PERCENT:
			case PERIOD:
			case PERMISSIVE:
			case PHYSICAL:
			case PLAN:
			case PLUGIN:
			case PLUGINS:
			case POLICY:
			case PROC:
			case PROCESSLIST:
			case PROFILE:
			case PROPERTIES:
			case PROPERTY:
			case QUANTILE_STATE:
			case QUANTILE_UNION:
			case QUERY:
			case QUOTA:
			case RANDOM:
			case RECOVER:
			case RECYCLE:
			case REFRESH:
			case REPEATABLE:
			case REPLACE:
			case REPLACE_IF_NOT_NULL:
			case REPOSITORIES:
			case REPOSITORY:
			case RESOURCE:
			case RESOURCES:
			case RESTORE:
			case RESTRICTIVE:
			case RESUME:
			case RETURNS:
			case REWRITTEN:
			case RLIKE:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case S3:
			case SAMPLE:
			case SCHEDULER:
			case SCHEMA:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SHAPE:
			case SKEW:
			case SNAPSHOT:
			case SONAME:
			case SPLIT:
			case START:
			case STARTS:
			case STATS:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STREAMING:
			case STRING:
			case STRUCT:
			case SUBDATE:
			case SUM:
			case TABLES:
			case TASK:
			case TASKS:
			case TEMPORARY:
			case TEXT:
			case THAN:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TRANSACTION:
			case TREE:
			case TRIGGERS:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNCOMMITTED:
			case UNLOCK:
			case USER:
			case VALUE:
			case VARCHAR:
			case VARIABLES:
			case VERBOSE:
			case VERSION:
			case VIEW:
			case WARNINGS:
			case WEEK:
			case WORK:
			case YEAR:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2101);
				nonReserved();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(DorisParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2104);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(DorisParser.EXPONENT_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(DorisParser.DECIMAL_VALUE, 0); }
		public TerminalNode SUBTRACT() { return getToken(DorisParser.SUBTRACT, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(DorisParser.INTEGER_VALUE, 0); }
		public TerminalNode SUBTRACT() { return getToken(DorisParser.SUBTRACT, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_number);
		int _la;
		try {
			setState(2114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACT) {
					{
					setState(2106);
					match(SUBTRACT);
					}
				}

				setState(2109);
				match(INTEGER_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACT) {
					{
					setState(2110);
					match(SUBTRACT);
					}
				}

				setState(2113);
				_la = _input.LA(1);
				if ( !(_la==EXPONENT_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADDDATE() { return getToken(DorisParser.ADDDATE, 0); }
		public TerminalNode AFTER() { return getToken(DorisParser.AFTER, 0); }
		public TerminalNode AGG_STATE() { return getToken(DorisParser.AGG_STATE, 0); }
		public TerminalNode AGGREGATE() { return getToken(DorisParser.AGGREGATE, 0); }
		public TerminalNode ALIAS() { return getToken(DorisParser.ALIAS, 0); }
		public TerminalNode ANALYZED() { return getToken(DorisParser.ANALYZED, 0); }
		public TerminalNode ARRAY() { return getToken(DorisParser.ARRAY, 0); }
		public TerminalNode AT() { return getToken(DorisParser.AT, 0); }
		public TerminalNode AUTHORS() { return getToken(DorisParser.AUTHORS, 0); }
		public TerminalNode BACKENDS() { return getToken(DorisParser.BACKENDS, 0); }
		public TerminalNode BACKUP() { return getToken(DorisParser.BACKUP, 0); }
		public TerminalNode BEGIN() { return getToken(DorisParser.BEGIN, 0); }
		public TerminalNode BIN() { return getToken(DorisParser.BIN, 0); }
		public TerminalNode BITAND() { return getToken(DorisParser.BITAND, 0); }
		public TerminalNode BITMAP() { return getToken(DorisParser.BITMAP, 0); }
		public TerminalNode BITMAP_UNION() { return getToken(DorisParser.BITMAP_UNION, 0); }
		public TerminalNode BITOR() { return getToken(DorisParser.BITOR, 0); }
		public TerminalNode BITXOR() { return getToken(DorisParser.BITXOR, 0); }
		public TerminalNode BLOB() { return getToken(DorisParser.BLOB, 0); }
		public TerminalNode BOOLEAN() { return getToken(DorisParser.BOOLEAN, 0); }
		public TerminalNode BRIEF() { return getToken(DorisParser.BRIEF, 0); }
		public TerminalNode BROKER() { return getToken(DorisParser.BROKER, 0); }
		public TerminalNode BUCKETS() { return getToken(DorisParser.BUCKETS, 0); }
		public TerminalNode BUILD() { return getToken(DorisParser.BUILD, 0); }
		public TerminalNode BUILTIN() { return getToken(DorisParser.BUILTIN, 0); }
		public TerminalNode CACHED() { return getToken(DorisParser.CACHED, 0); }
		public TerminalNode CATALOG() { return getToken(DorisParser.CATALOG, 0); }
		public TerminalNode CATALOGS() { return getToken(DorisParser.CATALOGS, 0); }
		public TerminalNode CHAIN() { return getToken(DorisParser.CHAIN, 0); }
		public TerminalNode CHAR() { return getToken(DorisParser.CHAR, 0); }
		public TerminalNode CHARSET() { return getToken(DorisParser.CHARSET, 0); }
		public TerminalNode CHECK() { return getToken(DorisParser.CHECK, 0); }
		public TerminalNode CLUSTER() { return getToken(DorisParser.CLUSTER, 0); }
		public TerminalNode CLUSTERS() { return getToken(DorisParser.CLUSTERS, 0); }
		public TerminalNode COLLATION() { return getToken(DorisParser.COLLATION, 0); }
		public TerminalNode COLUMNS() { return getToken(DorisParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(DorisParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(DorisParser.COMMIT, 0); }
		public TerminalNode COMMITTED() { return getToken(DorisParser.COMMITTED, 0); }
		public TerminalNode COMPACT() { return getToken(DorisParser.COMPACT, 0); }
		public TerminalNode COMPLETE() { return getToken(DorisParser.COMPLETE, 0); }
		public TerminalNode CONFIG() { return getToken(DorisParser.CONFIG, 0); }
		public TerminalNode CONNECTION() { return getToken(DorisParser.CONNECTION, 0); }
		public TerminalNode CONNECTION_ID() { return getToken(DorisParser.CONNECTION_ID, 0); }
		public TerminalNode CONSISTENT() { return getToken(DorisParser.CONSISTENT, 0); }
		public TerminalNode CONVERT() { return getToken(DorisParser.CONVERT, 0); }
		public TerminalNode COPY() { return getToken(DorisParser.COPY, 0); }
		public TerminalNode COUNT() { return getToken(DorisParser.COUNT, 0); }
		public TerminalNode CREATION() { return getToken(DorisParser.CREATION, 0); }
		public TerminalNode CRON() { return getToken(DorisParser.CRON, 0); }
		public TerminalNode CURRENT_CATALOG() { return getToken(DorisParser.CURRENT_CATALOG, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(DorisParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode DATA() { return getToken(DorisParser.DATA, 0); }
		public TerminalNode DATE() { return getToken(DorisParser.DATE, 0); }
		public TerminalNode DATE_ADD() { return getToken(DorisParser.DATE_ADD, 0); }
		public TerminalNode DATE_CEIL() { return getToken(DorisParser.DATE_CEIL, 0); }
		public TerminalNode DATE_DIFF() { return getToken(DorisParser.DATE_DIFF, 0); }
		public TerminalNode DATE_FLOOR() { return getToken(DorisParser.DATE_FLOOR, 0); }
		public TerminalNode DATE_SUB() { return getToken(DorisParser.DATE_SUB, 0); }
		public TerminalNode DATEADD() { return getToken(DorisParser.DATEADD, 0); }
		public TerminalNode DATEDIFF() { return getToken(DorisParser.DATEDIFF, 0); }
		public TerminalNode DATETIME() { return getToken(DorisParser.DATETIME, 0); }
		public TerminalNode DATETIMEV2() { return getToken(DorisParser.DATETIMEV2, 0); }
		public TerminalNode DATEV2() { return getToken(DorisParser.DATEV2, 0); }
		public TerminalNode DATETIMEV1() { return getToken(DorisParser.DATETIMEV1, 0); }
		public TerminalNode DATEV1() { return getToken(DorisParser.DATEV1, 0); }
		public TerminalNode DAY() { return getToken(DorisParser.DAY, 0); }
		public TerminalNode DAYS_ADD() { return getToken(DorisParser.DAYS_ADD, 0); }
		public TerminalNode DAYS_SUB() { return getToken(DorisParser.DAYS_SUB, 0); }
		public TerminalNode DECIMAL() { return getToken(DorisParser.DECIMAL, 0); }
		public TerminalNode DECIMALV2() { return getToken(DorisParser.DECIMALV2, 0); }
		public TerminalNode DECIMALV3() { return getToken(DorisParser.DECIMALV3, 0); }
		public TerminalNode DEFERRED() { return getToken(DorisParser.DEFERRED, 0); }
		public TerminalNode DEMAND() { return getToken(DorisParser.DEMAND, 0); }
		public TerminalNode DIAGNOSE() { return getToken(DorisParser.DIAGNOSE, 0); }
		public TerminalNode DISTINCTPC() { return getToken(DorisParser.DISTINCTPC, 0); }
		public TerminalNode DISTINCTPCSA() { return getToken(DorisParser.DISTINCTPCSA, 0); }
		public TerminalNode DO() { return getToken(DorisParser.DO, 0); }
		public TerminalNode DORIS_INTERNAL_TABLE_ID() { return getToken(DorisParser.DORIS_INTERNAL_TABLE_ID, 0); }
		public TerminalNode DYNAMIC() { return getToken(DorisParser.DYNAMIC, 0); }
		public TerminalNode ENABLE() { return getToken(DorisParser.ENABLE, 0); }
		public TerminalNode ENCRYPTKEY() { return getToken(DorisParser.ENCRYPTKEY, 0); }
		public TerminalNode ENCRYPTKEYS() { return getToken(DorisParser.ENCRYPTKEYS, 0); }
		public TerminalNode END() { return getToken(DorisParser.END, 0); }
		public TerminalNode ENDS() { return getToken(DorisParser.ENDS, 0); }
		public TerminalNode ENGINE() { return getToken(DorisParser.ENGINE, 0); }
		public TerminalNode ENGINES() { return getToken(DorisParser.ENGINES, 0); }
		public TerminalNode ERRORS() { return getToken(DorisParser.ERRORS, 0); }
		public TerminalNode EVENTS() { return getToken(DorisParser.EVENTS, 0); }
		public TerminalNode EVERY() { return getToken(DorisParser.EVERY, 0); }
		public TerminalNode EXCLUDE() { return getToken(DorisParser.EXCLUDE, 0); }
		public TerminalNode EXPIRED() { return getToken(DorisParser.EXPIRED, 0); }
		public TerminalNode EXTERNAL() { return getToken(DorisParser.EXTERNAL, 0); }
		public TerminalNode FAILED_LOGIN_ATTEMPTS() { return getToken(DorisParser.FAILED_LOGIN_ATTEMPTS, 0); }
		public TerminalNode FAST() { return getToken(DorisParser.FAST, 0); }
		public TerminalNode FEATURE() { return getToken(DorisParser.FEATURE, 0); }
		public TerminalNode FIELDS() { return getToken(DorisParser.FIELDS, 0); }
		public TerminalNode FILE() { return getToken(DorisParser.FILE, 0); }
		public TerminalNode FILTER() { return getToken(DorisParser.FILTER, 0); }
		public TerminalNode FIRST() { return getToken(DorisParser.FIRST, 0); }
		public TerminalNode FORMAT() { return getToken(DorisParser.FORMAT, 0); }
		public TerminalNode FREE() { return getToken(DorisParser.FREE, 0); }
		public TerminalNode FRONTENDS() { return getToken(DorisParser.FRONTENDS, 0); }
		public TerminalNode FUNCTION() { return getToken(DorisParser.FUNCTION, 0); }
		public TerminalNode GLOBAL() { return getToken(DorisParser.GLOBAL, 0); }
		public TerminalNode GRAPH() { return getToken(DorisParser.GRAPH, 0); }
		public TerminalNode GROUPING() { return getToken(DorisParser.GROUPING, 0); }
		public TerminalNode GROUPS() { return getToken(DorisParser.GROUPS, 0); }
		public TerminalNode HASH() { return getToken(DorisParser.HASH, 0); }
		public TerminalNode HDFS() { return getToken(DorisParser.HDFS, 0); }
		public TerminalNode HELP() { return getToken(DorisParser.HELP, 0); }
		public TerminalNode HISTOGRAM() { return getToken(DorisParser.HISTOGRAM, 0); }
		public TerminalNode HLL_UNION() { return getToken(DorisParser.HLL_UNION, 0); }
		public TerminalNode HOSTNAME() { return getToken(DorisParser.HOSTNAME, 0); }
		public TerminalNode HOUR() { return getToken(DorisParser.HOUR, 0); }
		public TerminalNode HUB() { return getToken(DorisParser.HUB, 0); }
		public TerminalNode IDENTIFIED() { return getToken(DorisParser.IDENTIFIED, 0); }
		public TerminalNode IGNORE() { return getToken(DorisParser.IGNORE, 0); }
		public TerminalNode IMMEDIATE() { return getToken(DorisParser.IMMEDIATE, 0); }
		public TerminalNode INCREMENTAL() { return getToken(DorisParser.INCREMENTAL, 0); }
		public TerminalNode INDEXES() { return getToken(DorisParser.INDEXES, 0); }
		public TerminalNode INVERTED() { return getToken(DorisParser.INVERTED, 0); }
		public TerminalNode IS_NOT_NULL_PRED() { return getToken(DorisParser.IS_NOT_NULL_PRED, 0); }
		public TerminalNode IS_NULL_PRED() { return getToken(DorisParser.IS_NULL_PRED, 0); }
		public TerminalNode ISNULL() { return getToken(DorisParser.ISNULL, 0); }
		public TerminalNode ISOLATION() { return getToken(DorisParser.ISOLATION, 0); }
		public TerminalNode JOB() { return getToken(DorisParser.JOB, 0); }
		public TerminalNode JOBS() { return getToken(DorisParser.JOBS, 0); }
		public TerminalNode JSON() { return getToken(DorisParser.JSON, 0); }
		public TerminalNode JSONB() { return getToken(DorisParser.JSONB, 0); }
		public TerminalNode LABEL() { return getToken(DorisParser.LABEL, 0); }
		public TerminalNode LAST() { return getToken(DorisParser.LAST, 0); }
		public TerminalNode LDAP() { return getToken(DorisParser.LDAP, 0); }
		public TerminalNode LDAP_ADMIN_PASSWORD() { return getToken(DorisParser.LDAP_ADMIN_PASSWORD, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(DorisParser.LEFT_BRACE, 0); }
		public TerminalNode LESS() { return getToken(DorisParser.LESS, 0); }
		public TerminalNode LEVEL() { return getToken(DorisParser.LEVEL, 0); }
		public TerminalNode LINES() { return getToken(DorisParser.LINES, 0); }
		public TerminalNode LINK() { return getToken(DorisParser.LINK, 0); }
		public TerminalNode LOCAL() { return getToken(DorisParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(DorisParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(DorisParser.LOCK, 0); }
		public TerminalNode LOGICAL() { return getToken(DorisParser.LOGICAL, 0); }
		public TerminalNode MAP() { return getToken(DorisParser.MAP, 0); }
		public TerminalNode MATERIALIZED() { return getToken(DorisParser.MATERIALIZED, 0); }
		public TerminalNode MAX() { return getToken(DorisParser.MAX, 0); }
		public TerminalNode MEMO() { return getToken(DorisParser.MEMO, 0); }
		public TerminalNode MERGE() { return getToken(DorisParser.MERGE, 0); }
		public TerminalNode MIGRATE() { return getToken(DorisParser.MIGRATE, 0); }
		public TerminalNode MIGRATIONS() { return getToken(DorisParser.MIGRATIONS, 0); }
		public TerminalNode MIN() { return getToken(DorisParser.MIN, 0); }
		public TerminalNode MINUTE() { return getToken(DorisParser.MINUTE, 0); }
		public TerminalNode MODIFY() { return getToken(DorisParser.MODIFY, 0); }
		public TerminalNode MONTH() { return getToken(DorisParser.MONTH, 0); }
		public TerminalNode MTMV() { return getToken(DorisParser.MTMV, 0); }
		public TerminalNode NAME() { return getToken(DorisParser.NAME, 0); }
		public TerminalNode NAMES() { return getToken(DorisParser.NAMES, 0); }
		public TerminalNode NEGATIVE() { return getToken(DorisParser.NEGATIVE, 0); }
		public TerminalNode NEVER() { return getToken(DorisParser.NEVER, 0); }
		public TerminalNode NEXT() { return getToken(DorisParser.NEXT, 0); }
		public TerminalNode NGRAM_BF() { return getToken(DorisParser.NGRAM_BF, 0); }
		public TerminalNode NO() { return getToken(DorisParser.NO, 0); }
		public TerminalNode NON_NULLABLE() { return getToken(DorisParser.NON_NULLABLE, 0); }
		public TerminalNode NULLS() { return getToken(DorisParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(DorisParser.OF, 0); }
		public TerminalNode OFFSET() { return getToken(DorisParser.OFFSET, 0); }
		public TerminalNode ONLY() { return getToken(DorisParser.ONLY, 0); }
		public TerminalNode OPEN() { return getToken(DorisParser.OPEN, 0); }
		public TerminalNode OPTIMIZED() { return getToken(DorisParser.OPTIMIZED, 0); }
		public TerminalNode PARAMETER() { return getToken(DorisParser.PARAMETER, 0); }
		public TerminalNode PARSED() { return getToken(DorisParser.PARSED, 0); }
		public TerminalNode PASSWORD() { return getToken(DorisParser.PASSWORD, 0); }
		public TerminalNode PASSWORD_EXPIRE() { return getToken(DorisParser.PASSWORD_EXPIRE, 0); }
		public TerminalNode PASSWORD_HISTORY() { return getToken(DorisParser.PASSWORD_HISTORY, 0); }
		public TerminalNode PASSWORD_LOCK_TIME() { return getToken(DorisParser.PASSWORD_LOCK_TIME, 0); }
		public TerminalNode PASSWORD_REUSE() { return getToken(DorisParser.PASSWORD_REUSE, 0); }
		public TerminalNode PATH() { return getToken(DorisParser.PATH, 0); }
		public TerminalNode PAUSE() { return getToken(DorisParser.PAUSE, 0); }
		public TerminalNode PERCENT() { return getToken(DorisParser.PERCENT, 0); }
		public TerminalNode PERIOD() { return getToken(DorisParser.PERIOD, 0); }
		public TerminalNode PERMISSIVE() { return getToken(DorisParser.PERMISSIVE, 0); }
		public TerminalNode PHYSICAL() { return getToken(DorisParser.PHYSICAL, 0); }
		public TerminalNode PLAN() { return getToken(DorisParser.PLAN, 0); }
		public TerminalNode PLUGIN() { return getToken(DorisParser.PLUGIN, 0); }
		public TerminalNode PLUGINS() { return getToken(DorisParser.PLUGINS, 0); }
		public TerminalNode POLICY() { return getToken(DorisParser.POLICY, 0); }
		public TerminalNode PROC() { return getToken(DorisParser.PROC, 0); }
		public TerminalNode PROCESSLIST() { return getToken(DorisParser.PROCESSLIST, 0); }
		public TerminalNode PROFILE() { return getToken(DorisParser.PROFILE, 0); }
		public TerminalNode PROPERTIES() { return getToken(DorisParser.PROPERTIES, 0); }
		public TerminalNode PROPERTY() { return getToken(DorisParser.PROPERTY, 0); }
		public TerminalNode QUANTILE_STATE() { return getToken(DorisParser.QUANTILE_STATE, 0); }
		public TerminalNode QUANTILE_UNION() { return getToken(DorisParser.QUANTILE_UNION, 0); }
		public TerminalNode QUERY() { return getToken(DorisParser.QUERY, 0); }
		public TerminalNode QUOTA() { return getToken(DorisParser.QUOTA, 0); }
		public TerminalNode RANDOM() { return getToken(DorisParser.RANDOM, 0); }
		public TerminalNode RECOVER() { return getToken(DorisParser.RECOVER, 0); }
		public TerminalNode RECYCLE() { return getToken(DorisParser.RECYCLE, 0); }
		public TerminalNode REFRESH() { return getToken(DorisParser.REFRESH, 0); }
		public TerminalNode REPEATABLE() { return getToken(DorisParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(DorisParser.REPLACE, 0); }
		public TerminalNode REPLACE_IF_NOT_NULL() { return getToken(DorisParser.REPLACE_IF_NOT_NULL, 0); }
		public TerminalNode REPOSITORIES() { return getToken(DorisParser.REPOSITORIES, 0); }
		public TerminalNode REPOSITORY() { return getToken(DorisParser.REPOSITORY, 0); }
		public TerminalNode RESOURCE() { return getToken(DorisParser.RESOURCE, 0); }
		public TerminalNode RESOURCES() { return getToken(DorisParser.RESOURCES, 0); }
		public TerminalNode RESTORE() { return getToken(DorisParser.RESTORE, 0); }
		public TerminalNode RESTRICTIVE() { return getToken(DorisParser.RESTRICTIVE, 0); }
		public TerminalNode RESUME() { return getToken(DorisParser.RESUME, 0); }
		public TerminalNode RETURNS() { return getToken(DorisParser.RETURNS, 0); }
		public TerminalNode REWRITTEN() { return getToken(DorisParser.REWRITTEN, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DorisParser.RIGHT_BRACE, 0); }
		public TerminalNode RLIKE() { return getToken(DorisParser.RLIKE, 0); }
		public TerminalNode ROLLBACK() { return getToken(DorisParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(DorisParser.ROLLUP, 0); }
		public TerminalNode ROUTINE() { return getToken(DorisParser.ROUTINE, 0); }
		public TerminalNode S3() { return getToken(DorisParser.S3, 0); }
		public TerminalNode SAMPLE() { return getToken(DorisParser.SAMPLE, 0); }
		public TerminalNode SCHEDULER() { return getToken(DorisParser.SCHEDULER, 0); }
		public TerminalNode SCHEMA() { return getToken(DorisParser.SCHEMA, 0); }
		public TerminalNode SECOND() { return getToken(DorisParser.SECOND, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(DorisParser.SERIALIZABLE, 0); }
		public TerminalNode SESSION() { return getToken(DorisParser.SESSION, 0); }
		public TerminalNode SHAPE() { return getToken(DorisParser.SHAPE, 0); }
		public TerminalNode SKEW() { return getToken(DorisParser.SKEW, 0); }
		public TerminalNode SNAPSHOT() { return getToken(DorisParser.SNAPSHOT, 0); }
		public TerminalNode SONAME() { return getToken(DorisParser.SONAME, 0); }
		public TerminalNode SPLIT() { return getToken(DorisParser.SPLIT, 0); }
		public TerminalNode START() { return getToken(DorisParser.START, 0); }
		public TerminalNode STARTS() { return getToken(DorisParser.STARTS, 0); }
		public TerminalNode STATS() { return getToken(DorisParser.STATS, 0); }
		public TerminalNode STATUS() { return getToken(DorisParser.STATUS, 0); }
		public TerminalNode STOP() { return getToken(DorisParser.STOP, 0); }
		public TerminalNode STORAGE() { return getToken(DorisParser.STORAGE, 0); }
		public TerminalNode STREAM() { return getToken(DorisParser.STREAM, 0); }
		public TerminalNode STREAMING() { return getToken(DorisParser.STREAMING, 0); }
		public TerminalNode STRING() { return getToken(DorisParser.STRING, 0); }
		public TerminalNode STRUCT() { return getToken(DorisParser.STRUCT, 0); }
		public TerminalNode SUBDATE() { return getToken(DorisParser.SUBDATE, 0); }
		public TerminalNode SUM() { return getToken(DorisParser.SUM, 0); }
		public TerminalNode TABLES() { return getToken(DorisParser.TABLES, 0); }
		public TerminalNode TASK() { return getToken(DorisParser.TASK, 0); }
		public TerminalNode TASKS() { return getToken(DorisParser.TASKS, 0); }
		public TerminalNode TEMPORARY() { return getToken(DorisParser.TEMPORARY, 0); }
		public TerminalNode TEXT() { return getToken(DorisParser.TEXT, 0); }
		public TerminalNode THAN() { return getToken(DorisParser.THAN, 0); }
		public TerminalNode TIME() { return getToken(DorisParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(DorisParser.TIMESTAMP, 0); }
		public TerminalNode TIMESTAMPADD() { return getToken(DorisParser.TIMESTAMPADD, 0); }
		public TerminalNode TIMESTAMPDIFF() { return getToken(DorisParser.TIMESTAMPDIFF, 0); }
		public TerminalNode TRANSACTION() { return getToken(DorisParser.TRANSACTION, 0); }
		public TerminalNode TREE() { return getToken(DorisParser.TREE, 0); }
		public TerminalNode TRIGGERS() { return getToken(DorisParser.TRIGGERS, 0); }
		public TerminalNode TRUNCATE() { return getToken(DorisParser.TRUNCATE, 0); }
		public TerminalNode TYPE() { return getToken(DorisParser.TYPE, 0); }
		public TerminalNode TYPES() { return getToken(DorisParser.TYPES, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(DorisParser.UNCOMMITTED, 0); }
		public TerminalNode UNLOCK() { return getToken(DorisParser.UNLOCK, 0); }
		public TerminalNode USER() { return getToken(DorisParser.USER, 0); }
		public TerminalNode VALUE() { return getToken(DorisParser.VALUE, 0); }
		public TerminalNode VARCHAR() { return getToken(DorisParser.VARCHAR, 0); }
		public TerminalNode VARIABLES() { return getToken(DorisParser.VARIABLES, 0); }
		public TerminalNode VERBOSE() { return getToken(DorisParser.VERBOSE, 0); }
		public TerminalNode VERSION() { return getToken(DorisParser.VERSION, 0); }
		public TerminalNode VIEW() { return getToken(DorisParser.VIEW, 0); }
		public TerminalNode WARNINGS() { return getToken(DorisParser.WARNINGS, 0); }
		public TerminalNode WEEK() { return getToken(DorisParser.WEEK, 0); }
		public TerminalNode WORK() { return getToken(DorisParser.WORK, 0); }
		public TerminalNode YEAR() { return getToken(DorisParser.YEAR, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisParserListener ) ((DorisParserListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisParserVisitor ) return ((DorisParserVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_BRACE) | (1L << RIGHT_BRACE) | (1L << ADDDATE) | (1L << AFTER) | (1L << AGG_STATE) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ANALYZED) | (1L << ARRAY) | (1L << AT) | (1L << AUTHORS) | (1L << BACKENDS) | (1L << BACKUP) | (1L << BEGIN) | (1L << BIN) | (1L << BITAND) | (1L << BITMAP) | (1L << BITMAP_UNION) | (1L << BITOR) | (1L << BITXOR) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BRIEF) | (1L << BROKER) | (1L << BUCKETS) | (1L << BUILD) | (1L << BUILTIN) | (1L << CACHED) | (1L << CATALOG) | (1L << CATALOGS) | (1L << CHAIN) | (1L << CHAR) | (1L << CHARSET) | (1L << CHECK))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CLUSTER - 65)) | (1L << (CLUSTERS - 65)) | (1L << (COLLATION - 65)) | (1L << (COLUMNS - 65)) | (1L << (COMMENT - 65)) | (1L << (COMMIT - 65)) | (1L << (COMMITTED - 65)) | (1L << (COMPACT - 65)) | (1L << (COMPLETE - 65)) | (1L << (CONFIG - 65)) | (1L << (CONNECTION - 65)) | (1L << (CONNECTION_ID - 65)) | (1L << (CONSISTENT - 65)) | (1L << (CONVERT - 65)) | (1L << (COPY - 65)) | (1L << (COUNT - 65)) | (1L << (CREATION - 65)) | (1L << (CRON - 65)) | (1L << (CURRENT_CATALOG - 65)) | (1L << (CURRENT_TIMESTAMP - 65)) | (1L << (DATA - 65)) | (1L << (DATE - 65)) | (1L << (DATE_ADD - 65)) | (1L << (DATE_CEIL - 65)) | (1L << (DATE_DIFF - 65)) | (1L << (DATE_FLOOR - 65)) | (1L << (DATE_SUB - 65)) | (1L << (DATEADD - 65)) | (1L << (DATEDIFF - 65)) | (1L << (DATETIME - 65)) | (1L << (DATETIMEV2 - 65)) | (1L << (DATEV2 - 65)) | (1L << (DATETIMEV1 - 65)) | (1L << (DATEV1 - 65)) | (1L << (DAY - 65)) | (1L << (DAYS_ADD - 65)) | (1L << (DAYS_SUB - 65)) | (1L << (DECIMAL - 65)) | (1L << (DECIMALV2 - 65)) | (1L << (DECIMALV3 - 65)) | (1L << (DEFERRED - 65)) | (1L << (DEMAND - 65)) | (1L << (DIAGNOSE - 65)) | (1L << (DISTINCTPC - 65)) | (1L << (DISTINCTPCSA - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (DO - 130)) | (1L << (DORIS_INTERNAL_TABLE_ID - 130)) | (1L << (DYNAMIC - 130)) | (1L << (ENABLE - 130)) | (1L << (ENCRYPTKEY - 130)) | (1L << (ENCRYPTKEYS - 130)) | (1L << (END - 130)) | (1L << (ENDS - 130)) | (1L << (ENGINE - 130)) | (1L << (ENGINES - 130)) | (1L << (ERRORS - 130)) | (1L << (EVENTS - 130)) | (1L << (EVERY - 130)) | (1L << (EXCLUDE - 130)) | (1L << (EXPIRED - 130)) | (1L << (EXTERNAL - 130)) | (1L << (FAILED_LOGIN_ATTEMPTS - 130)) | (1L << (FAST - 130)) | (1L << (FEATURE - 130)) | (1L << (FIELDS - 130)) | (1L << (FILE - 130)) | (1L << (FILTER - 130)) | (1L << (FIRST - 130)) | (1L << (FORMAT - 130)) | (1L << (FREE - 130)) | (1L << (FRONTENDS - 130)) | (1L << (FUNCTION - 130)) | (1L << (GLOBAL - 130)) | (1L << (GRAPH - 130)) | (1L << (GROUPING - 130)) | (1L << (GROUPS - 130)) | (1L << (HASH - 130)) | (1L << (HDFS - 130)) | (1L << (HELP - 130)) | (1L << (HISTOGRAM - 130)) | (1L << (HLL_UNION - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (HOSTNAME - 194)) | (1L << (HOUR - 194)) | (1L << (HUB - 194)) | (1L << (IDENTIFIED - 194)) | (1L << (IGNORE - 194)) | (1L << (IMMEDIATE - 194)) | (1L << (INCREMENTAL - 194)) | (1L << (INDEXES - 194)) | (1L << (INVERTED - 194)) | (1L << (IS_NOT_NULL_PRED - 194)) | (1L << (IS_NULL_PRED - 194)) | (1L << (ISNULL - 194)) | (1L << (ISOLATION - 194)) | (1L << (JOB - 194)) | (1L << (JOBS - 194)) | (1L << (JSON - 194)) | (1L << (JSONB - 194)) | (1L << (LABEL - 194)) | (1L << (LAST - 194)) | (1L << (LDAP - 194)) | (1L << (LDAP_ADMIN_PASSWORD - 194)) | (1L << (LESS - 194)) | (1L << (LEVEL - 194)) | (1L << (LINES - 194)) | (1L << (LINK - 194)) | (1L << (LOCAL - 194)) | (1L << (LOCATION - 194)) | (1L << (LOCK - 194)) | (1L << (LOGICAL - 194)) | (1L << (MAP - 194)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (MATERIALIZED - 261)) | (1L << (MAX - 261)) | (1L << (MEMO - 261)) | (1L << (MERGE - 261)) | (1L << (MIGRATE - 261)) | (1L << (MIGRATIONS - 261)) | (1L << (MIN - 261)) | (1L << (MINUTE - 261)) | (1L << (MODIFY - 261)) | (1L << (MONTH - 261)) | (1L << (MTMV - 261)) | (1L << (NAME - 261)) | (1L << (NAMES - 261)) | (1L << (NEGATIVE - 261)) | (1L << (NEVER - 261)) | (1L << (NEXT - 261)) | (1L << (NGRAM_BF - 261)) | (1L << (NO - 261)) | (1L << (NON_NULLABLE - 261)) | (1L << (NULLS - 261)) | (1L << (OF - 261)) | (1L << (OFFSET - 261)) | (1L << (ONLY - 261)) | (1L << (OPEN - 261)) | (1L << (OPTIMIZED - 261)) | (1L << (PARAMETER - 261)) | (1L << (PARSED - 261)) | (1L << (PASSWORD - 261)) | (1L << (PASSWORD_EXPIRE - 261)) | (1L << (PASSWORD_HISTORY - 261)) | (1L << (PASSWORD_LOCK_TIME - 261)) | (1L << (PASSWORD_REUSE - 261)) | (1L << (PATH - 261)) | (1L << (PAUSE - 261)) | (1L << (PERCENT - 261)) | (1L << (PERIOD - 261)) | (1L << (PERMISSIVE - 261)) | (1L << (PHYSICAL - 261)) | (1L << (PLAN - 261)) | (1L << (PLUGIN - 261)) | (1L << (PLUGINS - 261)) | (1L << (POLICY - 261)) | (1L << (PROC - 261)) | (1L << (PROCESSLIST - 261)) | (1L << (PROFILE - 261)) | (1L << (PROPERTIES - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (PROPERTY - 325)) | (1L << (QUANTILE_STATE - 325)) | (1L << (QUANTILE_UNION - 325)) | (1L << (QUERY - 325)) | (1L << (QUOTA - 325)) | (1L << (RANDOM - 325)) | (1L << (RECOVER - 325)) | (1L << (RECYCLE - 325)) | (1L << (REFRESH - 325)) | (1L << (REPEATABLE - 325)) | (1L << (REPLACE - 325)) | (1L << (REPLACE_IF_NOT_NULL - 325)) | (1L << (REPOSITORIES - 325)) | (1L << (REPOSITORY - 325)) | (1L << (RESOURCE - 325)) | (1L << (RESOURCES - 325)) | (1L << (RESTORE - 325)) | (1L << (RESTRICTIVE - 325)) | (1L << (RESUME - 325)) | (1L << (RETURNS - 325)) | (1L << (REWRITTEN - 325)) | (1L << (RLIKE - 325)) | (1L << (ROLLBACK - 325)) | (1L << (ROLLUP - 325)) | (1L << (ROUTINE - 325)) | (1L << (S3 - 325)) | (1L << (SAMPLE - 325)) | (1L << (SCHEDULER - 325)) | (1L << (SCHEMA - 325)) | (1L << (SECOND - 325)) | (1L << (SERIALIZABLE - 325)) | (1L << (SESSION - 325)) | (1L << (SHAPE - 325)) | (1L << (SKEW - 325)) | (1L << (SNAPSHOT - 325)) | (1L << (SONAME - 325)) | (1L << (SPLIT - 325)) | (1L << (START - 325)) | (1L << (STARTS - 325)) | (1L << (STATS - 325)))) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (STATUS - 389)) | (1L << (STOP - 389)) | (1L << (STORAGE - 389)) | (1L << (STREAM - 389)) | (1L << (STREAMING - 389)) | (1L << (STRING - 389)) | (1L << (STRUCT - 389)) | (1L << (SUBDATE - 389)) | (1L << (SUM - 389)) | (1L << (TABLES - 389)) | (1L << (TASK - 389)) | (1L << (TASKS - 389)) | (1L << (TEMPORARY - 389)) | (1L << (TEXT - 389)) | (1L << (THAN - 389)) | (1L << (TIME - 389)) | (1L << (TIMESTAMP - 389)) | (1L << (TIMESTAMPADD - 389)) | (1L << (TIMESTAMPDIFF - 389)) | (1L << (TRANSACTION - 389)) | (1L << (TREE - 389)) | (1L << (TRIGGERS - 389)) | (1L << (TRUNCATE - 389)) | (1L << (TYPE - 389)) | (1L << (TYPES - 389)) | (1L << (UNCOMMITTED - 389)) | (1L << (UNLOCK - 389)) | (1L << (USER - 389)) | (1L << (VALUE - 389)) | (1L << (VARCHAR - 389)) | (1L << (VARIABLES - 389)) | (1L << (VERBOSE - 389)) | (1L << (VERSION - 389)) | (1L << (VIEW - 389)) | (1L << (WARNINGS - 389)) | (1L << (WEEK - 389)))) != 0) || _la==WORK || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 24:
			return querySpecification_sempred((QuerySpecificationContext)_localctx, predIndex);
		case 84:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 87:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 89:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean querySpecification_sempred(QuerySpecificationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return doris_legacy_SQL_syntax;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u01f3\u0849\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\3\2\3\2\7\2\u00f1\n\2\f\2\16\2\u00f4\13\2\6\2\u00f6\n\2\r\2\16\2"+
		"\u00f7\3\2\3\2\3\3\3\3\7\3\u00fe\n\3\f\3\16\3\u0101\13\3\3\3\3\3\3\4\5"+
		"\4\u0106\n\4\3\4\3\4\5\4\u010a\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0112\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u011d\n\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4\u0129\n\4\3\4\3\4\5\4\u012d\n\4\3\4\3\4\3\4"+
		"\5\4\u0132\n\4\3\4\3\4\5\4\u0136\n\4\3\4\3\4\3\4\5\4\u013b\n\4\3\4\3\4"+
		"\3\4\5\4\u0140\n\4\3\4\3\4\5\4\u0144\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u014c"+
		"\n\4\3\4\3\4\5\4\u0150\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u0157\n\4\3\4\3\4\3"+
		"\4\5\4\u015c\n\4\5\4\u015e\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u0165\n\4\3\4\5"+
		"\4\u0168\n\4\3\4\3\4\5\4\u016c\n\4\3\4\5\4\u016f\n\4\3\4\3\4\3\4\3\4\5"+
		"\4\u0175\n\4\3\4\3\4\3\4\5\4\u017a\n\4\3\4\3\4\3\4\5\4\u017f\n\4\3\4\5"+
		"\4\u0182\n\4\3\4\3\4\3\4\3\4\5\4\u0188\n\4\3\4\3\4\3\4\5\4\u018d\n\4\3"+
		"\4\5\4\u0190\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0198\n\4\3\4\3\4\3\4\5\4"+
		"\u019d\n\4\3\4\5\4\u01a0\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u01a8\n\4\3\4"+
		"\3\4\3\4\3\4\7\4\u01ae\n\4\f\4\16\4\u01b1\13\4\5\4\u01b3\n\4\3\4\5\4\u01b6"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u01bf\n\4\f\4\16\4\u01c2\13\4\3\4"+
		"\3\4\5\4\u01c6\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u01cd\n\4\3\4\5\4\u01d0\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u01d9\n\4\f\4\16\4\u01dc\13\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\u01e5\n\4\3\4\5\4\u01e8\n\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4\u01f1\n\4\3\4\5\4\u01f4\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u01fb"+
		"\n\4\3\4\5\4\u01fe\n\4\3\4\3\4\3\4\5\4\u0203\n\4\3\4\5\4\u0206\n\4\5\4"+
		"\u0208\n\4\3\5\5\5\u020b\n\5\3\5\5\5\u020e\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5\u0216\n\5\f\5\16\5\u0219\13\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0221\n"+
		"\5\3\5\3\5\3\5\3\5\5\5\u0227\n\5\3\5\3\5\3\5\3\5\5\5\u022d\n\5\3\5\3\5"+
		"\3\5\5\5\u0232\n\5\3\5\5\5\u0235\n\5\3\5\5\5\u0238\n\5\3\5\5\5\u023b\n"+
		"\5\3\5\5\5\u023e\n\5\3\5\5\5\u0241\n\5\3\5\5\5\u0244\n\5\3\5\5\5\u0247"+
		"\n\5\3\5\5\5\u024a\n\5\3\5\5\5\u024d\n\5\3\5\5\5\u0250\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u025b\n\5\3\5\5\5\u025e\n\5\3\5\5\5\u0261"+
		"\n\5\3\5\5\5\u0264\n\5\3\5\5\5\u0267\n\5\5\5\u0269\n\5\3\6\3\6\3\6\5\6"+
		"\u026e\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0277\n\7\5\7\u0279\n\7\3\b"+
		"\3\b\5\b\u027d\n\b\3\b\3\b\5\b\u0281\n\b\3\b\5\b\u0284\n\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u02a1\n\17\f\17\16\17\u02a4"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u02c5\n\21\5\21\u02c7\n\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u02d0\n\22\3\23\3\23\3\23\5\23\u02d5\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u02de\n\23\3\23\3\23\3\23\3\23\5\23"+
		"\u02e4\n\23\3\23\3\23\3\23\3\23\5\23\u02ea\n\23\3\23\5\23\u02ed\n\23\3"+
		"\23\5\23\u02f0\n\23\3\23\5\23\u02f3\n\23\3\23\5\23\u02f6\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u02fe\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0306\n\25\3\25\5\25\u0309\n\25\3\26\5\26\u030c\n\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u0317\n\27\3\27\7\27\u031a\n\27\f\27"+
		"\16\27\u031d\13\27\3\30\3\30\3\30\3\30\3\30\5\30\u0324\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u032c\n\31\3\32\3\32\5\32\u0330\n\32\3\32\5"+
		"\32\u0333\n\32\3\32\5\32\u0336\n\32\3\32\5\32\u0339\n\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\7\33\u0342\n\33\f\33\16\33\u0345\13\33\3\34\3\34"+
		"\5\34\u0349\n\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u0354"+
		"\n\35\f\35\16\35\u0357\13\35\3\35\3\35\3\36\3\36\5\36\u035d\n\36\3\36"+
		"\5\36\u0360\n\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u036b"+
		"\n\37\3 \3 \3 \3!\3!\3!\3!\7!\u0374\n!\f!\16!\u0377\13!\3\"\3\"\7\"\u037b"+
		"\n\"\f\"\16\"\u037e\13\"\3#\3#\3#\5#\u0383\n#\3#\3#\5#\u0387\n#\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\5$\u0391\n$\3%\3%\3%\3%\7%\u0397\n%\f%\16%\u039a\13"+
		"%\3%\3%\3%\3%\3%\3%\7%\u03a2\n%\f%\16%\u03a5\13%\3%\3%\5%\u03a9\n%\3&"+
		"\3&\3&\5&\u03ae\n&\3\'\3\'\3\'\3\'\3\'\7\'\u03b5\n\'\f\'\16\'\u03b8\13"+
		"\'\5\'\u03ba\n\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u03c2\n\'\f\'\16\'\u03c5"+
		"\13\'\5\'\u03c7\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u03d0\n\'\f\'\16\'"+
		"\u03d3\13\'\3\'\3\'\3\'\3\'\3\'\7\'\u03da\n\'\f\'\16\'\u03dd\13\'\5\'"+
		"\u03df\n\'\3(\3(\3(\3(\7(\u03e5\n(\f(\16(\u03e8\13(\5(\u03ea\n(\3(\3("+
		"\3)\3)\3)\3*\3*\3*\5*\u03f4\n*\3*\7*\u03f7\n*\f*\16*\u03fa\13*\3*\3*\3"+
		"+\3+\3+\3+\5+\u0402\n+\3+\7+\u0405\n+\f+\16+\u0408\13+\3+\3+\5+\u040c"+
		"\n+\3,\3,\3,\3,\5,\u0412\n,\5,\u0414\n,\3-\3-\3-\3-\5-\u041a\n-\3.\3."+
		"\3.\7.\u041f\n.\f.\16.\u0422\13.\3/\3/\3/\3/\3/\3/\3/\7/\u042b\n/\f/\16"+
		"/\u042e\13/\5/\u0430\n/\3/\3/\3/\3/\3/\3\60\5\60\u0438\n\60\3\60\5\60"+
		"\u043b\n\60\3\61\3\61\3\61\3\61\3\61\7\61\u0442\n\61\f\61\16\61\u0445"+
		"\13\61\3\62\3\62\5\62\u0449\n\62\3\62\3\62\5\62\u044d\n\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0459\n\63\3\64\3\64\3\64"+
		"\3\64\3\64\7\64\u0460\n\64\f\64\16\64\u0463\13\64\3\65\5\65\u0466\n\65"+
		"\3\65\3\65\3\65\5\65\u046b\n\65\3\65\3\65\5\65\u046f\n\65\3\65\3\65\5"+
		"\65\u0473\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u047d\n\65"+
		"\3\66\3\66\3\66\3\66\5\66\u0483\n\66\3\67\3\67\3\67\3\67\38\38\38\78\u048c"+
		"\n8\f8\168\u048f\138\39\39\59\u0493\n9\39\59\u0496\n9\39\39\59\u049a\n"+
		"9\39\59\u049d\n9\39\79\u04a0\n9\f9\169\u04a3\139\39\39\39\39\39\79\u04aa"+
		"\n9\f9\169\u04ad\139\39\39\39\59\u04b2\n9\39\39\39\59\u04b7\n9\3:\3:\3"+
		":\3:\3:\3;\3;\3;\7;\u04c1\n;\f;\16;\u04c4\13;\3<\3<\3<\3<\3=\3=\5=\u04cc"+
		"\n=\3>\3>\5>\u04d0\n>\3?\5?\u04d3\n?\3?\3?\5?\u04d7\n?\5?\u04d9\n?\3@"+
		"\3@\3@\7@\u04de\n@\f@\16@\u04e1\13@\3A\3A\3A\7A\u04e6\nA\fA\16A\u04e9"+
		"\13A\3B\3B\3B\5B\u04ee\nB\3B\5B\u04f1\nB\3B\3B\3B\5B\u04f6\nB\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\5B\u0501\nB\5B\u0503\nB\5B\u0505\nB\3B\3B\5B\u0509"+
		"\nB\3C\3C\3C\7C\u050e\nC\fC\16C\u0511\13C\3D\3D\3D\3D\3D\5D\u0518\nD\3"+
		"D\5D\u051b\nD\3E\3E\3E\7E\u0520\nE\fE\16E\u0523\13E\3F\3F\3F\3F\5F\u0529"+
		"\nF\3F\5F\u052c\nF\3G\3G\3G\3G\5G\u0532\nG\3G\3G\3G\3G\3G\3G\5G\u053a"+
		"\nG\3H\3H\3H\3H\5H\u0540\nH\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I"+
		"\3I\5I\u0551\nI\3J\3J\3J\3J\5J\u0557\nJ\3J\3J\3J\3J\3J\3J\3J\7J\u0560"+
		"\nJ\fJ\16J\u0563\13J\3J\3J\3J\5J\u0568\nJ\3K\3K\3K\3K\7K\u056e\nK\fK\16"+
		"K\u0571\13K\3K\3K\3L\3L\3M\3M\3M\7M\u057a\nM\fM\16M\u057d\13M\3N\3N\3"+
		"N\3N\3N\5N\u0584\nN\3N\5N\u0587\nN\3O\3O\3P\3P\3P\3P\3P\7P\u0590\nP\f"+
		"P\16P\u0593\13P\3P\3P\3Q\3Q\3Q\3Q\7Q\u059b\nQ\fQ\16Q\u059e\13Q\3R\3R\5"+
		"R\u05a2\nR\3R\5R\u05a5\nR\3S\3S\3S\7S\u05aa\nS\fS\16S\u05ad\13S\3T\3T"+
		"\5T\u05b1\nT\3U\3U\3U\3U\3U\3U\3U\3U\6U\u05bb\nU\rU\16U\u05bc\3U\3U\3"+
		"U\3U\5U\u05c3\nU\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3"+
		"V\3V\3V\5V\u05d9\nV\5V\u05db\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\7V\u05e6\n"+
		"V\fV\16V\u05e9\13V\3W\3W\3W\3W\7W\u05ef\nW\fW\16W\u05f2\13W\3W\3W\3X\5"+
		"X\u05f7\nX\3X\3X\3X\3X\3X\3X\5X\u05ff\nX\3X\3X\3X\5X\u0604\nX\3X\3X\3"+
		"X\5X\u0609\nX\3X\3X\3X\3X\3X\3X\5X\u0611\nX\3X\3X\3X\3X\3X\7X\u0618\n"+
		"X\fX\16X\u061b\13X\3X\3X\3X\3X\5X\u0621\nX\3X\5X\u0624\nX\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0631\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u063d"+
		"\nY\fY\16Y\u0640\13Y\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3"+
		"[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u0660\n[\3[\3[\3[\3[\3[\3"+
		"[\3[\3[\3[\3[\3[\5[\u066d\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u067a"+
		"\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u0687\n[\3[\3[\3[\3[\6[\u068d"+
		"\n[\r[\16[\u068e\3[\3[\5[\u0693\n[\3[\3[\3[\3[\3[\6[\u069a\n[\r[\16[\u069b"+
		"\3[\3[\5[\u06a0\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\7[\u06b7\n[\f[\16[\u06ba\13[\3[\3[\5[\u06be\n[\3[\3[\3[\3"+
		"[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u06d3\n[\3[\3[\3[\7"+
		"[\u06d8\n[\f[\16[\u06db\13[\3[\3[\3[\3[\3[\7[\u06e2\n[\f[\16[\u06e5\13"+
		"[\5[\u06e7\n[\5[\u06e9\n[\3[\3[\3[\5[\u06ee\n[\3[\3[\3[\3[\3[\3[\3[\3"+
		"[\3[\5[\u06f9\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u0705\n[\3[\3[\3[\3"+
		"[\3[\3[\5[\u070d\n[\3[\3[\3[\5[\u0712\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3"+
		"[\5[\u071e\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u072a\n[\7[\u072c\n[\f"+
		"[\16[\u072f\13[\3\\\3\\\3\\\5\\\u0734\n\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3"+
		"]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u0747\n]\3^\3^\5^\u074b\n^\3^\5^\u074e\n"+
		"^\3^\5^\u0751\n^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u075e\n_\3`\3`\3"+
		"a\3a\3a\3a\3a\3a\3a\5a\u0769\na\3b\3b\3b\7b\u076e\nb\fb\16b\u0771\13b"+
		"\3c\5c\u0774\nc\3c\3c\3c\5c\u0779\nc\3c\5c\u077c\nc\3c\3c\5c\u0780\nc"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\5d\u078a\nd\3d\3d\7d\u078e\nd\fd\16d\u0791\13"+
		"d\3d\3d\3d\3d\3d\3d\5d\u0799\nd\3d\3d\3d\3d\3d\7d\u07a0\nd\fd\16d\u07a3"+
		"\13d\3d\3d\3d\3d\3d\7d\u07aa\nd\fd\16d\u07ad\13d\3d\3d\5d\u07b1\nd\3e"+
		"\3e\3f\3f\3g\3g\3g\3g\3g\3h\3h\3h\3h\3i\3i\3j\3j\3j\3j\3j\3j\3j\3j\3j"+
		"\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\7j\u07d8\nj\fj\16j\u07db\13j\3"+
		"j\5j\u07de\nj\5j\u07e0\nj\3k\3k\3k\3k\5k\u07e6\nk\3k\3k\3k\3k\3k\3k\3"+
		"k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\5"+
		"k\u0805\nk\3l\3l\3l\7l\u080a\nl\fl\16l\u080d\13l\3m\3m\3m\3m\5m\u0813"+
		"\nm\3n\3n\3n\3o\3o\3o\5o\u081b\no\3o\3o\3o\5o\u0820\no\3p\3p\3p\3p\5p"+
		"\u0826\np\3q\3q\3q\3r\3r\6r\u082d\nr\rr\16r\u082e\3r\5r\u0832\nr\3s\3"+
		"s\3t\3t\3t\5t\u0839\nt\3u\3u\3v\5v\u083e\nv\3v\3v\5v\u0842\nv\3v\5v\u0845"+
		"\nv\3w\3w\3w\2\6,\u00aa\u00b0\u00b4x\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\2(\4\2\u013a\u013a\u0161\u0161\5"+
		"\2\23\23\u0089\u0089\u01b4\u01b4\4\2\u00f6\u00f6\u014d\u014d\6\2\u00b9"+
		"\u00b9\u013c\u013c\u01a8\u01a8\u01bf\u01bf\13\2\25\25\30\30\u00fb\u00fb"+
		"\u010a\u010a\u0126\u0126\u012e\u012e\u013b\u013b\u0165\u0165\u017b\u017b"+
		"\5\2\33\33ww\u010b\u010b\5\2\u0097\u0097\u00d6\u00d6\u01b3\u01b3\4\2\36"+
		"\36yy\4\2\u00a8\u00a8\u00eb\u00eb\5\2\u0109\u0109\u01e5\u01e5\u01ea\u01ea"+
		"\t\2--\u00c3\u00c3\u0108\u0108\u010e\u010e\u0149\u0149\u0159\u015a\u018f"+
		"\u018f\4\2\u011d\u011d\u01db\u01db\3\2\u00de\u00df\4\2\31\31\u01da\u01da"+
		"\5\2\u00f2\u00f2\u0154\u0154\u0167\u0167\4\2\u00fe\u0100\u0106\u0106\4"+
		"\2\u01d3\u01d4\u01d8\u01d8\4\2++./\3\2\u01d5\u01d7\7\2\u0083\u0083\u01d3"+
		"\u01d4\u01d9\u01d9\u01dc\u01dc\u01de\u01de\t\2nn\u00c5\u00c5\u0110\u0110"+
		"\u0112\u0112\u0174\u0174\u01c3\u01c3\u01cb\u01cb\4\2hh\u01a3\u01a3\4\2"+
		"gg\u01a2\u01a2\5\2\17\17bboo\5\2ffpp\u018e\u018e\4\2\25\25}}\4\2\u00b6"+
		"\u00b6\u0178\u0178\4\2aa\u01a1\u01a1\4\2\u014d\u014d\u016e\u016e\4\2\u00ab"+
		"\u00ab\u0140\u0140\6\2aakkmm\u01a1\u01a1\3\2\u01cc\u01d2\4\2\u00a2\u00a2"+
		"\u01ab\u01ab\4\2\u01d5\u01d5\u01ea\u01ea\4\2\u017d\u017d\u01b6\u01b6\3"+
		"\2\u00d3\u00d4\3\2\u01eb\u01ec]\2\n\13\17\17\21\24\30\30\34\34\37 $&)"+
		")+\6688<ACDFFHTVW[\\^^asvvxx{{~\177\u0084\u0085\u008a\u008a\u008c\u0092"+
		"\u0094\u0096\u0098\u0098\u009b\u009b\u009f\u009f\u00a1\u00a1\u00a3\u00a8"+
		"\u00ae\u00af\u00b2\u00b2\u00b4\u00b4\u00b6\u00b6\u00b9\u00b9\u00bb\u00bd"+
		"\u00bf\u00c1\u00c3\u00c7\u00c9\u00ca\u00cc\u00cc\u00ce\u00ce\u00d9\u00d9"+
		"\u00dd\u00e2\u00e4\u00e5\u00e9\u00e9\u00eb\u00eb\u00ed\u00ee\u00f0\u00f1"+
		"\u00f4\u00f5\u00f8\u00fb\u00fd\u00fd\u0107\u0108\u010a\u010e\u0110\u0115"+
		"\u0117\u011c\u011f\u011f\u0121\u0122\u0124\u0126\u012d\u012e\u0131\u013f"+
		"\u0142\u0142\u0144\u014c\u0151\u0153\u0158\u015a\u015c\u0163\u0165\u0165"+
		"\u0167\u0167\u016a\u016c\u016f\u0172\u0174\u0174\u0177\u0178\u017b\u017b"+
		"\u017e\u017e\u0180\u0182\u0184\u018f\u0195\u0195\u0199\u019b\u019d\u019e"+
		"\u01a0\u01a3\u01a6\u01a6\u01a8\u01a9\u01ac\u01ad\u01af\u01af\u01b1\u01b1"+
		"\u01b5\u01b5\u01b9\u01b9\u01bb\u01bb\u01bd\u01c3\u01c8\u01c8\u01cb\u01cb"+
		"\2\u095d\2\u00f5\3\2\2\2\4\u00fb\3\2\2\2\6\u0207\3\2\2\2\b\u0268\3\2\2"+
		"\2\n\u026d\3\2\2\2\f\u026f\3\2\2\2\16\u0280\3\2\2\2\20\u0285\3\2\2\2\22"+
		"\u0287\3\2\2\2\24\u0289\3\2\2\2\26\u028d\3\2\2\2\30\u0291\3\2\2\2\32\u0295"+
		"\3\2\2\2\34\u029b\3\2\2\2\36\u02a7\3\2\2\2 \u02c6\3\2\2\2\"\u02c8\3\2"+
		"\2\2$\u02d1\3\2\2\2&\u02fd\3\2\2\2(\u02ff\3\2\2\2*\u030b\3\2\2\2,\u0310"+
		"\3\2\2\2.\u0323\3\2\2\2\60\u032b\3\2\2\2\62\u032d\3\2\2\2\64\u033d\3\2"+
		"\2\2\66\u0346\3\2\2\28\u034f\3\2\2\2:\u035a\3\2\2\2<\u036a\3\2\2\2>\u036c"+
		"\3\2\2\2@\u036f\3\2\2\2B\u0378\3\2\2\2D\u037f\3\2\2\2F\u0390\3\2\2\2H"+
		"\u03a8\3\2\2\2J\u03aa\3\2\2\2L\u03de\3\2\2\2N\u03e0\3\2\2\2P\u03ed\3\2"+
		"\2\2R\u03f0\3\2\2\2T\u03fd\3\2\2\2V\u040d\3\2\2\2X\u0415\3\2\2\2Z\u041b"+
		"\3\2\2\2\\\u0423\3\2\2\2^\u0437\3\2\2\2`\u043c\3\2\2\2b\u0446\3\2\2\2"+
		"d\u0458\3\2\2\2f\u045a\3\2\2\2h\u047c\3\2\2\2j\u0482\3\2\2\2l\u0484\3"+
		"\2\2\2n\u0488\3\2\2\2p\u04b6\3\2\2\2r\u04b8\3\2\2\2t\u04bd\3\2\2\2v\u04c5"+
		"\3\2\2\2x\u04cb\3\2\2\2z\u04cf\3\2\2\2|\u04d8\3\2\2\2~\u04da\3\2\2\2\u0080"+
		"\u04e2\3\2\2\2\u0082\u04ea\3\2\2\2\u0084\u050a\3\2\2\2\u0086\u0512\3\2"+
		"\2\2\u0088\u051c\3\2\2\2\u008a\u0528\3\2\2\2\u008c\u052d\3\2\2\2\u008e"+
		"\u053b\3\2\2\2\u0090\u0549\3\2\2\2\u0092\u0552\3\2\2\2\u0094\u0569\3\2"+
		"\2\2\u0096\u0574\3\2\2\2\u0098\u0576\3\2\2\2\u009a\u057e\3\2\2\2\u009c"+
		"\u0588\3\2\2\2\u009e\u058a\3\2\2\2\u00a0\u0596\3\2\2\2\u00a2\u059f\3\2"+
		"\2\2\u00a4\u05a6\3\2\2\2\u00a6\u05b0\3\2\2\2\u00a8\u05c2\3\2\2\2\u00aa"+
		"\u05da\3\2\2\2\u00ac\u05ea\3\2\2\2\u00ae\u0623\3\2\2\2\u00b0\u0630\3\2"+
		"\2\2\u00b2\u0641\3\2\2\2\u00b4\u0711\3\2\2\2\u00b6\u0733\3\2\2\2\u00b8"+
		"\u0746\3\2\2\2\u00ba\u0748\3\2\2\2\u00bc\u075d\3\2\2\2\u00be\u075f\3\2"+
		"\2\2\u00c0\u0768\3\2\2\2\u00c2\u076a\3\2\2\2\u00c4\u077f\3\2\2\2\u00c6"+
		"\u07b0\3\2\2\2\u00c8\u07b2\3\2\2\2\u00ca\u07b4\3\2\2\2\u00cc\u07b6\3\2"+
		"\2\2\u00ce\u07bb\3\2\2\2\u00d0\u07bf\3\2\2\2\u00d2\u07df\3\2\2\2\u00d4"+
		"\u0804\3\2\2\2\u00d6\u0806\3\2\2\2\u00d8\u080e\3\2\2\2\u00da\u0814\3\2"+
		"\2\2\u00dc\u0817\3\2\2\2\u00de\u0825\3\2\2\2\u00e0\u0827\3\2\2\2\u00e2"+
		"\u0831\3\2\2\2\u00e4\u0833\3\2\2\2\u00e6\u0838\3\2\2\2\u00e8\u083a\3\2"+
		"\2\2\u00ea\u0844\3\2\2\2\u00ec\u0846\3\2\2\2\u00ee\u00f2\5\6\4\2\u00ef"+
		"\u00f1\7\3\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00ee\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\2\2\3\u00fa\3\3\2\2\2\u00fb\u00ff"+
		"\5\6\4\2\u00fc\u00fe\7\3\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0102\u0103\7\2\2\3\u0103\5\3\2\2\2\u0104\u0106\5\16\b\2\u0105\u0104"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\5*\26\2\u0108"+
		"\u010a\5(\25\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0208\3\2"+
		"\2\2\u010b\u010c\7U\2\2\u010c\u010d\7\u016d\2\2\u010d\u0111\7\u013f\2"+
		"\2\u010e\u010f\7\u00c8\2\2\u010f\u0110\7\u011d\2\2\u0110\u0112\7\u009a"+
		"\2\2\u0111\u010e\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0114\5\u00e4s\2\u0114\u0115\7\u0123\2\2\u0115\u0116\5~@\2\u0116\u0117"+
		"\7\35\2\2\u0117\u0118\t\2\2\2\u0118\u011c\7\u01a5\2\2\u0119\u011d\5\f"+
		"\7\2\u011a\u011b\7\u0168\2\2\u011b\u011d\5\u00e4s\2\u011c\u0119\3\2\2"+
		"\2\u011c\u011a\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7\u01ba\2\2\u011f"+
		"\u0120\7\4\2\2\u0120\u0121\5\u00aaV\2\u0121\u0122\7\5\2\2\u0122\u0208"+
		"\3\2\2\2\u0123\u0124\7U\2\2\u0124\u0128\7\u0194\2\2\u0125\u0126\7\u00c8"+
		"\2\2\u0126\u0127\7\u011d\2\2\u0127\u0129\7\u009a\2\2\u0128\u0125\3\2\2"+
		"\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0135\5~@\2\u012b\u012d"+
		"\5l\67\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0136\3\2\2\2\u012e"+
		"\u012f\7\4\2\2\u012f\u0131\5\u0080A\2\u0130\u0132\5\u0084C\2\u0131\u0130"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7\5\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u012c\3\2\2\2\u0135\u012e\3\2\2\2\u0136\u013a\3\2"+
		"\2\2\u0137\u0138\7\u0091\2\2\u0138\u0139\7\u01cc\2\2\u0139\u013b\5\u00e4"+
		"s\2\u013a\u0137\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013f\3\2\2\2\u013c"+
		"\u013d\t\3\2\2\u013d\u013e\7\u00e6\2\2\u013e\u0140\5l\67\2\u013f\u013c"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u0142\7I\2\2\u0142"+
		"\u0144\7\u01e5\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u014f"+
		"\3\2\2\2\u0145\u0146\7\u012f\2\2\u0146\u0147\7\67\2\2\u0147\u0148\t\4"+
		"\2\2\u0148\u0149\5l\67\2\u0149\u014b\7\4\2\2\u014a\u014c\5\u0088E\2\u014b"+
		"\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\7\5"+
		"\2\2\u014e\u0150\3\2\2\2\u014f\u0145\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u015d\3\2\2\2\u0151\u0152\7\u0081\2\2\u0152\u0156\7\67\2\2\u0153\u0154"+
		"\7\u00bd\2\2\u0154\u0157\5l\67\2\u0155\u0157\7\u014c\2\2\u0156\u0153\3"+
		"\2\2\2\u0156\u0155\3\2\2\2\u0157\u015b\3\2\2\2\u0158\u0159\7\64\2\2\u0159"+
		"\u015c\7\u01ea\2\2\u015a\u015c\7!\2\2\u015b\u0158\3\2\2\2\u015b\u015a"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u0151\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u0164\3\2\2\2\u015f\u0160\7\u016b\2\2\u0160\u0161"+
		"\7\4\2\2\u0161\u0162\5\u0098M\2\u0162\u0163\7\5\2\2\u0163\u0165\3\2\2"+
		"\2\u0164\u015f\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0168"+
		"\5r:\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016b\3\2\2\2\u0169"+
		"\u016a\7\35\2\2\u016a\u016c\5*\26\2\u016b\u0169\3\2\2\2\u016b\u016c\3"+
		"\2\2\2\u016c\u0208\3\2\2\2\u016d\u016f\5\16\b\2\u016e\u016d\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0174\7\u00d1\2\2\u0171\u0175"+
		"\7\u00d8\2\2\u0172\u0173\7\u012c\2\2\u0173\u0175\7\u0194\2\2\u0174\u0171"+
		"\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0179\5~@\2\u0177"+
		"\u0178\7\u012f\2\2\u0178\u017a\5l\67\2\u0179\u0177\3\2\2\2\u0179\u017a"+
		"\3\2\2\2\u017a\u017e\3\2\2\2\u017b\u017c\7\u01c7\2\2\u017c\u017d\7\u00e9"+
		"\2\2\u017d\u017f\5\u00e4s\2\u017e\u017b\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0181\3\2\2\2\u0180\u0182\5l\67\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0187\3\2\2\2\u0183\u0184\7\b\2\2\u0184\u0185\5n8\2\u0185\u0186"+
		"\7\t\2\2\u0186\u0188\3\2\2\2\u0187\u0183\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018a\5*\26\2\u018a\u0208\3\2\2\2\u018b\u018d\5\16"+
		"\b\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e"+
		"\u0190\5\64\33\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3"+
		"\2\2\2\u0191\u0192\7\u01b7\2\2\u0192\u0193\5~@\2\u0193\u0194\5|?\2\u0194"+
		"\u0195\7\u0179\2\2\u0195\u0197\5Z.\2\u0196\u0198\5@!\2\u0197\u0196\3\2"+
		"\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\5> \2\u019a\u0208"+
		"\3\2\2\2\u019b\u019d\5\16\b\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2"+
		"\u019d\u019f\3\2\2\2\u019e\u01a0\5\64\33\2\u019f\u019e\3\2\2\2\u019f\u01a0"+
		"\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\7w\2\2\u01a2\u01a3\7\u00b0\2"+
		"\2\u01a3\u01a4\5~@\2\u01a4\u01a7\5|?\2\u01a5\u01a6\7\u012f\2\2\u01a6\u01a8"+
		"\5l\67\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01b2\3\2\2\2\u01a9"+
		"\u01aa\7\u01ba\2\2\u01aa\u01af\5B\"\2\u01ab\u01ac\7\6\2\2\u01ac\u01ae"+
		"\5B\"\2\u01ad\u01ab\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01a9\3\2"+
		"\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b6\5> \2\u01b5\u01b4"+
		"\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u0208\3\2\2\2\u01b7\u01b8\7\u00f7\2"+
		"\2\u01b8\u01b9\7\u00e9\2\2\u01b9\u01ba\5\u00e4s\2\u01ba\u01bb\7\4\2\2"+
		"\u01bb\u01c0\5\b\5\2\u01bc\u01bd\7\6\2\2\u01bd\u01bf\5\b\5\2\u01be\u01bc"+
		"\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c5\7\5\2\2\u01c4\u01c6\5 "+
		"\21\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01cc\3\2\2\2\u01c7"+
		"\u01c8\7\u0146\2\2\u01c8\u01c9\7\4\2\2\u01c9\u01ca\5t;\2\u01ca\u01cb\7"+
		"\5\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01c7\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01cf\3\2\2\2\u01ce\u01d0\5\u00dan\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0\u0208\3\2\2\2\u01d1\u01d2\7\u00f7\2\2\u01d2\u01d3\7\u00e9"+
		"\2\2\u01d3\u01d4\5\u00e4s\2\u01d4\u01d5\7\4\2\2\u01d5\u01da\5\b\5\2\u01d6"+
		"\u01d7\7\6\2\2\u01d7\u01d9\5\b\5\2\u01d8\u01d6\3\2\2\2\u01d9\u01dc\3\2"+
		"\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dd\u01de\7\5\2\2\u01de\u01e4\5\"\22\2\u01df\u01e0\7"+
		"\u0146\2\2\u01e0\u01e1\7\4\2\2\u01e1\u01e2\5t;\2\u01e2\u01e3\7\5\2\2\u01e3"+
		"\u01e5\3\2\2\2\u01e4\u01df\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2"+
		"\2\2\u01e6\u01e8\5\u00dan\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u0208\3\2\2\2\u01e9\u01ea\7\u00f7\2\2\u01ea\u01f0\5$\23\2\u01eb\u01ec"+
		"\7\u0146\2\2\u01ec\u01ed\7\4\2\2\u01ed\u01ee\5t;\2\u01ee\u01ef\7\5\2\2"+
		"\u01ef\u01f1\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3"+
		"\3\2\2\2\u01f2\u01f4\5\u00dan\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2"+
		"\2\u01f4\u0208\3\2\2\2\u01f5\u01f6\7\u009d\2\2\u01f6\u01f7\7\u0194\2\2"+
		"\u01f7\u01fa\5~@\2\u01f8\u01f9\7\u012f\2\2\u01f9\u01fb\5l\67\2\u01fa\u01f8"+
		"\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fe\5> \2\u01fd"+
		"\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\7\u01a5"+
		"\2\2\u0200\u0202\7\u01e5\2\2\u0201\u0203\5r:\2\u0202\u0201\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0206\5 \21\2\u0205\u0204\3\2"+
		"\2\2\u0205\u0206\3\2\2\2\u0206\u0208\3\2\2\2\u0207\u0105\3\2\2\2\u0207"+
		"\u010b\3\2\2\2\u0207\u0123\3\2\2\2\u0207\u016e\3\2\2\2\u0207\u018c\3\2"+
		"\2\2\u0207\u019c\3\2\2\2\u0207\u01b7\3\2\2\2\u0207\u01d1\3\2\2\2\u0207"+
		"\u01e9\3\2\2\2\u0207\u01f5\3\2\2\2\u0208\7\3\2\2\2\u0209\u020b\7\u01c7"+
		"\2\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020e\5\22\n\2\u020d\u020a\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3"+
		"\2\2\2\u020f\u0210\7^\2\2\u0210\u0211\7\u00cf\2\2\u0211\u0212\7\4\2\2"+
		"\u0212\u0217\7\u01e5\2\2\u0213\u0214\7\6\2\2\u0214\u0216\7\u01e5\2\2\u0215"+
		"\u0213\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2"+
		"\2\2\u0218\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021b\7\5\2\2\u021b"+
		"\u021c\7\u00d8\2\2\u021c\u021d\7\u0194\2\2\u021d\u0220\5~@\2\u021e\u021f"+
		"\7\u012f\2\2\u021f\u0221\5l\67\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2"+
		"\2\u0221\u0226\3\2\2\2\u0222\u0223\7H\2\2\u0223\u0224\7\u019c\2\2\u0224"+
		"\u0225\7\67\2\2\u0225\u0227\7\u01e5\2\2\u0226\u0222\3\2\2\2\u0226\u0227"+
		"\3\2\2\2\u0227\u022c\3\2\2\2\u0228\u0229\7\u00f4\2\2\u0229\u022a\7\u019c"+
		"\2\2\u022a\u022b\7\67\2\2\u022b\u022d\7\u01e5\2\2\u022c\u0228\3\2\2\2"+
		"\u022c\u022d\3\2\2\2\u022d\u0231\3\2\2\2\u022e\u022f\7\u00ae\2\2\u022f"+
		"\u0230\7\35\2\2\u0230\u0232\5\u00e4s\2\u0231\u022e\3\2\2\2\u0231\u0232"+
		"\3\2\2\2\u0232\u0234\3\2\2\2\u0233\u0235\5l\67\2\u0234\u0233\3\2\2\2\u0234"+
		"\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0238\5\32\16\2\u0237\u0236\3"+
		"\2\2\2\u0237\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u023b\5\34\17\2\u023a"+
		"\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d\3\2\2\2\u023c\u023e\5\24"+
		"\13\2\u023d\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f"+
		"\u0241\5> \2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2"+
		"\2\u0242\u0244\5\26\f\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\u0246\3\2\2\2\u0245\u0247\5\30\r\2\u0246\u0245\3\2\2\2\u0246\u0247\3"+
		"\2\2\2\u0247\u0249\3\2\2\2\u0248\u024a\5r:\2\u0249\u0248\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024a\u0269\3\2\2\2\u024b\u024d\7\u01c7\2\2\u024c\u024b"+
		"\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250\5\22\n\2"+
		"\u024f\u024c\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252"+
		"\7^\2\2\u0252\u0253\7\u00b0\2\2\u0253\u0254\7\u0194\2\2\u0254\u0255\5"+
		"~@\2\u0255\u0256\7\u00d8\2\2\u0256\u0257\7\u0194\2\2\u0257\u025a\5~@\2"+
		"\u0258\u0259\7\u012f\2\2\u0259\u025b\5l\67\2\u025a\u0258\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b\u025d\3\2\2\2\u025c\u025e\5\34\17\2\u025d\u025c\3"+
		"\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\3\2\2\2\u025f\u0261\5> \2\u0260"+
		"\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263\3\2\2\2\u0262\u0264\5\26"+
		"\f\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\3\2\2\2\u0265"+
		"\u0267\5r:\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2\2"+
		"\2\u0268\u020d\3\2\2\2\u0268\u024f\3\2\2\2\u0269\t\3\2\2\2\u026a\u026e"+
		"\5\u00e0q\2\u026b\u026e\7\u01e5\2\2\u026c\u026e\7\u01e6\2\2\u026d\u026a"+
		"\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026c\3\2\2\2\u026e\13\3\2\2\2\u026f"+
		"\u0278\5\n\6\2\u0270\u0276\7\37\2\2\u0271\u0277\5\n\6\2\u0272\u0273\7"+
		"\4\2\2\u0273\u0274\5\n\6\2\u0274\u0275\7\5\2\2\u0275\u0277\3\2\2\2\u0276"+
		"\u0271\3\2\2\2\u0276\u0272\3\2\2\2\u0277\u0279\3\2\2\2\u0278\u0270\3\2"+
		"\2\2\u0278\u0279\3\2\2\2\u0279\r\3\2\2\2\u027a\u027c\7\u009c\2\2\u027b"+
		"\u027d\5\20\t\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0281\3"+
		"\2\2\2\u027e\u0281\7y\2\2\u027f\u0281\7z\2\2\u0280\u027a\3\2\2\2\u0280"+
		"\u027e\3\2\2\2\u0280\u027f\3\2\2\2\u0281\u0283\3\2\2\2\u0282\u0284\t\5"+
		"\2\2\u0283\u0282\3\2\2\2\u0283\u0284\3\2\2\2\u0284\17\3\2\2\2\u0285\u0286"+
		"\t\6\2\2\u0286\21\3\2\2\2\u0287\u0288\t\7\2\2\u0288\23\3\2\2\2\u0289\u028a"+
		"\7\u0140\2\2\u028a\u028b\7\u00a7\2\2\u028b\u028c\5\u00a6T\2\u028c\25\3"+
		"\2\2\2\u028d\u028e\7w\2\2\u028e\u028f\7\u0123\2\2\u028f\u0290\5\u00a6"+
		"T\2\u0290\27\3\2\2\2\u0291\u0292\7\u0128\2\2\u0292\u0293\7\67\2\2\u0293"+
		"\u0294\5\u00e4s\2\u0294\31\3\2\2\2\u0295\u0296\7H\2\2\u0296\u0297\7\u00b0"+
		"\2\2\u0297\u0298\7\u0136\2\2\u0298\u0299\7\35\2\2\u0299\u029a\5l\67\2"+
		"\u029a\33\3\2\2\2\u029b\u029c\7\u0179\2\2\u029c\u029d\7\4\2\2\u029d\u02a2"+
		"\5\36\20\2\u029e\u029f\7\6\2\2\u029f\u02a1\5\36\20\2\u02a0\u029e\3\2\2"+
		"\2\u02a1\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5"+
		"\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a6\7\5\2\2\u02a6\35\3\2\2\2\u02a7"+
		"\u02a8\5\u00e4s\2\u02a8\u02a9\7\u01cc\2\2\u02a9\u02aa\5\u00a6T\2\u02aa"+
		"\37\3\2\2\2\u02ab\u02ac\7\u01c7\2\2\u02ac\u02ad\7\u016f\2\2\u02ad\u02ae"+
		"\7\4\2\2\u02ae\u02af\5t;\2\u02af\u02b0\7\5\2\2\u02b0\u02c7\3\2\2\2\u02b1"+
		"\u02b2\7\u01c7\2\2\u02b2\u02b3\7\u00bf\2\2\u02b3\u02b4\7\4\2\2\u02b4\u02b5"+
		"\5t;\2\u02b5\u02b6\7\5\2\2\u02b6\u02c7\3\2\2\2\u02b7\u02b8\7\u01c7\2\2"+
		"\u02b8\u02b9\7\u00f8\2\2\u02b9\u02ba\7\4\2\2\u02ba\u02bb\5t;\2\u02bb\u02bc"+
		"\7\5\2\2\u02bc\u02c7\3\2\2\2\u02bd\u02be\7\u01c7\2\2\u02be\u02bf\7\63"+
		"\2\2\u02bf\u02c4\5\n\6\2\u02c0\u02c1\7\4\2\2\u02c1\u02c2\5t;\2\u02c2\u02c3"+
		"\7\5\2\2\u02c3\u02c5\3\2\2\2\u02c4\u02c0\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5"+
		"\u02c7\3\2\2\2\u02c6\u02ab\3\2\2\2\u02c6\u02b1\3\2\2\2\u02c6\u02b7\3\2"+
		"\2\2\u02c6\u02bd\3\2\2\2\u02c7!\3\2\2\2\u02c8\u02c9\7\u01c7\2\2\u02c9"+
		"\u02ca\7\u015e\2\2\u02ca\u02cf\5\n\6\2\u02cb\u02cc\7\4\2\2\u02cc\u02cd"+
		"\5t;\2\u02cd\u02ce\7\5\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02cb\3\2\2\2\u02cf"+
		"\u02d0\3\2\2\2\u02d0#\3\2\2\2\u02d1\u02d4\7^\2\2\u02d2\u02d3\7\u00f8\2"+
		"\2\u02d3\u02d5\5\u00caf\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5"+
		"\u02d6\3\2\2\2\u02d6\u02d7\7\u00cf\2\2\u02d7\u02d8\7\u01e5\2\2\u02d8\u02d9"+
		"\7\u00d8\2\2\u02d9\u02da\7\u0194\2\2\u02da\u02dd\5~@\2\u02db\u02dc\7\u012f"+
		"\2\2\u02dc\u02de\5l\67\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de"+
		"\u02e3\3\2\2\2\u02df\u02e0\7H\2\2\u02e0\u02e1\7\u019c\2\2\u02e1\u02e2"+
		"\7\67\2\2\u02e2\u02e4\7\u01e5\2\2\u02e3\u02df\3\2\2\2\u02e3\u02e4\3\2"+
		"\2\2\u02e4\u02e9\3\2\2\2\u02e5\u02e6\7\u00f4\2\2\u02e6\u02e7\7\u019c\2"+
		"\2\u02e7\u02e8\7\67\2\2\u02e8\u02ea\7\u01e5\2\2\u02e9\u02e5\3\2\2\2\u02e9"+
		"\u02ea\3\2\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02ed\5&\24\2\u02ec\u02eb\3\2"+
		"\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef\3\2\2\2\u02ee\u02f0\5l\67\2\u02ef"+
		"\u02ee\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02f3\5\34"+
		"\17\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f5\3\2\2\2\u02f4"+
		"\u02f6\5r:\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6%\3\2\2\2\u02f7"+
		"\u02f8\7\u00c9\2\2\u02f8\u02f9\7\u01ea\2\2\u02f9\u02fe\7\u00f4\2\2\u02fa"+
		"\u02fb\7\u00c9\2\2\u02fb\u02fc\7\u01ea\2\2\u02fc\u02fe\7\u016e\2\2\u02fd"+
		"\u02f7\3\2\2\2\u02fd\u02fa\3\2\2\2\u02fe\'\3\2\2\2\u02ff\u0300\7\u00d8"+
		"\2\2\u0300\u0301\7\u012a\2\2\u0301\u0305\5\u00c6d\2\u0302\u0303\7\u00ae"+
		"\2\2\u0303\u0304\7\35\2\2\u0304\u0306\5\u00e4s\2\u0305\u0302\3\2\2\2\u0305"+
		"\u0306\3\2\2\2\u0306\u0308\3\2\2\2\u0307\u0309\5r:\2\u0308\u0307\3\2\2"+
		"\2\u0308\u0309\3\2\2\2\u0309)\3\2\2\2\u030a\u030c\5\64\33\2\u030b\u030a"+
		"\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\5,\27\2\u030e"+
		"\u030f\5^\60\2\u030f+\3\2\2\2\u0310\u0311\b\27\1\2\u0311\u0312\5\60\31"+
		"\2\u0312\u031b\3\2\2\2\u0313\u0314\f\3\2\2\u0314\u0316\t\b\2\2\u0315\u0317"+
		"\5.\30\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"\u031a\5,\27\4\u0319\u0313\3\2\2\2\u031a\u031d\3\2\2\2\u031b\u0319\3\2"+
		"\2\2\u031b\u031c\3\2\2\2\u031c-\3\2\2\2\u031d\u031b\3\2\2\2\u031e\u0324"+
		"\7}\2\2\u031f\u0324\7\25\2\2\u0320\u0324\7\u0080\2\2\u0321\u0322\7\25"+
		"\2\2\u0322\u0324\7\u0097\2\2\u0323\u031e\3\2\2\2\u0323\u031f\3\2\2\2\u0323"+
		"\u0320\3\2\2\2\u0323\u0321\3\2\2\2\u0324/\3\2\2\2\u0325\u032c\5\62\32"+
		"\2\u0326\u0327\7\4\2\2\u0327\u0328\5*\26\2\u0328\u0329\7\5\2\2\u0329\u032c"+
		"\3\2\2\2\u032a\u032c\5\u00a0Q\2\u032b\u0325\3\2\2\2\u032b\u0326\3\2\2"+
		"\2\u032b\u032a\3\2\2\2\u032c\61\3\2\2\2\u032d\u032f\5:\36\2\u032e\u0330"+
		"\5@!\2\u032f\u032e\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0332\3\2\2\2\u0331"+
		"\u0333\5> \2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0335\3\2\2"+
		"\2\u0334\u0336\5J&\2\u0335\u0334\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0338"+
		"\3\2\2\2\u0337\u0339\5P)\2\u0338\u0337\3\2\2\2\u0338\u0339\3\2\2\2\u0339"+
		"\u033a\3\2\2\2\u033a\u033b\6\32\3\2\u033b\u033c\5^\60\2\u033c\63\3\2\2"+
		"\2\u033d\u033e\7\u01c7\2\2\u033e\u0343\5\66\34\2\u033f\u0340\7\6\2\2\u0340"+
		"\u0342\5\66\34\2\u0341\u033f\3\2\2\2\u0342\u0345\3\2\2\2\u0343\u0341\3"+
		"\2\2\2\u0343\u0344\3\2\2\2\u0344\65\3\2\2\2\u0345\u0343\3\2\2\2\u0346"+
		"\u0348\5\u00e4s\2\u0347\u0349\58\35\2\u0348\u0347\3\2\2\2\u0348\u0349"+
		"\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\7\35\2\2\u034b\u034c\7\4\2\2"+
		"\u034c\u034d\5*\26\2\u034d\u034e\7\5\2\2\u034e\67\3\2\2\2\u034f\u0350"+
		"\7\4\2\2\u0350\u0355\5\u00e4s\2\u0351\u0352\7\6\2\2\u0352\u0354\5\u00e4"+
		"s\2\u0353\u0351\3\2\2\2\u0354\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u0356\u0358\3\2\2\2\u0357\u0355\3\2\2\2\u0358\u0359\7\5"+
		"\2\2\u03599\3\2\2\2\u035a\u035c\7\u0175\2\2\u035b\u035d\5R*\2\u035c\u035b"+
		"\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035f\3\2\2\2\u035e\u0360\7}\2\2\u035f"+
		"\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362\5<"+
		"\37\2\u0362;\3\2\2\2\u0363\u036b\5\u00a4S\2\u0364\u0365\7\u01d5\2\2\u0365"+
		"\u0366\7\u0097\2\2\u0366\u0367\7\4\2\2\u0367\u0368\5\u00a4S\2\u0368\u0369"+
		"\7\5\2\2\u0369\u036b\3\2\2\2\u036a\u0363\3\2\2\2\u036a\u0364\3\2\2\2\u036b"+
		"=\3\2\2\2\u036c\u036d\7\u01c5\2\2\u036d\u036e\5\u00aaV\2\u036e?\3\2\2"+
		"\2\u036f\u0370\7\u00b0\2\2\u0370\u0375\5B\"\2\u0371\u0372\7\6\2\2\u0372"+
		"\u0374\5B\"\2\u0373\u0371\3\2\2\2\u0374\u0377\3\2\2\2\u0375\u0373\3\2"+
		"\2\2\u0375\u0376\3\2\2\2\u0376A\3\2\2\2\u0377\u0375\3\2\2\2\u0378\u037c"+
		"\5p9\2\u0379\u037b\5D#\2\u037a\u0379\3\2\2\2\u037b\u037e\3\2\2\2\u037c"+
		"\u037a\3\2\2\2\u037c\u037d\3\2\2\2\u037dC\3\2\2\2\u037e\u037c\3\2\2\2"+
		"\u037f\u0380\5h\65\2\u0380\u0382\7\u00e3\2\2\u0381\u0383\5F$\2\u0382\u0381"+
		"\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0386\5p9\2\u0385"+
		"\u0387\5j\66\2\u0386\u0385\3\2\2\2\u0386\u0387\3\2\2\2\u0387E\3\2\2\2"+
		"\u0388\u0389\7\b\2\2\u0389\u038a\5\u00e4s\2\u038a\u038b\7\t\2\2\u038b"+
		"\u0391\3\2\2\2\u038c\u038d\7\u01e1\2\2\u038d\u038e\5\u00e4s\2\u038e\u038f"+
		"\7\u01e2\2\2\u038f\u0391\3\2\2\2\u0390\u0388\3\2\2\2\u0390\u038c\3\2\2"+
		"\2\u0391G\3\2\2\2\u0392\u0393\7\b\2\2\u0393\u0398\5\u00e4s\2\u0394\u0395"+
		"\7\6\2\2\u0395\u0397\5\u00e4s\2\u0396\u0394\3\2\2\2\u0397\u039a\3\2\2"+
		"\2\u0398\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039b\3\2\2\2\u039a\u0398"+
		"\3\2\2\2\u039b\u039c\7\t\2\2\u039c\u03a9\3\2\2\2\u039d\u039e\7\u01e1\2"+
		"\2\u039e\u03a3\5\u00e4s\2\u039f\u03a0\7\6\2\2\u03a0\u03a2\5\u00e4s\2\u03a1"+
		"\u039f\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2"+
		"\2\2\u03a4\u03a6\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a6\u03a7\7\u01e2\2\2\u03a7"+
		"\u03a9\3\2\2\2\u03a8\u0392\3\2\2\2\u03a8\u039d\3\2\2\2\u03a9I\3\2\2\2"+
		"\u03aa\u03ab\7\u00ba\2\2\u03ab\u03ad\7\67\2\2\u03ac\u03ae\5L\'\2\u03ad"+
		"\u03ac\3\2\2\2\u03ad\u03ae\3\2\2\2\u03aeK\3\2\2\2\u03af\u03b0\7\u016b"+
		"\2\2\u03b0\u03b9\7\4\2\2\u03b1\u03b6\5\u00a6T\2\u03b2\u03b3\7\6\2\2\u03b3"+
		"\u03b5\5\u00a6T\2\u03b4\u03b2\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4"+
		"\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9"+
		"\u03b1\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03df\7\5"+
		"\2\2\u03bc\u03bd\7Y\2\2\u03bd\u03c6\7\4\2\2\u03be\u03c3\5\u00a6T\2\u03bf"+
		"\u03c0\7\6\2\2\u03c0\u03c2\5\u00a6T\2\u03c1\u03bf\3\2\2\2\u03c2\u03c5"+
		"\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5"+
		"\u03c3\3\2\2\2\u03c6\u03be\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\3\2"+
		"\2\2\u03c8\u03df\7\5\2\2\u03c9\u03ca\7\u00bb\2\2\u03ca\u03cb\7\u017a\2"+
		"\2\u03cb\u03cc\7\4\2\2\u03cc\u03d1\5N(\2\u03cd\u03ce\7\6\2\2\u03ce\u03d0"+
		"\5N(\2\u03cf\u03cd\3\2\2\2\u03d0\u03d3\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d1"+
		"\u03d2\3\2\2\2\u03d2\u03d4\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d4\u03d5\7\5"+
		"\2\2\u03d5\u03df\3\2\2\2\u03d6\u03db\5\u00a6T\2\u03d7\u03d8\7\6\2\2\u03d8"+
		"\u03da\5\u00a6T\2\u03d9\u03d7\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9"+
		"\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03df\3\2\2\2\u03dd\u03db\3\2\2\2\u03de"+
		"\u03af\3\2\2\2\u03de\u03bc\3\2\2\2\u03de\u03c9\3\2\2\2\u03de\u03d6\3\2"+
		"\2\2\u03dfM\3\2\2\2\u03e0\u03e9\7\4\2\2\u03e1\u03e6\5\u00a6T\2\u03e2\u03e3"+
		"\7\6\2\2\u03e3\u03e5\5\u00a6T\2\u03e4\u03e2\3\2\2\2\u03e5\u03e8\3\2\2"+
		"\2\u03e6\u03e4\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03ea\3\2\2\2\u03e8\u03e6"+
		"\3\2\2\2\u03e9\u03e1\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb"+
		"\u03ec\7\5\2\2\u03ecO\3\2\2\2\u03ed\u03ee\7\u00be\2\2\u03ee\u03ef\5\u00aa"+
		"V\2\u03efQ\3\2\2\2\u03f0\u03f1\7\u01e1\2\2\u03f1\u03f8\5T+\2\u03f2\u03f4"+
		"\7\6\2\2\u03f3\u03f2\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5"+
		"\u03f7\5T+\2\u03f6\u03f3\3\2\2\2\u03f7\u03fa\3\2\2\2\u03f8\u03f6\3\2\2"+
		"\2\u03f8\u03f9\3\2\2\2\u03f9\u03fb\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb\u03fc"+
		"\7\u01e2\2\2\u03fcS\3\2\2\2\u03fd\u040b\5\u00e4s\2\u03fe\u03ff\7\4\2\2"+
		"\u03ff\u0406\5V,\2\u0400\u0402\7\6\2\2\u0401\u0400\3\2\2\2\u0401\u0402"+
		"\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0405\5V,\2\u0404\u0401\3\2\2\2\u0405"+
		"\u0408\3\2\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0409\3\2"+
		"\2\2\u0408\u0406\3\2\2\2\u0409\u040a\7\5\2\2\u040a\u040c\3\2\2\2\u040b"+
		"\u03fe\3\2\2\2\u040b\u040c\3\2\2\2\u040cU\3\2\2\2\u040d\u0413\5\n\6\2"+
		"\u040e\u0411\7\u01cc\2\2\u040f\u0412\5\u00c6d\2\u0410\u0412\5\u00e4s\2"+
		"\u0411\u040f\3\2\2\2\u0411\u0410\3\2\2\2\u0412\u0414\3\2\2\2\u0413\u040e"+
		"\3\2\2\2\u0413\u0414\3\2\2\2\u0414W\3\2\2\2\u0415\u0416\5~@\2\u0416\u0419"+
		"\7\u01cc\2\2\u0417\u041a\5\u00a6T\2\u0418\u041a\7u\2\2\u0419\u0417\3\2"+
		"\2\2\u0419\u0418\3\2\2\2\u041aY\3\2\2\2\u041b\u0420\5X-\2\u041c\u041d"+
		"\7\6\2\2\u041d\u041f\5X-\2\u041e\u041c\3\2\2\2\u041f\u0422\3\2\2\2\u0420"+
		"\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421[\3\2\2\2\u0422\u0420\3\2\2\2"+
		"\u0423\u0424\7\u00ec\2\2\u0424\u0425\7\u01c1\2\2\u0425\u0426\5\u00e4s"+
		"\2\u0426\u042f\7\4\2\2\u0427\u042c\5\u00a6T\2\u0428\u0429\7\6\2\2\u0429"+
		"\u042b\5\u00a6T\2\u042a\u0428\3\2\2\2\u042b\u042e\3\2\2\2\u042c\u042a"+
		"\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u0430\3\2\2\2\u042e\u042c\3\2\2\2\u042f"+
		"\u0427\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0432\7\5"+
		"\2\2\u0432\u0433\5\u00e4s\2\u0433\u0434\7\35\2\2\u0434\u0435\5\u00e4s"+
		"\2\u0435]\3\2\2\2\u0436\u0438\5`\61\2\u0437\u0436\3\2\2\2\u0437\u0438"+
		"\3\2\2\2\u0438\u043a\3\2\2\2\u0439\u043b\5d\63\2\u043a\u0439\3\2\2\2\u043a"+
		"\u043b\3\2\2\2\u043b_\3\2\2\2\u043c\u043d\7\u0128\2\2\u043d\u043e\7\67"+
		"\2\2\u043e\u0443\5b\62\2\u043f\u0440\7\6\2\2\u0440\u0442\5b\62\2\u0441"+
		"\u043f\3\2\2\2\u0442\u0445\3\2\2\2\u0443\u0441\3\2\2\2\u0443\u0444\3\2"+
		"\2\2\u0444a\3\2\2\2\u0445\u0443\3\2\2\2\u0446\u0448\5\u00a6T\2\u0447\u0449"+
		"\t\t\2\2\u0448\u0447\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044c\3\2\2\2\u044a"+
		"\u044b\7\u011f\2\2\u044b\u044d\t\n\2\2\u044c\u044a\3\2\2\2\u044c\u044d"+
		"\3\2\2\2\u044dc\3\2\2\2\u044e\u044f\7\u00f3\2\2\u044f\u0459\7\u01ea\2"+
		"\2\u0450\u0451\7\u00f3\2\2\u0451\u0452\7\u01ea\2\2\u0452\u0453\7\u0122"+
		"\2\2\u0453\u0459\7\u01ea\2\2\u0454\u0455\7\u00f3\2\2\u0455\u0456\7\u01ea"+
		"\2\2\u0456\u0457\7\6\2\2\u0457\u0459\7\u01ea\2\2\u0458\u044e\3\2\2\2\u0458"+
		"\u0450\3\2\2\2\u0458\u0454\3\2\2\2\u0459e\3\2\2\2\u045a\u045b\7\u012f"+
		"\2\2\u045b\u045c\7\67\2\2\u045c\u0461\5\u00a6T\2\u045d\u045e\7\6\2\2\u045e"+
		"\u0460\5\u00a6T\2\u045f\u045d\3\2\2\2\u0460\u0463\3\2\2\2\u0461\u045f"+
		"\3\2\2\2\u0461\u0462\3\2\2\2\u0462g\3\2\2\2\u0463\u0461\3\2\2\2\u0464"+
		"\u0466\7\u00d0\2\2\u0465\u0464\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u047d"+
		"\3\2\2\2\u0467\u047d\7X\2\2\u0468\u046a\7\u00ef\2\2\u0469\u046b\7\u0129"+
		"\2\2\u046a\u0469\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u047d\3\2\2\2\u046c"+
		"\u046e\7\u0166\2\2\u046d\u046f\7\u0129\2\2\u046e\u046d\3\2\2\2\u046e\u046f"+
		"\3\2\2\2\u046f\u047d\3\2\2\2\u0470\u0472\7\u00b3\2\2\u0471\u0473\7\u0129"+
		"\2\2\u0472\u0471\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u047d\3\2\2\2\u0474"+
		"\u0475\7\u00ef\2\2\u0475\u047d\7\u0176\2\2\u0476\u0477\7\u0166\2\2\u0477"+
		"\u047d\7\u0176\2\2\u0478\u0479\7\u00ef\2\2\u0479\u047d\7\32\2\2\u047a"+
		"\u047b\7\u0166\2\2\u047b\u047d\7\32\2\2\u047c\u0465\3\2\2\2\u047c\u0467"+
		"\3\2\2\2\u047c\u0468\3\2\2\2\u047c\u046c\3\2\2\2\u047c\u0470\3\2\2\2\u047c"+
		"\u0474\3\2\2\2\u047c\u0476\3\2\2\2\u047c\u0478\3\2\2\2\u047c\u047a\3\2"+
		"\2\2\u047di\3\2\2\2\u047e\u047f\7\u0123\2\2\u047f\u0483\5\u00aaV\2\u0480"+
		"\u0481\7\u01ba\2\2\u0481\u0483\5l\67\2\u0482\u047e\3\2\2\2\u0482\u0480"+
		"\3\2\2\2\u0483k\3\2\2\2\u0484\u0485\7\4\2\2\u0485\u0486\5n8\2\u0486\u0487"+
		"\7\5\2\2\u0487m\3\2\2\2\u0488\u048d\5\u00e0q\2\u0489\u048a\7\6\2\2\u048a"+
		"\u048c\5\u00e0q\2\u048b\u0489\3\2\2\2\u048c\u048f\3\2\2\2\u048d\u048b"+
		"\3\2\2\2\u048d\u048e\3\2\2\2\u048eo\3\2\2\2\u048f\u048d\3\2\2\2\u0490"+
		"\u0492\5~@\2\u0491\u0493\5\u00c4c\2\u0492\u0491\3\2\2\2\u0492\u0493\3"+
		"\2\2\2\u0493\u0495\3\2\2\2\u0494\u0496\5\u009eP\2\u0495\u0494\3\2\2\2"+
		"\u0495\u0496\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0499\5|?\2\u0498\u049a"+
		"\5\u00dco\2\u0499\u0498\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049c\3\2\2"+
		"\2\u049b\u049d\5H%\2\u049c\u049b\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u04a1"+
		"\3\2\2\2\u049e\u04a0\5\\/\2\u049f\u049e\3\2\2\2\u04a0\u04a3\3\2\2\2\u04a1"+
		"\u049f\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04b7\3\2\2\2\u04a3\u04a1\3\2"+
		"\2\2\u04a4\u04a5\7\4\2\2\u04a5\u04a6\5*\26\2\u04a6\u04a7\7\5\2\2\u04a7"+
		"\u04ab\5|?\2\u04a8\u04aa\5\\/\2\u04a9\u04a8\3\2\2\2\u04aa\u04ad\3\2\2"+
		"\2\u04ab\u04a9\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04b7\3\2\2\2\u04ad\u04ab"+
		"\3\2\2\2\u04ae\u04af\5\u00e4s\2\u04af\u04b1\7\4\2\2\u04b0\u04b2\5t;\2"+
		"\u04b1\u04b0\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4"+
		"\7\5\2\2\u04b4\u04b5\5|?\2\u04b5\u04b7\3\2\2\2\u04b6\u0490\3\2\2\2\u04b6"+
		"\u04a4\3\2\2\2\u04b6\u04ae\3\2\2\2\u04b7q\3\2\2\2\u04b8\u04b9\7\u0146"+
		"\2\2\u04b9\u04ba\7\4\2\2\u04ba\u04bb\5t;\2\u04bb\u04bc\7\5\2\2\u04bcs"+
		"\3\2\2\2\u04bd\u04c2\5v<\2\u04be\u04bf\7\6\2\2\u04bf\u04c1\5v<\2\u04c0"+
		"\u04be\3\2\2\2\u04c1\u04c4\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c3\3\2"+
		"\2\2\u04c3u\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c5\u04c6\5x=\2\u04c6\u04c7"+
		"\7\u01cc\2\2\u04c7\u04c8\5z>\2\u04c8w\3\2\2\2\u04c9\u04cc\5\u00e4s\2\u04ca"+
		"\u04cc\5\u00c6d\2\u04cb\u04c9\3\2\2\2\u04cb\u04ca\3\2\2\2\u04ccy\3\2\2"+
		"\2\u04cd\u04d0\5\u00e4s\2\u04ce\u04d0\5\u00c6d\2\u04cf\u04cd\3\2\2\2\u04cf"+
		"\u04ce\3\2\2\2\u04d0{\3\2\2\2\u04d1\u04d3\7\35\2\2\u04d2\u04d1\3\2\2\2"+
		"\u04d2\u04d3\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d6\5\u00e6t\2\u04d5"+
		"\u04d7\5l\67\2\u04d6\u04d5\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d9\3\2"+
		"\2\2\u04d8\u04d2\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9}\3\2\2\2\u04da\u04df"+
		"\5\u00e0q\2\u04db\u04dc\7\7\2\2\u04dc\u04de\5\u00e0q\2\u04dd\u04db\3\2"+
		"\2\2\u04de\u04e1\3\2\2\2\u04df\u04dd\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0"+
		"\177\3\2\2\2\u04e1\u04df\3\2\2\2\u04e2\u04e7\5\u0082B\2\u04e3\u04e4\7"+
		"\6\2\2\u04e4\u04e6\5\u0082B\2\u04e5\u04e3\3\2\2\2\u04e6\u04e9\3\2\2\2"+
		"\u04e7\u04e5\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u0081\3\2\2\2\u04e9\u04e7"+
		"\3\2\2\2\u04ea\u04eb\5\u00e4s\2\u04eb\u04ed\5\u00d2j\2\u04ec\u04ee\7\u00e6"+
		"\2\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04f0\3\2\2\2\u04ef"+
		"\u04f1\5\u009cO\2\u04f0\u04ef\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f5"+
		"\3\2\2\2\u04f2\u04f3\7\u011d\2\2\u04f3\u04f6\7\u011e\2\2\u04f4\u04f6\7"+
		"\u011e\2\2\u04f5\u04f2\3\2\2\2\u04f5\u04f4\3\2\2\2\u04f5\u04f6\3\2\2\2"+
		"\u04f6\u0504\3\2\2\2\u04f7\u0502\7u\2\2\u04f8\u0503\7\u011e\2\2\u04f9"+
		"\u0503\7\u01ea\2\2\u04fa\u0503\7\u01e5\2\2\u04fb\u0500\7\\\2\2\u04fc\u04fd"+
		"\7\4\2\2\u04fd\u04fe\5\u00eav\2\u04fe\u04ff\7\5\2\2\u04ff\u0501\3\2\2"+
		"\2\u0500\u04fc\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0503\3\2\2\2\u0502\u04f8"+
		"\3\2\2\2\u0502\u04f9\3\2\2\2\u0502\u04fa\3\2\2\2\u0502\u04fb\3\2\2\2\u0503"+
		"\u0505\3\2\2\2\u0504\u04f7\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0508\3\2"+
		"\2\2\u0506\u0507\7I\2\2\u0507\u0509\7\u01e5\2\2\u0508\u0506\3\2\2\2\u0508"+
		"\u0509\3\2\2\2\u0509\u0083\3\2\2\2\u050a\u050f\5\u0086D\2\u050b\u050c"+
		"\7\6\2\2\u050c\u050e\5\u0086D\2\u050d\u050b\3\2\2\2\u050e\u0511\3\2\2"+
		"\2\u050f\u050d\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0085\3\2\2\2\u0511\u050f"+
		"\3\2\2\2\u0512\u0513\7\u00cd\2\2\u0513\u0514\5\u00e4s\2\u0514\u0517\5"+
		"l\67\2\u0515\u0516\7\u01ba\2\2\u0516\u0518\7,\2\2\u0517\u0515\3\2\2\2"+
		"\u0517\u0518\3\2\2\2\u0518\u051a\3\2\2\2\u0519\u051b\7\u01e5\2\2\u051a"+
		"\u0519\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u0087\3\2\2\2\u051c\u0521\5\u008a"+
		"F\2\u051d\u051e\7\6\2\2\u051e\u0520\5\u008aF\2\u051f\u051d\3\2\2\2\u0520"+
		"\u0523\3\2\2\2\u0521\u051f\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0089\3\2"+
		"\2\2\u0523\u0521\3\2\2\2\u0524\u0529\5\u008cG\2\u0525\u0529\5\u008eH\2"+
		"\u0526\u0529\5\u0090I\2\u0527\u0529\5\u0092J\2\u0528\u0524\3\2\2\2\u0528"+
		"\u0525\3\2\2\2\u0528\u0526\3\2\2\2\u0528\u0527\3\2\2\2\u0529\u052b\3\2"+
		"\2\2\u052a\u052c\5r:\2\u052b\u052a\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u008b"+
		"\3\2\2\2\u052d\u0531\7\u012f\2\2\u052e\u052f\7\u00c8\2\2\u052f\u0530\7"+
		"\u011d\2\2\u0530\u0532\7\u009a\2\2\u0531\u052e\3\2\2\2\u0531\u0532\3\2"+
		"\2\2\u0532\u0533\3\2\2\2\u0533\u0534\5\u00e4s\2\u0534\u0535\7\u01bc\2"+
		"\2\u0535\u0536\7\u00f0\2\2\u0536\u0539\7\u019e\2\2\u0537\u053a\7\u0109"+
		"\2\2\u0538\u053a\5\u0094K\2\u0539\u0537\3\2\2\2\u0539\u0538\3\2\2\2\u053a"+
		"\u008d\3\2\2\2\u053b\u053f\7\u012f\2\2\u053c\u053d\7\u00c8\2\2\u053d\u053e"+
		"\7\u011d\2\2\u053e\u0540\7\u009a\2\2\u053f\u053c\3\2\2\2\u053f\u0540\3"+
		"\2\2\2\u0540\u0541\3\2\2\2\u0541\u0542\5\u00e4s\2\u0542\u0543\7\u01bc"+
		"\2\2\u0543\u0544\7\b\2\2\u0544\u0545\5\u0094K\2\u0545\u0546\7\6\2\2\u0546"+
		"\u0547\5\u0094K\2\u0547\u0548\7\5\2\2\u0548\u008f\3\2\2\2\u0549\u054a"+
		"\7\u00b0\2\2\u054a\u054b\5\u0094K\2\u054b\u054c\7\u01a5\2\2\u054c\u054d"+
		"\5\u0094K\2\u054d\u054e\7\u00d7\2\2\u054e\u0550\7\u01ea\2\2\u054f\u0551"+
		"\5\u00b2Z\2\u0550\u054f\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0091\3\2\2"+
		"\2\u0552\u0556\7\u012f\2\2\u0553\u0554\7\u00c8\2\2\u0554\u0555\7\u011d"+
		"\2\2\u0555\u0557\7\u009a\2\2\u0556\u0553\3\2\2\2\u0556\u0557\3\2\2\2\u0557"+
		"\u0558\3\2\2\2\u0558\u0559\5\u00e4s\2\u0559\u055a\7\u01bc\2\2\u055a\u0567"+
		"\7\u00cb\2\2\u055b\u055c\7\4\2\2\u055c\u0561\5\u0094K\2\u055d\u055e\7"+
		"\6\2\2\u055e\u0560\5\u0094K\2\u055f\u055d\3\2\2\2\u0560\u0563\3\2\2\2"+
		"\u0561\u055f\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0564\3\2\2\2\u0563\u0561"+
		"\3\2\2\2\u0564\u0565\7\5\2\2\u0565\u0568\3\2\2\2\u0566\u0568\5\u0094K"+
		"\2\u0567\u055b\3\2\2\2\u0567\u0566\3\2\2\2\u0568\u0093\3\2\2\2\u0569\u056a"+
		"\7\4\2\2\u056a\u056f\5\u0096L\2\u056b\u056c\7\6\2\2\u056c\u056e\5\u0096"+
		"L\2\u056d\u056b\3\2\2\2\u056e\u0571\3\2\2\2\u056f\u056d\3\2\2\2\u056f"+
		"\u0570\3\2\2\2\u0570\u0572\3\2\2\2\u0571\u056f\3\2\2\2\u0572\u0573\7\5"+
		"\2\2\u0573\u0095\3\2\2\2\u0574\u0575\t\13\2\2\u0575\u0097\3\2\2\2\u0576"+
		"\u057b\5\u009aN\2\u0577\u0578\7\6\2\2\u0578\u057a\5\u009aN\2\u0579\u0577"+
		"\3\2\2\2\u057a\u057d\3\2\2\2\u057b\u0579\3\2\2\2\u057b\u057c\3\2\2\2\u057c"+
		"\u0099\3\2\2\2\u057d\u057b\3\2\2\2\u057e\u057f\5\u00e4s\2\u057f\u0583"+
		"\5l\67\2\u0580\u0581\7\u0089\2\2\u0581\u0582\7\u00e6\2\2\u0582\u0584\5"+
		"l\67\2\u0583\u0580\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0586\3\2\2\2\u0585"+
		"\u0587\5r:\2\u0586\u0585\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u009b\3\2\2"+
		"\2\u0588\u0589\t\f\2\2\u0589\u009d\3\2\2\2\u058a\u058b\7\u0197\2\2\u058b"+
		"\u058c\7\4\2\2\u058c\u0591\7\u01ea\2\2\u058d\u058e\7\6\2\2\u058e\u0590"+
		"\7\u01ea\2\2\u058f\u058d\3\2\2\2\u0590\u0593\3\2\2\2\u0591\u058f\3\2\2"+
		"\2\u0591\u0592\3\2\2\2\u0592\u0594\3\2\2\2\u0593\u0591\3\2\2\2\u0594\u0595"+
		"\7\5\2\2\u0595\u009f\3\2\2\2\u0596\u0597\7\u01bc\2\2\u0597\u059c\5\u00ac"+
		"W\2\u0598\u0599\7\6\2\2\u0599\u059b\5\u00acW\2\u059a\u0598\3\2\2\2\u059b"+
		"\u059e\3\2\2\2\u059c\u059a\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u00a1\3\2"+
		"\2\2\u059e\u059c\3\2\2\2\u059f\u05a4\5\u00a6T\2\u05a0\u05a2\7\35\2\2\u05a1"+
		"\u05a0\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a5\5\n"+
		"\6\2\u05a4\u05a1\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u00a3\3\2\2\2\u05a6"+
		"\u05ab\5\u00a2R\2\u05a7\u05a8\7\6\2\2\u05a8\u05aa\5\u00a2R\2\u05a9\u05a7"+
		"\3\2\2\2\u05aa\u05ad\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac"+
		"\u00a5\3\2\2\2\u05ad\u05ab\3\2\2\2\u05ae\u05b1\5\u00aaV\2\u05af\u05b1"+
		"\5\u00a8U\2\u05b0\u05ae\3\2\2\2\u05b0\u05af\3\2\2\2\u05b1\u00a7\3\2\2"+
		"\2\u05b2\u05b3\5\u00e0q\2\u05b3\u05b4\7\u01e0\2\2\u05b4\u05b5\5\u00aa"+
		"V\2\u05b5\u05c3\3\2\2\2\u05b6\u05b7\7\4\2\2\u05b7\u05ba\5\u00e0q\2\u05b8"+
		"\u05b9\7\6\2\2\u05b9\u05bb\5\u00e0q\2\u05ba\u05b8\3\2\2\2\u05bb\u05bc"+
		"\3\2\2\2\u05bc\u05ba\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05be\3\2\2\2\u05be"+
		"\u05bf\7\5\2\2\u05bf\u05c0\7\u01e0\2\2\u05c0\u05c1\5\u00aaV\2\u05c1\u05c3"+
		"\3\2\2\2\u05c2\u05b2\3\2\2\2\u05c2\u05b6\3\2\2\2\u05c3\u00a9\3\2\2\2\u05c4"+
		"\u05c5\bV\1\2\u05c5\u05c6\t\r\2\2\u05c6\u05db\5\u00aaV\n\u05c7\u05c8\7"+
		"\u009a\2\2\u05c8\u05c9\7\4\2\2\u05c9\u05ca\5*\26\2\u05ca\u05cb\7\5\2\2"+
		"\u05cb\u05db\3\2\2\2\u05cc\u05cd\t\16\2\2\u05cd\u05ce\7\4\2\2\u05ce\u05cf"+
		"\5\u00b0Y\2\u05cf\u05d0\7\5\2\2\u05d0\u05db\3\2\2\2\u05d1\u05d2\7\u00dd"+
		"\2\2\u05d2\u05d3\7\4\2\2\u05d3\u05d4\5\u00b0Y\2\u05d4\u05d5\7\5\2\2\u05d5"+
		"\u05db\3\2\2\2\u05d6\u05d8\5\u00b0Y\2\u05d7\u05d9\5\u00aeX\2\u05d8\u05d7"+
		"\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05db\3\2\2\2\u05da\u05c4\3\2\2\2\u05da"+
		"\u05c7\3\2\2\2\u05da\u05cc\3\2\2\2\u05da\u05d1\3\2\2\2\u05da\u05d6\3\2"+
		"\2\2\u05db\u05e7\3\2\2\2\u05dc\u05dd\f\5\2\2\u05dd\u05de\t\17\2\2\u05de"+
		"\u05e6\5\u00aaV\6\u05df\u05e0\f\4\2\2\u05e0\u05e1\7\u0127\2\2\u05e1\u05e6"+
		"\5\u00aaV\5\u05e2\u05e3\f\3\2\2\u05e3\u05e4\7\u01dd\2\2\u05e4\u05e6\5"+
		"\u00aaV\4\u05e5\u05dc\3\2\2\2\u05e5\u05df\3\2\2\2\u05e5\u05e2\3\2\2\2"+
		"\u05e6\u05e9\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u00ab"+
		"\3\2\2\2\u05e9\u05e7\3\2\2\2\u05ea\u05eb\7\4\2\2\u05eb\u05f0\5\u00a2R"+
		"\2\u05ec\u05ed\7\6\2\2\u05ed\u05ef\5\u00a2R\2\u05ee\u05ec\3\2\2\2\u05ef"+
		"\u05f2\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f3\3\2"+
		"\2\2\u05f2\u05f0\3\2\2\2\u05f3\u05f4\7\5\2\2\u05f4\u00ad\3\2\2\2\u05f5"+
		"\u05f7\7\u011d\2\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8"+
		"\3\2\2\2\u05f8\u05f9\7\'\2\2\u05f9\u05fa\5\u00b0Y\2\u05fa\u05fb\7\31\2"+
		"\2\u05fb\u05fc\5\u00b0Y\2\u05fc\u0624\3\2\2\2\u05fd\u05ff\7\u011d\2\2"+
		"\u05fe\u05fd\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0601"+
		"\t\20\2\2\u0601\u0624\5\u00b0Y\2\u0602\u0604\7\u011d\2\2\u0603\u0602\3"+
		"\2\2\2\u0603\u0604\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0606\t\21\2\2\u0606"+
		"\u0624\5\u00b0Y\2\u0607\u0609\7\u011d\2\2\u0608\u0607\3\2\2\2\u0608\u0609"+
		"\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060b\7\u00cb\2\2\u060b\u060c\7\4\2"+
		"\2\u060c\u060d\5*\26\2\u060d\u060e\7\5\2\2\u060e\u0624\3\2\2\2\u060f\u0611"+
		"\7\u011d\2\2\u0610\u060f\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0612\3\2\2"+
		"\2\u0612\u0613\7\u00cb\2\2\u0613\u0614\7\4\2\2\u0614\u0619\5\u00a6T\2"+
		"\u0615\u0616\7\6\2\2\u0616\u0618\5\u00a6T\2\u0617\u0615\3\2\2\2\u0618"+
		"\u061b\3\2\2\2\u0619\u0617\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061c\3\2"+
		"\2\2\u061b\u0619\3\2\2\2\u061c\u061d\7\5\2\2\u061d\u0624\3\2\2\2\u061e"+
		"\u0620\7\u00dc\2\2\u061f\u0621\7\u011d\2\2\u0620\u061f\3\2\2\2\u0620\u0621"+
		"\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0624\7\u011e\2\2\u0623\u05f6\3\2\2"+
		"\2\u0623\u05fe\3\2\2\2\u0623\u0603\3\2\2\2\u0623\u0608\3\2\2\2\u0623\u0610"+
		"\3\2\2\2\u0623\u061e\3\2\2\2\u0624\u00af\3\2\2\2\u0625\u0626\bY\1\2\u0626"+
		"\u0631\5\u00b4[\2\u0627\u0628\t\22\2\2\u0628\u0631\5\u00b0Y\7\u0629\u062a"+
		"\t\23\2\2\u062a\u062b\7\4\2\2\u062b\u062c\5\u00b0Y\2\u062c\u062d\7\6\2"+
		"\2\u062d\u062e\5\u00b0Y\2\u062e\u062f\7\5\2\2\u062f\u0631\3\2\2\2\u0630"+
		"\u0625\3\2\2\2\u0630\u0627\3\2\2\2\u0630\u0629\3\2\2\2\u0631\u063e\3\2"+
		"\2\2\u0632\u0633\f\6\2\2\u0633\u0634\t\24\2\2\u0634\u063d\5\u00b0Y\7\u0635"+
		"\u0636\f\5\2\2\u0636\u0637\t\25\2\2\u0637\u063d\5\u00b0Y\6\u0638\u0639"+
		"\f\4\2\2\u0639\u063a\5\u00c8e\2\u063a\u063b\5\u00b0Y\5\u063b\u063d\3\2"+
		"\2\2\u063c\u0632\3\2\2\2\u063c\u0635\3\2\2\2\u063c\u0638\3\2\2\2\u063d"+
		"\u0640\3\2\2\2\u063e\u063c\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u00b1\3\2"+
		"\2\2\u0640\u063e\3\2\2\2\u0641\u0642\t\26\2\2\u0642\u00b3\3\2\2\2\u0643"+
		"\u0644\b[\1\2\u0644\u0645\t\27\2\2\u0645\u0646\7\4\2\2\u0646\u0647\5\u00b2"+
		"Z\2\u0647\u0648\7\6\2\2\u0648\u0649\5\u00b0Y\2\u0649\u064a\7\6\2\2\u064a"+
		"\u064b\5\u00b0Y\2\u064b\u064c\7\5\2\2\u064c\u0712\3\2\2\2\u064d\u064e"+
		"\t\30\2\2\u064e\u064f\7\4\2\2\u064f\u0650\5\u00b2Z\2\u0650\u0651\7\6\2"+
		"\2\u0651\u0652\5\u00b0Y\2\u0652\u0653\7\6\2\2\u0653\u0654\5\u00b0Y\2\u0654"+
		"\u0655\7\5\2\2\u0655\u0712\3\2\2\2\u0656\u0657\t\31\2\2\u0657\u0658\7"+
		"\4\2\2\u0658\u0659\5\u00b0Y\2\u0659\u065f\7\6\2\2\u065a\u065b\7\u00d7"+
		"\2\2\u065b\u065c\5\u00b0Y\2\u065c\u065d\5\u00b2Z\2\u065d\u0660\3\2\2\2"+
		"\u065e\u0660\5\u00b0Y\2\u065f\u065a\3\2\2\2\u065f\u065e\3\2\2\2\u0660"+
		"\u0661\3\2\2\2\u0661\u0662\7\5\2\2\u0662\u0712\3\2\2\2\u0663\u0664\t\32"+
		"\2\2\u0664\u0665\7\4\2\2\u0665\u0666\5\u00b0Y\2\u0666\u066c\7\6\2\2\u0667"+
		"\u0668\7\u00d7\2\2\u0668\u0669\5\u00b0Y\2\u0669\u066a\5\u00b2Z\2\u066a"+
		"\u066d\3\2\2\2\u066b\u066d\5\u00b0Y\2\u066c\u0667\3\2\2\2\u066c\u066b"+
		"\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u066f\7\5\2\2\u066f\u0712\3\2\2\2\u0670"+
		"\u0671\7e\2\2\u0671\u0672\7\4\2\2\u0672\u0673\5\u00b0Y\2\u0673\u0679\7"+
		"\6\2\2\u0674\u0675\7\u00d7\2\2\u0675\u0676\5\u00b0Y\2\u0676\u0677\5\u00b2"+
		"Z\2\u0677\u067a\3\2\2\2\u0678\u067a\5\u00b0Y\2\u0679\u0674\3\2\2\2\u0679"+
		"\u0678\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067c\7\5\2\2\u067c\u0712\3\2"+
		"\2\2\u067d\u067e\7c\2\2\u067e\u067f\7\4\2\2\u067f\u0680\5\u00b0Y\2\u0680"+
		"\u0686\7\6\2\2\u0681\u0682\7\u00d7\2\2\u0682\u0683\5\u00b0Y\2\u0683\u0684"+
		"\5\u00b2Z\2\u0684\u0687\3\2\2\2\u0685\u0687\5\u00b0Y\2\u0686\u0681\3\2"+
		"\2\2\u0686\u0685\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u0689\7\5\2\2\u0689"+
		"\u0712\3\2\2\2\u068a\u068c\7:\2\2\u068b\u068d\5\u00ccg\2\u068c\u068b\3"+
		"\2\2\2\u068d\u068e\3\2\2\2\u068e\u068c\3\2\2\2\u068e\u068f\3\2\2\2\u068f"+
		"\u0692\3\2\2\2\u0690\u0691\7\u008b\2\2\u0691\u0693\5\u00a6T\2\u0692\u0690"+
		"\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0695\7\u008f\2"+
		"\2\u0695\u0712\3\2\2\2\u0696\u0697\7:\2\2\u0697\u0699\5\u00a6T\2\u0698"+
		"\u069a\5\u00ccg\2\u0699\u0698\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u0699"+
		"\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069f\3\2\2\2\u069d\u069e\7\u008b\2"+
		"\2\u069e\u06a0\5\u00a6T\2\u069f\u069d\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0"+
		"\u06a1\3\2\2\2\u06a1\u06a2\7\u008f\2\2\u06a2\u0712\3\2\2\2\u06a3\u06a4"+
		"\7;\2\2\u06a4\u06a5\7\4\2\2\u06a5\u06a6\5\u00a6T\2\u06a6\u06a7\7\35\2"+
		"\2\u06a7\u06a8\5\u00d2j\2\u06a8\u06a9\7\5\2\2\u06a9\u0712\3\2\2\2\u06aa"+
		"\u0712\5\u00c6d\2\u06ab\u0712\5\u00ceh\2\u06ac\u0712\7\u01d5\2\2\u06ad"+
		"\u06ae\5\u00c2b\2\u06ae\u06af\7\7\2\2\u06af\u06b0\7\u01d5\2\2\u06b0\u0712"+
		"\3\2\2\2\u06b1\u06b2\7?\2\2\u06b2\u06b3\7\4\2\2\u06b3\u06b8\5\u00a6T\2"+
		"\u06b4\u06b5\7\6\2\2\u06b5\u06b7\5\u00a6T\2\u06b6\u06b4\3\2\2\2\u06b7"+
		"\u06ba\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06bd\3\2"+
		"\2\2\u06ba\u06b8\3\2\2\2\u06bb\u06bc\7\u01ba\2\2\u06bc\u06be\5\n\6\2\u06bd"+
		"\u06bb\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c0\7\5"+
		"\2\2\u06c0\u0712\3\2\2\2\u06c1\u06c2\7R\2\2\u06c2\u06c3\7\4\2\2\u06c3"+
		"\u06c4\5\u00a6T\2\u06c4\u06c5\7\u01ba\2\2\u06c5\u06c6\5\n\6\2\u06c6\u06c7"+
		"\7\5\2\2\u06c7\u0712\3\2\2\2\u06c8\u06c9\7R\2\2\u06c9\u06ca\7\4\2\2\u06ca"+
		"\u06cb\5\u00a6T\2\u06cb\u06cc\7\6\2\2\u06cc\u06cd\5\u00d2j\2\u06cd\u06ce"+
		"\7\5\2\2\u06ce\u0712\3\2\2\2\u06cf\u06d0\5\u00b6\\\2\u06d0\u06e8\7\4\2"+
		"\2\u06d1\u06d3\t\33\2\2\u06d2\u06d1\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3"+
		"\u06d4\3\2\2\2\u06d4\u06d9\5\u00a6T\2\u06d5\u06d6\7\6\2\2\u06d6\u06d8"+
		"\5\u00a6T\2\u06d7\u06d5\3\2\2\2\u06d8\u06db\3\2\2\2\u06d9\u06d7\3\2\2"+
		"\2\u06d9\u06da\3\2\2\2\u06da\u06e6\3\2\2\2\u06db\u06d9\3\2\2\2\u06dc\u06dd"+
		"\7\u0128\2\2\u06dd\u06de\7\67\2\2\u06de\u06e3\5b\62\2\u06df\u06e0\7\6"+
		"\2\2\u06e0\u06e2\5b\62\2\u06e1\u06df\3\2\2\2\u06e2\u06e5\3\2\2\2\u06e3"+
		"\u06e1\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e7\3\2\2\2\u06e5\u06e3\3\2"+
		"\2\2\u06e6\u06dc\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e9\3\2\2\2\u06e8"+
		"\u06d2\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06ed\7\5"+
		"\2\2\u06eb\u06ec\7\u012b\2\2\u06ec\u06ee\5\u00ba^\2\u06ed\u06eb\3\2\2"+
		"\2\u06ed\u06ee\3\2\2\2\u06ee\u0712\3\2\2\2\u06ef\u06f0\7\4\2\2\u06f0\u06f1"+
		"\5*\26\2\u06f1\u06f2\7\5\2\2\u06f2\u0712\3\2\2\2\u06f3\u06f4\7\u01e3\2"+
		"\2\u06f4\u0712\5\n\6\2\u06f5\u06f8\7\u01e4\2\2\u06f6\u06f7\t\34\2\2\u06f7"+
		"\u06f9\7\7\2\2\u06f8\u06f6\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u06fa\3\2"+
		"\2\2\u06fa\u0712\5\u00e4s\2\u06fb\u0712\5\u00e4s\2\u06fc\u06fd\7\4\2\2"+
		"\u06fd\u06fe\5\u00a6T\2\u06fe\u06ff\7\5\2\2\u06ff\u0712\3\2\2\2\u0700"+
		"\u0704\7\u00e6\2\2\u0701\u0702\5\u00e4s\2\u0702\u0703\7\7\2\2\u0703\u0705"+
		"\3\2\2\2\u0704\u0701\3\2\2\2\u0704\u0705\3\2\2\2\u0705\u0706\3\2\2\2\u0706"+
		"\u0712\5\u00e4s\2\u0707\u0708\7\u00a0\2\2\u0708\u0709\7\4\2\2\u0709\u070a"+
		"\5\u00e4s\2\u070a\u070c\7\u00b0\2\2\u070b\u070d\t\35\2\2\u070c\u070b\3"+
		"\2\2\2\u070c\u070d\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u070f\5\u00b0Y\2"+
		"\u070f\u0710\7\5\2\2\u0710\u0712\3\2\2\2\u0711\u0643\3\2\2\2\u0711\u064d"+
		"\3\2\2\2\u0711\u0656\3\2\2\2\u0711\u0663\3\2\2\2\u0711\u0670\3\2\2\2\u0711"+
		"\u067d\3\2\2\2\u0711\u068a\3\2\2\2\u0711\u0696\3\2\2\2\u0711\u06a3\3\2"+
		"\2\2\u0711\u06aa\3\2\2\2\u0711\u06ab\3\2\2\2\u0711\u06ac\3\2\2\2\u0711"+
		"\u06ad\3\2\2\2\u0711\u06b1\3\2\2\2\u0711\u06c1\3\2\2\2\u0711\u06c8\3\2"+
		"\2\2\u0711\u06cf\3\2\2\2\u0711\u06ef\3\2\2\2\u0711\u06f3\3\2\2\2\u0711"+
		"\u06f5\3\2\2\2\u0711\u06fb\3\2\2\2\u0711\u06fc\3\2\2\2\u0711\u0700\3\2"+
		"\2\2\u0711\u0707\3\2\2\2\u0712\u072d\3\2\2\2\u0713\u0714\f\r\2\2\u0714"+
		"\u0715\7\b\2\2\u0715\u0716\5\u00b0Y\2\u0716\u0717\7\t\2\2\u0717\u072c"+
		"\3\2\2\2\u0718\u0719\f\f\2\2\u0719\u071a\7\b\2\2\u071a\u071b\5\u00b0Y"+
		"\2\u071b\u071d\7\u01df\2\2\u071c\u071e\5\u00b0Y\2\u071d\u071c\3\2\2\2"+
		"\u071d\u071e\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u0720\7\t\2\2\u0720\u072c"+
		"\3\2\2\2\u0721\u0722\f\7\2\2\u0722\u0723\7\7\2\2\u0723\u072c\5\u00e4s"+
		"\2\u0724\u0725\f\3\2\2\u0725\u0729\7E\2\2\u0726\u072a\5\u00e4s\2\u0727"+
		"\u072a\7\u01e5\2\2\u0728\u072a\7u\2\2\u0729\u0726\3\2\2\2\u0729\u0727"+
		"\3\2\2\2\u0729\u0728\3\2\2\2\u072a\u072c\3\2\2\2\u072b\u0713\3\2\2\2\u072b"+
		"\u0718\3\2\2\2\u072b\u0721\3\2\2\2\u072b\u0724\3\2\2\2\u072c\u072f\3\2"+
		"\2\2\u072d\u072b\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u00b5\3\2\2\2\u072f"+
		"\u072d\3\2\2\2\u0730\u0731\5\u00e4s\2\u0731\u0732\7\7\2\2\u0732\u0734"+
		"\3\2\2\2\u0733\u0730\3\2\2\2\u0733\u0734\3\2\2\2\u0734\u0735\3\2\2\2\u0735"+
		"\u0736\5\u00b8]\2\u0736\u00b7\3\2\2\2\u0737\u0747\5\u00e4s\2\u0738\u0747"+
		"\7\16\2\2\u0739\u0747\7P\2\2\u073a\u0747\7[\2\2\u073b\u0747\7]\2\2\u073c"+
		"\u0747\7_\2\2\u073d\u0747\7\u00c8\2\2\u073e\u0747\7\u00ef\2\2\u073f\u0747"+
		"\7\u00f2\2\2\u0740\u0747\7\u0131\2\2\u0741\u0747\7\u0154\2\2\u0742\u0747"+
		"\7\u0166\2\2\u0743\u0747\7\u0172\2\2\u0744\u0747\7\u01aa\2\2\u0745\u0747"+
		"\7\u01b9\2\2\u0746\u0737\3\2\2\2\u0746\u0738\3\2\2\2\u0746\u0739\3\2\2"+
		"\2\u0746\u073a\3\2\2\2\u0746\u073b\3\2\2\2\u0746\u073c\3\2\2\2\u0746\u073d"+
		"\3\2\2\2\u0746\u073e\3\2\2\2\u0746\u073f\3\2\2\2\u0746\u0740\3\2\2\2\u0746"+
		"\u0741\3\2\2\2\u0746\u0742\3\2\2\2\u0746\u0743\3\2\2\2\u0746\u0744\3\2"+
		"\2\2\u0746\u0745\3\2\2\2\u0747\u00b9\3\2\2\2\u0748\u074a\7\4\2\2\u0749"+
		"\u074b\5f\64\2\u074a\u0749\3\2\2\2\u074a\u074b\3\2\2\2\u074b\u074d\3\2"+
		"\2\2\u074c\u074e\5`\61\2\u074d\u074c\3\2\2\2\u074d\u074e\3\2\2\2\u074e"+
		"\u0750\3\2\2\2\u074f\u0751\5\u00bc_\2\u0750\u074f\3\2\2\2\u0750\u0751"+
		"\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0753\7\5\2\2\u0753\u00bb\3\2\2\2\u0754"+
		"\u0755\5\u00be`\2\u0755\u0756\5\u00c0a\2\u0756\u075e\3\2\2\2\u0757\u0758"+
		"\5\u00be`\2\u0758\u0759\7\'\2\2\u0759\u075a\5\u00c0a\2\u075a\u075b\7\31"+
		"\2\2\u075b\u075c\5\u00c0a\2\u075c\u075e\3\2\2\2\u075d\u0754\3\2\2\2\u075d"+
		"\u0757\3\2\2\2\u075e\u00bd\3\2\2\2\u075f\u0760\t\36\2\2\u0760\u00bf\3"+
		"\2\2\2\u0761\u0762\7\u01b0\2\2\u0762\u0769\t\37\2\2\u0763\u0764\7Z\2\2"+
		"\u0764\u0769\7\u016d\2\2\u0765\u0766\5\u00a6T\2\u0766\u0767\t\37\2\2\u0767"+
		"\u0769\3\2\2\2\u0768\u0761\3\2\2\2\u0768\u0763\3\2\2\2\u0768\u0765\3\2"+
		"\2\2\u0769\u00c1\3\2\2\2\u076a\u076f\5\u00e4s\2\u076b\u076c\7\7\2\2\u076c"+
		"\u076e\5\u00e4s\2\u076d\u076b\3\2\2\2\u076e\u0771\3\2\2\2\u076f\u076d"+
		"\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u00c3\3\2\2\2\u0771\u076f\3\2\2\2\u0772"+
		"\u0774\7\u019b\2\2\u0773\u0772\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0775"+
		"\3\2\2\2\u0775\u0778\7\u012f\2\2\u0776\u0779\5\u00e4s\2\u0777\u0779\5"+
		"l\67\2\u0778\u0776\3\2\2\2\u0778\u0777\3\2\2\2\u0779\u0780\3\2\2\2\u077a"+
		"\u077c\7\u019b\2\2\u077b\u077a\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u077d"+
		"\3\2\2\2\u077d\u077e\7\u0130\2\2\u077e\u0780\5l\67\2\u077f\u0773\3\2\2"+
		"\2\u077f\u077b\3\2\2\2\u0780\u00c5\3\2\2\2\u0781\u07b1\7\u011e\2\2\u0782"+
		"\u0783\t \2\2\u0783\u07b1\7\u01e5\2\2\u0784\u07b1\5\u00eav\2\u0785\u07b1"+
		"\5\u00caf\2\u0786\u07b1\7\u01e5\2\2\u0787\u0789\7\b\2\2\u0788\u078a\5"+
		"\u00c6d\2\u0789\u0788\3\2\2\2\u0789\u078a\3\2\2\2\u078a\u078f\3\2\2\2"+
		"\u078b\u078c\7\6\2\2\u078c\u078e\5\u00c6d\2\u078d\u078b\3\2\2\2\u078e"+
		"\u0791\3\2\2\2\u078f\u078d\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0792\3\2"+
		"\2\2\u0791\u078f\3\2\2\2\u0792\u07b1\7\t\2\2\u0793\u0798\7\n\2\2\u0794"+
		"\u0795\5\u00c6d\2\u0795\u0796\7\u01df\2\2\u0796\u0797\5\u00c6d\2\u0797"+
		"\u0799\3\2\2\2\u0798\u0794\3\2\2\2\u0798\u0799\3\2\2\2\u0799\u07a1\3\2"+
		"\2\2\u079a\u079b\7\6\2\2\u079b\u079c\5\u00c6d\2\u079c\u079d\7\u01df\2"+
		"\2\u079d\u079e\5\u00c6d\2\u079e\u07a0\3\2\2\2\u079f\u079a\3\2\2\2\u07a0"+
		"\u07a3\3\2\2\2\u07a1\u079f\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a4\3\2"+
		"\2\2\u07a3\u07a1\3\2\2\2\u07a4\u07b1\7\13\2\2\u07a5\u07a6\7\n\2\2\u07a6"+
		"\u07ab\5\u00c6d\2\u07a7\u07a8\7\6\2\2\u07a8\u07aa\5\u00c6d\2\u07a9\u07a7"+
		"\3\2\2\2\u07aa\u07ad\3\2\2\2\u07ab\u07a9\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac"+
		"\u07ae\3\2\2\2\u07ad\u07ab\3\2\2\2\u07ae\u07af\7\13\2\2\u07af\u07b1\3"+
		"\2\2\2\u07b0\u0781\3\2\2\2\u07b0\u0782\3\2\2\2\u07b0\u0784\3\2\2\2\u07b0"+
		"\u0785\3\2\2\2\u07b0\u0786\3\2\2\2\u07b0\u0787\3\2\2\2\u07b0\u0793\3\2"+
		"\2\2\u07b0\u07a5\3\2\2\2\u07b1\u00c7\3\2\2\2\u07b2\u07b3\t!\2\2\u07b3"+
		"\u00c9\3\2\2\2\u07b4\u07b5\t\"\2\2\u07b5\u00cb\3\2\2\2\u07b6\u07b7\7\u01c4"+
		"\2\2\u07b7\u07b8\5\u00a6T\2\u07b8\u07b9\7\u019f\2\2\u07b9\u07ba\5\u00a6"+
		"T\2\u07ba\u00cd\3\2\2\2\u07bb\u07bc\7\u00d7\2\2\u07bc\u07bd\5\u00a6T\2"+
		"\u07bd\u07be\5\u00d0i\2\u07be\u00cf\3\2\2\2\u07bf\u07c0\t\26\2\2\u07c0"+
		"\u00d1\3\2\2\2\u07c1\u07c2\7\34\2\2\u07c2\u07c3\7\u01cf\2\2\u07c3\u07c4"+
		"\5\u00d2j\2\u07c4\u07c5\7\u01d1\2\2\u07c5\u07e0\3\2\2\2\u07c6\u07c7\7"+
		"\u00fd\2\2\u07c7\u07c8\7\u01cf\2\2\u07c8\u07c9\5\u00d2j\2\u07c9\u07ca"+
		"\7\6\2\2\u07ca\u07cb\5\u00d2j\2\u07cb\u07cc\7\u01d1\2\2\u07cc\u07e0\3"+
		"\2\2\2\u07cd\u07ce\7\u018d\2\2\u07ce\u07cf\7\u01cf\2\2\u07cf\u07d0\5\u00d6"+
		"l\2\u07d0\u07d1\7\u01d1\2\2\u07d1\u07e0\3\2\2\2\u07d2\u07dd\5\u00d4k\2"+
		"\u07d3\u07d4\7\4\2\2\u07d4\u07d9\t#\2\2\u07d5\u07d6\7\6\2\2\u07d6\u07d8"+
		"\7\u01ea\2\2\u07d7\u07d5\3\2\2\2\u07d8\u07db\3\2\2\2\u07d9\u07d7\3\2\2"+
		"\2\u07d9\u07da\3\2\2\2\u07da\u07dc\3\2\2\2\u07db\u07d9\3\2\2\2\u07dc\u07de"+
		"\7\5\2\2\u07dd\u07d3\3\2\2\2\u07dd\u07de\3\2\2\2\u07de\u07e0\3\2\2\2\u07df"+
		"\u07c1\3\2\2\2\u07df\u07c6\3\2\2\2\u07df\u07cd\3\2\2\2\u07df\u07d2\3\2"+
		"\2\2\u07e0\u00d3\3\2\2\2\u07e1\u0805\3\2\2\2\u07e2\u0805\7\u01a4\2\2\u07e3"+
		"\u0805\7\u017f\2\2\u07e4\u07e6\t$\2\2\u07e5\u07e4\3\2\2\2\u07e5\u07e6"+
		"\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u0805\t%\2\2\u07e8\u0805\7(\2\2\u07e9"+
		"\u0805\7\u00ea\2\2\u07ea\u0805\7\61\2\2\u07eb\u0805\7\u00a9\2\2\u07ec"+
		"\u0805\7\u0086\2\2\u07ed\u0805\7a\2\2\u07ee\u0805\7i\2\2\u07ef\u0805\7"+
		"\u01a0\2\2\u07f0\u0805\7k\2\2\u07f1\u0805\7j\2\2\u07f2\u0805\7m\2\2\u07f3"+
		"\u0805\7l\2\2\u07f4\u0805\7,\2\2\u07f5\u0805\7\u0148\2\2\u07f6\u0805\7"+
		"\u00c2\2\2\u07f7\u0805\7\22\2\2\u07f8\u0805\7\u018c\2\2\u07f9\u0805\7"+
		"\u00e4\2\2\u07fa\u0805\7\u00e5\2\2\u07fb\u0805\7\u019d\2\2\u07fc\u0805"+
		"\7\u01bd\2\2\u07fd\u0805\7?\2\2\u07fe\u0805\7q\2\2\u07ff\u0805\7r\2\2"+
		"\u0800\u0805\7s\2\2\u0801\u0805\7\u00da\2\2\u0802\u0805\7\u00db\2\2\u0803"+
		"\u0805\7\25\2\2\u0804\u07e1\3\2\2\2\u0804\u07e2\3\2\2\2\u0804\u07e3\3"+
		"\2\2\2\u0804\u07e5\3\2\2\2\u0804\u07e8\3\2\2\2\u0804\u07e9\3\2\2\2\u0804"+
		"\u07ea\3\2\2\2\u0804\u07eb\3\2\2\2\u0804\u07ec\3\2\2\2\u0804\u07ed\3\2"+
		"\2\2\u0804\u07ee\3\2\2\2\u0804\u07ef\3\2\2\2\u0804\u07f0\3\2\2\2\u0804"+
		"\u07f1\3\2\2\2\u0804\u07f2\3\2\2\2\u0804\u07f3\3\2\2\2\u0804\u07f4\3\2"+
		"\2\2\u0804\u07f5\3\2\2\2\u0804\u07f6\3\2\2\2\u0804\u07f7\3\2\2\2\u0804"+
		"\u07f8\3\2\2\2\u0804\u07f9\3\2\2\2\u0804\u07fa\3\2\2\2\u0804\u07fb\3\2"+
		"\2\2\u0804\u07fc\3\2\2\2\u0804\u07fd\3\2\2\2\u0804\u07fe\3\2\2\2\u0804"+
		"\u07ff\3\2\2\2\u0804\u0800\3\2\2\2\u0804\u0801\3\2\2\2\u0804\u0802\3\2"+
		"\2\2\u0804\u0803\3\2\2\2\u0805\u00d5\3\2\2\2\u0806\u080b\5\u00d8m\2\u0807"+
		"\u0808\7\6\2\2\u0808\u080a\5\u00d8m\2\u0809\u0807\3\2\2\2\u080a\u080d"+
		"\3\2\2\2\u080b\u0809\3\2\2\2\u080b\u080c\3\2\2\2\u080c\u00d7\3\2\2\2\u080d"+
		"\u080b\3\2\2\2\u080e\u080f\5\u00e4s\2\u080f\u0810\7\u01df\2\2\u0810\u0812"+
		"\5\u00d2j\2\u0811\u0813\5\u00dan\2\u0812\u0811\3\2\2\2\u0812\u0813\3\2"+
		"\2\2\u0813\u00d9\3\2\2\2\u0814\u0815\7I\2\2\u0815\u0816\7\u01e5\2\2\u0816"+
		"\u00db\3\2\2\2\u0817\u0818\7\u0196\2\2\u0818\u081a\7\4\2\2\u0819\u081b"+
		"\5\u00dep\2\u081a\u0819\3\2\2\2\u081a\u081b\3\2\2\2\u081b\u081c\3\2\2"+
		"\2\u081c\u081f\7\5\2\2\u081d\u081e\7\u0158\2\2\u081e\u0820\7\u01ea\2\2"+
		"\u081f\u081d\3\2\2\2\u081f\u0820\3\2\2\2\u0820\u00dd\3\2\2\2\u0821\u0822"+
		"\7\u01ea\2\2\u0822\u0826\7\u0138\2\2\u0823\u0824\7\u01ea\2\2\u0824\u0826"+
		"\7\u016e\2\2\u0825\u0821\3\2\2\2\u0825\u0823\3\2\2\2\u0826\u00df\3\2\2"+
		"\2\u0827\u0828\5\u00e4s\2\u0828\u0829\5\u00e2r\2\u0829\u00e1\3\2\2\2\u082a"+
		"\u082b\7\u01d4\2\2\u082b\u082d\5\u00e4s\2\u082c\u082a\3\2\2\2\u082d\u082e"+
		"\3\2\2\2\u082e\u082c\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0832\3\2\2\2\u0830"+
		"\u0832\3\2\2\2\u0831\u082c\3\2\2\2\u0831\u0830\3\2\2\2\u0832\u00e3\3\2"+
		"\2\2\u0833\u0834\5\u00e6t\2\u0834\u00e5\3\2\2\2\u0835\u0839\7\u01ee\2"+
		"\2\u0836\u0839\5\u00e8u\2\u0837\u0839\5\u00ecw\2\u0838\u0835\3\2\2\2\u0838"+
		"\u0836\3\2\2\2\u0838\u0837\3\2\2\2\u0839\u00e7\3\2\2\2\u083a\u083b\7\u01ef"+
		"\2\2\u083b\u00e9\3\2\2\2\u083c\u083e\7\u01d4\2\2\u083d\u083c\3\2\2\2\u083d"+
		"\u083e\3\2\2\2\u083e\u083f\3\2\2\2\u083f\u0845\7\u01ea\2\2\u0840\u0842"+
		"\7\u01d4\2\2\u0841\u0840\3\2\2\2\u0841\u0842\3\2\2\2\u0842\u0843\3\2\2"+
		"\2\u0843\u0845\t&\2\2\u0844\u083d\3\2\2\2\u0844\u0841\3\2\2\2\u0845\u00eb"+
		"\3\2\2\2\u0846\u0847\t\'\2\2\u0847\u00ed\3\2\2\2\u0115\u00f2\u00f7\u00ff"+
		"\u0105\u0109\u0111\u011c\u0128\u012c\u0131\u0135\u013a\u013f\u0143\u014b"+
		"\u014f\u0156\u015b\u015d\u0164\u0167\u016b\u016e\u0174\u0179\u017e\u0181"+
		"\u0187\u018c\u018f\u0197\u019c\u019f\u01a7\u01af\u01b2\u01b5\u01c0\u01c5"+
		"\u01cc\u01cf\u01da\u01e4\u01e7\u01f0\u01f3\u01fa\u01fd\u0202\u0205\u0207"+
		"\u020a\u020d\u0217\u0220\u0226\u022c\u0231\u0234\u0237\u023a\u023d\u0240"+
		"\u0243\u0246\u0249\u024c\u024f\u025a\u025d\u0260\u0263\u0266\u0268\u026d"+
		"\u0276\u0278\u027c\u0280\u0283\u02a2\u02c4\u02c6\u02cf\u02d4\u02dd\u02e3"+
		"\u02e9\u02ec\u02ef\u02f2\u02f5\u02fd\u0305\u0308\u030b\u0316\u031b\u0323"+
		"\u032b\u032f\u0332\u0335\u0338\u0343\u0348\u0355\u035c\u035f\u036a\u0375"+
		"\u037c\u0382\u0386\u0390\u0398\u03a3\u03a8\u03ad\u03b6\u03b9\u03c3\u03c6"+
		"\u03d1\u03db\u03de\u03e6\u03e9\u03f3\u03f8\u0401\u0406\u040b\u0411\u0413"+
		"\u0419\u0420\u042c\u042f\u0437\u043a\u0443\u0448\u044c\u0458\u0461\u0465"+
		"\u046a\u046e\u0472\u047c\u0482\u048d\u0492\u0495\u0499\u049c\u04a1\u04ab"+
		"\u04b1\u04b6\u04c2\u04cb\u04cf\u04d2\u04d6\u04d8\u04df\u04e7\u04ed\u04f0"+
		"\u04f5\u0500\u0502\u0504\u0508\u050f\u0517\u051a\u0521\u0528\u052b\u0531"+
		"\u0539\u053f\u0550\u0556\u0561\u0567\u056f\u057b\u0583\u0586\u0591\u059c"+
		"\u05a1\u05a4\u05ab\u05b0\u05bc\u05c2\u05d8\u05da\u05e5\u05e7\u05f0\u05f6"+
		"\u05fe\u0603\u0608\u0610\u0619\u0620\u0623\u0630\u063c\u063e\u065f\u066c"+
		"\u0679\u0686\u068e\u0692\u069b\u069f\u06b8\u06bd\u06d2\u06d9\u06e3\u06e6"+
		"\u06e8\u06ed\u06f8\u0704\u070c\u0711\u071d\u0729\u072b\u072d\u0733\u0746"+
		"\u074a\u074d\u0750\u075d\u0768\u076f\u0773\u0778\u077b\u077f\u0789\u078f"+
		"\u0798\u07a1\u07ab\u07b0\u07d9\u07dd\u07df\u07e5\u0804\u080b\u0812\u081a"+
		"\u081f\u0825\u082e\u0831\u0838\u083d\u0841\u0844";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}