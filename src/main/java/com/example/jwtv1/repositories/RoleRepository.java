package com.example.jwtv1.repositories;

import com.example.jwtv1.models.ERole;
import com.example.jwtv1.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}