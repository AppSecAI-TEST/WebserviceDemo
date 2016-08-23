package com.gk.webservice.server.normal;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
	
	@WebMethod
	@WebResult
	public String say(@WebParam String word);

}
