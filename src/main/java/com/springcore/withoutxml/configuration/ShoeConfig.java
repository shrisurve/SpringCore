package com.springcore.withoutxml.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShoeConfig 
{
	@Bean("shoe")
	public Shoe getShoe()
	{
		return new Shoe();
	}
}
