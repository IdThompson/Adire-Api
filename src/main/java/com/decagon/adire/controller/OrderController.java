package com.decagon.adire.controller;

import com.decagon.adire.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adire/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
}
