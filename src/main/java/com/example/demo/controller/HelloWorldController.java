package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "Hello World Controller", description = "Endpoints for greeting messages")
public class HelloWorldController {

    @GetMapping("/hello")
    @Operation(summary = "Get Greeting Message", description = "Returns a friendly greeting message")
    public String getGreeting(@RequestParam(name = "name", defaultValue = "World") String name) {
        return String.format("Hello, %s! Welcome to Spring Boot App.", name);
    }
}
