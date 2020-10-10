package com.github.vadmurzakov.javatelegrambotapi.config.properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class TelegramPropertiesTest {

    @Autowired
    private TelegramProperties properties;

    @Test
    public void getUrl() {
        String url = properties.getUrl();
        assertNotNull(url);
        assertFalse(url.isEmpty());
    }

    @Test
    public void getToken() {
        String token = properties.getToken();
        assertNotNull(token);
        assertFalse(token.isEmpty());
    }
}