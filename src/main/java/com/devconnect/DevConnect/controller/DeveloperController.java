package com.devconnect.DevConnect.controller;

import com.devconnect.DevConnect.model.Developer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/v1/developers")
public class DeveloperController {

    // ─── In-Memory Storage ────────────────────────────────────────
    // ConcurrentHashMap is thread-safe — safe for concurrent requests
    // AtomicLong is thread-safe for ID generation
    // WARNING: All data is lost when the server restarts!
    private final Map<Long, Developer> developerStore = new ConcurrentHashMap<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    @GetMapping("/{id}")
    public Developer getDeveloperById(@PathVariable Long id) {
        return new Developer();
    }

    @GetMapping("/{skill1}/{skill2}")
    public List<Developer> getDevelopersBySkills(@PathVariable String skill1, @PathVariable String skill2) {
        return new ArrayList<>();
    }

    // GET /api/v1/developes/search?skill=Java&city=Bangalore&count=15
    @GetMapping("/search")
    public List<Developer> getDevelopersBySkillAndLocation(
             @RequestParam String skill,
             @RequestParam(required = false) String city,
             @RequestParam(defaultValue = "10") int count) {
        return new ArrayList<>();
    }


    // Body: {"name":"Riya","email":"riya@test.com","skills":["Java"]}
    @PostMapping
    public Developer createDeveloper(@RequestBody Developer developer) {
        System.out.println(developer.getName());
        System.out.println(developer.getEmail());

        return developer;
    }

}
