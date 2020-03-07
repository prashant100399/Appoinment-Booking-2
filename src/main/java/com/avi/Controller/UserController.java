package com.avi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.avi.Model.UserRegistrationModel;
import com.avi.Services.UserRegistrationServices;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private UserRegistrationServices userservices;
	
	
	@PostMapping("/saveuserdata")
	public void saveUserRegistration(@ModelAttribute("user") UserRegistrationModel usermodel) {
		userservices.saveUserRegistrationt(usermodel);
		
	}
	
	
	
	
	
	

}
