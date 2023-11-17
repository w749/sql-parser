package com.wx.parser.info;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JoinInfo implements Info {
    private final String joinType;
    private final String joinHint;
    private final String condition;
    private final Info left;
    private final Info right;
}
