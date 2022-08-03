package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.A;

public class Test {
	
	public static void main(String[] args) {
		   ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/autowireconfig.xml");
	      
		   /*
		    * autowire by name
		    */
		   Emp empbyname=context.getBean("empAutoWireByName",Emp.class);
	       System.out.println(empbyname );
	        
	        
	        
	        
	        /*
			    * autowire by type
			    */
			   Emp empbyType=context.getBean("empAutoWireByType",Emp.class);
		        System.out.println(empbyType);
		        
		        
		        
		        /*
				    * autowire by construtor
				    */
				   Emp empByConstrutoror=context.getBean("empAutoWireByConstrutor",Emp.class);
			        System.out.println(empByConstrutoror);
		   
	   
	}

}
