package com.example.bring_test;

import svydovets.BringApplication;
import svydovets.core.context.ApplicationContext;

public class IocApplicationDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = BringApplication.run(IocApplicationDemo.class);
    }
}