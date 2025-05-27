package com.hexaware.hotpot.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.hotpot.entities.Admin;
import com.hexaware.hotpot.services.IAdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	 @Autowired private IAdminService service;

	   

	 @PostMapping("/login")
	 public ResponseEntity<Admin> login(@RequestBody Admin admin) {
	     return ResponseEntity.ok(service.login(admin.getUsername(), admin.getPassword()));
	     
	 }

	    @GetMapping("/getall")
	    public List<Admin> getAllAdmins() {
	        return service.getAllAdmins();
	    }
}
