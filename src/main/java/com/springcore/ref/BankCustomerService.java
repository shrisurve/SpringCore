package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankCustomerService 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Bankconfig.xml");
		
		Customer customer=(Customer) applicationContext.getBean("customerref");
		
		System.out.println(customer);
	}
}
