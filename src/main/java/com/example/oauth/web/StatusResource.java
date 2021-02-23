package com.example.oauth.web;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("status")
public class StatusResource {

    @GetMapping
    @ResponseBody
    public String status() {
        return "Another OK";
    }
}