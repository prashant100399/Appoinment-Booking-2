package com.avi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.avi.Dao.AppointmentDao;
import com.avi.Model.AppointmentModel;

@Service
public class AppointmentServicesImpl implements AppointmentServices {

	@Autowired
	AppointmentDao appointmentdao;
	
	
	@Override
	public List<AppointmentModel> getAllAppointments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void saveAppoinment(AppointmentModel am) {
		appointmentdao.saveAppoinment(am);
		
	}

	@Override
	public void deleteAppoinment(int id) {
		// TODO Auto-generated method stub
		
	}

}
