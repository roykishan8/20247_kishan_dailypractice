package com.sonata.required;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean
	public Address getAddress() {
		Address address = new Address();
		return address;
	}

	@Bean
	public Person getPerson() {
		Person person = new Person();
		person.setAddress(getAddress());
		return person;
	}

}
