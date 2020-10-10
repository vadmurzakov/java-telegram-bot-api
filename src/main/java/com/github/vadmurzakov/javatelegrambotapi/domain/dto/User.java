package com.github.vadmurzakov.javatelegrambotapi.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class User {
    private Long id;
    private Boolean bot;
    private String firstName;
    private String lastName;
    private String username;
    private String languageCode;
    private Boolean canJoinGroup;
    private Boolean canReadAllGroupMessages;
    private Boolean supportsInlineQueries;

    @JsonProperty(required = true)
    public Long getId() {
        return id;
    }

    @JsonProperty(required = true, value = "is_bot")
    public Boolean isBot() {
        return bot;
    }

    @JsonProperty(required = true, value = "first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty(value = "last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty(value = "language_code")
    public String getLanguageCode() {
        return languageCode;
    }

    @JsonProperty(value = "can_join_groups")
    public Boolean getCanJoinGroup() {
        return canJoinGroup;
    }

    @JsonProperty(value = "can_read_all_group_messages")
    public Boolean getCanReadAllGroupMessages() {
        return canReadAllGroupMessages;
    }

    @JsonProperty(value = "supports_inline_queries")
    public Boolean getSupportsInlineQueries() {
        return supportsInlineQueries;
    }
}
