package com.springcore.annotation.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/annotation/sterotype/config.xml");
		
			Person person=context.getBean("personObj",Person.class);
					System.out.println(person);

	}

}
