package com.springcore.primitives;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherService 
{
	public static void main(String[]args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("teacherconfig.xml");
		
		Teacher t1=(Teacher)applicationContext.getBean("Teacher1");
		System.out.println(t1);
	}
}
