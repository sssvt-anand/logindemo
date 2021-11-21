package com.booleanit.training.login.service;

/**
 * 
 * @author Anand
 *
 */
public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
