package com.springcore.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentPrototypeService 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/springcore/bean/scope/beanscopeconfig.xml");
		
		StudentPrototype student1= context.getBean("student",StudentPrototype.class);
		
		System.out.println(student1.getStudentId());
		System.out.println(student1.getStudentName());
		System.out.println(student1.getAddress());
		System.out.println(student1.getCourses());
		System.out.println(student1.getFeesStructure());
	}
}
