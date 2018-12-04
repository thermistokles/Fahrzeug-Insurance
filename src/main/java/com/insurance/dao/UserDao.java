package com.insurance.dao;

import com.insurance.model.Login;
import com.insurance.model.User;

public interface UserDao {
	public int register(User u);
	public User validateUser(Login login);
	public int getUid(String username);
}
