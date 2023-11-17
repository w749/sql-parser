package com.wx.parser.info;

import com.wx.parser.doris.entity.SubQueryAlias;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CTEInfo implements Info {
    private final List<SubQueryAlias> aliasQueries;
    private final Info info;
}
