package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.domain.User;
import com.spring.service.UserService;

public class ManageJDBCTemplate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
				              new ClassPathXmlApplicationContext("com/spring/config/spring-jdbc.xml");
		UserService service = (UserService) context.getBean("userServiceImpl");
		//Inserting user into user table in data base
		User user = new User(112,"Sara","SP","Citizen");
		service.insertUser(user);
		
		//Getting User with user id..
		User user1 = (User) service.getUser(112);
		System.out.println("User id::"+user1.getUid());
		System.out.println("User Name::"+user1.getUserName());
		System.out.println("User Country::"+user1.getCountry());
		System.out.println("User status::"+user1.getStatus());
		System.out.println("=======End=========");
		
		//Displaying list of users...
		List<User> usersList = (List<User>) service.usersList();
		for(User user2: usersList){
			System.out.println("User id::"+user2.getUid());
			System.out.println("User Name::"+user2.getUserName());
			System.out.println("User Country::"+user2.getCountry());
			System.out.println("User status::"+user2.getStatus());
			System.out.println("User=="+user2.getUid()+"====End===");
			
		}
		//Deleting user..
		service.deleteUser(103);
		
		User user3 = new User(105,"Niharika","USA","H1B");
		service.updateUser(105, user3);
		
		
	}

}
