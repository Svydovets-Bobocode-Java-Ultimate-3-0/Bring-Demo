package com.example.bring_test.config;

import com.example.bring_test.beans.PrintService;
import svydovets.core.context.AnnotationConfigApplicationContext;

public class MainConfig {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(TestConfig.class);
        var printService = context.getBean(PrintService.class);

        printService.print();
    }
}
