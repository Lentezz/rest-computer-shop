package com.shop.restcomputershop.service;

import com.shop.restcomputershop.dto.Customer;
import com.shop.restcomputershop.dto.Desktop;
import com.shop.restcomputershop.dto.Order;
import com.shop.restcomputershop.entity.OrderEntity;
import com.shop.restcomputershop.repository.ComputerRepository;
import com.shop.restcomputershop.repository.OrderRepository;
import com.shop.restcomputershop.util.ComputerMapper;
import com.shop.restcomputershop.util.OrderMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final ComputerRepository computerRepository;
    private final OrderMapper orderMapper;
    private final ComputerMapper computerMapper;


    @Transactional
    public Order createOrder(Desktop desktop, Customer customer){
        if(computerRepository.findById(desktop.getId()).isEmpty()
                || desktop.getAvailableQuantity() < 1) return null;

        OrderEntity order = new OrderEntity();
        order.setClientEmail(customer.getEmail());
        order.setClientName(customer.getName());
        order.setComputerInfo(desktop.toString());
        order.setOrderPrice(desktop.getPrice());
        desktop.setAvailableQuantity(desktop.getAvailableQuantity() - 1);
        computerRepository.save(computerMapper.convert(desktop));
        return orderMapper.convert(orderRepository.save(order));
    }

}
