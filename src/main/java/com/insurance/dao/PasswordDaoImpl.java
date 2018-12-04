package com.insurance.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.insurance.model.Login;


public class PasswordDaoImpl implements PasswordDao{
	
	@Autowired
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int getPass(String username, String email) {
		
		String sql = "select gu_id from gr10_users where gu_username='"+username+"' ";
		int i= template.queryForObject(sql,Integer.class);				
		return i;
			
	}
	
	public int setPass(Login login) {
		String sql="update gr10_users set gu_password = '"+login.getPassword()+"' where gu_username='"+login.getUsername()+"'";
		
		 return template.update(sql);
		
	}
	

}
