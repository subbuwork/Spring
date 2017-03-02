package com.spring.java.service.impl;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;

import com.spirng.dao.UserDao;
import com.spring.domain.User;
import com.spring.service.UserService;

public class UserServiceImpl implements UserService{
    UserDao userDao;
	public void insertUser(User user) {
		System.out.println("Inside UserServiceImpl insertUser()");
		userDao.insertUser(user);
		
	}

	public User getUser(Integer userid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> usersList() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUser(Integer userid) {
		// TODO Auto-generated method stub
		
	}

	public void updateUser(Integer userid, User user) {
		// TODO Auto-generated method stub
		
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	

}
