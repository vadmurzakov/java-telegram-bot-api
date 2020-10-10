package com.github.vadmurzakov.javatelegrambotapi.domain.request.method;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetChatRequest {
    private Long chatId;

    @JsonProperty(value = "chat_id")
    public Long getChatId() {
        return chatId;
    }
}
