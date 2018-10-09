package com.capgemini.orderapp1.exception;

public class OrderDoesnotExistsException extends RuntimeException {
	
	public OrderDoesnotExistsException(String message) {
		super(message);
	}


}
