package com.satyen.user_management.repository;

import com.satyen.user_management.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends MongoRepository<User, UUID> {
}
