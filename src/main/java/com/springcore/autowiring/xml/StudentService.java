package com.springcore.autowiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentService 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/springcore/autowiring/xml/autowiringxmlconfig.xml");
		
		Student student=context.getBean("student1",Student.class);
		
		System.out.println(student);
	}
}
