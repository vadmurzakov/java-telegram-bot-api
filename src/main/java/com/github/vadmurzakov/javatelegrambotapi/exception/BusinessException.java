package com.github.vadmurzakov.javatelegrambotapi.exception;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message, null, false, false);
    }
}
