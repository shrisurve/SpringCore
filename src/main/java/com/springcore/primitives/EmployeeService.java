package com.springcore.primitives;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeService 
{
	public static void main(String[]args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("employeeconfig.xml");
	    Employee e1=(Employee)applicationContext.getBean("employee1");
	    System.out.println(e1);
	}

}
