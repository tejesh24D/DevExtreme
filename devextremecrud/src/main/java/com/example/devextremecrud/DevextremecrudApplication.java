package com.example.devextremecrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.devextremecrud.repository")
public class DevextremecrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevextremecrudApplication.class, args);
	}

}
