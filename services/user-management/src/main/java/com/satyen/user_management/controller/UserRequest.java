package com.satyen.user_management.controller;

import com.satyen.user_management.entity.user.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
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
