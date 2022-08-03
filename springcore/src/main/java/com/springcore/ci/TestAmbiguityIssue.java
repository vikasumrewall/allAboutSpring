package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAmbiguityIssue {
	

public static void main(String arhs[])
{
	 System.out.println( "Hello World!" );
     ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ambiguityconfig.xml");
     AdditionAmbiguityIssue additionAmbiguityIssue1 =(AdditionAmbiguityIssue) context.getBean("additionAmbiguityIssue1");
     System.out.println(additionAmbiguityIssue1.sum());
}

}
