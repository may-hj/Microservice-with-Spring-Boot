package com.example.demo.uss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uss.repository.UserRepositoryImpl;

@Service
public abstract class UserServiceImpl implements UserService {
	private final UserRepositoryImpl repo;
	
	@Autowired
	public UserServiceImpl(UserRepositoryImpl repo) {
		this.repo = repo;
	}

}
