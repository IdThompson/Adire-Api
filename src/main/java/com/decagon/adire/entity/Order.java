package com.decagon.adire.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long orderID; // 12345
    private int customerID;
    private  int designerID_1;
    private String orderDate;
    private String duration;
    private String dueDate;
    private  int productMeasurement;
    private String productType;
    private  int productQuantity;
    private  double productAmount;
    private  String paymentDate;

}
