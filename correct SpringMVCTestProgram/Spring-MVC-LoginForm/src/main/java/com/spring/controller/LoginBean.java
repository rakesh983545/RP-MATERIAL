package com.spring.controller;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginBean {
	 @NotNull(message="Your username must not be empty")
	@Size(min=2, max=30, message = "Your username must between 2 and 30 characters") 	
	private String userName;
	 @NotEmpty
	    @Size(min = 6, max = 15)
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
