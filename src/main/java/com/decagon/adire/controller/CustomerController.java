package com.decagon.adire.controller;

import com.decagon.adire.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adire/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
}
