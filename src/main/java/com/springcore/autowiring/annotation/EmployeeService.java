package com.springcore.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeService 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/springcore/autowiring/annotation/autowiringannotationconfig.xml");
		
		Employee employee=applicationContext.getBean("employee",Employee.class);
		
		System.out.println(employee);
	}
}
	