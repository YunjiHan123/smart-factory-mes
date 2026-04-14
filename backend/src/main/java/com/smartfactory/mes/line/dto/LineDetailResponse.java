package com.smartfactory.mes.line.dto;

import com.smartfactory.mes.alarm.dto.AlarmSimpleDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class LineDetailResponse {
    private Long lineId;
    private String lineCode;
    private String lineName;
    private String productName;
    private String currentStatus;
    private String location;
    private LineKpiDto kpi;
    private List<LineEquipmentDto> equipments;
    private List<AlarmSimpleDto> alarms;
    private LocalDateTime lastUpdatedAt;
}