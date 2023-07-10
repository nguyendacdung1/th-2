package com.example.Example1.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "employee")
@NoArgsConstructor
@SuperBuilder
@Data
public class Employee {
    @Id
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "wage", nullable = false)
    private BigDecimal wage;
}
