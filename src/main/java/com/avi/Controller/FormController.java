package com.avi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.avi.Dao.LogInDao;
import com.avi.Model.UserRegistrationModel;
import com.avi.Services.LogInService;
import com.avi.Services.UserRegistrationServices;

@RestController
public class FormController {

	
	@Autowired
	private UserRegistrationServices user;
	
	
	@Autowired
	private LogInService loginservice;
	
	@RequestMapping(value = "/userr",method = RequestMethod.GET)
	public ModelAndView getUserRegistrationPage() {
		ModelAndView mv=new ModelAndView("userRegister");
		return mv;
	}
	
	@RequestMapping(value = "/appointment",method = RequestMethod.GET)
	public ModelAndView getAppointmentFromPage() {
		ModelAndView mv=new ModelAndView("appointmentFrom");
		return mv;
	}
	
	
	//for showing log in form 
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public ModelAndView getLoginForm() {
		return new ModelAndView("loginfrom");
		
	}
	
	//for getting log in data
		@RequestMapping(value = "/logindata")
		public String getLoginData(@ModelAttribute("logindatauser") UserRegistrationModel urm) {
			
			//System.out.println(email +  "  "+ password);
			loginservice.findByEmailAndPassword(urm.getEmail(), urm.getPassword());
			
			
			//	System.out.println("==============log in successfull=========");
			return "userRegister";
			
		}
}
