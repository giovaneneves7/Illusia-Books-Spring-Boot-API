package com.illusia.api.entity.banner.model.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public record CreateBannerResponseDto(

        @JsonProperty(value = "id")
        UUID id,

        @JsonProperty(value = "name")
        String name
) {
}
