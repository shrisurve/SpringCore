package com.springcore.ref;

public class Customer 
{
	private long accountNo;
	private String name;
	
	private Bank obj;

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bank getObj() {
		return obj;
	}

	public void setObj(Bank obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Customer [accountNo=" + accountNo + ", name=" + name + ", obj=" + obj + "]";
	}
	
	
}
