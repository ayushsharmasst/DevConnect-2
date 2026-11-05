package com.devconnect.DevConnect.controller;

import com.devconnect.DevConnect.model.Developer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/developers")
public class DeveloperController {

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
