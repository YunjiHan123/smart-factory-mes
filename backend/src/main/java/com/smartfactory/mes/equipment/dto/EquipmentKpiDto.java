package com.smartfactory.mes.equipment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class EquipmentKpiDto {
    private int productionCount;
    private int uph;
    private double operationRate;
    private int defectCount;
}