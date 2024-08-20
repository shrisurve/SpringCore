package com.springcore.withoutxml.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PuneConfig 
{
	@Bean("p1")
	public Pune getpune()
	{
		return new Pune();
	}
}
