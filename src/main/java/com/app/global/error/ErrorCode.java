package com.app.global.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    TEST(HttpStatus.INTERNAL_SERVER_ERROR, "001", "BusinessExceptionTest")
    ;
    private HttpStatus httpStatus;
    private String errorCode;
    private String message;
}