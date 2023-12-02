package com.example.bring_test.ioc.qualifier;

import svydovets.core.annotation.Component;

import java.math.BigDecimal;

@Component
public class GroceryItem implements Item{
    @Override
    public BigDecimal calculatePrice() {
        return BigDecimal.ONE;
    }
}
