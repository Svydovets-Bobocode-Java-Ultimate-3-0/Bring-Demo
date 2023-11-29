package com.example.bring_test.beans;

import svydovets.core.annotation.Autowired;
import svydovets.core.annotation.Component;

@Component
public class PrintService {

    private final MessageService messageService;

    @Autowired
    public PrintService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void print() {
        System.out.println(messageService.getMessage());
    }
}
