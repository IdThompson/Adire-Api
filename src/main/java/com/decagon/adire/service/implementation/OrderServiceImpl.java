package com.decagon.adire.service.implementation;

import com.decagon.adire.repository.OrderRepository;
import com.decagon.adire.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
}
