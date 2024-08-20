package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean , DisposableBean
{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//same like destroy method
		
		System.out.println("Taking pepsi:-destroy");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//Same like init method
		
		System.out.println("Taking pepsi:-init");
		
	}
	
	
}
