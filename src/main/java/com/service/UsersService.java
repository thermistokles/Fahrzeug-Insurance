package com.service;

import java.util.List;

import com.model.Users;

public interface UsersService {
	public void addUsers(Users user);
	
	public List<Users> getAllUsers();
	
	public Users updateUsers(Users users);
}
