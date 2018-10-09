package com.capgemini.orderapp1.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.mongo.MongoClientSettingsBuilderCustomizer;

import com.capgemini.orderapp1.entity.Order;

public interface OrderRepository {
	
	public Order addOrder(Order order);
	public void deleteOrder(int orderId);
	public Order editOrder(Order order);
	public Order findOrderById(int orderId);
	public List<Order> findOrderByCustomerId(int customerId);
	public List<Order> getAllOrders();

	

	
	
	
}
	
	


