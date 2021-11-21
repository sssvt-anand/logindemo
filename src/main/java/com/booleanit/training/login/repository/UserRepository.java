package com.booleanit.training.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booleanit.training.login.model.User;

/**
 * 
 * @author Anand
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
