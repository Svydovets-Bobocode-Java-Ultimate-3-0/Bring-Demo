package com.example.bring_test.ioc.postConstruct;

import svydovets.core.annotation.Component;
import svydovets.core.annotation.PostConstruct;

@Component
public class ServiceWithPostConstruct {

    private String message;

    @PostConstruct
    public void init() {
        message = "Message loaded with @PostConstruct";
    }

    public String getMessage() {
        return message;
    }
}
