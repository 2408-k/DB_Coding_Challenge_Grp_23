package com.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.entity.Book;
import com.dashboard.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService service;
	
	@GetMapping("/books")  
	private List<Book> getAllBook()   
	{  
	return service.getAllBooks();  
	}  
	
	@GetMapping("/book/{id}")  
	private Book getBook(@PathVariable("id") int id)   
	{  
	return service.getBookById(id);  
	} 
}
