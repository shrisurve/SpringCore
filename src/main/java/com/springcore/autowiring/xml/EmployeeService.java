package com.springcore.autowiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeService 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/springcore/autowiring/xml/autowiringxmlconfig.xml");
		
		Employee employee=applicationContext.getBean("employee1",Employee.class);
		
		System.out.println(employee);
	}
}
	