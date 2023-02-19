package com.decagon.adire.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private String firstName;
    private String lastname;
    private String email;
    private int phoneNumber;
    private  int postalCode;
    private int streetNo;
    private  String street;
    private  String city;
    private  String state;
}
