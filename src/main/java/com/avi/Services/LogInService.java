package com.avi.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avi.Dao.LogInDao;
import com.avi.Model.UserRegistrationModel;

@Service
public class LogInService {
	
	@Autowired
	private LogInDao login;
	
	
	public UserRegistrationModel findByEmailAndPassword(String email,String password) {
		UserRegistrationModel urm=login.findByEmailAndPassword(email, password);
		return urm;
		
	}
	
	

}
