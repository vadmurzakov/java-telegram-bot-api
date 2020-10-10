package com.github.vadmurzakov.javatelegrambotapi.config.rest;

import com.github.vadmurzakov.javatelegrambotapi.config.rest.operation.RestClientOperation;
import com.github.vadmurzakov.javatelegrambotapi.config.rest.operation.RestClientTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestTemplateConfiguration {

    private static final String CONTENT_TYPE = "Content-type";
    private static final String APPLICATION_JSON_VALUE = "application/json";

    @Bean
    public RestClientOperation telegramRestTemplate(RestTemplateBuilder builder) {
        return new RestClientTemplate(builder.defaultHeader(CONTENT_TYPE, APPLICATION_JSON_VALUE).build());
    }

}
