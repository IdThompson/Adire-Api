package com.decagon.adire.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "customer")
public class Customer {

    // a customer can have many order
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long customerID; // 123445
    private int designerID;
    private String firstName;
    private String lastname;
    private String email;
    private int phoneNumber;
    private  int postalCode;
    private int streetNo;
    private  String street;
    private  String city;
    private  String state;

    @OneToMany(targetEntity = Order.class, cascade = CascadeType.ALL)
    @JoinColumn(name = " order_fk", referencedColumnName = "customerID")
    private List<Order> orders;




}
