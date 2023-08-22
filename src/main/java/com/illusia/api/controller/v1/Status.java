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

    @GetMapping(path = "/status")
    public ResponseEntity<?> getStatus(){

        return ResponseEntity.status(HttpStatus.OK).body("API online!");

    }

}
