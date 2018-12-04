package com.insurance.service;

import com.insurance.model.Login;

public interface PasswordService {
	
	int getPass(String username, String email);
	
	int setPass(Login login);

}
