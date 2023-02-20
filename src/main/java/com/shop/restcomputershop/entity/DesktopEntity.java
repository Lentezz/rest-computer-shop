package com.shop.restcomputershop.entity;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "computer")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DesktopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String processorName;
    private int coreNumber;
    private String videoCardName;
    private int videoCardMemory;
    private int ramAmount;
    private int hddAmount;
    private double price;
    private int availableQuantity;


}
