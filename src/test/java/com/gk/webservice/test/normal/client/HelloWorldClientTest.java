package com.gk.webservice.test.normal.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.gk.webservice.server.normal.HelloWorld;

public class HelloWorldClientTest {

	public static void main(String[] args) {
		JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
		factoryBean.setServiceClass(HelloWorld.class);
		factoryBean.setAddress("http://localhost:9000/ws/HelloWorld");
		HelloWorld helloWorld = (HelloWorld)factoryBean.create();
		String msg = helloWorld.say("world");
		System.out.println(msg);
	}

}
