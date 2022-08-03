package com.springcore.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	@Autowired
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	
	private Samosa samosa;
	
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
	

}
