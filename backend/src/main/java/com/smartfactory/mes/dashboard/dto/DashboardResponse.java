package com.smartfactory.mes.dashboard.dto;

import com.smartfactory.mes.alarm.dto.AlarmSimpleDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class DashboardResponse {
    private DashboardKpiDto kpi;
    private List<ProductionTrendDto> productionTrend;
    private List<LineStatusDto> lineStatuses;
    private EquipmentSummaryDto equipmentSummary;
    private List<AlarmSimpleDto> recentAlarms;
    private LocalDateTime lastUpdatedAt;
}