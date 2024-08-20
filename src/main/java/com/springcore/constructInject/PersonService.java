package com.springcore.constructInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonService 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("personconst.xml");
		Person person=(Person) applicationContext.getBean("person");
		
		System.out.println(person);
	}
}
