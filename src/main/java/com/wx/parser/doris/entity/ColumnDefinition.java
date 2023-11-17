package com.wx.parser.doris.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public class ColumnDefinition {
    private final String name;
    private List<String> type;
    private boolean isKey;
    private String aggType;
    private boolean isNullable;
    private String defaultValue;
    private final String comment;
}
