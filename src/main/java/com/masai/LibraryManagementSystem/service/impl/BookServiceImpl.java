package com.masai.LibraryManagementSystem.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.LibraryManagementSystem.Entitys.Book;
import com.masai.LibraryManagementSystem.exception.IdNotFoundException;
import com.masai.LibraryManagementSystem.repository.BookRepo;
import com.masai.LibraryManagementSystem.service.BookServices;

@Service
public class BookServiceImpl implements BookServices{
	
	@Autowired
	private BookRepo bRepo;

	@Override
	public Book createBooks(Book book) {
		Book save = this.bRepo.save(book);
		return save;
	}

	@Override
	public Book updateBooks(int id ,Book book) throws IdNotFoundException {
		Optional<Book> ops = this.bRepo.findById(id);
		if(ops.isPresent()) {
			Book book2 = ops.get();
			book2.setTital(book.getTital());
			book2.setIsbn(book.getIsbn());
			book2.setAuthor(book.getAuthor());
			book2.setQuntity(book.getQuntity());
			Book save = this.bRepo.save(book2);
			return save;
		}else {
			throw new IdNotFoundException("Book id not presnt "+id);
		}
		
		
		
	}

	@Override
	public List<Book> getAllBook() {
		List<Book> findAll = (List<Book>) this.bRepo.findAll();
		return findAll;
	
	}

	@Override
	public Book getBookById(Integer id) throws IdNotFoundException  {
		Optional<Book> findById = this.bRepo.findById(id);
		if(findById.isPresent()) {
			Book book = findById.get();
			return book;
		}else {
			throw new IdNotFoundException("Book id not presnt "+id);
		}
	}

	@Override
	public void deleteBook(Integer id) throws IdNotFoundException{
		Optional<Book> findById = this.bRepo.findById(id);
		if(findById.isPresent()) {
			this.bRepo.existsById(id);
		}else {
			throw new IdNotFoundException("Book id not presnt "+id);
		}
		
	}

}
