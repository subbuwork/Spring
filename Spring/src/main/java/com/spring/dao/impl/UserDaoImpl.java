package com.spring.dao.impl;

import java.util.List;

//import javax.sql.DataSource;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spirng.dao.UserDao;
import com.spring.domain.User;
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

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
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

}
