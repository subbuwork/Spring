package com.spring.javabased.config;

public class TextEditor {
	SpellChecker checker;
	//String message;

	public TextEditor(){
	}
	public TextEditor(SpellChecker checker){
		this.checker = checker;
	}
	public SpellChecker getChecker() {
		return checker;
	}

	public void setChecker(SpellChecker checker) {
		this.checker = checker;
	}
	
	public void checkSpellings(){
		System.out.println("Inside checkSpellings..");
		checker.spellChekings();
	}

/*	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}*/
	

}
