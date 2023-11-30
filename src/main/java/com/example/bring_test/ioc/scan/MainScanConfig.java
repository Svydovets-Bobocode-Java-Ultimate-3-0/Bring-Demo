package com.example.bring_test.ioc.scan;

import svydovets.core.context.AnnotationConfigApplicationContext;

public class MainScanConfig {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ScanConfigTest.class);
        var beans = context.getBeans();
        System.out.println(beans);
    }
}
