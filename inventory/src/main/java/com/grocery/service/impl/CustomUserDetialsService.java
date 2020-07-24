package com.grocery.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.grocery.model.CustoUserDetails;
import com.grocery.model.User;
import com.grocery.repository.UserRepository;
import com.grocery.repository.UserRolesRepository;

@Service
public class CustomUserDetialsService implements  UserDetailsService{

     @Autowired
	 private UserRepository userRepository;
     @Autowired
	 private UserRolesRepository userRolesRepository;
	 

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=userRepository.findByUserName(username);
		System.out.println("user: "+user.toString());
		
		  if(null == user){
		   throw new UsernameNotFoundException("No user present with username: "+username);
		  }else{
		   List<String> userRoles=userRolesRepository.findRoleByUserName(username);
		   return new CustoUserDetails(user,userRoles);
		  }
	}

	
}
