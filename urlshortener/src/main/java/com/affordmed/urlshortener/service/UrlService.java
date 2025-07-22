package com.affordmed.urlshortener.service;

import com.affordmed.urlshortener.model.Url;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class UrlService {
    private final Map<String, Url> urlMap = new HashMap<>();

    public String shortenUrl(String originalUrl, int expiryMinutes) {

        String shortCode = UUID.randomUUID().toString().substring(0, 6);
        LocalDateTime expiryTime = LocalDateTime.now().plusMinutes(expiryMinutes);
        Url url = new Url(originalUrl, shortCode, expiryTime);
        urlMap.put(shortCode, url);
        return shortCode;

    }

    public String getOriginalUrl(String shortCode) {
        Url url = urlMap.get(shortCode);
        if (url == null) {
            return null;
        }
        if (url.getExpiry().isBefore(LocalDateTime.now())) {

            urlMap.remove(shortCode);
            return null;

        }

        return url.getOriginalUrl();
    }
}
