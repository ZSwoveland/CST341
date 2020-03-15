package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import com.gcu.business.OrdersBusinessInterface;
import com.gcu.business.OrdersBusinessService;
import com.gcu.controller.UserController;

@Configuration
public class ApplicationConfiguration {

	@Bean(name="userController")
	public UserController getUserController() {
		UserController user = new UserController();
		
		return user;
	}
	
	@Bean(name="ordersService", initMethod = "init", destroyMethod="destroy")
	@Scope(value="singleton",proxyMode=ScopedProxyMode.TARGET_CLASS)
	public OrdersBusinessInterface getOrdersService() {
		OrdersBusinessService service = new OrdersBusinessService();
		
		return service;
	}
	public ApplicationConfiguration() {
		// TODO Auto-generated constructor stub
	}

}
