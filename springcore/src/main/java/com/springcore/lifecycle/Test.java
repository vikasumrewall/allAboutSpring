package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
	context.registerShutdownHook();//to tell now destroy method must be called
	
	
	Samosa samosa=(Samosa)context.getBean("samosa1");
	System.out.println( "samosa="+samosa );
	
	
	Samosa samosaCustomerInitDestroy=(Samosa)context.getBean("samosaCustomerInitDestroy");
	System.out.println( "samosaCustomerInitDestroy="+samosaCustomerInitDestroy );
	
	
	Pepsi pepesiInitAndDstroyWithImlements=(Pepsi)context.getBean("pepesiInitAndDstroyWithImlements");
	System.out.println( "samosaCustomerInitDestroy="+pepesiInitAndDstroyWithImlements );
	
	
	LifecycleViaAnnotation lifecycleViaAnnotation=(LifecycleViaAnnotation)context.getBean("lifecycleViaAnnotation");
	System.out.println( "lifecycleViaAnnotation==="+lifecycleViaAnnotation );
	
	
	
	}
	

}
