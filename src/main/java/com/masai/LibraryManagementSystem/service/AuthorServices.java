package com.masai.LibraryManagementSystem.service;

import java.util.List;

import com.masai.LibraryManagementSystem.Entitys.Author;

public interface AuthorServices {
	public Author createAuthor(Author author);
	public List<Author> retriveAllAuthor();

}
