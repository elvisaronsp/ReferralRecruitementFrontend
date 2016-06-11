package com.esprit.service;

import java.util.HashSet;
import java.util.Set;

import javax.ejb.Singleton;
import javax.ws.rs.Path;

import com.esprit.domain.Book;


@Singleton
public class BookService {

	private Set<Book> books=new HashSet<Book>();
	
	
	public void add(Book book){
		books.add(book);
	}
	
	public Set<Book> getBooks() {
		return books;
	}
	
	
}
