package com.illusia.api.service;

import com.illusia.api.entity.banner.model.dto.request.CreateBannerRequestDto;
import com.illusia.api.entity.banner.model.dto.response.CreateBannerResponseDto;
import com.illusia.api.entity.banner.service.IBannerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Facade implements IFacade{

    @Autowired
    IBannerService bannerService;

    // ======================{ - BANNERS - }====================== //

    /**
     * Saves a new banner in the database.
     *
     * @param bannerDto The object with the banner data to be saved.
     * @return A DTO object with the ID and name of the banner saved.
     */
    @Override
    public CreateBannerResponseDto createBanner(CreateBannerRequestDto bannerDto) {

        return this.bannerService.createBanner(bannerDto);

    }
}
