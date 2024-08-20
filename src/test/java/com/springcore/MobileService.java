package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileService 
{
	public static void main(String[]args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Mobileconfig.xml");
		
		Mobile m=(Mobile)applicationContext.getBean("mobile");
		
		System.out.println(m);
	}
}
