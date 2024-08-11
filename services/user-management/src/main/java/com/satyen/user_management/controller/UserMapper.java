package com.satyen.user_management.controller;

import com.satyen.user_management.dto.user.UserResponse;
import com.satyen.user_management.entity.user.User;

public class UserMapper {
    public static UserResponse toUserDTO(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .build();
    }
}
