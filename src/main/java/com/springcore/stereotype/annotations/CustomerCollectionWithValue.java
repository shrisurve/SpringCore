package com.springcore.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("customer")
public class CustomerCollectionWithValue 
{
	@Value("Shital")
	private String customerName;
	@Value("7757")
	private int customerId;
	@Value("#{address}")
	private List<String> address;
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "CustomerCollectionWithValue [customerName=" + customerName + ", customerId=" + customerId + ", address="
				+ address + "]";
	}
	
	
}
