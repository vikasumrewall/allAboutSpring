package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifecycleViaAnnotation {
	private String subject;

	public LifecycleViaAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "LifecycleViaAnnotation [subject=" + subject + "]";
	}
	
	
	@PostConstruct
	public void start()
	{
		System.out.println("stats of annoation");
		
	}
	@PreDestroy
	public void end()
	{
		System.out.println("end of annoation");	
	}

}
