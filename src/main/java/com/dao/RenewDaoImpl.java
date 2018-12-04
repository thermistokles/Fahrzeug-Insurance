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

public class RenewDaoImpl implements RenewDao {
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

	public List<Policy> getPolicyDetails(int policyId) {
		String sql = "select * from gr10_policies where gp_policy_id='"+policyId+"'";
		List<Policy> u =template.query(sql, new PolicyMapper());
	    return u;
	}
	
	class PolicyMapper implements RowMapper<Policy> {
		  public Policy mapRow(ResultSet rs, int arg1) throws SQLException {
			  Policy p = new Policy();
			  p.setPolicyId(rs.getInt("gp_policy_id"));
			  p.setPolicyType(rs.getString("gp_policy_type"));
			  p.setPolicyStatus(rs.getInt("gp_policy_status"));
			  p.setUserVehicleRegNo((rs.getString("guv_reg_no")));
			  p.setClaimAmount((rs.getInt("gp_claim_amount")));
			  p.setUserId(rs.getInt("gp_user_id"));
			  
		    return p;
		  }
		}
	
	public int saveTicket(Ticket r,int policyId){ 
	    Policy grp=new Policy();
	    int pol =grp.getPolicyStatus();
	    String query="insert into gr10_tickets values('"+r.getticketNo()+"','"+policyId+"',0,'"+pol+"')"; 
	    return  template.update(query);  
	}  

}
