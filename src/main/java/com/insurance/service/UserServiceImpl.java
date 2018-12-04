package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dao.UserDao;
import com.insurance.model.Login;
import com.insurance.model.User;

@Service
public class UserServiceImpl implements UserService {

	  @Autowired
	  public UserDao userDao;

	  public int register(User user) {
	    return userDao.register(user);
	  }

	  public User validateUser(Login login) {
	    return userDao.validateUser(login);
	  }

	public int getUid(String username) {
		return userDao.getUid(username);
	}

	}