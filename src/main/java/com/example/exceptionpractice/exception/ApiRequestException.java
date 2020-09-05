package com.example.exceptionpractice.exception;

/**
 * Creating custom exception class that overrides RuntimeException
 * Telling SpringBoot that ApiRequestException is one of exceptions
 */
public class ApiRequestException extends RuntimeException{

    public ApiRequestException(String message){
        super(message);
    }

    public ApiRequestException(String message, Throwable throwable){
        super(message, throwable);
    }
}
