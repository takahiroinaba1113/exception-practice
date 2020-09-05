package com.example.exceptionpractice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Class for handling exceptions, including custom exceptions and even existing exceptions
 * and customize the way you throw the exceptions (like the contents and messages)
 */

@ControllerAdvice // Tell SpringBoot that this class handles exceptions
public class ApiExceptionHandler {

    // Receive an ApiRequestException that is created by me
    // Return ResponseEntity which is the representation of a request body

    @ExceptionHandler(ApiRequestException.class) // Telling SpringBoot that this method handles ApiRequestException
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException e){

        // 1. Create payload(contents) containing exception details
        // Http status set as a Bad Request
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;

        // ApiException initiated
        ApiException apiException = new ApiException(
                                            e.getMessage(),
                                            e,
                                            badRequest,
                                            ZonedDateTime.now(ZoneId.of("Z"))
                                            );

        // 2. Return response entity that holds the ApiException
        return new ResponseEntity<>(apiException, badRequest);
    }
}
