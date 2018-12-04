package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.PasswordDao;

@Service
public class PasswordServiceImpl implements PasswordService {

	@Autowired
	PasswordDao padao;
	
	public boolean getPass(String username, String email) {
		return padao.getPass(username, email);
	}

	public String setPass(String username, String password) {
		return padao.setPass(username, password);
	}

}
