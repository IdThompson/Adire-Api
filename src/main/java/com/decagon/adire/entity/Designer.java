package com.decagon.adire.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Designer")
public class Designer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long designerID; // 12345
    private String firstName;
    private  String lastName;
    private String email;
    private  int phoneNumber;
    private   String userName;
    private  String password;
}
