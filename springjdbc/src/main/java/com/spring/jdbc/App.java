package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
    	 * how to insert using man mehti spring jdbc template
    	 */
      /*  System.out.println( "My program statred............." );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        JdbcTemplate template=context.getBean("jdbcTmeplate",JdbcTemplate.class)	;
        
        //inseting query;
        String query="insert into  student(id,name,city) values(?,?,?)";
        
        //fire query
       int i= template.update(query,457,"Shyam","Kanpur");
        
       System.out.println("number of record inserted="+i);*/
    	
    	
    	  ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	  
    	  //to insert record
          
          
         /* StudentDao studentDao=context.getBean("studentDao",StudentDao.class)	;
          
          Student student=new Student(14,"Gopal","Delhi");
          
          
          System.out.println("titla row inserted="+studentDao.insert(student));*/
          
          
          //to update record..
  StudentDao studentDaoInsert=context.getBean("studentDao",StudentDao.class)	;
          
          Student studentoInsert=new Student(10,"Gopal10","Delhi10");
          
          
          System.out.println("titla row inserted="+studentDaoInsert.update(studentoInsert));
          
          
          
          //to delete record..
         /* 	StudentDao studentDaoDelete=context.getBean("studentDao",StudentDao.class)	;
        
          
          System.out.println("titla row delted="+studentDaoDelete.delete(10));*/
          
          
          
          
          
  StudentDao studentDaoSelect=context.getBean("studentDao",StudentDao.class)	;
          
 
          
          
          System.out.println("titla row selected="+studentDaoSelect.getStudent(1));
          
          
          
 StudentDao studentDaoMulSelect=context.getBean("studentDao",StudentDao.class)	;
          
 
          
          
          System.out.println("titla row MULselected="+studentDaoMulSelect.getAllStudent());
          
          
          
          
          for(Student s:studentDaoMulSelect.getAllStudent())
          {
        	  System.out.println(s);
        	  
        	  
          }
          
          
          
          
       
       
        
        
    
    }
}
