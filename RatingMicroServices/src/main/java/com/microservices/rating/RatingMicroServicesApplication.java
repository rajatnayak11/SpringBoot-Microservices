package com.microservices.rating;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RatingMicroServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingMicroServicesApplication.class, args);
		System.out.println("Ratings microservices has started");
	}
}