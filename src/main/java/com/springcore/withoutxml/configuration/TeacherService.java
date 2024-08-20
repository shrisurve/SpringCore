package com.springcore.withoutxml.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TeacherService 
{ 
	public static void main(String[] args) 
	{
		ApplicationContext context=
				new AnnotationConfigApplicationContext(TeacherJavaConfig.class);
		
		Teacher teacher=context.getBean("getTeacher",Teacher.class);
		
		System.out.println(teacher);
		
		teacher.Teaching();
	}
}
