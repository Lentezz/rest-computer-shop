package com.shop.restcomputershop.controller;

import com.shop.restcomputershop.dto.Desktop;
import com.shop.restcomputershop.dto.Laptop;
import com.shop.restcomputershop.dto.MonoBlock;
import com.shop.restcomputershop.service.DesktopService;
import com.shop.restcomputershop.service.LaptopService;
import com.shop.restcomputershop.service.MonoBlockService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@RestController(value = "/")
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ComputerController {

    DesktopService desktopService;
    LaptopService laptopService;
    MonoBlockService monoBlockService;

    @GetMapping(path = "/computers/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<Desktop> getComputer(@PathVariable Long id){
        Desktop desktop = desktopService.getComputerById(id);
        return ResponseEntity.ok(desktop);
    }

    @GetMapping(path = "/computers/all",
            produces = {MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<Desktop>> getAllComputers(){
        List<Desktop> desktops = desktopService.getAllComputers();
        return ResponseEntity.ok(desktops);
    }

    @PostMapping(path = "/add/desktop")
    public ResponseEntity<Desktop> createComputer(@RequestBody Desktop desktop){
        Desktop newDesktop = desktopService.createComputer(desktop);
        return ResponseEntity.ok(newDesktop);
    }

    @PostMapping(path = "/add/laptop")
    public ResponseEntity<Laptop> createComputer(@RequestBody Laptop computer){
        Laptop newComputer = laptopService.createComputer(computer);
        return ResponseEntity.ok(newComputer);
    }

    @PostMapping(path = "/add/mono")
    public ResponseEntity<MonoBlock> createComputer(@RequestBody MonoBlock monoBlock){
        MonoBlock newComputer = monoBlockService.createComputer(monoBlock);
        return ResponseEntity.ok(newComputer);
    }

    @GetMapping(path = "/computers/type/{type}",
            produces = {MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<Desktop>> getComputersByType(@PathVariable("type") String type){
        List<Desktop> desktops = desktopService.getAllComputers();
        type = type.toUpperCase(Locale.ROOT);
        String finalType = type;
        desktops = desktops.stream().filter(c -> c.getClass().getSimpleName().toUpperCase(Locale.ROOT).equals(finalType)).collect(Collectors.toList());
        return ResponseEntity.ok(desktops);
    }

}