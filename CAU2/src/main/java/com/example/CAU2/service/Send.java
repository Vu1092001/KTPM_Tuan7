package com.example.CAU2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.example.CAU2.entity.Book;

@Service
public class Send {
	@Autowired
	private JmsTemplate jmsTemplate;
	private String topic = "jpa-topic";
	public Book SendProduct(Book book) {
		jmsTemplate.convertAndSend(topic,book);
		System.out.println("Send to:"+ book.toString());
		return book;
	}
}