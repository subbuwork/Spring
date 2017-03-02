package org.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.User;

public class ManageAOP {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/spring/config/AppConfig.xml");
		
		User user = (User) context.getBean("user");
        user.getAddress();	
        user.getuID();
        user.getUserName();
        user.printThrowException();
	}

}
