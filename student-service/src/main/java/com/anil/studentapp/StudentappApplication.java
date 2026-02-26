package com.anil.studentapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StudentappApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudentappApplication.class, args);
	}
}

