package com.decagon.adire.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "orderSummary")
public class OrderSummary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderSummaryID;
    private  String orderDate;
    private  String firstName;
    private  String lastName;
    private  String productType;
    private  int productMeasurement;
    private  int phoneNumber;
    private String email;
    private  int productQuantity;
    private double amount;
    private String paymentDate;
    private  String streetNo;
    private  String street;
    private String city;
    private  String state;


    // Relationship between the entities
    @ManyToOne
    private  Customer customerId;

    @OneToOne
    private  Order orderId;


}
