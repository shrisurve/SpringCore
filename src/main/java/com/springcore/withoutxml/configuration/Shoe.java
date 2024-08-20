package com.springcore.withoutxml.configuration;

import org.springframework.beans.factory.annotation.Value;

public class Shoe 
{
	@Value("Adidas")
	private String name;
	@Value("10")
	private int size;
	@Value("2000")
	private double price;
	public Shoe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shoe(String name, int size, double price) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Shoe [name=" + name + ", size=" + size + ", price=" + price + "]";
	}
	
}
