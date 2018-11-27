package com.dao;

import com.model.Login;
import com.model.User;

public interface UserDao {
	public int register(User u);
	public User validateUser(Login login);
}
