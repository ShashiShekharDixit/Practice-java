package com.practice.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
