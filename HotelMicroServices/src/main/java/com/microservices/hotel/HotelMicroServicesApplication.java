package com.microservices.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HotelMicroServicesApplication {
	public static void main(String[] args) {
		SpringApplication.run(HotelMicroServicesApplication.class, args);
		System.out.println("Hotel microservices has started");
	}
}

