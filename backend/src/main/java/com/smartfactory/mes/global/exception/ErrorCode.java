package com.smartfactory.mes.global.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "COMMON_500", "서버 내부 오류가 발생했습니다."),
    INVALID_INPUT_VALUE(HttpStatus.BAD_REQUEST, "COMMON_400", "잘못된 요청입니다."),
    METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED, "COMMON_405", "지원하지 않는 HTTP 메서드입니다."),

    LINE_NOT_FOUND(HttpStatus.NOT_FOUND, "LINE_404", "존재하지 않는 라인입니다."),
    EQUIPMENT_NOT_FOUND(HttpStatus.NOT_FOUND, "EQUIPMENT_404", "존재하지 않는 설비입니다."),
    PRODUCTION_RECORD_NOT_FOUND(HttpStatus.NOT_FOUND, "PRODUCTION_404", "생산 기록을 찾을 수 없습니다."),
    ALARM_NOT_FOUND(HttpStatus.NOT_FOUND, "ALARM_404", "알람 정보를 찾을 수 없습니다.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    ErrorCode(HttpStatus httpStatus, String code, String message) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.message = message;
    }
}
