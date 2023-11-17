package com.wx.parser.doris.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class IndexDefinition {
    private final String name;
    private final List<String> cols;
    private final boolean isUseBitmap;
    private final String comment;
}
