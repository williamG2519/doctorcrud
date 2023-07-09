package com.platzidoctorcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class DoctorcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorcrudApplication.class, args);
	}

}
