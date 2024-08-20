package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationExample 
{
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "AnnotaionExample [subject=" + subject + "]";
	}
	@PostConstruct
	public void start()
	{
		System.out.println("Starting method");
	}
	@PreDestroy
	public void end()
	{
		System.out.println("Ending method");
	}
	
	
}
