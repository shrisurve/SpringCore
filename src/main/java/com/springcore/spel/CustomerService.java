package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerService 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		
		Customer customer1=context.getBean("customer",Customer.class);
		
		System.out.println(customer1);
	}
}
