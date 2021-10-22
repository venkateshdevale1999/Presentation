package com.th.repository;
import java.util.ArrayList;
import java.util.List;

import com.th.model.Book;



public class BookRepository {
	
	List<Book> blist;
	
	
	public BookRepository()
	{
		
		blist = new ArrayList<Book>();
		
		Book b1 = new Book();
		b1.setBookId(10);
		b1.setBookName("java");
		b1.setBookPrice(100);
		
		
		Book b2 = new Book();
		b2.setBookId(20);
		b2.setBookName("C");
		b2.setBookPrice(200);
		
		Book b3 = new Book();
		b3.setBookId(30);
		b3.setBookName("C++");
		b3.setBookPrice(300);
		
		blist.add(b1);
		blist.add(b2);
		blist.add(b3);
		
	}
	
	
	
	public List<Book> getAllBooks(){
		
		return blist;
	}
	
	
	public Book getABook(int bookId) {
		
		for (Book b:blist) {
			if(b.getBookId()==bookId)
				return b;
			}
		
		return null;
		
		
	}
	

}
