package com.spring.annotations;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private Integer sid;
	private String sName;
	
	public Integer getSid() {
		return sid;
	}
	@Required
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	@Required
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	

}
