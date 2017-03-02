package org.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.java.dependency.injection.TextEditor3;

public class ManageInnerBeanInjection {

	public static void main(String[] args) {

		ApplicationContext context =
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		TextEditor3 editor3 = (TextEditor3)context.getBean("textEditor3");
		editor3.chekcSpellings();
	}

}
