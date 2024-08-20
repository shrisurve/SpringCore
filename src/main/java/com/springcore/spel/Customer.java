package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer 
{
	@Value("55")
	private int a;
	@Value("45")
	private int b;
	@Value("#{ T(java.lang.Math).sqrt(144) }")  //creating static method call
	private double c;
	@Value("#{ T(java.lang.Math).PI }")       //creating static variable call
	private double d;
	
	@Value("#{ new java.lang.String('Shrikant Surve') }")  //creating object
	private String name;

	@Value("#{ 4>3 }")      //creating boolean type spel
	private boolean isActive;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Customer [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

	
	
	
	
}
