package com.wx.parser.info;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LimitInfo implements Info {
    private final long limit;
    private final long offset;
}
