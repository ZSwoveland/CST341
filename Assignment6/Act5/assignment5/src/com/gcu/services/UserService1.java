package com.gcu.services;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.model.User;

@RestController()
@RequestMapping("/service1")
public class UserService1 {

	@GetMapping("/users")
	public List<User> getUsers(){
		User user = new User();
		
		List<User> users = null;
		
		user.setFirstName("Zach");
		user.setGender(1);
		user.setLastName("Land");
		
		users.add(user);
		
		
		
		
		return users;

	}
	public UserService1() {
		// TODO Auto-generated constructor stub
	}

}
