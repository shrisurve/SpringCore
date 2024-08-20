package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SamosaService 
{
	public static void main(String[] args) 
	{
		AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("samosaconfig.xml");
		
		Samosa samosa=(Samosa) applicationContext.getBean("samosa");
		
		System.out.println(samosa);
		
		//registering shutdown hook (for calling destroy mothod)
		applicationContext.registerShutdownHook();
	}
}
