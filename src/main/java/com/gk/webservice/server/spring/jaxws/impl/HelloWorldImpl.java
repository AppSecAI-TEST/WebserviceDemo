package com.gk.webservice.server.spring.jaxws.impl;

import org.springframework.stereotype.Component;

import com.gk.webservice.server.spring.jaxws.HelloWorld;

@Component("helloWorldBean")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String say(String word) {
		String msg = "Hello " + word;
		return msg;
	}

}
