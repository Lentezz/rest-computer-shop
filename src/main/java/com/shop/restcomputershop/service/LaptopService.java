package com.shop.restcomputershop.service;

import com.shop.restcomputershop.dto.Laptop;
import com.shop.restcomputershop.entity.LaptopEntity;
import com.shop.restcomputershop.repository.LaptopRepository;
import com.shop.restcomputershop.util.ComputerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@AllArgsConstructor
public class LaptopService{

    private final LaptopRepository laptopRepository;
    private final ComputerMapper laptopMapper;

    @Transactional
    public Laptop createComputer(Laptop computer) {
        LaptopEntity computerEntity = (LaptopEntity) laptopMapper.convert(computer);
        return (Laptop) laptopMapper.convert(laptopRepository.save(computerEntity));
    }
}
