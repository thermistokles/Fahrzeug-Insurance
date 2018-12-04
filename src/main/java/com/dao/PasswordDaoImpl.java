package com.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


public class PasswordDaoImpl implements PasswordDao{
	
	@Autowired
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public boolean getPass(String username, String email) {
		String sql = "select * from gr10_users where gu_username='" +username+ "' and gu_email='"+email+"'";
		Integer i= template.queryForObject(sql,Integer.class);
		return i != null && i > 0;
			
	}
	
	public String setPass(String username,String password) {
		String sql="update gr10_users set gu_password = '"+password+"' where gu_username='" +username+ "'";
		 template.update(sql);
		 return password;
		
	}
	

}
