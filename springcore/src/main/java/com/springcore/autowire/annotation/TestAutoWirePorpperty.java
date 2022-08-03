package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestAutoWirePorpperty {
	
	public static void main(String[] args) {
		   ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autowireaautowireporppertyconfig.xml");
	      
		   /*
		    * atowire by annotation by property
		    */
		   EmpAutoWirePorpperty empbyname=context.getBean("empAutoWireByAnnotationBYProperty",EmpAutoWirePorpperty.class);
	        System.out.println("-->"+empbyname );
	        
	        
	        
	       
	        
	        
	        
	        
		   
	   
	}

}
