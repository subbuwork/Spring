package com.spring.aop;

public class User {
	private Integer uID;
	private String userName;
	private String address;
	
	public User(){}
	public User(Integer uID, String userName, String address) {
		super();
		this.uID = uID;
		this.userName = userName;
		this.address = address;
	}
	public Integer getuID() {
		return uID;
	}
	public void setuID(Integer uID) {
		this.uID = uID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void printThrowException(){
		   System.out.println("Exception raised");
	       throw new IllegalArgumentException();
	   }
}
