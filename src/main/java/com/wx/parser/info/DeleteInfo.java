package com.wx.parser.info;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class DeleteInfo implements Info {
    private final List<String> nameParts;
    private final List<String> partitions;
    private final String tableAlias;
    private final Info info;
}
