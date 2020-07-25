package com.grocery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GroceryController {

	@GetMapping("/home")
	 String home() {
		System.out.println("hbjsnsjn");
		//System.out.println("username: "+username+" password: "+password);
		return "grocery.homePage";
	}
	
	@RequestMapping("/")
	 String homepage() {
		System.out.println("homepage");
		//System.out.println("username: "+username+" password: "+password);
		return "grocery.homePage";
	}
	
	@GetMapping(value={"/", "/login"})
	String login() {
		System.out.println("Login page");
		return "grocery.loginPage";
	}
	
	
	@RequestMapping("/signUp")
	String signUp() {
		System.out.println("signUp page");
		return "grocery.signUpPage";
	}
	
	@RequestMapping(value = "/register")
	String register(@RequestParam("username") String username, @RequestParam("psw") String psw,@RequestParam("email")
			String email, @RequestParam("psw-repeat") String psw_repeat, @RequestParam("mobilenumber") String mobilenumber) {
		System.out.println("register page"+username);
		return "grocery.homePage";
	}
}
