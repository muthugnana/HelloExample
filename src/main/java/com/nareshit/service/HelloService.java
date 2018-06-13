package com.nareshit.service;

import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloService {
	public String sayHello (String name) {
		return "say hello to "+name;
	}

}
