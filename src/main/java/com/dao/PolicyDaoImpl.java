package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Policy;
import com.model.Ticket;
import com.model.User;

public class PolicyDaoImpl implements PolicyDao {
	@Autowired
	DataSource dataSource;
	@Autowired
	JdbcTemplate template; 
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	} 
	
	public List<Policy> show(String username) {
	    String query = "select * from gr10_policies where gp_user_id=(select gp_user_id from gr10_users where gu_username='"+username+"')"; 
	    List<Policy> u =template.query(query, new PolicyMapper());
	    return u;
	}
	
	public int addPolicy(Policy p) {
		String q="insert into gr10_policies (gp_policy_type,gp_policy_status,guv_reg_no,gp_claim_amount,gp_user_id,gp_policy_start_date,gp_policy_end_date) values ('"+p.getPolicyType()+"',"+p.getPolicyStatus()+",'"+p.getUserVehicleRegNo()+"',"+p.getClaimAmount()+","+p.getUserId()+",'"+p.getStartDate()+"','"+p.getEndDate()+"')";
		
		return template.update(q);
	}
	
	public int saveTicket(Ticket r, String username) {
		List<Policy> lst=show(username);
	    Policy grp=new Policy();
	    grp=lst.get(0);
	    int pol=grp.getPolicyId();
	    int status=grp.getPolicyStatus();
	    String query="insert into gr10_tickets values("+r.getticketNo()+","+pol+",'"+status+"')"; 
	    return template.update(query); 
	    
	}
	
	class UserMapper implements RowMapper<User> {
		  public User mapRow(ResultSet rs, int arg1) throws SQLException {
		    User user = new User();
		    user.setfName(rs.getString("gu_first_name"));
		    user.setlName(rs.getString("gu_last_name"));
		    user.setEmail(rs.getString("gu_email"));
		    user.setPhone(rs.getInt("gu_phone_no"));
		    user.setAddress(rs.getString("gu_address"));
		    user.setUsername(rs.getString("gu_username"));
		    user.setPassword(rs.getString("gu_password"));
		    return user;
		  }
		}
	class PolicyMapper implements RowMapper<Policy> {
		  public Policy mapRow(ResultSet rs, int arg1) throws SQLException {
			  Policy p = new Policy();
		    p.setPolicyId(rs.getInt("gp_policy_id"));
		    p.setPolicyType(rs.getString("gp_policy_type"));
		    p.setPolicyStatus(Integer.parseInt(rs.getString("gp_policy_status")));
		    p.setUserVehicleRegNo((rs.getString("guv_reg_no")));		    
		    p.setClaimAmount((rs.getInt("gp_claim_amount")));
		    p.setUserId(rs.getInt("gp_user_id"));
		    p.setStartDate(rs.getString("gp_policy_start_date"));
		    p.setEndDate(rs.getString("gp_policy_end_date"));
		    return p;
		  }
		}
	public int getPid(int userId) {
		String q="select gp_policy_id from gr10_policies where gp_user_id="+userId+"";
	    int p =template.queryForObject(q, Integer.class);

		
		return p;
	}
	

}
