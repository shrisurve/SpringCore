package com.springcore.withoutxml.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FoodsService 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=
				new AnnotationConfigApplicationContext(FoodConfigBean.class);
		
		
		Samosa samosa=context.getBean("getSamosa",Samosa.class);
		
		System.out.println(samosa);
		samosa.getSamosa();
	}
}
