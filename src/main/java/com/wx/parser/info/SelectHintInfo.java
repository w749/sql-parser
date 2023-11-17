package com.wx.parser.info;

import com.wx.parser.doris.entity.SelectHint;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class SelectHintInfo implements Info {
    private final Map<String, SelectHint> selectHintMap;
    private final Info info;
}
