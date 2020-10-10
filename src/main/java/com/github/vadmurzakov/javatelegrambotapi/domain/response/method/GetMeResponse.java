package com.github.vadmurzakov.javatelegrambotapi.domain.response.method;

import com.github.vadmurzakov.javatelegrambotapi.domain.dto.User;
import com.github.vadmurzakov.javatelegrambotapi.domain.response.ResponseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GetMeResponse extends ResponseEntity {
    private User result;
}
