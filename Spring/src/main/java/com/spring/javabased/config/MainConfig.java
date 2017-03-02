package com.spring.javabased.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MainConfig {

	@Bean
	Helloworld helloWorld(){
		return new Helloworld();
	}
	
	@Bean
	public TextEditor textEditor(){
		return new TextEditor(spellChecker());
	}
	
	@Bean
	public SpellChecker spellChecker(){
		return new SpellChecker();
	}

}
