
package com.chrishammer.model;

public class LoginAttempt {
	
	
	private String userName;
	private String password;
	private String passwordMatch;
	
	public String getPasswordMatch() {return passwordMatch;}
	public String getPassword() {return password;}
	public String getUserName() {return userName;}
	
	public void setPasswordMatch(String passwordMatch) {this.passwordMatch = passwordMatch;}
	public void setPassword(String password) {this.password = password;}
	public void setUserName(String userName) {this.userName = userName;}
}