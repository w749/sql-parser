package com.wx.parser.info;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SortInfo implements Info{
    private final List<OrderKey> orderKeys;
}
