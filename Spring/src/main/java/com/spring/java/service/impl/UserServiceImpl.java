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
		System.out.println("Inside UserServiceImpl getUser() user ID::"+userid);
		return userDao.getUser(userid);
	}

	public List<User> usersList() {
		System.out.println("Inside UserServiceImpl usersList()");
		return userDao.usersList();
	}

	public void deleteUser(Integer userid) {
		userDao.deleteUser(userid);
		
	}

	public void updateUser(Integer userid, User user) {
		userDao.updateUser(userid, user);
		
	}

	/*public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}*/
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
