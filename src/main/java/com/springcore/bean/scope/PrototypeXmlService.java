package com.springcore.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeXmlService 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/springcore/bean/scope/beanscopeconfig.xml");
		
		PrototypeXml prototypeXml1=context.getBean("prototype1",PrototypeXml.class);
		
		System.out.println(prototypeXml1.hashCode());
		System.out.println(prototypeXml1);
		
		
		PrototypeXml prototypeXml2=context.getBean("prototype1",PrototypeXml.class);
		System.out.println(prototypeXml2.hashCode());
		System.out.println(prototypeXml2);
	}
}
