package com.exterro.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exterro.mongo.model.Book;
import com.exterro.mongo.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookSvc;

	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {
		return bookSvc.addBook(book);
	}

	@GetMapping("/findAllBooks")
	public List<Book> getBooks() {
		return bookSvc.getAllBooks();
	}
	
	@GetMapping("/getBook/{bookId}")
	public Book getBook(@PathVariable int bookId) {
		return bookSvc.viewBook(bookId);
	}
	
	@PutMapping("/updateBook")
	public Book updateBook(@RequestBody Book book) {
		return bookSvc.addBook(book);
	}

	@DeleteMapping("/delete/{bookId}")
	public String deleteBook(@PathVariable int bookId) {
		bookSvc.deleteBook(bookId);
		return "Deleted Successfully";
	}
}
