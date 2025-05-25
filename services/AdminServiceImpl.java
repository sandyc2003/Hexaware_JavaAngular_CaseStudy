package com.hexaware.hotpot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexaware.hotpot.entities.Admin;
import com.hexaware.hotpot.repositories.AdminRepository;

public class AdminServiceImpl implements IAdminService {
    @Autowired private AdminRepository repo;

	@Override
	public Admin login(String username, String password) {
		 Admin admin = repo.findByUsername(username);
	        return (admin != null && admin.getPassword().equals(password)) ? admin : null;
	}

	@Override
	public List<Admin> getAllAdmins() {
		return repo.findAll();
	}

}
