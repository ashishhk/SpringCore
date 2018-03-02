package com.epam.spring;

import org.springframework.beans.factory.annotation.Value;

public class Client {
	
	private String id;
	
	private String fullName;
	
	public String getId() {
		return id;
	}
	
	@Value("${id}")
	public void setId(String id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	
	@Value("${name}")
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	

}
