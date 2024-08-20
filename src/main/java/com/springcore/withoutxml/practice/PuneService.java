package com.springcore.withoutxml.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PuneService 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=
				new AnnotationConfigApplicationContext(PuneConfig.class);
		
		Pune pune=context.getBean("p1",Pune.class);
		
		System.out.println(pune);
	}
}
