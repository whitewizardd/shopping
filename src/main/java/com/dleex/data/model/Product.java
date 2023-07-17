package com.dleex.data.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
public class Product {
    @Id
    private String id;
    private String location;
    @CreatedDate
    private LocalDateTime dateTimePosted;
    private String name;
    private String description;
    private BigDecimal price;
}
