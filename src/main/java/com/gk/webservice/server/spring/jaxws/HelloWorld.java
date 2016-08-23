package com.gk.webservice.server.spring.jaxws;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
	
	public String say(String word);

}
