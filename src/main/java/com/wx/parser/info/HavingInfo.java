package com.wx.parser.info;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HavingInfo implements Info {
    private final String condition;
    private final Info info;
}
