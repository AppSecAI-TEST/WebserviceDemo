package com.gk.webservice.server.spring.jaxws;

import javax.jws.WebService;

import com.gk.webservice.server.spring.entity.User;


@WebService
public interface UserService {
	
	public void setUser(User user);
	
	public User getUserById(int id);

}
