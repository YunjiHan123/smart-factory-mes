package com.smartfactory.mes.dashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class EquipmentSummaryDto {
    private int runCount;
    private int stopCount;
    private int idleCount;
    private int errorCount;
}