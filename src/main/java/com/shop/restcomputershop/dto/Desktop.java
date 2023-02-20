package com.shop.restcomputershop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Desktop {
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

    @Override
    public String toString() {
        return "Brand - " + brand
                + ", processor - " + processorName
                + " - " + coreNumber + " cores, "
                + "Video card - " + videoCardName + " " + videoCardMemory + "GB"
                + ", RAM - " + ramAmount + "GB"
                + ", HDD - " + hddAmount + "GB";
    }
}
