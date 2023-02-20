package com.shop.restcomputershop.dto;


import lombok.*;
import net.bytebuddy.utility.nullability.MaybeNull;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonoBlock extends Laptop {
    @MaybeNull
    private boolean builtInSpeakers;

    @Override
    public String toString() {
        return super.toString() + ", speakers - " + builtInSpeakers + ".";
    }
}
