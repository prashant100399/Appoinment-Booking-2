package com.avi.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userregistration")
public class UserRegistrationModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Column int id;
	private @Column String firstName;
	private @Column String lastName;
	private @Column String email;
	private @Column String password;
	private @Column String repassword;
	private @Column String birthDate;
	private @Column String phoneNumber;
	private @Column String gender;
	
	
	public UserRegistrationModel() {
		
	}
	
	
	public UserRegistrationModel(int id, String firstName, String lastName, String email, String password,
			String repassword, String birthDate, String phoneNumber, String gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.repassword = repassword;
		this.birthDate = birthDate;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String femaleRadio) {
		this.gender = femaleRadio;
	}
	
	
	
	
	
	
	
	
	
	
	
}
