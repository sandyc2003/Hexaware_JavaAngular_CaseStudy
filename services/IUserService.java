package com.hexaware.hotpot.services;

import java.util.List;

import com.hexaware.hotpot.entities.User;

public interface IUserService {
    User registerUser(User user);
    User login(String email, String password);
    User getUserById(int userId);
    List<User> getAllUsers();
}