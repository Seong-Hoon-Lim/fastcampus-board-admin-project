package com.fastcampus.adminproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class FastcampusAdminProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastcampusAdminProjectApplication.class, args);
	}

}
