package com.example.CAU1.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CAU1.entity.Book;
import com.example.CAU1.service.BookService;


@RestController
public class Controller {
	@Autowired
	BookService bookService;
	
	@GetMapping("/list")
	public List<Book> findAll(){
		return bookService.findAll();
	}
	
	@PostMapping("/create")
	public Book createBook(@RequestBody Book book) {
		return bookService.createBook(book);
	}
	@GetMapping("/findOne/{id}")
	public Book findOne (@PathVariable String id) {
		List<Book> ls = findAll();
		for (Book book :ls) {
			if(book.getSubId()==id)
				return book;
		}
		return null;
	}
}
