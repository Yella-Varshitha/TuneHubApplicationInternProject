package com.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class NavController {
	@GetMapping("/mapping-register")
	public String registerMapping()
	{
		return "register";
	}
	@GetMapping("/mapping-login")
	public String loginMapping()
	{
		return "login";
	}
	@GetMapping("/mapping-songs")
	public String songMapping()
	{
		return "addsongs";
	}
	
}
