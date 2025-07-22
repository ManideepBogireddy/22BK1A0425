package com.affordmed.urlshortener.model;

import java.time.LocalDateTime;

public class Url {

    private String originalUrl;
    private String shortCode;
    private LocalDateTime expiry;

    public Url() {
    }

    public Url(String originalUrl, String shortCode, LocalDateTime expiry) {

        this.originalUrl = originalUrl;
        this.shortCode = shortCode;
        this.expiry = expiry;

    }

    public String getOriginalUrl() {

        return originalUrl;

    }

    public void setOriginalUrl(String originalUrl) {

        this.originalUrl = originalUrl;
    }

    public String getShortCode() {

        return shortCode;

    }

    public void setShortCode(String shortCode) {

        this.shortCode = shortCode;

    }

    public LocalDateTime getExpiry() {

        return expiry;

    }

    public void setExpiry(LocalDateTime expiry) {

        this.expiry = expiry;

    }
}
