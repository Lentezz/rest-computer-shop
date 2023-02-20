package com.shop.restcomputershop.service;

import com.shop.restcomputershop.dto.MonoBlock;
import com.shop.restcomputershop.entity.MonoBlockEntity;
import com.shop.restcomputershop.repository.MonoBlockRepository;
import com.shop.restcomputershop.util.ComputerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class MonoBlockService {

    private final ComputerMapper computerMapper;
    private final MonoBlockRepository monoBlockRepository;

    @Transactional
    public MonoBlock createComputer(MonoBlock monoBlock) {
        MonoBlockEntity monoBlockEntity = (MonoBlockEntity) computerMapper.convert(monoBlock);
        return (MonoBlock) computerMapper.convert(monoBlockRepository.save(monoBlockEntity));
    }
}
