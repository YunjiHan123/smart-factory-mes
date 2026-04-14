package com.smartfactory.mes.line.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class LineEquipmentDto {
    private Long equipmentId;
    private String equipmentCode;
    private String equipmentName;
    private String equipmentType;
    private int processOrder;
    private String currentStatus;
    private int productionCount;
    private double operationRate;
}