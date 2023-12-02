package com.example.bring_test.ioc.qualifier;

import svydovets.core.context.AnnotationConfigApplicationContext;

public class MainQualifire {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("com.example.bring_test.ioc.qualifier");
        var orderService = context.getBean(OrderService.class);

        System.out.println(orderService.getItem());
    }
}
