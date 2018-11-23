package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Users;

public class UsersDaoImpl implements UsersDao {
	
	@Autowired
    private SessionFactory sessionFactory;

	public void addUsers(Users user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		
	}

	public List<Users> getAllUsers() {
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}

	public Users updateUser(Users user) {
		sessionFactory.getCurrentSession().update(user);
        return user;
	}

}
