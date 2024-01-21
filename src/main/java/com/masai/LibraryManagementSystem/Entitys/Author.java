package com.masai.LibraryManagementSystem.Entitys;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id ;
	private String name;
	private String DateOfBirth;
	@OneToMany(mappedBy = "author",fetch = FetchType.EAGER)
	private List<Book> books ;
	
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Author(Integer id, String name, String dateOfBirth, List<Book> books) {
		super();
		this.id = id;
		this.name = name;
		DateOfBirth = dateOfBirth;
		this.books = books;
	}
	
	public Author( String name, String dateOfBirth, List<Book> books) {
		super();
		this.name = name;
		DateOfBirth = dateOfBirth;
		this.books = books;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	/**
	 * @return the books
	 */
	public List<Book> getBooks() {
		return books;
	}
	/**
	 * @param books the books to set
	 */
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	

}
