package com.in28minutes.springboot;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    public String welcome() {
        return "Welcome bro";
    }
}
