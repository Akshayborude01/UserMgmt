package com.ashokit.usermgmt.entities;

public class Loginform {
	
	private String email;
	private String userPwd;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public Loginform(String email, String userPwd) {
		super();
		this.email = email;
		this.userPwd = userPwd;
	}
	public Loginform() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Loginform [email=" + email + ", userPwd=" + userPwd + "]";
	}
	
	

}
