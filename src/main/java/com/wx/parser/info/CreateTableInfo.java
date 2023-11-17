package com.wx.parser.info;

import com.wx.parser.doris.entity.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class CreateTableInfo implements Info {
    private final Info ctasQuery;
    private final boolean ifNotExists;
    private String ctlName;
    private String dbName;
    private final String tableName;
    private List<ColumnDefinition> columns;
    private final List<IndexDefinition> indexes;
    private final List<String> ctasColumns;
    private final String engineName;
    private String keysType;
    private List<String> keys;
    private final String comment;
    private final String partitionType;
    private final List<String> partitionColumns;
    private final List<PartitionDefinition> partitions;
    private final DistributionDescriptor distribution;
    private final List<RollupDefinition> rollups;
    private Map<String, String> properties;
}
