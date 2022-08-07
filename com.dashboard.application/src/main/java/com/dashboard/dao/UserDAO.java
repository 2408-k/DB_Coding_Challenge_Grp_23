package com.dashboard.dao;

import org.springframework.data.repository.CrudRepository;

import com.dashboard.entity.User;

public interface UserDAO extends CrudRepository<User,Integer> {

}