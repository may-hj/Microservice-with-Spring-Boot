package com.example.demo.sec.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins="*")
public class AuthController {
	
	@GetMapping("/insertMany")
	public Map<String, Object> login() {
		System.out.println("insertMany ����");
		Map<String, Object> map = new HashMap<>();
		map.put("data", "success");
		return map;
	}
}