package com.wx.parser.info;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class InsertIntoInfo implements Info {
    private final List<String> tableName;
    private final List<String> colNames;
    private final String labelName;
    private final List<String> partitions;
    private final boolean isOverwrite;
    private Info info;
}
