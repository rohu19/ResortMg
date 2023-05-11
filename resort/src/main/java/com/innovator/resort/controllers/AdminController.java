package com.innovator.resort.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innovator.resort.models.Admin;
import com.innovator.resort.repositories.AdminRepository;

@RestController
@RequestMapping("admin")
public class AdminController {

	@Autowired
	AdminRepository userRepository;

	@GetMapping("/users")
	public Iterable<Admin> getAllAdmin() {
		return userRepository.findAll();
	}

	@PostMapping("/saveAdmin")
	public Admin createUser(@RequestBody Admin admin) {
		userRepository.save(admin);
		return admin;
	}

}
