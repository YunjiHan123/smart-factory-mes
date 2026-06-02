package com.smartfactory.mes.global.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "COMMON_500", "Internal server error."),
    INVALID_INPUT_VALUE(HttpStatus.BAD_REQUEST, "COMMON_400", "Invalid request."),
    METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED, "COMMON_405", "HTTP method not allowed."),
    AUTH_INVALID_CREDENTIALS(HttpStatus.UNAUTHORIZED, "AUTH_401", "Invalid email or password."),
    AUTH_USER_ALREADY_EXISTS(HttpStatus.CONFLICT, "AUTH_409", "User already exists."),
    AUTH_USER_NOT_FOUND(HttpStatus.NOT_FOUND, "AUTH_404", "User not found."),

    LINE_NOT_FOUND(HttpStatus.NOT_FOUND, "LINE_404", "Line not found."),
    EQUIPMENT_NOT_FOUND(HttpStatus.NOT_FOUND, "EQUIPMENT_404", "Equipment not found."),
    PRODUCTION_RECORD_NOT_FOUND(HttpStatus.NOT_FOUND, "PRODUCTION_404", "Production record not found."),
    ALARM_NOT_FOUND(HttpStatus.NOT_FOUND, "ALARM_404", "Alarm not found.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    ErrorCode(HttpStatus httpStatus, String code, String message) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.message = message;
    }
}
