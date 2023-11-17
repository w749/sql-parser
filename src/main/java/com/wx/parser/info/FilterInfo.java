package com.wx.parser.info;

import lombok.AllArgsConstructor;
import lombok.Data;
import com.wx.parser.doris.Expression;

@Data
@AllArgsConstructor
public class FilterInfo implements Info {
    private final Expression expression;
}
