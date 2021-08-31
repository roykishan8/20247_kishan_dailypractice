package com.sonata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = {"com.sonata.model", "com.sonata.repository"})
public class SpringRestAngualrExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestAngualrExampleApplication.class, args);
	}

}
