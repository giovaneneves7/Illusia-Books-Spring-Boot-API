package com.illusia.api.entity.banner.model.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.illusia.api.entity.banner.model.Banner;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateBannerRequestDto(

        @NotNull(message = "Banners's name can't be Null")
        @NotBlank(message = "Banner's name can't be Blank")
        @JsonProperty(value = "name")
        String name,

        @JsonProperty(value = "description")
        String description,

        @NotNull(message = "Banner's URL can't be NULL")
        @NotBlank(message = "Banner's URL can't be Blank")
        @JsonProperty(value = "url")
        String url
) {

        public void convert(final Banner banner){

                banner.setName(this.name);
                banner.setDescription(this.description);
                banner.setUrl(this.url);

        }
}
