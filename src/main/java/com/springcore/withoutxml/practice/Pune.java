package com.springcore.withoutxml.practice;

import org.springframework.beans.factory.annotation.Value;

public class Pune 
{
	@Value("Pune Fc-Road")
	private String cityName;
	@Value("Narhe")
	private String villages;
	
	
	
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getVillages() {
		return villages;
	}
	public void setVillages(String villages) {
		this.villages = villages;
	}
	@Override
	public String toString() {
		return "Pune [cityName=" + cityName + ", villages=" + villages + "]";
	}
	
}
