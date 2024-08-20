package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationExService 
{
	public static void main(String[] args) 
	{
		AbstractApplicationContext abstractApplicationContext=new ClassPathXmlApplicationContext("AnnotationExconfig.xml");
		
		AnnotationExample annotationExample=(AnnotationExample) abstractApplicationContext.getBean("annotation");
		
		System.out.println(annotationExample);
		
		
		abstractApplicationContext.registerShutdownHook();
	}
}
