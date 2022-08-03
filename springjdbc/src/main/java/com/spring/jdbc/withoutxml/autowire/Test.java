package com.spring.jdbc.withoutxml.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.withoutxml.autowire.dao.StudentDao;
import com.spring.jdbc.withoutxml.autowire.entity.Student;



public class Test {

	public static void main(String[] args) {
		/*
		 * how to insert using man mehti spring jdbc template
		 */
		/*
		 * System.out.println( "My program statred............." ); ApplicationContext
		 * context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		 * JdbcTemplate template=context.getBean("jdbcTmeplate",JdbcTemplate.class) ;
		 * 
		 * //inseting query; String
		 * query="insert into  student(id,name,city) values(?,?,?)";
		 * 
		 * //fire query int i= template.update(query,457,"Shyam","Kanpur");
		 * 
		 * System.out.println("number of record inserted="+i);
		 */

		ApplicationContext context = new AnnotationConfigApplicationContext(Jdbconfig.class);

		// to insert record


		StudentDao studentDaoSelect = context.getBean("studentDao", StudentDao.class);

		System.out.println("titla row selected=" + studentDaoSelect.getStudent(1));
		
//T
	}

}
