package com.sonata.postconstruct;

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
	public Person getPerson(Address address) {
		Person person = new Person(address);
		return person;
	}

}
