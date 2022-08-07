package com.dashboard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dashboard.dao.BookDAO;
import com.dashboard.entity.Book;

@Service
public class BookService {
	@Autowired
	BookDAO dao;
	

	public List<Book> getAllBooks()   
	{  
	List<Book> books =  new ArrayList<Book>();  
	dao.findAll().forEach(book -> books.add(book));  
	return books;  
	}  
	
	
	//getting a specific record  
	public Book getBookById(int id)   
	{  
	return dao.findById(id).get();  
	}  
}
