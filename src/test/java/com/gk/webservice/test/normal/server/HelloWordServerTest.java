package com.gk.webservice.test.normal.server;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.gk.webservice.server.normal.impl.HelloWorldImpl;

public class HelloWordServerTest {
	
	public static void main(String[] args) {
		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
		factoryBean.setServiceClass(HelloWorldImpl.class);
		factoryBean.setAddress("http://localhost:9000/ws/HelloWorld");
		factoryBean.create();
	}

}
