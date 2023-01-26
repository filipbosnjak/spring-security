package com.example.springsecurity.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    public ResponseEntity<String> admin() {
        return ResponseEntity.status(200).body("root admin");
    }

    @GetMapping("/settings")
    public ResponseEntity<String> adminSettings() {
        return ResponseEntity.status(200).body("admin settings");
    }
}
