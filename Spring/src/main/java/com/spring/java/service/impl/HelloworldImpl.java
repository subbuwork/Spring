/**
 * 
 */
package com.spring.java.service.impl;

import com.spring.service.HelloWorld;

/**
 * @author subbu
 *
 */
public class HelloworldImpl implements HelloWorld{
	
	String message;
	
	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

public String greetWorld(){
	return message;
}

}
