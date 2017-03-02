package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.domain.User;
import com.spring.service.UserService;

public class ManageJDBCTemplate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
				              new ClassPathXmlApplicationContext("com/spring/config/spring-jdbc.xml");
		User user = new User(103,"Jason","USA","Citizen");
		
		UserService service = (UserService) context.getBean("userServiceImpl");
		service.insertUser(user);
		

	}

}
