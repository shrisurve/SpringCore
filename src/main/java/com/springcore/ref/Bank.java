package com.springcore.ref;

public class Bank 
{
	private String bankName;
	private int bankCode;
	private String ifcCode;
	private String branchName;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getBankCode() {
		return bankCode;
	}
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	public String getIfcCode() {
		return ifcCode;
	}
	public void setIfcCode(String ifcCode) {
		this.ifcCode = ifcCode;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", bankCode=" + bankCode + ", ifcCode=" + ifcCode + ", branchName="
				+ branchName + "]";
	}
	
	
	
}
