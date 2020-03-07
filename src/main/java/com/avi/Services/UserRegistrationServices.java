package com.avi.Services;

import java.util.List;

import com.avi.Model.UserRegistrationModel;

public interface UserRegistrationServices {
	public List<UserRegistrationModel> getAllUsers();
	public void saveUserRegistrationt(UserRegistrationModel user);
	public void deleteUser(int id);

}
