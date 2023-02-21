package com.decagon.adire.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CustomerDTO {
    private String firstName;
    private String lastname;
    private String email;
    private int phoneNumber;
    private  String address;
}
