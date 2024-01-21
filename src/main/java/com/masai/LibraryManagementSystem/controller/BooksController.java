package com.masai.LibraryManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.LibraryManagementSystem.Entitys.Book;
import com.masai.LibraryManagementSystem.exception.IdNotFoundException;
import com.masai.LibraryManagementSystem.service.impl.BookServiceImpl;

@RequestMapping("api/")
@RestController
public class BooksController {
	@Autowired
	private BookServiceImpl service;
	@PostMapping("books")
	public Book addBook(@RequestBody Book book) {
		Book createBooks = this.service.createBooks(book);
		return createBooks;
	}
	
	@PutMapping("books/{id}")
	public Book updateData(@PathVariable int id , @RequestBody Book book) throws IdNotFoundException {
		Book updateBooks = this.service.updateBooks(id ,book);
		return updateBooks;
		
	}
	
	@DeleteMapping("books/{id}")
	public void deleteBook(@PathVariable int id) throws IdNotFoundException {
		this.service.deleteBook(id);
	}
	
	@GetMapping("books/{id}")
	public Book retriveBookById(@PathVariable int id) throws IdNotFoundException {
		Book bookById = this.service.getBookById(id);
		return bookById;
		
	}
	@GetMapping("books/")
	public List<Book> retriveBookById() {
		List<Book> allBook = this.service.getAllBook();
		return allBook;
		
	}

}
