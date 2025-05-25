package com.hexaware.hotpot.services;

import java.util.List;

import com.hexaware.hotpot.entities.Admin;

public interface IAdminService {
    Admin login(String username, String password);
    List<Admin> getAllAdmins();
}