package com.springcore.constructInject;

public class Company 
{
	private String companyName;
	private long gstNo;
	
	public Company(String companyName, long gstNo) {
		super();
		this.companyName = companyName;
		this.gstNo = gstNo;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", gstNo=" + gstNo + "]";
	}
	
	
	
	
}
