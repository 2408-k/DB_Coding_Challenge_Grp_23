package com.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.entity.CounterParty;
import com.dashboard.service.CounterPartyService;


@RestController
public class CounterPartyController {
	@Autowired
	CounterPartyService service;
	
	@GetMapping("/counterparties")  
	private List<CounterParty> getAllCounterParty()   
	{  
	return service.getAllCounterParties();  
	}  
	
	@GetMapping("/counterparty/{id}")  
	private CounterParty getCounterParty(@PathVariable("id") int id)   
	{  
	return service.getCounterPartyById(id);  
	} 
}
