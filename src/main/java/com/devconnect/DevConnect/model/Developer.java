package com.devconnect.DevConnect.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Developer {
    private Long id;
    private String name;
    private String email;
    private String bio;
    private String city;
    private List<String> skills;
    private String linkedInURL;
    private String githubInURL;
    private Double yearsOfExperience;
    private LocalDateTime createdAt;


    public Developer() {
        createdAt = LocalDateTime.now();
    }

    public Developer(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.skills = new ArrayList<>();
        createdAt = LocalDateTime.now();
    }

    // ─── Getters and Setters ─────────────────────────────────────
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<String> getSkills() {
        return skills;
    }

    // Is this method safe?
    public void setSkills(List<String> skills) {
        if (skills == null) {
            this.skills = skills;
        }
    }

    public void addSkill(String skill) {
        if (skills == null) {
            skills = new ArrayList<>();
        }
        this.skills.add(skill);
    }

    public void addSkills(List<String> skills) {
        if (skills == null) {
            this.skills = skills;
        } else {
            this.skills.addAll(skills);
        }
    }

    public String getLinkedInURL() {
        return linkedInURL;
    }

    public void setLinkedInURL(String linkedInURL) {
        this.linkedInURL = linkedInURL;
    }

    public String getGithubInURL() {
        return githubInURL;
    }

    public void setGithubInURL(String githubInURL) {
        this.githubInURL = githubInURL;
    }

    public Double getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Double yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
