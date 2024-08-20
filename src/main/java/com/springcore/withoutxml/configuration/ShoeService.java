package com.springcore.withoutxml.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShoeService 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(ShoeConfig.class);
		Shoe shoe=context.getBean("shoe",Shoe.class);
		System.out.println(shoe);
	}
}
