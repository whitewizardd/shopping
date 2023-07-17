package com.dleex.data.repository.mocks;

import com.dleex.data.model.User;

import java.util.Optional;

public class DuplicateUserName extends FirstRegisterRepo{
    private Optional<User> findByUserName(String nsme){
        if (count() > 1) return Optional.of(new User());
        return Optional.empty();
    }
}
