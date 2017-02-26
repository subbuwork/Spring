package org.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.spring.java.service.impl.HelloworldImpl;
import com.spring.service.HelloWorld;

public class ManageHelloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		HelloWorld world = (HelloWorld)context.getBean("helloWorld");
		System.out.println(world.greetWorld());
	}

}
