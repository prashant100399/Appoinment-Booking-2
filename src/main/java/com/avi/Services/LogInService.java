package com.avi.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avi.Dao.LogInDao;
import com.avi.Model.UserRegistrationModel;

@Service
public class LogInService {
	
	@Autowired
	private LogInDao login;
	
	
	public UserRegistrationModel findByEmailAndPassword(String email,String password) {
		UserRegistrationModel urm=login.findByEmailAndPassword(email, password);
		return urm;
		
	}
	
	
	
	
	public void arm(int m) {
		
		
		System.out.println("=====================Armstrong service is start========");
		int r=0,sum=0,n=m;
		System.out.println("Current r="+r);
		System.out.println("current sum="+sum);
		while (n>0) {
			
			r=n%10;
			System.out.println("update remainder is="+r);
			sum=sum+r*r*r;
			System.out.println("update sum="+sum);
			n=n/10;
			System.out.println("update n="+n);
			
			
		}
		
		if(m==sum)
			System.out.println("given nimber is an armstrong");
		else {
			System.out.println("not armstrong");
		}
		
		System.out.println("=====================Armstrong service is END========");
	}
	
	

}
