package com.exterro.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Book")
public class Book {
	@Id
	private int bookId;
	private String bookName;
	private String authorName;
	private String genre;
	private double bookCost;

	public Book() {
		super();
	}

	public Book(int bookId, String bookName, String authorName, String genre, double bookCost) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.genre = genre;
		this.bookCost = bookCost;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getBookCost() {
		return bookCost;
	}

	public void setBookCost(double bookCost) {
		this.bookCost = bookCost;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", genre="
				+ genre + ", bookCost=" + bookCost + "]";
	}
}
