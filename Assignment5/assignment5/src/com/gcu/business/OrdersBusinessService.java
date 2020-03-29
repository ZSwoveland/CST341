package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.model.Order;

public class OrdersBusinessService  implements OrdersBusinessInterface{

	
	public OrdersBusinessService() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Hello from the OrdersBusinessService");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Hello from the AnotherOrdersBusinessService INIT");
		
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Hello from the AnotherOrdersBusinessService DESTROY");
	}

	@Override
	@Autowired
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		
		
		return null;
	}
}
