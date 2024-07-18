package com.example.smallwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication	
@ComponentScan(basePackages = {"com.example.smallwebapp"})
public class SmallWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmallWebAppApplication.class, args);
		System.out.println("Hello");
	}

}
