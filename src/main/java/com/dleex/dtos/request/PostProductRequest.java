package com.dleex.dtos.request;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class PostProductRequest {
    private String name;
    private String description;
    private BigDecimal price;
}
