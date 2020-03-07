package com.avi.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.avi.Model.UserRegistrationModel;


@Repository
public interface LogInDao extends CrudRepository<UserRegistrationModel, Integer> {
	
	public UserRegistrationModel findByEmailAndPassword(String email,String password);
	
	

}
