package com.springcore.withoutxml.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoodConfigBean 
{
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	
	@Bean
	public Foods getFoods()
	{
		Foods food=new Foods(getSamosa());
		return food;
	}
}
