package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UsersDao;
import com.model.Users;

@Service
@Transactional
public class UsersServiceImpl implements UsersService{
	@Autowired
	private UsersDao usersDao;
	
	@Transactional
	public List<Users> getAllUsers(){
		return usersDao.getAllUsers();
	}

	@Transactional
	public void addUsers(Users user) {
		usersDao.addUsers(user);
		
	}
	
	public Users updateUsers(Users users) {
        // TODO Auto-generated method stub
        return usersDao.updateUser(users);
    }
	
}
