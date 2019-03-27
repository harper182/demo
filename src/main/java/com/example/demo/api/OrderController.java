package com.example.demo.api;

import com.example.demo.entity.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/order")
public class OrderController {

    @GetMapping
    public List<Order> list(){
        return new ArrayList<>();
    }

}
