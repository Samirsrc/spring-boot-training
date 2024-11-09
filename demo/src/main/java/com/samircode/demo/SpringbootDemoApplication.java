package com.samircode.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(SpringbootDemoApplication.class, args);
	Alien obj1 = context.getBean(Alien.class);
	obj1.code();
	obj1.s = 5;
		Alien obj2 = context.getBean(Alien.class);
		obj2.code();
		System.out.println(obj2.s);



	}

}
