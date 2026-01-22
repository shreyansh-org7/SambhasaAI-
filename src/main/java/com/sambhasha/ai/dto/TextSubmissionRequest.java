package com.sambhasha.ai.dto;

import jakarta.validation.constraints.NotBlank;

public class TextSubmissionRequest {

    @NotBlank
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @NotBlank
    private String context; // Interview, Business Casual, etc.

    // getters & setters
}
