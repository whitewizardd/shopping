package com.dleex.data.repository;

import com.dleex.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    User findUserByUserName(String userName);
}
