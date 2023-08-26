package com.illusia.api.service;

import com.illusia.api.entity.banner.model.dto.request.CreateBannerRequestDto;
import com.illusia.api.entity.banner.model.dto.response.CreateBannerResponseDto;

public interface IFacade {

    // ======================{ - BANNERS - }====================== //

    /**
     * Saves a new banner in the database.
     *
     * @param bannerDto The object with the banner data to be saved.
     * @return A DTO object with the ID and name of the banner saved.
     */
    CreateBannerResponseDto createBanner(CreateBannerRequestDto bannerDto);
}
