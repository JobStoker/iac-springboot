package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;


@RestController
public class controller {

    @PostMapping("/welcome")
    public String getName(@@RequestBody Map<String, Object> naam){
        String message = "Welcome, " + naam;
        return message;
    }

    @GetMapping("/current-date")
    public LocalDateTime getCurrentDate(){
        LocalDateTime date = LocalDateTime.now();
        return date;
    }
}