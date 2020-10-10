package com.github.vadmurzakov.javatelegrambotapi.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Chat {
    private Long id;
    private String firstName;
    private String username;
    private String type;
    //todo добавить поля


    @JsonProperty(value = "first_name")
    public String getFirstName() {
        return firstName;
    }
}
