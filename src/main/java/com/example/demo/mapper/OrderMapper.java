package com.example.demo.mapper;

import com.example.demo.api.dto.OrderDto;
import com.example.demo.entity.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class OrderMapper {
    public static final OrderMapper ORDER_MAPPER = Mappers.getMapper(OrderMapper.class);

    public abstract OrderEntity mapToOrderEntity(OrderDto order);
}
