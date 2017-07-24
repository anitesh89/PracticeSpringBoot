package com.cubem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.cubem.entity")
public class StartMyApp {

	public static void main(String[] args) {
		SpringApplication.run(StartMyApp.class, args);

	}

}
