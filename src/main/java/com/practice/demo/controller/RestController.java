package com.practice.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.web.bind.annotation.RestController
public interface RestController {

@GetMapping(value = "/get")
    public void GetImpl();

@PostMapping(value = "/post")
    public void PostImpl();
}
