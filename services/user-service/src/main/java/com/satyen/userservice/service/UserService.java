package com.satyen.userservice.service;

import com.satyen.userservice.dto.user.UserRequest;
import com.satyen.userservice.dto.user.UserResponse;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<UserResponse> findAll();

    String createUser(UserRequest userRequest);

    String updateUser(UserRequest userRequest);

    Boolean existsById(UUID id);

    UserResponse findById(UUID id);

    String deleteUser(UUID id);
}
