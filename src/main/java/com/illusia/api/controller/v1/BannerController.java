package com.illusia.api.controller.v1;

import com.illusia.api.entity.banner.model.dto.request.CreateBannerRequestDto;
import com.illusia.api.service.IFacade;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
@Slf4j
public class BannerController {

    @Autowired
    IFacade facade;

    @PostMapping(path = "/banners/banner")
    public ResponseEntity<?> createBanner(@RequestBody CreateBannerRequestDto bannerDto,
                                          BindingResult result){

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(this.facade.createBanner(bannerDto));

    }
}
