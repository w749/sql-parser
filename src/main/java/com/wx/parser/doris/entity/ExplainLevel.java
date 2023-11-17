package com.wx.parser.doris.entity;

public enum ExplainLevel {
    NONE(false),
    NORMAL(false),
    VERBOSE(false),
    TREE(false),
    GRAPH(false),
    PARSED_PLAN(true),
    ANALYZED_PLAN(true),
    REWRITTEN_PLAN(true),
    OPTIMIZED_PLAN(true),
    SHAPE_PLAN(true),
    MEMO_PLAN(true),
    ALL_PLAN(true)
    ;

    public final boolean isPlanLevel;

    ExplainLevel(boolean isPlanLevel) {
        this.isPlanLevel = isPlanLevel;
    }
}
