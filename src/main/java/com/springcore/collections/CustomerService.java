package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerService 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("customerCollectionconfig.xml");
		Customer customer=(Customer) applicationContext.getBean("customer");
		System.out.println(customer.getCustomerId());
		System.out.println(customer.getCustomerName());
		System.out.println(customer.getEmailId());
		System.out.println(customer.getOrder());
		System.out.println(customer.getPhones());
		System.out.println(customer.getPrice());
	}
}
