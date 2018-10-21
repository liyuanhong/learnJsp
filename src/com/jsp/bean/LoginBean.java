package com.jsp.bean;

import java.io.Serializable;

public class LoginBean implements Serializable {
	public String name;
	public String password;
	
	public LoginBean() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
