package com.gk.webservice.server.spring.entity;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6523388062202989470L;
	
	private String code;
	
	private String name;
	
	private int age;
	
	public Student() {
		super();
	}
	
	public Student(String code, String name, int age) {
		super();
		this.code = code;
		this.name = name;
		this.age = age;
	}



	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + ", age=" + age
				+ "]";
	}
	

}
