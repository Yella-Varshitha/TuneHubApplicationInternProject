package com.example.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo1.entities.Users;
import com.example.demo1.sevices.UsersService;
@Controller
public class UsersController {
	
	@Autowired
	UsersService userv;
	@PostMapping("/register")
	public String addUser(@ModelAttribute Users user) {
	boolean usersstatus=userv.emailExists(user.getEmail());
	if(usersstatus==false) {
		userv.addUser(user);
		return "registersucess";
		//System.out.println("User is added");
		
	}
	else {
		return "registerfail";
		//System.out.println("User is already exist");
	}
	 //return "home";
	}
	@PostMapping("/login")
	public String validateUser(@RequestParam String email,@RequestParam String password)
	{
		boolean loginstatus=userv.validateUser(email,password);
		if (loginstatus == true) {
			if(userv.getRole(email).equals("admin"))
			{
				return "adminhome";
			}
			else {
				return "customerhome";	
			}
			
		}
		else {
			return "Loginfail";

			}
      
	}
	
	
	

}
