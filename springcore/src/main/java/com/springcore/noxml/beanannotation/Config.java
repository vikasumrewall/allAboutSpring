package com.springcore.noxml.beanannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Config {
	
@Bean(name = {"student"})
public Student getStudent()
{
	return new Student(getSamosa());
}


@Bean
public Samosa getSamosa()
{
	return new Samosa();
}

}
