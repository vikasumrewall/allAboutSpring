package com.spring.jdbc.withoutxml.autowire.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.withoutxml.autowire.entity.Student;


@Component("studentDao")
public class StudentDaoImpl implements StudentDao{
	
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
		System.out.println("under constructor of StudentDaoImpl");
		
	}

	public int insert(Student student) {
		 String query="insert into  student(id,name,city) values(?,?,?)";
		 //fire query
	       int i= jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
	        
	       System.out.println("number of record inserted="+i);
		return i;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int update(Student student) {
		 String query="update student set name=?,city=? where id=?";
		 //fire query
	       int i= jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
	        
	       System.out.println("number of record update="+i);
		return i;
	}

	public int delete(int id) {
		 String query="delete from student where id=?";
		 //fire query
	       int i= jdbcTemplate.update(query,id);
	        
	       System.out.println("number of record delete="+i);
		return i;
	}

	public Student getStudent(int id) {
		 String query="select * from student where id=?";
		 //fire query
		 
		 RowMapper rowMapper=new RowMapperImpl();
	       Student student= jdbcTemplate.queryForObject(query, rowMapper,id);
	        
	       System.out.println("number of record slected="+student);
		return student;
	}

	public List<Student> getAllStudent() {
		 String query="select * from student";
		 //fire query
		 
		 RowMapper rowMapper=new RowMapperImpl();
	       List <Student> student= jdbcTemplate.query(query, rowMapper);
	        
	       System.out.println("multiple of record slected="+student);
		return student;
	}

	
	
	

}
