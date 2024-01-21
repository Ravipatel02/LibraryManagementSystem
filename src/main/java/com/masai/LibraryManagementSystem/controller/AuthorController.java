package com.masai.LibraryManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.LibraryManagementSystem.Entitys.Author;
import com.masai.LibraryManagementSystem.service.AuthorServices;

@RequestMapping("api/")
@RestController
public class AuthorController {
	@Autowired
	private AuthorServices services;
	
	@PostMapping("authors/")
	public Author createAuthor(@RequestBody Author author) {
		Author createAuthor = this.services.createAuthor(author);
		return createAuthor;
	}
	
	@GetMapping("authors/")
	public List<Author> getAllAuthor(){
		List<Author> retriveAllAuthor = this.services.retriveAllAuthor();
		return retriveAllAuthor;
	}

}
