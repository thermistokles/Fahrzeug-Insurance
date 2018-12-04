package com.insurance.dao;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.insurance.model.UserVehicle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
	
	
	public class EstimateDaoImpl  implements EstimateDao{
		@Autowired
		  DataSource datasource;
		
		@Autowired
		JdbcTemplate template;  
		  
	
		public DataSource getDatasource() {
			return datasource;
		}

		public void setDatasource(DataSource datasource) {
			this.datasource = datasource;
		}

		public JdbcTemplate getTemplate() {
			return template;
		}

		public void setTemplate(JdbcTemplate template) {
			this.template = template;
		}

		//get engine number method	
				public String getEngine(UserVehicle uv) {
			
					System.out.println("vehicle engine in getengine:"+uv.getUser_vehicle_engine());
					 String query="select gv_cc from gr10_vehicledetails  where gv_model='"+uv.getUser_vehicle_model()+"' ";			 
					//Object[] inputs = new Object[] {v.getVehicle_model()};						
					String engine_no = template.queryForObject(query,String.class); 	
					
			       return engine_no;
				}
				
				//get car age method
				public float getAge(String dop) {
					
					System.out.println("date in getAge"+dop);
					
					
					   Date d=new Date();
				        float years=0;
				       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				       String d1=formatter.format(d);
				       
				        
				        try {
								Date startDate = formatter.parse(dop);
							    
							    Date endDate = formatter.parse(d1);
							     
							    float diffInMilliSec = endDate.getTime() - startDate.getTime();
							    
							    years =  (diffInMilliSec / (1000l * 60 * 60 * 24 * 365));
							    
							   
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					return years;
				}
				
				//method to fetch premium rate based on engine
				public String tp_rates(String engine) {
					
					String query="select gt_tp_rate from gr10_tprate where "+engine+" between gt_start_cc and gt_end_cc ";			 
					//Object[] inputs = new Object[] {engine};						
					String premium = template.queryForObject(query, String.class); 		
			       return premium;
					
				}
				
				//method to fetch dep percentage
				public int dep_value(float age) {
					System.out.println("age"+age);
					String query="select gd_dep_rate from gr10_deprate where "+age+" between gd_start_age and gd_end_age ";			 
					//Object[] inputs = new Object[] {age};						
					int dep = template.queryForObject(query,Integer.class); 				
					return dep;
				}
				//method to fetch selling price of model
				public int get_sp(String model) {
					String query="select gv_price from gr10_vehicledetails where gv_model='"+model+"' ";			 
					//Object[] inputs = new Object[] {model};					
					int sp = template.queryForObject(query, Integer.class); 				
					return sp;
				}
				//method to fetch own damage rate of vechicle by engine and state
						public float get_od(String engine,int state,float age) {
							String query="select go_od_rate from gr10_odrate where "+age+" between go_od_start_age and go_od_end_age and "+engine+" between go_od_start_cc and go_od_end_cc and go_od_zone="+state+"";			 
							//Object[] input1 = new Object[] {age,engine,state};	
							
							
							float sp = template.queryForObject(query,Float.class); 				
							return sp;
						}
				
				public List<String> getModel(){
					String query = "select gv_model from gr10_vehicledetails";
					List<String> strings = (List<String>) template.queryForList(query, String.class);
					return strings;
		                }
				
				public List<String> getCompany(){
					String query = "select DISTINCT gv_company from gr10_vehicledetails";
					List<String> strings = (List<String>) template.queryForList(query, String.class);
					return strings;
		                }
		
	}
		 
	

