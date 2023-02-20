package com.shop.restcomputershop.dto;

import lombok.*;
import net.bytebuddy.utility.nullability.MaybeNull;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop extends Desktop {
    @MaybeNull
    private double displaySize;
    @MaybeNull
    private int screenResolutionX;
    @MaybeNull
    private int screenResolutionY;


    @Override
    public String toString() {
        return super.toString() + ", display size - " + displaySize
                + " inch (" + screenResolutionX + " x " + screenResolutionY + ")px";
    }
}
