package com.dleex.data.repository;

import com.dleex.data.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
@DataMongoTest
class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;
    @Test public void testSave(){
        Product product = new Product();
        Product savedProduct = productRepository.save(product);
        assertThat(productRepository.count(), is(1L));
        assertEquals(1, productRepository.count());
        assertNotNull(savedProduct.getId());
    }
    @Test public void testSaveAgain(){
//        Product product = new Product();
        Product product1 = new Product();
//        Product savedProduct = productRepository.save(product);
        Product savedProduct1 = productRepository.save(product1);
        assertEquals(2, productRepository.count());
//        assertNotNull(savedProduct.getId());
        assertNotNull(savedProduct1.getId());
    }

}