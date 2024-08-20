package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PepsiService 
{
	public static void main(String[] args) 
	{
		AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("pepsiconfig.xml");
		
		Pepsi pepsi=(Pepsi) applicationContext.getBean("pepsi");
		
		System.out.println(pepsi);
		
		applicationContext.registerShutdownHook();
	}
}
