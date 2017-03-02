package org.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.javabased.config.Helloworld;
import com.spring.javabased.config.MainConfig;
import com.spring.javabased.config.TextEditor;

public class ManageJavaConfiguratioin {

	public static void main(String[] args) {

		ApplicationContext context = 
				new AnnotationConfigApplicationContext(MainConfig.class);
		Helloworld helloWorld =(Helloworld)context.getBean(Helloworld.class);
		helloWorld.getMessage();
		
		TextEditor editor = (TextEditor) context.getBean(TextEditor.class);
		editor.checkSpellings();
		
		
	}

}
