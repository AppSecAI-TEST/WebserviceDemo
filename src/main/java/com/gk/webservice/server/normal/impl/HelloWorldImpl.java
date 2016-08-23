package com.gk.webservice.server.normal.impl;

import com.gk.webservice.server.normal.HelloWorld;

public class HelloWorldImpl implements HelloWorld {

	@Override
	public String say(String word) {
		String msg = "Hello " + word;
		return msg;
	}

}
