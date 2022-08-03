package com.spring.jdbc.withoutxml;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.withoutxml.dao.StudentDao;
import com.spring.jdbc.withoutxml.dao.StudentDaoImpl;



@Configuration
public class Jdbconfig {

	@Bean(name={"ds"})
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds =new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean(name={"jdbcTemplate"})
	public JdbcTemplate getTempalte()
	{
		return new JdbcTemplate(getDataSource());
		
	}
	
	@Bean(name={"studentDao"})
	public StudentDao getStudentDao()
	{
		StudentDaoImpl stImp=new StudentDaoImpl();
		stImp.setJdbcTemplate(getTempalte());
		
		return stImp;
	}
}
