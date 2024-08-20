package com.springcore.constructInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompEmpService 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("empcompanyconst.xml");
		
		Employee employee=(Employee) applicationContext.getBean("employee");
		
		System.out.println(employee);
		
		
		Addition add=(Addition) applicationContext.getBean("add");
		add.doSum();
	}
}
