package com.springcore;

public class Mobile
{
	private int mobileId;
	private String mobName;
	private double price;
	private String serialNo;
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobName() {
		return mobName;
	}
	public void setMobName(String mobName) {
		this.mobName = mobName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobName=" + mobName + ", price=" + price + ", serialNo=" + serialNo
				+ "]";
	}
	
	
	
}
