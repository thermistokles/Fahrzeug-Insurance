package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dao.PasswordDao;
import com.insurance.model.Login;

@Service
public class PasswordServiceImpl implements PasswordService {

	@Autowired
	PasswordDao padao;
	
	public int getPass(String username, String email) {
		return padao.getPass(username, email);
	}

	public int setPass(Login login) {
		return padao.setPass(login);
	}

}
