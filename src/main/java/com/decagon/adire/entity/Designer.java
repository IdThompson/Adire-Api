package com.decagon.adire.entity;

import com.decagon.adire.enums.Role;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "designers")
public class Designer extends BaseEntity {
    private String firstName;
    private  String lastName;
    private String email;
    private  String phoneNumber;
    private  String password;
    private  String confirmPassword;
    @Enumerated(EnumType.STRING)
    private Role role;
}
