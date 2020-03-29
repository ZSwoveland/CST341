package com.gcu.services;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.model.User;

@RequestMapping("service2")

public class UserService2 {

	@GetMapping("/users")
	//@Produces("application/json")
	public List<User> getUsers(){
		User user = new User();
		
		List<User> users = null;
		
		user.setFirstName("Zach");
		user.setGender(1);
		user.setLastName("Land");
		
		users.add(user);
		
		
		
		
		return users;

	}
	public UserService2() {
		// TODO Auto-generated constructor stub
	}

}
