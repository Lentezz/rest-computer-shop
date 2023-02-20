package com.shop.restcomputershop.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.bytebuddy.utility.nullability.MaybeNull;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
public class MonoBlockEntity extends LaptopEntity {
    @MaybeNull
    private boolean builtInSpeakers;
}
