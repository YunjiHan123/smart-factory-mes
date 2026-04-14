package com.smartfactory.mes.line.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class LineKpiDto {
    private int productionCount;
    private int targetProduction;
    private double achievementRate;
    private double operationRate;
    private double defectRate;
}