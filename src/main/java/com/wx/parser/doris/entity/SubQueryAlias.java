package com.wx.parser.doris.entity;

import com.wx.parser.info.Info;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Optional;

@Data
@AllArgsConstructor
public class SubQueryAlias {
    private final List<String> columnAliases;
    private final Optional<List<String>> qualifier;
    private final Info info;
}
