package com.avi.Dao;

import java.util.List;

import com.avi.Model.*;

public interface UserRegistrationDao {
	
	public List<UserRegistrationModel> getAllUsers();
	public void saveUserRegistrationt(UserRegistrationModel user);
	public void deleteUser(int id);
}
