package com.avi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.avi.Dao.UserRegistrationDao;
import com.avi.Model.UserRegistrationModel;

@Service
public class UserRegistrationServicesImpl implements UserRegistrationServices {

	@Autowired
	private UserRegistrationDao userdao;
	
	
	
	
	@Override
	public List<UserRegistrationModel> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional
	@Override
	public void saveUserRegistrationt(UserRegistrationModel user) {
		userdao.saveUserRegistrationt(user);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub

	}

}
