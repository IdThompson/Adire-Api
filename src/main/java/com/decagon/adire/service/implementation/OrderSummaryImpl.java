package com.decagon.adire.service.implementation;

import com.decagon.adire.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderSummaryImpl {
    @Autowired
    private OrderRepository orderRepository;
}
