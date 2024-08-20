package com.springcore.primitives;

public class Laptop
{
	private int laptopId;
	private String companyName;
	private String serialNo;
	private double price;
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", companyName=" + companyName + ", serialNo=" + serialNo + ", price="
				+ price + "]";
	}
	
	
}
