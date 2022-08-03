package com.spring.jdbc.withoutxml.autowire;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.withoutxml.autowire.dao.StudentDao;
import com.spring.jdbc.withoutxml.autowire.dao.StudentDaoImpl;





@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.withoutxml.autowire"})
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
	
	
}
