package com.satyen.user_management.entity.role;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "Roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID roleId;
    private String roleName;
    private String roleDescription;

}
