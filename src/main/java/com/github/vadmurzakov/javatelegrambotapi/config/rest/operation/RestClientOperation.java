package com.github.vadmurzakov.javatelegrambotapi.config.rest.operation;

public interface RestClientOperation {
    Object postForObject(String url, Object request);
}
