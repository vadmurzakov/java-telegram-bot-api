package com.github.vadmurzakov.javatelegrambotapi.domain.response;

import lombok.Data;

@Data
public class ResponseParameters {
    private Long migrateToChatId;
    private Long retryAfter;
}
