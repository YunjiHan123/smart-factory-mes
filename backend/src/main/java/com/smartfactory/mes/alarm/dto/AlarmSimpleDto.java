package com.smartfactory.mes.alarm.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
public class AlarmSimpleDto {
    private Long alarmId;
    private LocalDateTime createdAt;
    private Long lineId;
    private String lineName;
    private Long equipmentId;
    private String equipmentName;
    private String alarmType;
    private String severity;
    private String message;
    private boolean acknowledged;
}