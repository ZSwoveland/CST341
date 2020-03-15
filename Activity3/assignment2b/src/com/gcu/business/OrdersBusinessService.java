package com.gcu.business;

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
}
