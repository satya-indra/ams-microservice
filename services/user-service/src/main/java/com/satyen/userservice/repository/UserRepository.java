package com.satyen.userservice.repository;

import com.satyen.userservice.entity.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface UserRepository extends MongoRepository<User, UUID> {
}
