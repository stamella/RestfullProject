package com.capgemini.productapp1.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.productapp1.entity.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {

}
