package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Policy;
import com.model.Ticket;
import com.model.User;

public class PolicyDaoImpl implements PolicyDao {
	JdbcTemplate template; 
	
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	} 
	
	public List<Policy> show(String username) {
	    String query = "select * from gr10_policies where gp_user_id=(select id from gr10_users where username="+username; 
	    List<Policy> u =template.query(query, new PolicyMapper());
	    return u;
	}

	public int saveTicket(Ticket r, String username) {
		List<Policy> lst=show(username);
	    Policy grp=new Policy();
	    grp=lst.get(0);
	    int pol=grp.getPolicy_id();

	    String status=grp.getPolicy_status();
    String query="insert into gr10_tickets values("+r.getTicket_no()+","+pol+",'"+status+"')"; 
    return template.update(query); 
	}
	
	class UserMapper implements RowMapper<User> {
		  public User mapRow(ResultSet rs, int arg1) throws SQLException {
		    User user = new User();
		    user.setfName(rs.getString("first_name"));
		    user.setlName(rs.getString("last_name"));
		    user.setEmail(rs.getString("email"));
		    user.setPhone(rs.getInt("phone_no"));
		    user.setAddress(rs.getString("address"));
		    user.setUsername(rs.getString("username"));
		    user.setPassword(rs.getString("password"));
		    return user;
		  }
		}
	class PolicyMapper implements RowMapper<Policy> {
		  public Policy mapRow(ResultSet rs, int arg1) throws SQLException {
			  Policy p = new Policy();
		    p.setPolicy_id(rs.getInt("policy_id"));
		    p.setVehicle_id(rs.getInt("vehicle_id"));
		    p.setPolicy_type(rs.getString("vehicle_id"));
		    p.setPolicy_status(rs.getString("policy_status"));
		    p.setRegistration_no(rs.getInt("registration_no"));
		    p.setChasis_no(rs.getInt("chasis_no"));
		    p.setRegistration_no(rs.getInt("registration_no"));
		    p.setEngine_no(rs.getInt("engine_no"));
		    p.setClaim_amount(rs.getInt("claim_amount"));
		    p.setUser_id(rs.getInt("user_id"));
		    return p;
		  }
		}

}
