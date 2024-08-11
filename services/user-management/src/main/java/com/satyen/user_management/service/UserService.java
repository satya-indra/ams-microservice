package com.satyen.user_management.service;

import com.satyen.user_management.controller.UserRequest;
import com.satyen.user_management.dto.user.UserResponse;
import com.satyen.user_management.entity.user.User;

import java.util.List;

public interface UserService {
    List<UserResponse> findAll();

    String createUser(UserRequest userRequest);

    String updateUser(UserRequest userRequest);
}
