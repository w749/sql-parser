package com.wx.parser.info;

import lombok.AllArgsConstructor;
import lombok.Data;
import com.wx.parser.doris.entity.ExplainLevel;

@Data
@AllArgsConstructor
public class ExplainInfo implements Info {
  private final ExplainLevel level;
  private final Info stmt;
}
