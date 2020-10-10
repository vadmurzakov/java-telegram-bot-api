package com.github.vadmurzakov.javatelegrambotapi.domain.response.method;

import com.github.vadmurzakov.javatelegrambotapi.domain.dto.Chat;
import com.github.vadmurzakov.javatelegrambotapi.domain.response.ResponseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GetChatResponse extends ResponseEntity {
    private Chat result;
}
