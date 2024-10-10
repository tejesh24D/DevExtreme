package com.example.devextremecrud.repository;

import com.example.devextremecrud.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
