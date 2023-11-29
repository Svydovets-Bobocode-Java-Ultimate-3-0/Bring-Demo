package com.example.bring_test.primary;

import svydovets.core.context.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("com.example.bring_test.primary");
        System.out.println(context.getBean(InjectionCandidate.class));
    }
}
