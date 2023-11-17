package com.wx.parser.info;

import com.wx.parser.doris.entity.TableSample;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class TableInfo implements Info {
    private final List<String> nameParts;
    private List<String> partNames;
    private List<Long> tabletIds;
    private boolean isTempPart;
    private List<String> hints;
    private TableSample tableSample;
}
