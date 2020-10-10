package com.github.vadmurzakov.javatelegrambotapi.domain.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResponseEntity {
    private Boolean ok;
    private String description;
    private ResponseParameters responseParameters;

    @JsonProperty(required = true)
    public boolean isOk() {
        return ok;
    }
}
