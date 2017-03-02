package com.spring.java.dependency.injection;

public class TextEditor2 {
	
	SpellChecker spellChecker;
	
	public TextEditor2(){
		System.out.println("TextEditor2 constructor...");
	}
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}




	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void chekcSpellings(){
		System.out.println("Inside TextEditor2 class  chekcSpellings() method...");
		spellChecker.checkSpellings();
	}

}
