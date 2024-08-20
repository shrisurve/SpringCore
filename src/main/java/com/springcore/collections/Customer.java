package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer 
{
	private int customerId;
	private String customerName;
	private List<String> order;
	private Set<String> emailId;
	private List<String> phones;
	private Map<String,Double>price;
	
	
	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public List<String> getOrder() {
		return order;
	}


	public void setOrder(List<String> order) {
		this.order = order;
	}


	public Set<String> getEmailId() {
		return emailId;
	}


	public void setEmailId(Set<String> emailId) {
		this.emailId = emailId;
	}


	public List<String> getPhones() {
		return phones;
	}


	public void setPhones(List<String> phones) {
		this.phones = phones;
	}


	public Map<String, Double> getPrice() {
		return price;
	}


	public void setPrice(Map<String, Double> price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", order=" + order + ", emailId="
				+ emailId + ", phones=" + phones + ", price=" + price + "]";
	}
	
	
	
	
	
}
