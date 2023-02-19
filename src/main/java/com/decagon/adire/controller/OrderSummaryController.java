package com.decagon.adire.controller;

import com.decagon.adire.service.OrderSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderSummaryController {
    @Autowired
    private OrderSummaryService orderSummaryService;
}
