package com.example.demo.uss.domain;

import javax.persistence.Entity;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity @NoArgsConstructor
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name="user_no")
	private long userNo;
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String passwd;
	
	@Column(name="username")
	private String username;
	
	@Column(name="email")
	private String email;
	
	@Column(name="birthday")
	private String birthday;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="regdate")
	private String regdate;
	
	@Builder
	public User(String name, String passwd, String username, String email, String birthday, String gender,
			String regdate) {
		super();
		this.name = name;
		this.passwd = passwd;
		this.username = username;
		this.email = email;
		this.birthday = birthday;
		this.gender = gender;
		this.regdate = regdate;
	}

}