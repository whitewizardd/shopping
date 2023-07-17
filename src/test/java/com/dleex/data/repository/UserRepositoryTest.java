package com.dleex.data.repository;

import com.dleex.data.repository.mocks.FirstRegisterRepo;
import com.dleex.data.repository.mocks.DuplicateUserName;
import com.dleex.dtos.request.RegisterSellerRequest;
import com.dleex.services.SellerServices;
import com.dleex.services.SellerServicesImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class UserRepositoryTest {
    private UserRepository userRepository;
    private SellerServices sellerServices;

    @Test public void registerSellerTest(){
        userRepository = new FirstRegisterRepo();
        sellerServices = new SellerServicesImpl(null, userRepository);
        RegisterSellerRequest request = new RegisterSellerRequest();
        sellerServices.registerSeller(request);
        assertEquals(1, userRepository.count());
    }
    @Test
    public void registerSellerTestAg(){
        userRepository = new DuplicateUserName();
        sellerServices = new SellerServicesImpl(null, userRepository);
        RegisterSellerRequest request = new RegisterSellerRequest();
        request.setUserName("sultan");
        sellerServices.registerSeller(request);
        assertThrows(IllegalArgumentException.class, ()-> sellerServices.registerSeller(request));
        assertEquals(1, userRepository.count());
    }
}
