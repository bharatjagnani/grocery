package com.grocery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.grocery.repository.UserRepository;
import com.grocery.service.impl.CustomUserDetialsService;



@Configuration
@EnableWebSecurity
@ComponentScan({"com.grocery.service.impl","com.grocery.repository"})
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	 @Autowired
	private CustomUserDetialsService userDetailsService;
	 
	 @Override
	 protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	  /* auth.jdbcAuthentication().dataSource(dataSource)
	  .usersByUsernameQuery(
	   "select first_name from users where user_id=?")
	  .authoritiesByUsernameQuery("Select username ,role from user_roles where username =?");*/
		 System.out.println("hell0");
		
		auth.userDetailsService(userDetailsService)
		.passwordEncoder(new PasswordEncoder(){

			@Override
			public String encode(CharSequence rawPassword) {
				// TODO Auto-generated method stub
				return rawPassword.toString();
			}

			@Override
			public boolean matches(CharSequence rawPassword, String encodedPassword) {
				// TODO Auto-generated method stub
				System.out.println("rawPassword:"+rawPassword+" and encodedPassword "+encodedPassword);
				if(rawPassword.equals(encodedPassword)){
					return true;
				}else{
				return false;
				}
			}
			
			
		});
	  
	 } 
	 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    /*    http
            .authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .permitAll();*/
        System.out.println("Authentication");
        http
        .authorizeRequests()
        .antMatchers("/","/signUp","/login").permitAll()
        .anyRequest().authenticated()
        .and().csrf().disable()
        .formLogin()
        .loginPage("/login")
        .loginPage("/")
        .defaultSuccessUrl("/home")
        .usernameParameter("username")
        .passwordParameter("password")
        .and()
          .logout().logoutSuccessUrl("/logout") 
         .and()
         .exceptionHandling().accessDeniedPage("/403");
    }
   /* @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("bharat").password("12345").roles("ROLE_ADMIN");
        
    }*/
    
    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**");
    }
 
}
