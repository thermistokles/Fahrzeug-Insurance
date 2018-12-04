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

public class ClaimDaoImpl implements ClaimDao {
	@Autowired
	  DataSource datasource;
	
	@Autowired
	JdbcTemplate template;  
	  	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public List<Policy> show(String username) {
	    String query = "select * from gr10_policies where gp_user_id=(select gu_id from gr10_users where gu_username='"+username+"')"; 
	    List<Policy> u =template.query(query, new PolicyMapper());
	    return u;
	}
	class PolicyMapper implements RowMapper<Policy> {
		  public Policy mapRow(ResultSet rs, int arg1) throws SQLException {
			  Policy p = new Policy();
			  p.setPolicyId(rs.getInt("gp_policy_id"));
			  p.setPolicyType(rs.getString("gp_policy_type"));
			  p.setPolicyStatus(rs.getInt("gp_policy_status"));
			  p.setUserVehicleRegNo(rs.getString("guv_reg_no"));
			  p.setClaimAmount(rs.getFloat("gp_claim_amount"));
			  p.setUserId(rs.getInt("gp_user_id"));
			  
		    return p;
		  }
		}
	
	public int saveTicket(Ticket r,String username){  
	    List<Policy> lst=show(username);
	    Policy grp=new Policy();
	    grp=lst.get(0);
	     int pol =grp.getPolicyId();
	    int status=grp.getPolicyStatus();
    String query="insert into gr10_tickets values('"+r.getticketNo()+"','"+pol+"',0,'"+status+"')"; 
   return  template.update(query);
}  
	
}
