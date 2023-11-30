package com.example.invalid.qualifier;

import svydovets.core.annotation.Autowired;
import svydovets.core.annotation.Component;
import svydovets.core.annotation.Qualifier;

@Component
public class OrderService {

    @Autowired
    @Qualifier("storeItem")
    private Item item;

    public Item getItem() {
        return item;
    }
}
