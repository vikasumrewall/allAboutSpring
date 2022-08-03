package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class Test {

	public static void main(String[] args) {
		  System.out.println( "Hello World!" );
	        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
	        Emp emp =(Emp) context.getBean("emp1");
	        System.out.println( "emp="+emp );

	}

}
