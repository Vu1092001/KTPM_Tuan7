package com.example.CAU1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CAU1.entity.Book;
import com.example.CAU1.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;

	public List<Book> findAll() {
		return bookRepository.findAll();
	}
	
	public Book createBook(Book book) {
		return bookRepository.save(book);
	}
	
}
