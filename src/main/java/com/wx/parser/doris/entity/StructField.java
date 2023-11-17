package com.wx.parser.doris.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class StructField {
    private final String name;
    private final List<String> dataType;
    private final boolean nullable;
    private final String comment;
}
