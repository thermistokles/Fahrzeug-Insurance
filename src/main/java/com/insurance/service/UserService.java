package com.insurance.service;

import com.insurance.model.Login;
import com.insurance.model.User;

public interface UserService {

	  int register(User user);

	  User validateUser(Login login);
	  int getUid(String username);
	  
	}