package com.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.entity.Security;
import com.dashboard.service.SecurityService;


@RestController
public class SecurityController {
	@Autowired
	SecurityService service;
	
	@GetMapping("/securities")  
	private List<Security> getAllSecuirty()   
	{  
	return service.getAllSecurities();  
	}  
	
	@GetMapping("/security/{id}")  
	private Security getSecurity(@PathVariable("id") int id)   
	{  
	return service.getSecurityById(id);  
	} 
}
