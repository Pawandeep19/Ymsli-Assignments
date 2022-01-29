package com.book.service;

import java.util.List;

import com.book.dao.BookDao;
import com.book.dao.BookDaoImp;
import com.book.entities.Book;

public class BookServiceImp implements BookService {

BookDao bookDao=new BookDaoImp();
	
	@Override
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Override
	public Book getBookById(int id) {
		return bookDao.getBookById(id);
	}

	@Override
	public Book addBook(Book book) {
		bookDao.addBook(book);
		return null;
	}

	@Override
	public void deleteBook(int id) {
		bookDao.deleteBook(id);
	}

	@Override
	public void updateBook(int id, Book book) {
		bookDao.updateBook(id, book);
	}

	@Override
	public Book getBookByIsbn(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
