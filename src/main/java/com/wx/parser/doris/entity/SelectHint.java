package com.wx.parser.doris.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Data
@AllArgsConstructor
public class SelectHint {
    private final String hintName;
    private final List<String> listParameters;
    private final Map<String, Optional<String>> mapParameters;
}
