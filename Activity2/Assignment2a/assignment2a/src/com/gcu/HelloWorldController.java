/**
 * 
 */
package com.gcu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zachs
 *
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	/**
	 * @param args
	 */
	
	@RequestMapping(path ="/test1",method=RequestMethod.GET)
	public String sayHello() {
		
		
		
		
		return "Hello World!";
	}
	
	@RequestMapping(path ="/test2",method=RequestMethod.GET)
	public String sayHello(ModelMap model) {
		
		
		model.addAttribute("message","Hello Spring MVC");
		
		return "hello";
	}
	
	@RequestMapping(path ="/test3",method=RequestMethod.GET)
	public ModelAndView sayHello1() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("message","Hello World from ModelAndView");
		
		mav.setViewName("hello");
		
		return mav;
		 
	}
	
	@RequestMapping(path ="/test4",method=RequestMethod.GET)
	public String sayHello(@RequestParam("message") String message, ModelMap model) {
		
		model.addAttribute("message", message);
		
		return "hello";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
