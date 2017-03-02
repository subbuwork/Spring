package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	//Autowire annotation on bean property to get rid of the setter method..
	@Autowired
	SpellChecker checker;
	String message;

	public SpellChecker getChecker() {
		return checker;
	}
    /**
     * Autowire annotation on setter method
     * @param checker
     */
	/*@Autowired
	public void setChecker(SpellChecker checker) {
		this.checker = checker;
	}*/
	
	public void checkSpellings(){
		System.out.println("Inside checkSpellings Annotations222..");
		checker.spellChekings();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
