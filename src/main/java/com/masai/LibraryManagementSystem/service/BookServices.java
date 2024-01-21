package com.masai.LibraryManagementSystem.service;

import java.util.List;

import com.masai.LibraryManagementSystem.Entitys.Book;
import com.masai.LibraryManagementSystem.exception.IdNotFoundException;

public interface BookServices {
	public Book createBooks(Book book);
	public  Book updateBooks(int id ,Book book) throws IdNotFoundException;
	public List<Book> getAllBook();
	public Book getBookById(Integer id) throws IdNotFoundException;
	public void deleteBook(Integer id) throws IdNotFoundException;

}
