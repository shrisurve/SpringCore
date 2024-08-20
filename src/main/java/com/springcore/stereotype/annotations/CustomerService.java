package com.springcore.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerService 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/springcore/stereotype/annotations/stereotypeconfig.xml");
		
		
		CustomerCollectionWithValue collectionWithValue=
				applicationContext.getBean("customer",CustomerCollectionWithValue.class);
		
		
		System.out.println(collectionWithValue.getCustomerId());
		
		
		
		
		System.out.println(collectionWithValue.getCustomerName());
		System.out.println(collectionWithValue.getCustomerName().getClass().getName());
		
		
		System.out.println(collectionWithValue.getAddress());
		System.out.println(collectionWithValue.getAddress().getClass().getName());
		
	}
}
