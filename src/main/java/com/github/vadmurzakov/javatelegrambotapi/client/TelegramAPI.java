package com.github.vadmurzakov.javatelegrambotapi.client;

import com.github.vadmurzakov.javatelegrambotapi.domain.dto.User;

public interface TelegramAPI {
    User getMe();
}
