package com.decagon.adire.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private  String measurement;
    private String materialType;
    private  String designImage;
    private  int numberOfOrders;
    private String duration;
    private  double orderPrice;
    private  String paymentDate;
    private LocalDateTime dueDate;
    private String customerId;


}
