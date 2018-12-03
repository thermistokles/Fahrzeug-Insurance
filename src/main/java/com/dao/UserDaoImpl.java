package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Login;
import com.model.User;

public class UserDaoImpl implements UserDao {
	@Autowired
	  DataSource datasource;
	  @Autowired
	  JdbcTemplate jdbcTemplate;
	  
	  public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int register(User u) {
		String query = "insert into gr10_users (gu_first_name,gu_last_name,gu_email,gu_address,gu_phone_no,gu_username,gu_password) values('"+u.getfName()+"','"+u.getlName()+"','"+u.getEmail()+"','"+u.getAddress()+"',"+u.getPhone()+",'"+u.getUsername()+"','"+u.getPassword()+"')";
		return jdbcTemplate.update(query);
	    }
	public User validateUser(Login login) {
	    String sql = "select * from gr10_users where gu_username='" +login.getUsername() + "' and gu_password='" + login.getPassword()+ "'";
	    List<User> users = jdbcTemplate.query(sql, new UserMapper());
	    return users.size() > 0 ? users.get(0) : null;
	    }

public int getUid(String username) {
	String query="select gu_id from gr10_users  where gu_username='"+username+"' ";			 
							
	int uid = jdbcTemplate.queryForObject(query,Integer.class); 
	return uid;

  }

}

	  class UserMapper implements RowMapper<User> {
	  public User mapRow(ResultSet rs, int arg1) throws SQLException {
	    User user = new User();
	    System.out.println();
	    user.setUsername(rs.getString("gu_username"));
	    user.setPassword(rs.getString("gu_password"));
	    return user;
	  }
}

