package com.book.controller;

import com.book.entities.Book;
import com.book.service.BookService;
import com.book.service.BookServiceImp;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService bookService=new BookServiceImp();
		for(Book book:bookService.getAllBooks()) {
			System.out.println(book.toString());
			
		}
	}

}
