package com.example.bring_test.beans;

import svydovets.core.annotation.Component;

@Component
public class MessageService {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
