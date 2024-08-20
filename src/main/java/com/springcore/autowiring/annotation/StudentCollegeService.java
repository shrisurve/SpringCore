package com.springcore.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentCollegeService 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/springcore/autowiring/annotation/autowiringannotationconfig.xml");
		
		Student student=applicationContext.getBean("student",Student.class);
		
		System.out.println(student);
	}
}
