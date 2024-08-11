package com.satyen.user_management.entity.permissionroles;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "PermissionRoles")
public class PermissionRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID rolePermissionId;
    private UUID roleId;
    private UUID permissionId;
}
