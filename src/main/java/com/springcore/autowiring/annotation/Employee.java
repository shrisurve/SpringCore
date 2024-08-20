package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee 
{
	
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	@Autowired
	public void setAddress(Address address) {
		System.out.println("Setting Address");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
