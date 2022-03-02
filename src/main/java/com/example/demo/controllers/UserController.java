package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
public class UserController {
	
	@RequestMapping(value = "/users")
	public User createUser() {
		User user = new User();
		user.setUsername("user");
		user.setPassword("12345678");
		user.setEmail("user@gmail.com");
		
		return user;
	}
}
