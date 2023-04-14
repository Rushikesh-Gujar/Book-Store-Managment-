package com.book_store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book_store.entity.Book;
import com.book_store.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository brepo;
	
	public void save(Book b) {
		brepo.save(b);
	}
	
}
