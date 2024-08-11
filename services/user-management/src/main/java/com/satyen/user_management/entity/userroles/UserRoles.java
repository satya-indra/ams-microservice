package com.satyen.user_management.entity.userroles;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "UserRoles")
public class UserRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userRoleId;
    private UUID userId;
    private UUID roleId;
}
