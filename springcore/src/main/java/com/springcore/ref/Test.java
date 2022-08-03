package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collection.Emp;

public class Test {

	public static void main(String[] args) {
		   ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
	        A a =(A) context.getBean("aref");
	        System.out.println( "A="+a );
	        System.out.println( "A="+a.getOb().getY() );
	        
	        
	        A aref1 =(A) context.getBean("aref1");
	        System.out.println( "Aref1="+aref1 );
	        System.out.println( "Aref1="+aref1.getOb().getY() );
	        
	        
	        
	        A aref2 =(A) context.getBean("aref2");
	        System.out.println( "Aref2="+aref2 );
	        System.out.println( "Aref2="+aref2.getOb().getY() );

	}

}
