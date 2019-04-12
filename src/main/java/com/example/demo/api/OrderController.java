package com.example.demo.api;

import com.example.demo.api.dto.OrderDto;
import com.example.demo.entity.OrderEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.mapper.OrderMapper;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public List<OrderEntity> list(){
        return new ArrayList<>();
    }
    @GetMapping("/user")
    public UserEntity user(){
        return UserEntity.builder().address("beijing").age(1).build();
    }

    @PostMapping
    public OrderEntity save(@RequestBody OrderDto orderDto){
        OrderEntity orderEntity = OrderMapper.ORDER_MAPPER.mapToOrderEntity(orderDto);
        return orderEntity;
    }
}
