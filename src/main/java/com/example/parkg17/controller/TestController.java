package com.example.parkg17.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String dummyTest() {
        return "a";
    }

    @GetMapping("/dummy")
    public String dummyTest1() {
        return "a";
    }

    @GetMapping("/dummy/{id}")
    public Long dummyTest2(@PathVariable Long id) {
        return id;
    }

    @PostMapping("/dummy")
    public String dummyTest2() {
        return "a";
    }
}
