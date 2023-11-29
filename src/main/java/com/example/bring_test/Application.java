package com.example.bring_test;

import svydovets.core.context.AnnotationConfigApplicationContext;
import svydovets.core.context.ApplicationContext;

import java.util.Map;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.example.bring_test.beans");
        Map<String, Object> beans = applicationContext.getBeans();
    }
}
