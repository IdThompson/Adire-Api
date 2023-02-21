package com.decagon.adire.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")
public class Customer extends BaseEntity {
    private String firstName;
    private String lastname;
    private String email;
    private int phoneNumber;
    private  String address;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders = new ArrayList<>();
    @OneToMany(mappedBy = "customer")
    private List<Receipt> receipts = new ArrayList<>();




}
