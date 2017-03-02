package com.spring.sql.constants;

public class SQLQueries {
	
	public static final String INSERT_USER= "insert into user (uid,user_name,country,status) values (?, ?, ?, ?)";
	public static final String GET_USER ="select * from user where uid = ?";
	public static final String GET_ALL_USER ="select * from user;";
	public static final String DELETE_USER = "delete from user where uid = ?";
	public static final String UPDATE_USER="update user set country=? and status=? where uid=?";

}
