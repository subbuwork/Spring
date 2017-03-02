package org.spring.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.java.service.impl.BeansLifeCycles;

public class ManageBeanPostProcessor {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		BeansLifeCycles cycles =(BeansLifeCycles)context.getBean("lifeCycle");
		cycles.setMessage("Hello...");
		System.out.println(cycles.getmessage());
		context.registerShutdownHook();
	}

}
