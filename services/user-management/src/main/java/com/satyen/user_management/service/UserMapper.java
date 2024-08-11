package com.satyen.user_management.service;

import com.satyen.user_management.controller.UserRequest;
import com.satyen.user_management.entity.user.User;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {
    public User toUser(UserRequest userRequest) {

        return User.builder()
                .id(userRequest.id())
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .email(userRequest.getEmail())
                .address(userRequest.address())
                .build();
    }
}
