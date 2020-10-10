package com.github.vadmurzakov.javatelegrambotapi.client;

import com.github.vadmurzakov.javatelegrambotapi.domain.dto.Chat;
import com.github.vadmurzakov.javatelegrambotapi.domain.dto.User;

public interface TelegramAPI {
    /**
     * A simple method for testing your bot's auth token. Requires no parameters.
     *
     * @return Returns basic information about the bot in form of a User object.
     * @see <a href="https://core.telegram.org/bots/api#user">API Documentation</a>
     */
    User getMe();

    /**
     * Use this method to get up to date information about the chat
     * (current name of the user for one-on-one conversations, current username of a user, group or channel, etc.).
     *
     * @param chatId Unique identifier for the target chat or username of the target supergroup or channel
     * @return Returns a Chat object on success.
     * @see <a href="https://core.telegram.org/bots/api#chat">API Documentation</a>
     */
    Chat getChat(Long chatId);
}
