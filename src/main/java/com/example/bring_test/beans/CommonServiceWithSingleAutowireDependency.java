package com.example.bring_test.beans;

import svydovets.core.annotation.Autowired;
import svydovets.core.annotation.Component;

public class CommonServiceWithSingleAutowireDependency {

    private final InjectionCandidate injectionCandidate;

    @Autowired
    public CommonServiceWithSingleAutowireDependency(InjectionCandidate injectionCandidate) {
        this.injectionCandidate = injectionCandidate;
    }

    @Override
    public String toString() {
        return "CommonServiceWithSingleAutowireDependency{" +
                "injectionCandidate=" + injectionCandidate +
                '}';
    }
}
