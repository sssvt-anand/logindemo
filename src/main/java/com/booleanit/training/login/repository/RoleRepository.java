package com.booleanit.training.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booleanit.training.login.model.Role;

/**
 * 
 * @author Anand
 *
 */
public interface RoleRepository extends JpaRepository<Role, Long>{
}
