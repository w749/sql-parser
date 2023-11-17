package com.wx.parser.doris.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import com.wx.parser.doris.Expression;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Data
public class PartitionDefinition {
    private Map<String, String> properties;
    public PartitionDefinition withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * represent in partition
     */
    @Getter
    @ToString(callSuper = true)
    @AllArgsConstructor
    public static class InPartition extends PartitionDefinition {
        private final String partitionName;
        private final List<List<Expression>> values;
    }

    /**
     * represent step partition
     */
    @Getter
    @ToString(callSuper = true)
    @AllArgsConstructor
    public static class StepPartition extends PartitionDefinition {
        private final List<Expression> fromExpression;
        private final List<Expression> toExpression;
        private final long unit;
        private final String unitString;
    }

    /**
     * represent fixed range partition
     */
    @Getter
    @ToString(callSuper = true)
    @AllArgsConstructor
    public static class FixedRangePartition extends PartitionDefinition {
        private final String partitionName;
        private List<Expression> lowerBounds;
        private List<Expression> upperBounds;
    }

    /**
     * represent less than partition
     */
    @Getter
    @ToString(callSuper = true)
    @AllArgsConstructor
    public static class LessThanPartition extends PartitionDefinition {
        private final String partitionName;
        private final List<Expression> values;
    }
}
