package com.insurance.dao;

import com.insurance.model.Login;

public interface PasswordDao {
	
	int getPass(String username, String email);
	
	int setPass(Login login);

}