package com.hexaware.hotpot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexaware.hotpot.entities.User;
import com.hexaware.hotpot.repositories.UserRepository;

public class UserServiceImpl implements IUserService {
    @Autowired private UserRepository userRepo;

	@Override
	public User registerUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public User login(String email, String password) {
		User user = userRepo.findByEmail(email);
        return (user != null && user.getPassword().equals(password)) ? user : null;
	}

	@Override
	public User getUserById(int userId) {
		return userRepo.findById(userId).orElse(null);
	}

	@Override
	public List<User> getAllUsers() {
		 return userRepo.findAll();
	}

}
