package com.satyen.userservice.service;

import com.satyen.userservice.dto.user.UserRequest;
import com.satyen.userservice.dto.user.UserResponse;
import com.satyen.userservice.entity.user.User;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserMapper {
    public User toUser(UserRequest userRequest) {

        return User.builder()
                .id(UUID.randomUUID())
                .firstName(userRequest.firstName())
                .lastName(userRequest.lastName())
                .email(userRequest.email())
                .address(userRequest.address())
                .build();
    }

    public UserResponse toUserResponse(User user) {
        return new UserResponse(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getAddress());
    }
}
