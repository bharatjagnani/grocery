package com.grocery.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.grocery.model.User;

public class UserMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUserId(rs.getLong("userid"));
		user.setEmail(rs.getString("email"));
		user.setEnabled(rs.getInt("enabled"));
		user.setPassword(rs.getString("password"));
		user.setUserName(rs.getString("username"));
		user.setMobileNumber(rs.getString("mobileNumber"));
		
		
		return user;
	}

	
}
