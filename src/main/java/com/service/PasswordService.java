package com.service;

public interface PasswordService {
	
	boolean getPass(String username, String email);
	
	String setPass(String username,String password);

}
