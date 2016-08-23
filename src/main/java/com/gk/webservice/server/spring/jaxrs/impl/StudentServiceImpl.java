package com.gk.webservice.server.spring.jaxrs.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.gk.webservice.server.spring.entity.Student;
import com.gk.webservice.server.spring.jaxrs.StudentService;

@Component("studentServiceBean")
public class StudentServiceImpl implements StudentService {

	@Override
	public String getStudentByCode(String code) {
		List<Student> studentList = new ArrayList<Student>();
		
		Student student = new Student();
		student.setAge(30);
		student.setCode(code);
		student.setName("gk");
		studentList.add(student);
		
		Student student2 = new Student();
		student2.setAge(26);
		student2.setCode(code);
		student2.setName("yqq");
		studentList.add(student2);
		
		return JSONObject.toJSONString(studentList);
	}

	@Override
	public String getStudentByName(String name) {
		Student student = new Student();
		student.setAge(26);
		student.setCode(name);
		student.setName("yqq");
		return JSONObject.toJSONString(student);
	}

	@Override
	public String getStudentByAge(int age) {
		//浏览器访问接收到的age为0
		Student student = new Student();
		student.setAge(age);
		student.setCode("20131003");
		student.setName("gy");
		return JSONObject.toJSONString(student);
	}


}
