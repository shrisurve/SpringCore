package com.springcore.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonService 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/springcore/bean/scope/beanscopeconfig.xml");
		
		Singleton singleton1=applicationContext.getBean("singleton",Singleton.class);
		
		System.out.println(singleton1.hashCode());
		
		Singleton singleton2=applicationContext.getBean("singleton",Singleton.class);
		System.out.println(singleton2.hashCode());
	}
}
