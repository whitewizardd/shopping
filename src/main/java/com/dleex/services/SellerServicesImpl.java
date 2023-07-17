package com.dleex.services;
import com.dleex.data.model.Product;
import com.dleex.data.model.User;
import com.dleex.data.repository.ProductRepository;
import com.dleex.data.repository.UserRepository;
import com.dleex.dtos.response.PostProductResponse;
import com.dleex.dtos.request.PostProductRequest;
import com.dleex.dtos.response.RegisterSellerResponse;
import com.dleex.dtos.request.RegisterSellerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.dleex.mapper.Mapper.map;

@Service
public class SellerServicesImpl implements SellerServices{
    private ProductRepository repository;
    private UserRepository userRepository;
    @Autowired
    public SellerServicesImpl(ProductRepository repository, UserRepository userRepository){
        this.userRepository = userRepository;
        this.repository = repository;
    }
    @Override
    public PostProductResponse postAProduct(PostProductRequest productRequest) {
        Product product = new Product();
        PostProductResponse response = new PostProductResponse();
        map(productRequest, product);
        Product savedProduct = repository.save(product);
        map(savedProduct, response);
        return response;
    }
    @Override
    public RegisterSellerResponse registerSeller(RegisterSellerRequest request){
        User user = new User();
        var founderUSer = userRepository.findUserByUserName(request.getUserName());
        if (founderUSer.isPresent()) throw new IllegalArgumentException("name exist");
        else {
            user.setUserName(request.getUserName());
        }
        userRepository.save(user);
        return null;
    }
}
