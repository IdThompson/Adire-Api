package com.decagon.adire.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private int customerID;
    private String orderDate;
    private String duration;
    private String dueDate;
    private  int productMeasurement;
    private String productType;
    private  int prodctQuantity;
    private  double productAmount;
    private  String paymentDate;


}
