package com.example.sock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SockApplication {

	public static void main(String[] args) {

	  ApplicationContext context = SpringApplication.run(SockApplication.class, args);
		String[] beanNames = context.getBeanDefinitionNames();
		System.out.println("Beans in context:");
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}

	}

}
