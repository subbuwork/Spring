package com.spring.domain;

public class User {
	private  Integer uid;
	private String userName;
	private String country;
	private String status;
	
	public User(){}
	
	public User(Integer uid, String userName, String country, String status) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.country = country;
		this.status = status;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
