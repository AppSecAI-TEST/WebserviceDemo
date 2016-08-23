package com.gk.webservice.server.spring.jaxws.impl;

import org.springframework.stereotype.Component;

import com.gk.webservice.server.spring.entity.User;
import com.gk.webservice.server.spring.jaxws.UserService;

@Component("userServiceBean")
public class UserServiceImpl implements UserService {

	@Override
	public void setUser(User user) {
		System.out.println(user);
	}

	@Override
	public User getUserById(int id) {
		User user = new User();
		user.setId(id);
		user.setName("gk");
		user.setEmail("123456789@qq.com");
		return user;
	}

}
