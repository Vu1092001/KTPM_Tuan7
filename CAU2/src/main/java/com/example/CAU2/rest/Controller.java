package com.example.CAU2.rest;



import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.CAU2.entity.Book;
import com.example.CAU2.service.Receive;
import com.example.CAU2.service.Send;



@RestController
public class Controller implements Serializable{
	@Autowired
	  Send send;
	  @Autowired
	  Receive receive;
	@PostMapping("/app2create")
	private Book send(@RequestBody Book s) {
		// TODO Auto-generated method stub
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "http://localhost:8080/create";
		
		Book book = new Book("4","sach","23232");
		HttpEntity<Book> request = new HttpEntity<>(book);
		Book foo = restTemplate.postForObject(fooResourceUrl, request, Book.class);

		return book;
	}
	
	@GetMapping("/cau2find")
	private Book send() {
		// TODO Auto-generated method stub
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "http://localhost:8080/list";
		ResponseEntity<Book> sb = restTemplate.getForEntity(fooResourceUrl + "/1", Book.class);
		return sb.getBody();
		

	}
	
	@GetMapping("/receive")
	  public Book receive() {
		  return receive.receiveOfSend();
	  }
	@PostMapping("/send")
	  public Book SendProduct(@RequestBody Book book) {
		  return send.SendProduct(book);
	  }
	
}