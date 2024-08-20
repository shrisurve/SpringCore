package com.springcore.withoutxml.configuration;

import org.springframework.stereotype.Component;

@Component("firststudent")
public class Student 
{
	public void doStudy()
	{
		System.out.println("Student is Reading books");
	}
}
