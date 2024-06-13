package com.learningsb.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// no need of getter setter with record keyword
record Person(String name, int age, Address address) {
	
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
		var person=new Person("person1", 20, new Address("Trifalgar sq.", "London"));
		return person;
	}
	
	@Bean
	public Person person2MethodCall() {
		var person=new Person(name(), age(), address());
		return person;
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address2) {
		return new Person(name, age, address2);
	}
	
	@Bean
	public Person person4Qualifier(String name, int age, @Qualifier("address2Qualifier") Address address2) {
		return new Person(name, age, address2);
	}
	
	@Bean(name = "myCustomBean")
	@Primary
	public Address address() {
		var address = new Address("Baker St.", "London");
		
		return address;
	}
	
	@Bean(name = "address2")
	@Qualifier("address2Qualifier")
	public Address address2() {
		var address = new Address("Baker St.22", "London22");
		return address;
	}
	
	
	
}
