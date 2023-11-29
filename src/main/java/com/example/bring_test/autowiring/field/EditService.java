package com.example.bring_test.autowiring.field;

import com.example.bring_test.primary.InjectionCandidate;
import com.example.bring_test.beans.MessageService;
import svydovets.core.annotation.Autowired;
import svydovets.core.annotation.Component;

@Component
public class EditService {

    @Autowired
    private MessageService messageService;

    @Autowired
    private InjectionCandidate injectionCandidate;

    public MessageService getMessageService() {
        return messageService;
    }

    public InjectionCandidate getInjectionCandidate() {
        return injectionCandidate;
    }
}
