package com.wx.parser.info;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class SelectInfo implements Info {
    private final List<String> cols;
    private final List<String> excepts;
    private final boolean isDistinct;
    private final Info fromInfo;
    private final Info aggregateInfo;
    private Info sortInfo;
    private Info limitInfo;
}
