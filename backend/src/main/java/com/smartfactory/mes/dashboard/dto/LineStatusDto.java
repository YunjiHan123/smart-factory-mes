package com.smartfactory.mes.dashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class LineStatusDto {
    private Long lineId;
    private String lineCode;
    private String lineName;
    private String productName;
    private String currentStatus;
    private int productionCount;
    private double operationRate;
}