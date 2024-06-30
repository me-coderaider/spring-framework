package com.learningsb.learn_spring_framework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learningsb.learn_spring_framework.game.GameRunner;
import com.learningsb.learn_spring_framework.game.MarioGame;
import com.learningsb.learn_spring_framework.game.PacManGame;
import com.learningsb.learn_spring_framework.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
//		1.  Launch a Spring Context
		try(var context= new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
		
//		2 .Configure the things that we want to Spring to manage - @Configuration
		// HelloWorldConfiguration class - @Configuration
		// name method with - @Bean
		
		// 3. Retrieving Beans managed by Spring
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
//		System.out.println(context.getBean("myCustomBean"));
		System.out.println(context.getBean(Address.class));
		
		System.out.println(context.getBean("person2MethodCall"));
		
		System.out.println(context.getBean("person3Parameters"));
		
		System.out.println(context.getBean("person4Qualifier"));
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		}
	}

}
