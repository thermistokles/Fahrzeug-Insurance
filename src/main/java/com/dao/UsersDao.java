package com.dao;

import java.util.List;
import com.model.Users;

public interface UsersDao {
	public void addUsers(Users user);
	public List<Users> getAllUsers();
	public Users updateUser(Users user);
	 
}
