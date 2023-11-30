package com.example.bring_test.ioc.primary;

import svydovets.core.context.AnnotationConfigApplicationContext;

public class MainPrimary {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("com.example.bring_test.ioc.primary");
        InjectionCandidate primaryInjectCandidate = context.getBean(InjectionCandidate.class);
        System.out.println(primaryInjectCandidate);
    }
}
