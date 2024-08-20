package com.springcore.spel;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class StudentService 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		
		Student student=context.getBean("student",Student.class);
		
		System.out.println(student);
		
	
	}
}
