package com.avi.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointment_details")
public class AppointmentModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Column int sr_no;
	private @Column String firstName;
	private @Column String lastName;
	private @Column String email;
	private @Column String birthDate;
	private @Column String address;
	private @Column String time;
	private @Column String country;
	private @Column String district;
	private @Column String pin;
	private @Column String tal;
	private @Column String phoneNumber;
	private @Column String gender;
	private @Column String reason;
	
	
	
	public AppointmentModel()
	{
		
	}	
	
	
	public AppointmentModel(int sr_no, String firstName, String lastName, String email, String birthDate,
			String address, String time, String country, String district, String pin, String tal, String phoneNumber,
			String gender, String reason) {
		super();
		this.sr_no = sr_no;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.birthDate = birthDate;
		this.address = address;
		this.time = time;
		this.country = country;
		this.district = district;
		this.pin = pin;
		this.tal = tal;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.reason = reason;
	}
	public int getSr_no() {
		return sr_no;
	}
	public void setSr_no(int sr_no) {
		this.sr_no = sr_no;
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
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getTal() {
		return tal;
	}
	public void setTal(String tal) {
		this.tal = tal;
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
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
	
	
	
	
	
} 
