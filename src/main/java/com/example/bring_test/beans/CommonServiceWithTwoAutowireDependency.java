package com.example.bring_test.beans;

import svydovets.core.annotation.Autowired;
import svydovets.core.annotation.Component;

@Component
public class CommonServiceWithTwoAutowireDependency {

    private final InjectionCandidate firstInjectionCandidate;
    private final InjectionCandidate secondInjectionCandidate;

    @Autowired
    public CommonServiceWithTwoAutowireDependency(InjectionCandidate firstInjectionCandidate, InjectionCandidate secondInjectionCandidate) {
        this.firstInjectionCandidate = firstInjectionCandidate;
        this.secondInjectionCandidate = secondInjectionCandidate;
    }
}
