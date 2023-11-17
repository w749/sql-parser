package com.wx.parser.info;

import lombok.AllArgsConstructor;
import lombok.Data;
import com.wx.parser.doris.Expression;

import java.util.List;

@Data
@AllArgsConstructor
public class UpdateInfo implements Info {
    private final List<String> nameParts;
    private final List<Expression.EqualTo> assignments;
    private final String tableAlias;
    private final Info fromInfo;
    private final Info aggregateInfo;
}
