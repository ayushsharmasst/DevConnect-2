package com.devconnect.DevConnect.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @PostMapping("/api/v1/developers")
    public String createDeveloper() {

        return "Developer created";
    }

}
