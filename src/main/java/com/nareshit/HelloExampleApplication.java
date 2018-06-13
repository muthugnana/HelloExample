package com.nareshit;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nareshit.service.HelloService;

@SpringBootApplication
public class HelloExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HelloExampleApplication.class, args);
		
		HelloService helloservice = context.getBean("helloService",HelloService.class);
		System.out.println(helloservice.sayHello("muthu"));
		
		System.out.println(context.getBeanDefinitionCount());
		String[] names = context.getBeanDefinitionNames();
		
		for (String name :names) {
			System.out.println(name);
		}
	}
}
