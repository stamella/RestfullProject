package com.capgemini.orderapp1.service;

import java.util.List;

import com.capgemini.orderapp1.entity.Order;
import com.capgemini.orderapp1.exception.OrderAlreadyRegisteredException;
import com.capgemini.orderapp1.exception.OrderDoesnotExistsException;


public interface OrderService {
	public Order addOrder(Order order) throws OrderAlreadyRegisteredException;

	public void deleteOrder(Order order) throws OrderDoesnotExistsException;

	public Order findOrderById(int orderId) throws OrderDoesnotExistsException;

	public List<Order> findOrderByCustomerId(int customerId) throws OrderDoesnotExistsException;
    
	public Order editOrder(Order order);

	public List<Order> getAllOrders();

}