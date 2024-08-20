package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonService 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standaloneconfig.xml");
		
		Person person1=applicationContext.getBean("person1",Person.class);
		
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName());
		
		System.out.println("++++++++++++++++++++++++++++");
		
		System.out.println(person1.getFeesStructure());
		System.out.println(person1.getFeesStructure().getClass().getName());
		
		System.out.println("+++++++++++++++++++++++++++++");
		
		System.out.println(person1.getProperties());
		System.out.println(person1.getProperties().getClass().getName());
	}
}
