package com.github.vadmurzakov.javatelegrambotapi.config.rest.operation;

import com.github.vadmurzakov.javatelegrambotapi.exception.RestWSException;
import lombok.AllArgsConstructor;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestOperations;

@AllArgsConstructor
public class RestClientTemplate implements RestClientOperation {

    private final RestOperations restOperations;

    @Override
    public Object postForObject(String url, Object request) {
        try {
            return restOperations.postForObject(url, request, Object.class);
        } catch (RestClientException e) {
            throw new RestWSException(e.getMessage());
        }
    }
}
