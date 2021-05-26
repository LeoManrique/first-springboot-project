package com.in28minutes.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
    public String retrieveWelcomeMessage() {
        return "Welcome dude";
    }
}
