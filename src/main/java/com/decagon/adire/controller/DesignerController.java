package com.decagon.adire.controller;

import com.decagon.adire.service.DesignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesignerController {
    @Autowired
    private DesignerService designerService;
}
