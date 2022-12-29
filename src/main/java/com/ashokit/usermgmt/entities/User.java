package com.ashokit.usermgmt.entities;

import java.sql.Date;

public class User {

	private String fname;
	private String lname;
	private String email;
	private long phno;
	private Date dob;
	private String gender;
	private String country;
	private String state;
	private String city;
	private String userPwd;
	private String accStatus;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getAccStatus() {
		return accStatus;
	}
	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}
	public User(String fname, String lname, String email, long phno, Date dob, String gender, String country,
			String state, String city, String userPwd, String accStatus) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phno = phno;
		this.dob = dob;
		this.gender = gender;
		this.country = country;
		this.state = state;
		this.city = city;
		this.userPwd = userPwd;
		this.accStatus = accStatus;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", email=" + email + ", phno=" + phno + ", dob=" + dob
				+ ", gender=" + gender + ", country=" + country + ", state=" + state + ", city=" + city + ", userPwd="
				+ userPwd + ", accStatus=" + accStatus + "]";
	}
	
	

}