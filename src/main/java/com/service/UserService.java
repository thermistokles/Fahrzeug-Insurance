package com.service;

import com.model.Login;
import com.model.User;

public interface UserService {

	  int register(User user);

	  User validateUser(Login login);
	  int getUid(String username);
	  
	}