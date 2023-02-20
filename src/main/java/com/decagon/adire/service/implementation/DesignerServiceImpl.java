package com.decagon.adire.service.implementation;

import com.decagon.adire.dto.request.LoginDTO;
import com.decagon.adire.entity.Designer;
import com.decagon.adire.exception.UserNotFoundException;
import com.decagon.adire.repository.DesignerRepository;
import com.decagon.adire.service.DesignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesignerServiceImpl implements DesignerService {
    @Autowired
    private DesignerRepository designerRepository;

    @Override
    public String designerlogin(LoginDTO loginDTO) {
        Designer designer = designerRepository.findByEmail(loginDTO.getEmail());
        if(designer != null){
            if(designer.getPassword().equals(loginDTO.getPassword())){
                return  "login successfully";
            } else{
                return "incorrect password";
            }
        } else {
            throw new UserNotFoundException("User Not Found");
        }
    }
}
