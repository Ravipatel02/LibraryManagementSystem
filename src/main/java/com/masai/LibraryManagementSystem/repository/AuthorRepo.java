package com.masai.LibraryManagementSystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.masai.LibraryManagementSystem.Entitys.Author;

@Repository
public interface AuthorRepo extends CrudRepository<Author, Integer> {
	//List<Author> findDateOfBirthContaining(String date);

}
