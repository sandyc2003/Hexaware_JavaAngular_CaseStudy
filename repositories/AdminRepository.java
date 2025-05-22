package com.hexaware.hotpot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.hotpot.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findByUsername(String username);
}
