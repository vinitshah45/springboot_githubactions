package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "Hello World Controller", description = "Endpoints for greeting messages")
public class HelloWorldController {

    @GetMapping("/hello")
    @Operation(summary = "Get Greeting Message", description = "Returns a friendly greeting message")
    public String getGreeting() {
        return "Welcome to world of AI";
    }

    @GetMapping("/health")
    @Operation(summary = "Check Health", description = "Returns a message indicating the service is up")
    public String checkHealth() {
        return "Helllo world - it's up now";
    }
}
