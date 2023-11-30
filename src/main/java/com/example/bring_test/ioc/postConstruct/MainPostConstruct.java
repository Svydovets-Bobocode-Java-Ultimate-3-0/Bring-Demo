package com.example.bring_test.ioc.postConstruct;

import svydovets.core.context.AnnotationConfigApplicationContext;

public class MainPostConstruct {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("com.example.bring_test.ioc.postConstruct");
        var serviceWithPostConstruct = context.getBean(ServiceWithPostConstruct.class);
        System.out.println(serviceWithPostConstruct.getMessage());
    }
}
