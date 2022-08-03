package com.springcore.noxml.beanannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Student {
	
	private Samosa samosa;
	
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	
	


	public Samosa getSamosa() {
		return samosa;
	}




	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}




	public void study()
	{
		System.out.println("i am studying");
	}


	@Override
	public String toString() {
		return "Student [samosa=" + samosa + "]";
	}
	

}
