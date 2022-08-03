package com.springcore.beanscope.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("personPrototypeObj")
@Scope("prototype")
public class PersonPrototype {
	@Value("Vikas")	
	private String studentName;
	@Value("Delhi")	
	private String city;
	@Value("#{addressLst}")
	private List<String> address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [studentName=" + studentName + ", city=" + city + ", address=" + address + "]";
	}
	
	
	
	
}
