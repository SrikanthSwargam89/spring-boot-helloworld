package com.example.spring_boot_helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String sendGreetings() {
        return "Hello, World!";
    }
}
