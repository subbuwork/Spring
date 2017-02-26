/**
 * 
 */
package com.spring.java.service.impl;

/**
 * @author subbu
 *
 */
public class BeansLifeCycles {
	
	public String message;
	
	public String getmessage(){
		return message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public void init(){
		System.out.println("Bena going through inilizatoin process....");
	}
	public void destroy(){
		System.out.println("Bean going through destroy process.........");
	}
}
