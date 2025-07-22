package com.affordmed.urlshortener.controller;

import com.affordmed.urlshortener.model.UrlRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UrlController {

    @PostMapping("/shorten")
    public ResponseEntity<String> shortenUrl(@RequestBody UrlRequest request) {
        String originalUrl = request.getUrl();
        System.out.println("Received URL: " + originalUrl);
        return ResponseEntity.ok("shortened-url-for: " + originalUrl);
    }

    @GetMapping("/original/{shortCode}")
    public ResponseEntity<String> getOriginalUrl(@PathVariable String shortCode) {
        return ResponseEntity.ok("Original URL for code: " + shortCode);
    }

}
