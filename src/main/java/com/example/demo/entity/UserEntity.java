package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    private int age;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String address;
}
