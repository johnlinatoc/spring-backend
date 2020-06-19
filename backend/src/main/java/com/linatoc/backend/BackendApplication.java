package com.linatoc.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages="com.linatoc.backend.repository")
public class BackendApplication {
	public static void main(final String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
