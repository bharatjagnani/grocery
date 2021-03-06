package com.grocery.model;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name = "users")
public class User implements Serializable {
 private static final long serialVersionUID = 1L;
 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    @Column(name="userid")
    private Long userId;
 @Column(name = "username")
    private String userName;     
 @Column(name = "password")
    private String password;   
 @Column(name = "email")
    private String email;
 @Column(name ="enabled")
 private int enabled;
 @Column(name ="mobile_number")
 private String mobileNumber;
 
 public User(){
 }
 public User(User user) {
         this.userId = user.userId;
         this.userName = user.userName;
         this.email = user.email;       
         this.password = user.password;
         this.enabled=user.enabled;    
         this.mobileNumber=user.mobileNumber;  
 }
 public int getEnabled() {
  return enabled;
 }
 public void setEnabled(int enabled) {
  this.enabled = enabled;
 } 
 public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
public String getPassword() {
	System.out.println("password"+password);
  return password;
 }
 public void setPassword(String password) {
  this.password = password;
 }
 public String getEmail() {
  return email;
 }
 public void setEmail(String email) {
  this.email = email;
 }
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}


}
