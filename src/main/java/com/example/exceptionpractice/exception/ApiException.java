package com.example.exceptionpractice.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

/**
 * Defining a custom exception class to be thrown
 * to tell SpringBoot that this exception has the fields as below
 */
public class ApiException {

    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
    private final ZonedDateTime timestamp;

    // Why constructor?
    // to initialize ApiException with args everytime exceptions are thrown
    public ApiException(String message, Throwable throwable, HttpStatus httpStatus, ZonedDateTime timestap) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
        this.timestamp = timestap;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }
}
