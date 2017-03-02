package org.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.java.dependency.injection.CollectionsInjection;

public class ManageCollections {

	public static void main(String[] args) {
	ApplicationContext context = 
			new ClassPathXmlApplicationContext("ApplicationContext.xml");
	CollectionsInjection injection = (CollectionsInjection) context.getBean("collections");
	System.out.println("List Values:::"+injection.getCountries());
	System.out.println("Set Values:::"+injection.getStates());
	System.out.println("Map Values:::"+injection.getCities());
	System.out.println("Properties Values:::"+injection.getAddressProps());

	}

}
