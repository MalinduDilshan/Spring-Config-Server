package com.interblocks.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@RefreshScope
public class HelloResource {

    @Value("${message}")
    private String message;

    @GetMapping
    public String greetings(){
        return "Hello "+message;
    }
}
