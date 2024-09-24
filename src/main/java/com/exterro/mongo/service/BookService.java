package com.exterro.mongo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exterro.mongo.model.Book;

@Service
public interface BookService {
	Book addBook(Book book);
	Book viewBook(Integer bookId);
	List<Book> getAllBooks();
	Book updateBook(Book book);
	void deleteBook(Integer bookId);
}
