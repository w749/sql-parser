package com.wx.parser.info;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class GenerateInfo implements Info {
    private final String generateName;
    private final String columnName;
    private final String functionName;
    private final List<String> arguments;
    private final Info info;
}
