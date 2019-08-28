package model;

import java.io.Serializable;

public class employee implements Serializable{

	/**
	 * 
	 */
	public static int  serialVersionUID = 1;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public employee() {
		super();
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	private String name,email,password,country;
	public employee(String name, String email, String password, String country) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.country = country;
	}
	

}
