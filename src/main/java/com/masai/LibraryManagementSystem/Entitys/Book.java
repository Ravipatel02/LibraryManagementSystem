package com.masai.LibraryManagementSystem.Entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String title;
	private String isbn;
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name = "author_id" )
	private Author author;
	
	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Integer id, String tital, String isbn, int quntity) {
		super();
		this.id = id;
		this.title = tital;
		this.isbn = isbn;
		this.quantity = quntity;
	}
	public Book( String tital, String isbn, int quntity) {
		super();
		this.title = tital;
		this.isbn = isbn;
		this.quantity = quntity;
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
	 * @return the tital
	 */
	public String getTital() {
		return title;
	}

	/**
	 * @param tital the tital to set
	 */
	public void setTital(String tital) {
		this.title = tital;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the quntity
	 */
	public int getQuntity() {
		return quantity;
	}

	/**
	 * @param quntity the quntity to set
	 */
	public void setQuntity(int quntity) {
		this.quantity = quntity;
	}
	
	
	

}
