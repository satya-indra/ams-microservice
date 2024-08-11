package com.satyen.user_management.entity.permissions;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "Permissions")
public class Permissions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID permissionId;
    private String permissionName;
    private String permissionDescription;
}
