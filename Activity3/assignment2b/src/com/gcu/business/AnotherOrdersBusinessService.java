package com.gcu.business;

public class AnotherOrdersBusinessService implements OrdersBusinessInterface{

	public AnotherOrdersBusinessService() {
		// TODO Auto-generated constructor stub
	}

	public void test() {
		System.out.println("Hello from the AnotherOrdersBusinessService TEST");
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
