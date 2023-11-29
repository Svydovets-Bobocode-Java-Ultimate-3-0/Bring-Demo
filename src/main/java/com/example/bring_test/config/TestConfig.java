package com.example.bring_test.config;

import com.example.bring_test.beans.MessageService;
import com.example.bring_test.beans.PrintService;
import svydovets.core.annotation.Bean;
import svydovets.core.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public MessageService messageService() {
        MessageService messageService = new MessageService();
        messageService.setMessage("Hello from \"MessageService\"");
        return messageService;
    }

    @Bean
    public PrintService printService(MessageService messageService) {
        return new PrintService(messageService);
    }
}
