package com.gk.webservice.test.spring;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Test;

import com.gk.webservice.server.spring.entity.User;
import com.gk.webservice.server.spring.jaxws.HelloWorld;
import com.gk.webservice.server.spring.jaxws.UserService;

public class JaxwsTest {
	
	@Test
	public void test01() {
		JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
		factoryBean.setServiceClass(HelloWorld.class);
		factoryBean.setAddress("http://localhost:8080/WebserviceDemo/webservice/helloWorld");
		HelloWorld helloWorld = (HelloWorld)factoryBean.create();
		String msg = helloWorld.say("world");
		System.out.println(msg);
	}
	
	@Test
	public void test02() {
		JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
		factoryBean.setServiceClass(UserService.class);
		factoryBean.setAddress("http://localhost:8080/WebserviceDemo/webservice/user");
		UserService userService = (UserService)factoryBean.create();
		
		User user = new User(1,"yqq","yqq@qq.com");
		userService.setUser(user);
		
		User user2 = userService.getUserById(2);
		System.out.println(user2);
	}
	
}
