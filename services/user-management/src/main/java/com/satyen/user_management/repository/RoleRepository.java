package com.satyen.user_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.satyen.user_management.entity.role.Roles;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Roles, UUID> {
}
