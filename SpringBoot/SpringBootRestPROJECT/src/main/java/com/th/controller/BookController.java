package com.th.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.th.model.Book;
import com.th.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@GetMapping("/getAllBooks")
	public ResponseEntity<List<Book>> getAllBooksDetails(){
		
		BookRepository br = new BookRepository();
		
		List<Book> blist = br.getAllBooks();
		return new ResponseEntity<List<Book>>(blist,HttpStatus.OK);
	}
	
	@GetMapping("/getAbook/{id}")
	public ResponseEntity<Book> getAbookById(@PathVariable int id)
	{
		
		BookRepository br = new BookRepository();
		Book b= br.getABook(id);
		if(b!=null)
			return new ResponseEntity<Book>(b,HttpStatus.OK);
		else
			return new ResponseEntity<Book>(b,HttpStatus.NOT_FOUND);

	}
	
	
	

}