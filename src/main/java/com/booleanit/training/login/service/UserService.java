package com.booleanit.training.login.service;

import com.booleanit.training.login.model.User;

/**
 * 
 * @author Anand
 *
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
