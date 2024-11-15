package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trivydemo")
public class Greet {

    private static final Logger logger = LoggerFactory.getLogger(Greet.class);

    @GetMapping("/greet")
    public ResponseEntity<String> greet() {
        System.out.println("Starting");
        logger.info("Starting :: /api/trivydemo/greet");
        return ResponseEntity.ok().body("Hello from Trivy Demo");
    }

}
