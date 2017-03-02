package org.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.autowire.TextEditor;

public class ManageAutoWire {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		TextEditor editor =(TextEditor)context.getBean("te");
		System.out.println(editor.getMessage());
		editor.checkSpellings();
		
		ApplicationContext context2 = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		TextEditor editor2 =(TextEditor)context2.getBean("te2");
		editor2.checkSpellings();;
		System.out.println(editor.getMessage());
		
		
		
	}

}
