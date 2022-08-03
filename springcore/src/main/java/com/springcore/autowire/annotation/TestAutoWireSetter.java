package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestAutoWireSetter {
	
	public static void main(String[] args) {
		   ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autowireautowiresetterconfig.xml");
	      
		   /*
	
	        
	        
	        /*
			    * atowire by annotation  by setter
			    */
	        EmpAutoWireSetter empbynamebySetter=context.getBean("empAutoWireSetter",EmpAutoWireSetter.class);
		        System.out.println(empbynamebySetter );
		        
		        
		       
	        
	        
	        
		   
	   
	}

}
