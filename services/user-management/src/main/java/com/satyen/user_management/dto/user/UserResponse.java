package com.satyen.user_management.dto.user;

import com.satyen.user_management.entity.role.Roles;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Builder
public class UserResponse {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private List<Roles> roles;

}
