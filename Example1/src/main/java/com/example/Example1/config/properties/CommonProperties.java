package com.example.Example1.config.properties;

import lombok.Data;
import lombok.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class CommonProperties {
    private Integer pageSize = 10;
    private Integer pageNumber = 0;
}