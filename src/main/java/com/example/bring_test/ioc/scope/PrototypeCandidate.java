package com.example.bring_test.ioc.scope;

import svydovets.core.annotation.Component;
import svydovets.core.annotation.Scope;
import svydovets.core.context.ApplicationContext;

@Component
@Scope(ApplicationContext.SCOPE_PROTOTYPE)
public class PrototypeCandidate {

}
