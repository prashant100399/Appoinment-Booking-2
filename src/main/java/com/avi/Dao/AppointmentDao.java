package com.avi.Dao;


import java.util.List;

import com.avi.Model.*;
public interface AppointmentDao {
	
	public List<AppointmentModel> getAllAppointments();
	public void saveAppoinment(AppointmentModel am);
	public void deleteAppoinment(int id);

}
