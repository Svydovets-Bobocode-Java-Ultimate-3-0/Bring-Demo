package com.example.bring_test.ioc.autowiring;

import com.example.bring_test.ioc.autowiring.constructor.ServiceWithAutowiredConstructor;
import com.example.bring_test.ioc.autowiring.field.EditService;
import com.example.bring_test.ioc.autowiring.setter.TrimService;
import com.example.bring_test.beans.CommonService;
import com.example.bring_test.ioc.primary.PrimaryInjectionCandidate;
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

        MessageService firstMessageService = serviceWithAutowiredConstructor.getMessageService();
        MessageService secondMessageService = editService.getMessageService();

        System.out.println(firstMessageService);
        System.out.println(secondMessageService);
        System.out.println(firstMessageService == secondMessageService);

        System.out.println(editService.getInjectionCandidate());
        System.out.println(trimService.getCommonService());
    }
}
