package com.smartfactory.mes.dashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class ProductionTrendDto {
    private String timeLabel;
    private int productionCount;
}