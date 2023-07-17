package com.dleex.mapper;

import com.dleex.data.model.Product;
import com.dleex.dtos.request.PostProductRequest;
import com.dleex.dtos.response.PostProductResponse;

public class Mapper {
    public static void map(PostProductRequest productRequest, Product product){
        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());
        product.setPrice(productRequest.getPrice());
    }
    public static void map(Product product, PostProductResponse response){
        response.setId(product.getId());
        response.setName(product.getName());
        response.setDescription(product.getDescription());
    }
}
