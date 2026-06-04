package com.demo.cicd_app;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }

    @GetMapping("/version")
    public Map<String, String> version() {
        return Map.of(
                "version", "1.0.0",
                "app", "cicd-demo"
        );
    }
}