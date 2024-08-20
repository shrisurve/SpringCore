package com.springcore.withoutxml.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentService 
{
	public static void main(String[]args)
	{
		ApplicationContext context= 
			new AnnotationConfigApplicationContext(StudentJavaConfig.class);
	
		Student student=context.getBean("firststudent",Student.class);
	
		System.out.println(student);
		
		student.doStudy();
	}
}
