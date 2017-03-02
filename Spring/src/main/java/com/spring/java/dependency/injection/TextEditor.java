package com.spring.java.dependency.injection;

public class TextEditor {
	
	SpellChecker spellChecker;
	
	public TextEditor(SpellChecker sChecker){
		this.spellChecker = sChecker;
	}
	
	public void chekcSpellings(){
		System.out.println("Inside TextEditor class  chekcSpellings() method...");
		spellChecker.checkSpellings();
	}

}
