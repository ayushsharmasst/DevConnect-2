package com.devconnect.DevConnect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.*;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return "Devconnect backend is LIVE and HEALTHY!!!";
    }

    @GetMapping("/api/v1/status")
    public Map<String, Object> status() {
        Map<String, Object> map = new HashMap<>();
        map.put("Service", "DevConnect");
        map.put("Status", "Running");
        map.put("Version", "1.0.0");
        map.put("Timestamp", LocalDateTime.now().toString());

        return map;
    }

    // JACKSON - Convert JAVA Object to JSON objects.

}
