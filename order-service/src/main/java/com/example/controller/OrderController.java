package com.example.controller;

import com.example.dto.OrderResponseDTO;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping("/home")
    public String greetingMessage() {
        return service.greeting();
    }

    @GetMapping("/{orderId}")
    public OrderResponseDTO checkOrderStatus(@PathVariable String orderId) {
        return service.checkOrderStatus(orderId);
    }
}
