package com.wx.parser.doris;

public class DorisSql {
    public final static String EXPLAIN_SQL = "explain select t1.a, t1.b, t2.c from db.test1 t1 left join db.test2 t2 on t1.a = t2.a where t1.b >= 100";
    public final static String SELECT_SUB_SQL = "select a, b, c from (select z, x, c from db.test) as tmp where a = 123 order by a desc limit 10, 5";
    public final static String SELECT_JOIN_SQL = "select t1.a, t1.b, t2.c from db.test1 t1 left join db.test2 t2 on t1.a = t2.a where t1.b >= 100";
    public final static String SELECT_UNION_SQL = "select a, b, c from test1 union select d, e, f from test2";
    public final static String SELECT_WHERE_EXISTS_SQL = "select * from test1 where exists (select id from test2 where age > 18)";
    public final static String SELECT_WHERE_IN_SQL = "select * from test1 where id in (1, 2, 3)";
    public final static String INSERT_INTO_SQL = "insert into db.test1(a, b, c) select z, x, c from db.test where z = 123";
    public final static String INSERT_OVERWRITE_SQL = "insert overwrite table db.test1(a, b, c) select z, x, c from db.test where z = 123";
    public final static String UPDATE_SELECT_SQL = "update t1 set t1.c1 = t2.c1, t1.c3 = t2.c3 * 100 from t2 inner join t3 on t2.id = t3.id where t1.id = t2.id";
    public final static String UPDATE_VALUE_SQL = "update test set v1 = v1+1 where k1=1";
    public final static String DELETE_SQL = "delete from db.test1 t1 where t1.a = 100 and t1.b = 'hello'";
    /**
     * 不支持建表时创建index
     */
    public final static String CREATE_COLS_SQL = "CREATE TABLE IF NOT EXISTS nat (\n" +
            "    `create_time` DATETIME COMMENT 'create time',\n" +
            "    `private_ip` VARCHAR(1024) COMMENT '私网IP',\n" +
            "    `public_ip` VARCHAR(1024),\n" +
            "    `label` VARCHAR(1024),\n" +
            "    `nat_time` BIGINT,\n" +
            "    `start_port` INT,\n" +
            "    `end_port` INT DEFAULT '-1',\n" +
            "    `id` INT DEFAULT '0'\n" +
            ")\n" +
            "UNIQUE KEY(`create_time`, `private_ip`, `public_ip`, `label`, `nat_time`, `start_port`)\n" +
            "PARTITION BY RANGE(col)\n" +
            "(\n" +
            "   FROM (\"2000-11-14\") TO (\"2021-11-14\") INTERVAL 1 YEAR,\n" +
            "   FROM (\"2021-11-14\") TO (\"2022-11-14\") INTERVAL 1 MONTH,\n" +
            "   FROM (\"2022-11-14\") TO (\"2023-01-03\") INTERVAL 1 WEEK,\n" +
            "   FROM (\"2023-01-03\") TO (\"2023-01-14\") INTERVAL 1 DAY\n" +
            ")\n" +
            "DISTRIBUTED BY HASH(`private_ip`) BUCKETS 1\n" +
            "ROLLUP (\n" +
            "    r1 (k1, k3, v1, v2),\n" +
            "    r2 (k1, v1)\n" +
            ")\n" +
            "PROPERTIES (\n" +
            "  \"bloom_filter_columns\" = \"private_ip\",\n" +
            "  \"replication_allocation\" = \"tag.location.default: 1\",\n" +
            "  \"dynamic_partition.enable\" = \"true\",\n" +
            "  \"dynamic_partition.time_unit\" = \"HOUR\",\n" +
            "  \"dynamic_partition.start\" = \"-1\",\n" +
            "  \"dynamic_partition.end\" = \"3\",\n" +
            "  \"dynamic_partition.create_history_partition\" = \"true\",\n" +
            "  \"dynamic_partition.history_partition_num\" = \"1\",\n" +
            "  \"dynamic_partition.prefix\" = \"p\",\n" +
            "  \"colocate_with\" = \"radius_group\"\n" +
            ");";
    public final static String CREATE_AS_SQL = "CREATE TABLE db.test AS SELECT * FROM test2";
}
