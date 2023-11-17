package com.wx.parser.info;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class UnboundTVFRelationInfo implements Info {
    private final String functionName;
    private final Map<String, String> map;
}
