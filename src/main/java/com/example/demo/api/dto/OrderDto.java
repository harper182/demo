package com.example.demo.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private Integer activeFlag;

    private String buyId;
    private String OrderNo;
    private String buyerName;
    List<OrderLineDto> orderLineEntities;
}
