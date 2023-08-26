package com.illusia.api.entity.banner.service;

import com.illusia.api.entity.banner.model.Banner;
import com.illusia.api.entity.banner.model.dto.request.CreateBannerRequestDto;

import com.illusia.api.entity.banner.model.dto.response.CreateBannerResponseDto;
import com.illusia.api.entity.banner.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerService implements IBannerService{


    @Autowired
    BannerRepository bannerRepository;


    /**
     * Saves a new banner in the database.
     *
     * @param bannerDto The object with the banner data to be saved.
     * @return A DTO object with the ID and name of the banner saved.
     */
    @Override
    public CreateBannerResponseDto createBanner(final CreateBannerRequestDto bannerDto) {

        List<Banner> banners = bannerRepository.findAll();

        Banner banner = new Banner();
        bannerDto.convert(banner);

        if(!banners.isEmpty()){

            // Logic for banner name validation...
        }

        bannerRepository.save(banner);

        return new CreateBannerResponseDto(banner.getId(),banner.getName());
    }
}
