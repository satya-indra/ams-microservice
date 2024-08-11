package com.satyen.user_management.repository;

import com.satyen.user_management.entity.userroles.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRoleRepository extends JpaRepository<UserRoles, UUID> {
}
