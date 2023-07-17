package com.dleex.services;

import com.dleex.TestConfig;
import com.dleex.data.repository.ProductRepository;
import com.dleex.dtos.request.PostProductRequest;
import com.dleex.dtos.response.PostProductResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataMongoTest
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestConfig.class)
public class SellerServicesImplTest {
    @Autowired
    private SellerServices sellerServices;
    @Autowired
    private ProductRepository repository;
    @Test void postAProduct() {
        PostProductRequest request = new PostProductRequest();
        request.setDescription("Urgent sale");
        request.setName("laptop");
        request.setPrice(BigDecimal.valueOf(2_6000));
        PostProductResponse response = sellerServices.postAProduct(request);
        assertThat(repository.count(), is(1L));
        assertThat(repository.findAll().get(0).getName(), is("laptop"));
        assertNotNull(response.getId());
    }
}