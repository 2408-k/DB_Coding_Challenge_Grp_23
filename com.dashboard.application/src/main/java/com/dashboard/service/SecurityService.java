package com.dashboard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dashboard.dao.SecurityDAO;
import com.dashboard.entity.Security;





@Service
public class SecurityService {
	@Autowired
	SecurityDAO dao;
	

	public List<Security> getAllSecurities()   
	{  
	List<Security> securities =  new ArrayList<Security>();  
	dao.findAll().forEach(security -> securities.add(security));  
	return securities;  
	}  
	
	
	//getting a specific record  
	public Security getSecurityById(int id)   
	{  
	return dao.findById(id).get();  
	}  
}
