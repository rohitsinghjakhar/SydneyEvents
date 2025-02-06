package com.sydneyevents.sydney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SydneyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SydneyApplication.class, args);
	}

}
