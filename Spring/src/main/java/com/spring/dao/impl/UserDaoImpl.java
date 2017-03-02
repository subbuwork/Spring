package com.spring.dao.impl;

import java.util.List;

//import javax.sql.DataSource;


//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spirng.dao.UserDao;
import com.spring.domain.User;
import com.spring.mapper.UserMapper;
import com.spring.sql.constants.SQLQueries;

public class UserDaoImpl implements UserDao {
	//DataSource dataSource;
	
	JdbcTemplate jdbcTemplate;
	
	/*public void setDataSource(DataSource dataSource) {
		
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}*/
	
	public UserDaoImpl(){}
	
	public UserDaoImpl(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	public void insertUser(User user) {
		System.out.println("Inside UserDaoImpl insertUser()");
		jdbcTemplate.update(SQLQueries.INSERT_USER,user.getUid(),user.getUserName(),user.getCountry(),user.getStatus());
	}

	/*public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public User getUser(Integer userid) {
		System.out.println("Inside UserDaoImpl getUser()  UserID::"+userid);
		User user = jdbcTemplate.queryForObject(SQLQueries.GET_USER,new Object[]{userid}, new UserMapper());
		return user;
	}

	public List<User> usersList() {
		System.out.println("Inside UserDaoImpl usersList()::");
		List<User> userList = jdbcTemplate.query(SQLQueries.GET_ALL_USER, new UserMapper());
		System.out.println("User List Size::"+userList.size());
		return userList;
	}

	public void deleteUser(Integer userid) {
		jdbcTemplate.update(SQLQueries.DELETE_USER, userid);
		System.out.println("User deleted with userid:"+userid);
		
	}

	public void updateUser(Integer userid, User user) {
	jdbcTemplate.update(SQLQueries.UPDATE_USER, user.getCountry(),user.getStatus(),userid);
	System.out.println("User udpated with id:"+user.getUid());
		
	}

}
