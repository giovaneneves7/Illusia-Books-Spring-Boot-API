package com.illusia.api.entity.banner.service;

import com.illusia.api.entity.banner.model.dto.request.CreateBannerRequestDto;
import com.illusia.api.entity.banner.model.dto.response.CreateBannerResponseDto;

public interface IBannerService {

    /**
     * Saves a new banner in the database.
     *
     * @param bannerDto The object with the banner data to be saved.
     * @return A DTO object with the ID and name of the banner saved.
     */
    CreateBannerResponseDto createBanner(final CreateBannerRequestDto bannerDto);
}
