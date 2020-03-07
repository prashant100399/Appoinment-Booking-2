package com.avi.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.avi.Model.AppointmentModel;


@Repository
public class appointmentDaolmpl implements AppointmentDao {
	
	@Autowired
	private EntityManager entitymanager;
	
	
	
	@Override
	public List<AppointmentModel> getAllAppointments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveAppoinment(AppointmentModel am) {
		Session session=entitymanager.unwrap(Session.class);
		session.save(am);
		System.out.println("=======appointment saved===========");
		

	}

	@Override
	public void deleteAppoinment(int id) {
		// TODO Auto-generated method stub

	}

}
