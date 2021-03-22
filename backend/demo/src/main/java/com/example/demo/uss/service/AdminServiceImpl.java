package com.example.demo.uss.service;

import org.springframework.stereotype.Service;

import com.example.demo.uss.repository.AdminRepositoryImpl;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class AdminServiceImpl implements AdminService{
	private final AdminRepositoryImpl repo;
}
