package com.wx.parser.info;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class OutFileInfo implements Info {
    private final String filePath;
    private final String format;
    private final Map<String, String> properties;
    private final Info info;
}
