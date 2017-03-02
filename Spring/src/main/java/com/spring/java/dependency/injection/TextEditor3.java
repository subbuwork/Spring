package com.spring.java.dependency.injection;

public class TextEditor3 {
	
	SpellChecker spellChecker;
	
	public TextEditor3(){
		System.out.println("TextEditor2 constructor...");
	}
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}




	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void chekcSpellings(){
		System.out.println("Inside TextEditor3 class  chekcSpellings() method...");
		spellChecker.checkSpellings();
	}

}
