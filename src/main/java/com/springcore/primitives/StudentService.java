package com.springcore.primitives;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentService 
{
	public static void main(String[]args)
	{
		System.out.println("Hello");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("studentconfig.xml");
		Student s1=(Student)context.getBean("student1");
		System.out.println(s1);
	}

}
