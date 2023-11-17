package com.wx.parser.doris.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class DistributionDescriptor {
    private final boolean isHash;
    private final boolean isAutoBucket;
    private final int bucketNum;
    private List<String> cols;
}
