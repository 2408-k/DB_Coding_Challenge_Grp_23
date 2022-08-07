package com.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.entity.User;
import com.dashboard.service.UserService;



@RestController
public class UserController {
	@Autowired
	UserService service;
	
	@GetMapping("/users")  
	private List<User> getAllUser()   
	{  
	return service.getAllUsers();  
	}  
	
	@GetMapping("/user/{id}")  
	private User getUser(@PathVariable("id") int id)   
	{  
	return service.getUserById(id);  
	} 
}
