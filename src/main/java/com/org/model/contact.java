package com.org.model;

public class contact {

	private String name;
	private String email;
	private String pass;
	
	public contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public contact(String name, String email, String pass) {
		super();
		this.name = name;
		this.email = email;
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "contact [name=" + name + ", email=" + email + ", pass=" + pass + "]";
	}
	
}
