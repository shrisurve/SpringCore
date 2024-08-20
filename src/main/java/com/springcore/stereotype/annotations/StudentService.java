package com.springcore.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentService 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/springcore/stereotype/annotations/stereotypeconfig.xml");
		
		Student student=applicationContext.getBean("student",Student.class);
		
		System.out.println(student);
	}
}
