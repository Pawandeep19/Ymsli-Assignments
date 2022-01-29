package com.book.exception;

public class DataAccessException extends RuntimeException {
	
	private static final long serialVersionUID = 7477343417439178975L;

	public DataAccessException(String message) {
		super(message);
	}
	
}