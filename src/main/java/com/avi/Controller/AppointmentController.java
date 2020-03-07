package com.avi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avi.Model.AppointmentModel;
import com.avi.Services.AppointmentServices;


@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	
	
	@Autowired
	private AppointmentServices appointmentservice;
	
	@PostMapping("/saveappointment")
	public void saveAppointment(@ModelAttribute("appointmentmodel") AppointmentModel am) {
		
		appointmentservice.saveAppoinment(am);
		
	}

}
