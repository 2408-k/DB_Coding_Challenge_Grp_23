package com.dashboard.dao;

import org.springframework.data.repository.CrudRepository;

import com.dashboard.entity.CounterParty;

public interface CounterPartyDAO extends CrudRepository<CounterParty,Integer> {

}
