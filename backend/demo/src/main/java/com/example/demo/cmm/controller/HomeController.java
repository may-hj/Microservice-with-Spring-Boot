package com.example.demo.cmm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		System.out.println("===============================");
		System.out.println("======== Home Connected =======");
		System.out.println("===============================");
		
		return "<h1>Hello Wolrd!!<h1>";
	}

}
