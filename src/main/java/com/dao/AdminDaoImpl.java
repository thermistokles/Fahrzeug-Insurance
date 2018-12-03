package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.model.Policy;
import com.model.Ticket;
import com.model.User;

public class AdminDaoImpl implements AdminDao {
	@Autowired
	DataSource dataSource;

	@Autowired
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
		public void setJdbcTemplate(JdbcTemplate template) {
			this.template = template;
		}
		public List<User> getAllUser(){  
			 return template.query("select * from gr10_users",new ResultSetExtractor<List<User>>(){  
			    public List<User> extractData(ResultSet rs) throws SQLException, DataAccessException {    
			        List<User> list=new ArrayList<User>();  
			        while(rs.next()){  
			        User user=new User();  
				    user.setfName(rs.getString("gu_first_name"));
				    user.setlName(rs.getString("gu_last_name"));
				    user.setEmail((rs.getString("gu_email")));
				    user.setAddress(rs.getString("gu_address"));
				    user.setPhone(rs.getLong("gu_phone_no"));
				    user.setUsername((rs.getString("gu_username")));
				    user.setPassword(rs.getString("gu_password"));
			        list.add(user);  
			        }  
			        return list;  
			        }  
			 });  
		}
		public List<Policy> getAllPolicy(){  
			 return template.query("select * from gr10_policies",new ResultSetExtractor<List<Policy>>(){  
			    public List<Policy> extractData(ResultSet rs) throws SQLException, DataAccessException {    
			        List<Policy> list=new ArrayList<Policy>();  
			        while(rs.next()){  
			        Policy policy=new Policy();  
			        policy.setPolicyId(rs.getInt("gp_policy_id"));
			        policy.setPolicyType((rs.getString("gp_policy_type")));
			        policy.setPolicyStatus(rs.getInt("gp_policy_status"));
			        policy.setUserId((rs.getInt("gp_user_id")));
			        policy.setUserVehicleRegNo((rs.getString("guv_reg_no")));
			        policy.setClaimAmount(rs.getInt("gp_claim_amount"));
			        policy.setUserId(rs.getInt("gp_user_id"));
			        policy.setStartDate((rs.getString("gp_policy_start_date")));
			        policy.setEndDate((rs.getString("gp_policy_end_date")));
			        list.add(policy);  
			        
			        }  
			        return list;  
			        }  
			 });  
		}
		public List<Ticket> getAllTicket(){  
			 return template.query("select * from gr10_tickets",new ResultSetExtractor<List<Ticket>>(){  
			    public List<Ticket> extractData(ResultSet rs) throws SQLException, DataAccessException {    
			        List<Ticket> list=new ArrayList<Ticket>();  
			        while(rs.next()){  
			        Ticket t=new Ticket();  
			        t.setticketNo(rs.getInt("gt_ticket_id"));
			        t.setpolicyNo(rs.getInt("gt_policy_no"));
			        t.setStatus(rs.getInt("gt_ticket_status"));
			        list.add(t);  
			        }  
			        return list;  
			        }  
			 });  
		}
			 public List<Ticket> getTicketByNo(int ticketNo){
					String s="select * from gr10_tickets where gt_ticket_id="+ticketNo;
					return template.query(s, new ResultSetExtractor<List<Ticket>>(){  
					    public List<Ticket> extractData(ResultSet rs) throws SQLException, DataAccessException {    
					        List<Ticket> list=new ArrayList<Ticket>();  
					        while(rs.next()){    	
					        	Ticket p = new Ticket();
					        	p.setticketNo(rs.getInt(1));
					        	p.setStatus(rs.getInt(3));
					        	p.setpolicyNo(rs.getInt(2));
					        	list.add(p);
					        }
					      return list;
					}
					});
				}
			
		 public int deleteUser(String username){  
		    String sql="delete from gr10_users where gu_username='"+username+"'";  
		    return template.update(sql);  
		}   
		public int deletePolicy(int policy_id){  
		    String sql="delete from gr10_policies where gp_policy_id="+policy_id+"";  
		    return template.update(sql);  
		}  
		public int deletetickets(long ticket_no){  
		    String sql="delete from gr10_tickets where gt_ticket_id="+ticket_no+"";  
		    return template.update(sql);  
		}  
		
		public int approveTicket(int status,int ticketNo) {
			int i=0;
			 if(status==0) {	 
					String sql="update gr10_tickets set gt_ticket_status = "+1+" where gt_ticket_id = "+ticketNo+"";
					 i= template.update(sql);
			}
			 return i;
		}
		public int getclaim(float amt,float amount,int id) {
			int i=0;
			
			String sql="update gr10_policies set gp_claim_amount="+(amt-amount)+"where gp_policy_id="+id+"";
			i=template.update(sql);
			return i;
		}

}
