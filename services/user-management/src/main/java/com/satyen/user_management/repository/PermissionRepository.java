package com.satyen.user_management.repository;

import com.satyen.user_management.entity.permissions.Permissions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PermissionRepository extends JpaRepository<Permissions, UUID> {
}
