package com.example.Example1.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@SuperBuilder
@NoArgsConstructor
public class EmployeeDto {
    private long id;
    private String name;
    private BigDecimal wage;
}

