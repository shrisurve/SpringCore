package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ABService 
{
	public static void main(String[]args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("refconfig.xml");
		
		A temp=(A) applicationContext.getBean("aref");
		
		System.out.println(temp);
		
		System.out.println(temp.getX());
		
		System.out.println(temp.getObj().getY());
	}
}
