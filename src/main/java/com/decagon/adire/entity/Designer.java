package com.decagon.adire.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Designer")
public class Designer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String firstName;
    private  String lastName;
    private   String userName;
    private String email;
    private  int phoneNumber;
    private  String password;
}
