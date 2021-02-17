package com.example.oauth.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HelloWorldResource {

    @GetMapping("/hello")
    public String helloWorldPublico() {
        return "Hello World público!";
    }

    @GetMapping("/restricted")
    public String helloWorldRestricted() {
        return "Hello World restrito!";
    }
}