package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class OpenDataDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenDataDemoApplication.class, args);
	}
}
