package com.github.vadmurzakov.javatelegrambotapi.exception;

public class RestWSException extends BusinessException {
    public static final String MSG = "The call to server ended with an error: ";

    public RestWSException(String message) {
        super(MSG + message);
    }
}
