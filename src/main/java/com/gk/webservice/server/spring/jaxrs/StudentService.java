package com.gk.webservice.server.spring.jaxrs;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

@Path("/student")
@Description(value = "Resource", target = DocTarget.RESOURCE)
public interface StudentService {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getStudentByCode/{code}")
	public String getStudentByCode(@PathParam("code") String code);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getStudentByAge/{age}")
	public String getStudentByAge(@PathParam("age") int age);
	

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getStudentByName")
	public String getStudentByName(@FormParam("name") String name);
	
}
