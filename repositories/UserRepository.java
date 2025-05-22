package com.hexaware.hotpot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.hotpot.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email); // for login
}
