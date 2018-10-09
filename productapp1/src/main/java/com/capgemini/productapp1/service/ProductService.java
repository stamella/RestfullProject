package com.capgemini.productapp1.service;

import com.capgemini.productapp1.entity.Product;
import com.capgemini.productapp1.exception.ProductNotFoundException;

public interface ProductService {
	
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public void delete(Product product);
	public Product findProductById(int productId)throws ProductNotFoundException;

}
