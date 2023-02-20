package com.shop.restcomputershop.service;

import com.shop.restcomputershop.dto.Desktop;
import com.shop.restcomputershop.entity.DesktopEntity;
import com.shop.restcomputershop.repository.DesktopRepository;
import com.shop.restcomputershop.util.ComputerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DesktopService {
    private final ComputerMapper computerMapper;
    private final DesktopRepository desktopRepository;

    @Transactional
    public Desktop createComputer(Desktop desktop){
        DesktopEntity desktopEntity = computerMapper.convert(desktop);
        return computerMapper.convert(desktopRepository.save(desktopEntity));
    }

    @Transactional(readOnly = true)
    public Desktop getComputerById(Long computerId){
        return desktopRepository.findById(computerId).map(computerMapper::convert).orElse(new Desktop());
    }

    @Transactional
    public void deleteComputer(Long computerId){
        desktopRepository.deleteById(computerId);
    }

    @Transactional(readOnly = true)
    public List<Desktop> getAllComputers(){
        return desktopRepository.findAll().stream().map(computerMapper::convert).collect(Collectors.toList());
    }
}
