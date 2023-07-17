package com.dleex.services;

import com.dleex.dtos.request.PostProductRequest;
import com.dleex.dtos.request.RegisterSellerRequest;
import com.dleex.dtos.response.PostProductResponse;
import com.dleex.dtos.response.RegisterSellerResponse;

public interface SellerServices {
    PostProductResponse postAProduct(PostProductRequest productRequest);

    RegisterSellerResponse registerSeller(RegisterSellerRequest request);
}
