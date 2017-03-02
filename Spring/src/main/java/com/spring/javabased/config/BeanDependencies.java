package com.spring.javabased.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDependencies {
	
	@Bean
	public TextEditor textEditor(){
		System.out.println("Inside TextEditor constructor." );
		return new TextEditor(spellChecker());
	}
	@Bean
	public SpellChecker spellChecker(){
		return new SpellChecker();
	}

}
