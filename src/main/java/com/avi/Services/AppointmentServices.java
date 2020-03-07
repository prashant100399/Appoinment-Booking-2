package com.avi.Services;

import java.util.List;

import com.avi.Model.AppointmentModel;

public interface AppointmentServices {
	
	public List<AppointmentModel> getAllAppointments();
	public void saveAppoinment(AppointmentModel am);
	public void deleteAppoinment(int id);


}
