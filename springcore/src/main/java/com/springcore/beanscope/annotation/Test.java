package com.springcore.beanscope.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/beanscope/annotation/config.xml");
		
		//this is default. and default  is singleton
		
			PersonSingleton personSingletonORbydefault=context.getBean("personSingletonObj",PersonSingleton.class);
					System.out.println(personSingletonORbydefault);
					
					PersonSingleton personSingletonORbydefault2=context.getBean("personSingletonObj",PersonSingleton.class);
					System.out.println(personSingletonORbydefault2);
					if(personSingletonORbydefault.hashCode()==personSingletonORbydefault2.hashCode())
					{
						System.out.println("Has code will be same for single ton.I am always true sicne it is single ton");
					}
					
					//end this is default. and default  is singleton
					
					//this is prototype new object will be created by instiaiztion this.
					PersonPrototype personPrototype=context.getBean("personPrototypeObj",PersonPrototype.class);
					System.out.println(personPrototype);
					
					
					PersonPrototype personPrototype2=context.getBean("personPrototypeObj",PersonPrototype.class);
					System.out.println(personPrototype2);
					
					
					if(personPrototype.hashCode()!=personPrototype2.hashCode())
					{
						System.out.println("I am always true sicne it is not singleton.So new ojject will be there ");
					}
					
					
					
					
					
					
					
	}

}
