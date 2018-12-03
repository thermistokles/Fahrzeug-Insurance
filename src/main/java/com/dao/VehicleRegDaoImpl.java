package com.dao;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;


import com.model.UserVehicle;

@Controller
public class VehicleRegDaoImpl implements VehicleRegDao {
	
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

	public int registerVehicle(UserVehicle uv) {
		//String q="insert into gr10_user_vehicle (guv_reg_no,guv_engine_no,guv_vehicle_engine,guv_chasis_no,guv_vehicle_company,guv_vehicle_model,guv_purchase_date,guv_vehicle_type,guv_zone,gu_uid) values ('"+uv.getUser_vehicle_reg_no()+"',"+uv.getUser_vehicle_engine_no()+","+uv.getUser_vehicle_engine()+","+uv.getUser_vehicle_chasis_no()+",'"+uv.getUser_vehicle_company()+"','"+uv.getUser_vehicle_model()+"','"+uv.getPurchase_date()+"','"+uv.getUser_vehicle_type()+"',"+uv.getUser_zone()+","+uv.getUser_id()+")";
		
		String q="insert into gr10_user_vehicle (guv_reg_no,guv_engine_no,guv_vehicle_engine,guv_chasis_no,guv_vehicle_company,guv_vehicle_model,guv_purchase_date,guv_vehicle_type,guv_zone,gu_uid,guv_idv) values ('"+uv.getUser_vehicle_reg_no()+"',"+uv.getUser_vehicle_engine_no()+","+uv.getUser_vehicle_engine()+","+uv.getUser_vehicle_chasis_no()+",'"+uv.getUser_vehicle_company()+"','"+uv.getUser_vehicle_model()+"','"+uv.getPurchase_date()+"','"+uv.getUser_vehicle_type()+"',"+uv.getUser_zone()+","+uv.getUser_id()+","+uv.getUser_vehicle_idv()+")";

		return jdbcTemplate.update(q);
	}

}
