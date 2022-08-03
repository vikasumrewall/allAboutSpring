package com.spring.jdbc.withoutxml.autowire.entity;

import org.springframework.stereotype.Component;


public class Student {
	
	
	private long id;
	private String name;
	private String city;
	public Student(long id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		System.out.println("parameter ized student construtor");
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		System.out.println("setting student......");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	

}
