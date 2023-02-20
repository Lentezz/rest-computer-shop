package com.shop.restcomputershop.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Order {
    private Long id;
    private String clientName;
    private String clientEmail;
    private String computerInfo;
    private double orderPrice;
}
