package com.springboot.booklibrarymanagement.exception;

public class BooksNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public BooksNotFoundException(String msg) {
		 super(msg);
	}

}
