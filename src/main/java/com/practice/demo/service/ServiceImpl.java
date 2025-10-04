package com.practice.demo.service;

import com.practice.demo.controller.RestController;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements RestController {

    public void GetImpl(){
        System.out.println("Enter the Get Method");
    }

    public void PostImpl(){
        System.out.println("Enter the Post Method");
    }
}
