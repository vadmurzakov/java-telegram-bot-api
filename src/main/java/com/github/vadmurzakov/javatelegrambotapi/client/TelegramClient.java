package com.github.vadmurzakov.javatelegrambotapi.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.vadmurzakov.javatelegrambotapi.config.properties.TelegramProperties;
import com.github.vadmurzakov.javatelegrambotapi.config.rest.operation.RestClientOperation;
import com.github.vadmurzakov.javatelegrambotapi.domain.dto.Chat;
import com.github.vadmurzakov.javatelegrambotapi.domain.dto.User;
import com.github.vadmurzakov.javatelegrambotapi.domain.request.method.GetChatRequest;
import com.github.vadmurzakov.javatelegrambotapi.domain.response.ResponseEntity;
import com.github.vadmurzakov.javatelegrambotapi.domain.response.method.GetChatResponse;
import com.github.vadmurzakov.javatelegrambotapi.domain.response.method.GetMeResponse;
import com.github.vadmurzakov.javatelegrambotapi.exception.RestWSException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TelegramClient implements TelegramAPI {

    private final RestClientOperation telegramRestTemplate;
    private final TelegramProperties properties;
    private final ObjectMapper mapper;

    @Override
    public User getMe() {
        JsonNode response = sendRequest(properties.getUrl() + "/getMe", null);
        GetMeResponse getMeResponse = mapper.convertValue(response, GetMeResponse.class);
        checkServerResponse(getMeResponse);
        return getMeResponse.getResult();
    }

    @Override
    public Chat getChat(Long chatId) {
        GetChatRequest request = new GetChatRequest(chatId);
        JsonNode response = sendRequest(properties.getUrl() + "/getChat", request);
        GetChatResponse getChatResponse = mapper.convertValue(response, GetChatResponse.class);
        return getChatResponse.getResult();
    }

    private JsonNode sendRequest(String url, Object request) {
        JsonNode jsonNode = telegramRestTemplate.postForObject(url, request);
        if (jsonNode == null) throw new RestWSException("telegram.org ended with an unexpected error");
        return jsonNode;
    }

    private <T extends ResponseEntity> void checkServerResponse(T response) {
        if (!response.isOk()) throw new RestWSException(response.toString());
    }
}
