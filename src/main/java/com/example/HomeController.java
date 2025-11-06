package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Java 21 Spring Boot Application! 🚀\n" +
               "The application is running successfully.\n" +
               "Try these endpoints:\n" +
               "- GET /status - Check application status\n" +
               "- GET / - This welcome message";
    }

    @GetMapping("/status")
    public String status() {
        return "Application Status: OK ✅\n" +
               "Java Version: " + System.getProperty("java.version") + "\n" +
               "Spring Boot Version: 3.2.0";
    }
}