package com.example.bring_test.ioc.scope;

import svydovets.core.context.AnnotationConfigApplicationContext;

public class MainScope {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("com.example.bring_test.ioc.scope");

        var firstSingleton = context.getBean(SingletonCandidate.class);
        var secondSingleton = context.getBean(SingletonCandidate.class);
        System.out.println(firstSingleton == secondSingleton);

        var firstPrototype = context.getBean(PrototypeCandidate.class);
        var secondPrototype = context.getBean(PrototypeCandidate.class);
        System.out.println(firstPrototype == secondPrototype);
    }
}
