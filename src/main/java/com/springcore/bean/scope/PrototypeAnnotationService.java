package com.springcore.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeAnnotationService 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/springcore/bean/scope/beanscopeconfig.xml");
		
		PrototypeAnnotation annotation1=applicationContext.getBean("prototypeExample",PrototypeAnnotation.class);
		
		System.out.println(annotation1.hashCode());
		
		PrototypeAnnotation annotation2=applicationContext.getBean("prototypeExample",PrototypeAnnotation.class);
		
		System.out.println(annotation2.hashCode());
	}
}
