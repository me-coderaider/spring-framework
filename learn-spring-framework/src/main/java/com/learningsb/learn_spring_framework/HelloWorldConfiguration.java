package com.learningsb.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// no need of getter setter with record keyword
record Person(String name, int age) {
	
}

record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Pankaj";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		var person=new Person("person1", 20);
//		person.
		return person;
	}
	
	@Bean
	public Address address() {
		var address = new Address("Baker St.", "ENG");
		
		return address;
	}
	
}
