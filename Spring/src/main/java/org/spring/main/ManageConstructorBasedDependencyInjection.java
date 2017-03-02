package org.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.java.dependency.injection.TextEditor;

public class ManageConstructorBasedDependencyInjection {

	public static void main(String[] args) {

		ApplicationContext context = 
				 new ClassPathXmlApplicationContext("ApplicationContext.xml");
		TextEditor editor = (TextEditor)context.getBean("textEditor");
	    editor.chekcSpellings();
	}
	

}
