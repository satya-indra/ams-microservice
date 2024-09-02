package com.satyen.userservice.dto.user;

import com.satyen.userservice.entity.user.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;


public record UserRequest(
        UUID id,

        @NotNull(message = "First name is required")
        String firstName,

        @NotNull(message = "Last name is required")
        String lastName,

        @NotNull(message = "Email is required")
        @Email(message = "Email is invalid")
        String email,

        Address address

) {
}
