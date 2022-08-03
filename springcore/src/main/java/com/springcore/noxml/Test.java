package com.springcore.noxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello11");
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Student student=context.getBean("student",Student.class);
		student.study();
		student.getSamosa().enjoy();
		
		
		
		

	}

}
