package com.smartfactory.mes.equipment.dto;

import com.smartfactory.mes.alarm.dto.AlarmSimpleDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class EquipmentDetailResponse {
    private Long equipmentId;
    private String equipmentCode;
    private String equipmentName;
    private String equipmentType;
    private Long lineId;
    private String lineName;
    private int processOrder;
    private String currentStatus;
    private LocalDateTime lastStatusChangedAt;
    private LocalDateTime lastInspectionAt;
    private EquipmentKpiDto kpi;
    private List<EquipmentStatusHistoryDto> statusHistories;
    private List<AlarmSimpleDto> alarms;
    private LocalDateTime lastUpdatedAt;
}