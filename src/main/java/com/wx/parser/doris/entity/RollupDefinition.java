package com.wx.parser.doris.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class RollupDefinition {
    private final String name;
    private final List<String> cols;
    private final List<String> dupKeys;
    private final Map<String, String> properties;
}
