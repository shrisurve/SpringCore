package com.springcore.withoutxml.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TeacherJavaConfig 
{
	@Bean             //using bean annotation only
	public Teacher getTeacher()
	{
		//creating a new student object
		Teacher teacher=new Teacher();
		return teacher;
	}
}
