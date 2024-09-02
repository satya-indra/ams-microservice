package com.satyen.userservice.dto.user;

import com.satyen.userservice.entity.user.Address;

import java.util.UUID;


public record UserResponse (
        UUID id,
        String firstName,
        String lastName,
        String email,
        Address address
) {}
