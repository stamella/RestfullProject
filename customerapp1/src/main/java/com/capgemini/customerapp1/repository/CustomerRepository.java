package com.capgemini.customerapp1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.capgemini.customerapp1.entity.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {
	
	


}