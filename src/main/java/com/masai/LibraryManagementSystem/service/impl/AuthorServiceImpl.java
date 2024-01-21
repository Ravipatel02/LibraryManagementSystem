package com.masai.LibraryManagementSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.LibraryManagementSystem.Entitys.Author;
import com.masai.LibraryManagementSystem.repository.AuthorRepo;
import com.masai.LibraryManagementSystem.service.AuthorServices;
@Service
public class AuthorServiceImpl implements AuthorServices {
	
	@Autowired
	private AuthorRepo repo;;

	@Override
	public Author createAuthor(Author author) {
		Author save = this.repo.save(author);
		return save;
	}

	@Override
	public List<Author> retriveAllAuthor() {
		List<Author> findAll = (List<Author>)this.repo.findAll();
		return findAll;
	}

}
