package com.wx.parser.info;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UnionInfo implements Info {
    private final String qualifier;
    private List<Info> children;
}
