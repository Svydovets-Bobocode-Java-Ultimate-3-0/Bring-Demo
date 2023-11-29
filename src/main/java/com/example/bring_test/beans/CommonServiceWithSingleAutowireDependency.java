package com.example.bring_test.beans;

import com.example.bring_test.primary.InjectionCandidate;
import svydovets.core.annotation.Autowired;

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
