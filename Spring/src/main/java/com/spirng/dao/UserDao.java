package com.spirng.dao;

import java.util.List;

import javax.sql.DataSource;

import com.spring.domain.User;

public interface UserDao {
	
	/** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	    */
	//public void setDataSource(DataSource dataSource);
	
	 /** 
	    * This is the method to be used to create
	    * a record in the User table.
	    */
	public void insertUser(User user);
	
	/** 
	    * This is the method to be used to list down
	    * a record from the User table corresponding
	    * to a passed user id.
	    */
	public User getUser(Integer userid);
	
	/** 
	    * This is the method to be used to list down
	    * all the records from the User table.
	    */
    public List<User> usersList();
    
    /** 
     * This is the method to be used to delete
     * a record from the user table corresponding
     * to a passed user id.
     */
    public void deleteUser(Integer userid);
    
    /** 
     * This is the method to be used to update
     * a record into the User table.
     */
    public void updateUser(Integer userid,User user);
}
