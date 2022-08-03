package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestAutoWireConstructor {
	
	public static void main(String[] args) {
		   ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autowireautowireconstructorconfig.xml");
	      
	
		        
		        
		        /*
				    * atowire by annotation  by constructor
				    */
		        EmpAutoWireConstructor empAutoWireConstructor=context.getBean("empAutoWireConstructor",EmpAutoWireConstructor.class);
			        System.out.println("empAutoWireConstructor="+empAutoWireConstructor );
	        
	        
	        
	        
		   
	   
	}

}
