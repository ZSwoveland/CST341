/**
 * 
 */
package com.gcu.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.gcu.model.*;
import com.gcu.business.*;

/**
 * @author zachs
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	OrdersBusinessInterface service;
	/**
	 * 
	 */
	@Autowired
	public void setOrdersService(OrdersBusinessInterface ser) {
		
	}
	
	@RequestMapping(path = "/add")
	public ModelAndView addUser(@Valid @ModelAttribute("user") User user, BindingResult result) {
		
		ModelAndView mav = new ModelAndView("addUser","user","new User()");
		if(result.hasErrors() == true) {
			return null;
		}
		
		else {
			return mav;
		}
	}
	
	@RequestMapping(path ="/add", method = RequestMethod.GET)
	public ModelAndView displayForm() {
		
		
		ModelAndView mav = new ModelAndView("displayUsers","user","new User()");
		
		
		
		return mav;
		
	}
	
	@RequestMapping(path ="/add", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("user") User user) {
		
		ModelAndView mav = new ModelAndView("addUser","user","new User()");
		return mav;
	}
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}

}
