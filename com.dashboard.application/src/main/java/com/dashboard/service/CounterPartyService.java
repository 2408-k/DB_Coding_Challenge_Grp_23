package com.dashboard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dashboard.dao.CounterPartyDAO;
import com.dashboard.entity.CounterParty;

@Service
public class CounterPartyService {
	@Autowired
	CounterPartyDAO dao;
	

	public List<CounterParty> getAllCounterParties()   
	{  
	List<CounterParty> counterParties =  new ArrayList<CounterParty>();  
	dao.findAll().forEach(counterParty -> counterParties.add(counterParty));  
	return counterParties;  
	}  
	
	
	//getting a specific record  
	public CounterParty getCounterPartyById(int id)   
	{  
	return dao.findById(id).get();  
	}  
}
