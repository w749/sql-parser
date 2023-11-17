package com.wx.parser.info;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class AggregateInfo implements Info {
    private final String groupingElement;
    private final List<String> expressions;
    private final Info info;
}
