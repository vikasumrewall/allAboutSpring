package com.spring.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entity.Student;



@Transactional
public class StudentDao {
	
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public int insert(Student student)
	{
		Integer i=(Integer)hibernateTemplate.save(student);
		return i;
	}
	
	public Student fetchStudent(int id)
	{
		Student  s=hibernateTemplate.get(Student.class, id);
		return s;
	}
	
	
	public List<Student> fetchAllStudent()
	{
		List<Student>  sLst=hibernateTemplate.loadAll(Student.class);
		return sLst;
	}
	
	public void deleteStudent(int id)
	{
		hibernateTemplate.delete(hibernateTemplate.get(Student.class, id));
		
	}
	
	public void  updateStudent(Student  st)
	{
		hibernateTemplate.update(st);
		
	}
	

}
