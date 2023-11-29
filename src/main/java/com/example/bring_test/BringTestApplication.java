package com.example.bring_test;

import svydovets.BringApplication;
import svydovets.core.context.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class BringTestApplication {

    public static void main(String[] args) {
//        SpringApplication.run(BringTestApplication.class, args);
//        var applicationContext = new AnnotationConfigApplicationContext("com.example.bring_test");
        var applicationContext = BringApplication.run(BringTestApplication.class);
    }

}
