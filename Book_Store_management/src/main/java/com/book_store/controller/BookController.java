package com.book_store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.book_store.entity.Book;
import com.book_store.service.BookService;

@Controller
public class BookController {
	
	private BookService	service;

	@GetMapping("/")
	public String home() {
		return "Home";
	}
	
	@GetMapping("/book_Register")
	public String book_Register() {
		return "bookRegister";
	}
	

	@GetMapping("/bookList")
	public String bookList() {
		return "bookList";
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b) {
		service.save(b);
		return "redirect:/bookList";
	
	}
	}

