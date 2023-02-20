package com.decagon.adire.controller;

import com.decagon.adire.dto.request.LoginDTO;
import com.decagon.adire.dto.response.BaseResponse;
import com.decagon.adire.service.DesignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/adire")
public class DesignerController {
    @Autowired
    private DesignerService designerService;

    @PostMapping("/designerlogin")
    public ResponseEntity<BaseResponse<String>> login(@RequestBody LoginDTO loginDTO){
        return  new ResponseEntity<>( new BaseResponse<>(designerService.designerlogin(loginDTO), "Success"), HttpStatus.OK);
    }

}
