package com.wx.parser.info;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SubQueryAliasInfo implements Info {
    private final String alias;
    private final Info info;
}
