package com.smartfactory.mes.dashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class DashboardKpiDto {
    private int totalProduction;
    private int targetProduction;
    private double achievementRate;
    private double averageOperationRate;
    private double defectRate;
}