package com.exterro.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exterro.mongo.dao.BookRepository;
import com.exterro.mongo.model.Book;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepo;
	
	@Override
	public Book addBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public Book viewBook(Integer bookId) {
		return bookRepo.findById(bookId).orElse(null);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}

	@Override
	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public void deleteBook(Integer bookId) {
		bookRepo.deleteById(bookId);
	}

}
