package com.portfolio.demo_backend.exception.user;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("User not found with id: " + id);
    }
    public UserNotFoundException(String username) {
        super("User not found with username: " + username);
    }
}
