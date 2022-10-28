package com.example.CAU2.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.example.CAU2.entity.Book;

@Component
public class Receive {
	Book book1;
	@JmsListener(destination = "jpa-topic")
	public void receive(Book book) {
		book1 = book;
	}
	public Book receiveOfSend() {
		return book1;
	}
}