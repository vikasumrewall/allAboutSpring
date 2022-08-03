package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        
        
   
        StudentDao stDao= context.getBean("studentDao",StudentDao.class);
        
        //for inserting  record
        stDao.insert(new Student(2366,"Ram","Delhi11"));
        System.out.println("Reord inserted...................");
        
       
        //for updating  record
    stDao.updateStudent(new Student(231,"Ram","Delh456"));
       System.out.println("Reord updated...................");
       
       
       //for deleting record
      
      
       stDao.deleteStudent(231);
       System.out.println("Reord deletd...................");
     
       
       
       //for fetching multiple record
       List <Student> stList=stDao.fetchAllStudent();
       for(Student st:stList)
       {
    	   System.out.println("Reord seleted multiple..................."+st.getStudentId());
       }
   
       System.out.println("Reord eslleted multipl...................");
   
       
       
       
       
       
       
    }
}
