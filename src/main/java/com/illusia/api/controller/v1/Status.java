package com.illusia.api.controller.v1;

import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1")
@Slf4j
public class Status {

    /**
     * @author Giovane Neves
     * Since v0.0.1
     * Created 22/08/2023 10:37 AM
     *
     * Returns OK status if the API is online
     * @return a response with status 200 (OK).
     */
    @GetMapping(path = "/status")
    public ResponseEntity<?> getStatus(){

        return ResponseEntity.status(HttpStatus.OK).body("API online!");

    }

}
