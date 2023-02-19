package com.decagon.adire.service.implementation;

import com.decagon.adire.repository.CustomerRepository;
import com.decagon.adire.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
}
