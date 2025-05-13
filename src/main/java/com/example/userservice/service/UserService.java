package com.example.userservice.service;

import com.example.userservice.model.User;
import java.util.Optional;

public interface UserService {
    User registerUser(User user);
    Optional<User> getUserById(Long id);
}