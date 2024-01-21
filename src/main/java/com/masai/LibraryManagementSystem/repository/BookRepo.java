package com.masai.LibraryManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.masai.LibraryManagementSystem.Entitys.Author;
import com.masai.LibraryManagementSystem.Entitys.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{
	// List<Book> findByTitleContaining(String title);
	 //List<Book> findByAuthor(Author author);

}
