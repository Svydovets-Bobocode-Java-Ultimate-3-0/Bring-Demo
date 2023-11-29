package com.example.invalid.qualifier;

import svydovets.core.annotation.Autowired;
import svydovets.core.annotation.Component;
import svydovets.core.annotation.Qualifier;

@Component
public class OrderService {

    @Qualifier("storeItem")
    @Autowired
    private Item item;



}
