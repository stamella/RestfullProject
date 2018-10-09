package com.capgemini.productapp1.exception;

public class ProductNotFoundException extends Exception {
	
	public ProductNotFoundException(String message) {
		super(message);
	}
}