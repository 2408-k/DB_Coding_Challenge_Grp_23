package com.dashboard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dashboard.dao.UserDAO;
import com.dashboard.entity.User;

@Service
public class UserService {
	@Autowired
	UserDAO dao;
	

	public List<User> getAllUsers()   
	{  
	List<User> users =  new ArrayList<User>();  
	dao.findAll().forEach(user -> users.add(user));  
	return users;  
	}  
	
	
	//getting a specific record  
	public User getUserById(int id)   
	{  
	return dao.findById(id).get();  
	}
}
	
