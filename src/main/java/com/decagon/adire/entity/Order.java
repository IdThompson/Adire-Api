package com.decagon.adire.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order extends BaseEntity{
    private  String measurement;
    private String materialType;
    private  String designImage;
    private  int numberOfOrders;
    private String duration;
    private  double orderPrice;
    private  String paymentDate;
    private LocalDateTime dueDate;

    @ManyToOne
    @JoinColumn(name ="customerId", referencedColumnName = "id")
    private Customer customer;
    @OneToOne(mappedBy = "order")
    private Receipt receipt;

}
