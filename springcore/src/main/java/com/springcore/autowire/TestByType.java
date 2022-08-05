package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.A;

public class TestByType {
	
	public static void main(String[] args) {
		   ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/autowireconfigbytype.xml");
	      
		
	        
	        
	        
	        
	        /*
			    * autowire by type
			    */
			   Emp empbyType=context.getBean("empAutoWireByType",Emp.class);
		        System.out.println(empbyType);
		        
		        
		        
		        
		   
	   
	}

}
