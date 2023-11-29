package com.example.bring_test.autowiring;

import com.example.bring_test.autowiring.constructor.ServiceWithAutowiredConstructor;
import com.example.bring_test.autowiring.field.EditService;
import com.example.bring_test.autowiring.setter.TrimService;
import com.example.bring_test.beans.CommonService;
import com.example.bring_test.primary.PrimaryInjectionCandidate;
import com.example.bring_test.beans.MessageService;
import svydovets.core.context.AnnotationConfigApplicationContext;

public class MainAutowiring {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(
                ServiceWithAutowiredConstructor.class,
                MessageService.class,
                EditService.class,
                PrimaryInjectionCandidate.class,
                TrimService.class,
                CommonService.class
        );
        var serviceWithAutowiredConstructor = context.getBean(ServiceWithAutowiredConstructor.class);
        var editService = context.getBean(EditService.class);
        var trimService = context.getBean(TrimService.class);

        System.out.println(serviceWithAutowiredConstructor.getMessageService());
        System.out.println(editService.getMessageService());
        System.out.println(editService.getInjectionCandidate());
        System.out.println(trimService.getCommonService());
    }
}
