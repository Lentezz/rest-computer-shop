package com.shop.restcomputershop.controller;

import com.shop.restcomputershop.dto.Customer;
import com.shop.restcomputershop.dto.Order;
import com.shop.restcomputershop.service.DesktopService;
import com.shop.restcomputershop.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final DesktopService desktopService;

    @PostMapping(path = "/create")
    public ResponseEntity<Order> createComputer(@RequestBody Customer customer){
        Order newOrder = orderService.createOrder(desktopService.getComputerById(customer.getComputerId()), customer);
        return ResponseEntity.ok(newOrder);
    }
}
