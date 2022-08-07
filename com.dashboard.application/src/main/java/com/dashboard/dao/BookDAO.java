package com.dashboard.dao;

import org.springframework.data.repository.CrudRepository;

import com.dashboard.entity.Book;

public interface BookDAO extends CrudRepository<Book,Integer> {

}
