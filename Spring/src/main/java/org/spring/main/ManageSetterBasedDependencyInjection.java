package org.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.java.dependency.injection.TextEditor2;

public class ManageSetterBasedDependencyInjection {

	public static void main(String[] args) {

		ApplicationContext context = 
				 new ClassPathXmlApplicationContext("ApplicationContext.xml");
		TextEditor2 editor2 = (TextEditor2) context.getBean("textEditor2");
		editor2.chekcSpellings();
	}

}
