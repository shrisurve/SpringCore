package com.springcore.primitives;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopService 
{
	public static void main(String[]args)
	{
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Laptopconfig.xml");
		
		Laptop laptop1=(Laptop) applicationContext.getBean("laptop1");
		Laptop laptop2=(Laptop) applicationContext.getBean("laptop2");
		
		System.out.println(laptop1);
		System.out.println(laptop2);
		
	}
}
