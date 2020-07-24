package com.grocery.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.grocery.model.User;
import com.grocery.model.UserResponse;
import com.grocery.service.api.IrrigationService;

@Repository
public class IrrigationServiceImpl implements IrrigationService {

	@Autowired
	@Qualifier("mysqlJdbcTemplate")
	private JdbcTemplate jdbcTemplate = null;
	
	/*private static String username = "root";
	private static String password = "";
	private static String connectionString = "jdbc:mysql://localhost/irrigation";*/
	
	public UserResponse userDetails(){
		
		UserResponse users = new UserResponse();
		StringBuilder sb = new StringBuilder();
		sb.append("Select * from users");
	     List<User> userList= jdbcTemplate.query(sb.toString(), new UserMapper());
	     users.setUsers(userList);
	     return users;
		/*UserResponse userDetails = new UserResponse();
		Statement stmt = null;
		Connection con = null;
		
			try {
				 con = DriverManager.getConnection(connectionString, username, password);
				System.out.println("Connected");
				ArrayList<User1> users = new ArrayList<User1>();
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from users");
				while(rs.next()) {
					User1 user = new User1();
					user.setFirstName(rs.getString("first_name"));
					user.setLastName(rs.getString("last_name"));
					user.setUserId(rs.getString("user_id"));
					user.setEmailId(rs.getString("email_id"));
					user.setMobileNumber(rs.getLong("mobile_number"));
					user.setPassword(rs.getString("password"));
					users.add(user);
				}
				userDetails.setUsers(users);
			} catch(Exception e) {
				System.out.println(e);
			}finally{
				if(stmt != null){
					try {
						stmt.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(con != null){
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
*/		
			
		}
	public Integer RegisterUser(){
	
		StringBuilder sb = new StringBuilder();
		sb.append("insert into users(username,email,password) values(?,?,?)");
		List<Object> values = new ArrayList<Object>();
		values.add("xyz");
		values.add("xyz");
		values.add("13");
	     int rowCount= jdbcTemplate.update(sb.toString(), values.toArray());
	     return rowCount;
	}
}
