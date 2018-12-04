package com.dao;

public interface PasswordDao {
	
	boolean getPass(String username, String email);
	
	String setPass(String username,String password);

}
