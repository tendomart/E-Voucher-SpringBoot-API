package com.management.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.model.ERole;
import com.management.model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
