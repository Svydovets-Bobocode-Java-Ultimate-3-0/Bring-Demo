package com.example.bring_test.ioc.autowiring.constructor;

import com.example.bring_test.beans.MessageService;
import svydovets.core.annotation.Autowired;
import svydovets.core.annotation.Component;

@Component
public class ServiceWithAutowiredConstructor {

    private final MessageService messageService;

    @Autowired
    public ServiceWithAutowiredConstructor(MessageService messageService) {
        this.messageService = messageService;
    }

    public MessageService getMessageService() {
        return messageService;
    }
}
