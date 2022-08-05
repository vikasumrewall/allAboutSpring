package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.A;

public class TestByName {
	
	public static void main(String[] args) {
		   ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/autowireconfigbyname.xml");
	      
		   /*
		    * autowire by name
		    */
		   Emp empbyname=context.getBean("empAutoWireByName",Emp.class);
	       System.out.println(empbyname );
	        
	        
	        
	        
	        
	   
	}

}
