package com.decagon.adire.service.implementation;

import com.decagon.adire.repository.DesignerRepository;
import com.decagon.adire.service.DesignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesignerServiceImpl implements DesignerService {
    @Autowired
    private DesignerRepository designerRepository;
}
