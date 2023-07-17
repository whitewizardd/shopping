package com.dleex.data.repository;

import com.dleex.data.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String > {
}
