/**
 * 
 */
package com.spring.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.domain.User;

/**
 * @author subbu
 *
 */
public class UserMapper implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		System.out.println("Inside mapRow....");
        User user = new User();
        user.setUid(rs.getInt(1));
        user.setUserName(rs.getString(2));
        user.setCountry(rs.getString(3));
        user.setStatus(rs.getString(4));
        System.out.println("Inside mapRow:: userID::"+user.getUid());
		return user;
	}

}
