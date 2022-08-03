package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class Test {
	
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
        Person person1 =(Person) context.getBean("person1");
      
        
        
        System.out.println( "person1= World!" +person1);
        
       
        Person person2 =(Person) context.getBean("person2");
        System.out.println( "person1= World!" +person2);
        
        Person person3 =(Person) context.getBean("person3");
        System.out.println( "person3= World!" +person3);
        
        Person person4 =(Person) context.getBean("person4");
        System.out.println( "person4= World!" +person4);
        
        
       
    }


}
