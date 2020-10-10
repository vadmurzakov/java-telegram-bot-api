package com.github.vadmurzakov.javatelegrambotapi.client;

import com.github.vadmurzakov.javatelegrambotapi.domain.dto.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class TelegramClientTest {

    @Autowired
    private TelegramAPI telegramClient;

    @Test
    public void getMe() {
        User user = telegramClient.getMe();
        assertNotNull(user);
        assertFalse(user.getFirstName().isEmpty());
        assertNotNull(user.getId());
        assertNotNull(user.isBot());
    }
}