package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "student-api",version = "3.2",description = "test"))
public class StudentDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDetailsApplication.class, args);
	}

}
