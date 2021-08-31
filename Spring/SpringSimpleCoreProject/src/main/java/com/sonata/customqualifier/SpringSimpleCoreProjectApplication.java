package com.sonata.customqualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringSimpleCoreProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringSimpleCoreProjectApplication.class, args);
		
		Person person=context.getBean(Person.class);
		
		System.out.println(person);
		
		/*Address a1=new Address();
		a1.setCity("bangalore");
		a1.setState("karnataka");
		person.setAddress(a1);
		System.out.println(person);*/
		
	}

}
