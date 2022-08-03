package com.springcore.collection.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class Test {

	public static void main(String[] args) {
		  System.out.println( "Hello World!" );
	        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/standalonecollection/config.xml");
	        
	        
	       //1st way to use it -->
	        Person person1 =(Person) context.getBean("person1");
	        System.out.println( person1);
	        
	        
	       // 2nds way to use it more cleaner with lesser coding efforts -->
	        Person person2 =(Person) context.getBean("person2");
	        System.out.println( person2);

	}

}
