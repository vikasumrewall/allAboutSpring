package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.A;

public class TestByConstructor {
	
	public static void main(String[] args) {
		   ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/autowireconfigbyconstructor.xml");
	      
		  
		        
		        
		        
		        /*
				    * autowire by construtor
				    */
				   Emp empByConstrutoror=context.getBean("empAutoWireByConstrutor",Emp.class);
			        System.out.println(empByConstrutoror);
		   
	   
	}

}
