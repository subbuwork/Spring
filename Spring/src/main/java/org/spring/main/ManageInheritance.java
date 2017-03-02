package org.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.java.service.impl.HelloIndia;
import com.spring.java.service.impl.HelloWorld;

public class ManageInheritance {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		HelloWorld world = (HelloWorld) context.getBean("helloworld");
		world.getMessage1();
		world.getMessage2();
		
		HelloIndia india = (HelloIndia) context.getBean("helloIndia2");
		india.getMessage1();
		india.getMessage2();
		india.getMessage3();
	}

}
