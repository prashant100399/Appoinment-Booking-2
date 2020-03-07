package com.avi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AppoinmentBooking2Application {

	public static void main(String[] args) {
		SpringApplication.run(AppoinmentBooking2Application.class, args);
	}

}
