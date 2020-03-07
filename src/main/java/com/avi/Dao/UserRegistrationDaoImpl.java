package com.avi.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.avi.Model.UserRegistrationModel;

@Repository
public class UserRegistrationDaoImpl implements UserRegistrationDao {
	
	@Autowired
	private EntityManager entitymanager;
	
	

	@Override
	public List<UserRegistrationModel> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUserRegistrationt(UserRegistrationModel user) {
		Session session=entitymanager.unwrap(Session.class);
		session.save(user);
		System.out.println("=========save user data successfully========");

	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub

	}

}
