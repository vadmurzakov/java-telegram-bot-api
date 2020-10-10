package com.github.vadmurzakov.javatelegrambotapi.client;

import com.github.vadmurzakov.javatelegrambotapi.domain.dto.Chat;
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

    @Test
    public void getChat() {
        Chat chat = telegramClient.getChat(1119504532L);
        assertNotNull(chat);
        assertNotNull(chat.getId());
        assertNotNull(chat.getFirstName());
        assertNotNull(chat.getUsername());
        assertNotNull(chat.getType());
    }
}