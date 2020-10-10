package com.github.vadmurzakov.javatelegrambotapi.config.rest.operation;

import com.fasterxml.jackson.databind.JsonNode;

public interface RestClientOperation {
    JsonNode postForObject(String url, Object request);
}
