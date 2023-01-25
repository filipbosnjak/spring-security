package com.example.springsecurity.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public ResponseEntity<String> hello() {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("asdf", "asdf");
        return ResponseEntity
                .status(200)
                .headers(responseHeaders)
                .body("hello");
    }

    @GetMapping("/admin")
    public ResponseEntity<String> admin() {

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("asdf", "asdf");

        return ResponseEntity
                .status(200)
                .headers(responseHeaders)
                .body("Hello admin");
    }
}
