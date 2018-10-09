package com.capgemini.customerapp1.service;

import java.util.List;

import com.capgemini.customerapp1.entity.Customer;
import com.capgemini.customerapp1.exception.AuthenticationFailedException;
import com.capgemini.customerapp1.exception.CustomerAlreadyRegisteredException;
import com.capgemini.customerapp1.exception.CustomerNotFoundException;


public interface CustomerService {
	public Customer addCustomer(Customer customer) throws CustomerAlreadyRegisteredException;

	public Customer authentication(Customer customer) throws CustomerNotFoundException, AuthenticationFailedException;

	public Customer getCustomerById(int customerId) throws CustomerNotFoundException;


	public List<Customer> getAllCustomers();

	public void deleteCustomer(Customer customer) throws CustomerNotFoundException;

	public Customer editCustomer(Customer customer) throws CustomerNotFoundException;
}