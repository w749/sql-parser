package com.wx.parser.info;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UsingJoinInfo implements Info {
    private final String joinType;
    private final String joinHint;
    private final String condition;
    private final Info left;
    private final Info right;
    private final List<String> hashJoinConjuncts;
}
