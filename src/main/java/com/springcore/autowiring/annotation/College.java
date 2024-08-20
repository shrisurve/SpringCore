package com.springcore.autowiring.annotation;

public class College 
{
	private String collegeName;
	private int collegeId;
	private String address;
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", collegeId=" + collegeId + ", address=" + address + "]";
	}
	
	
	
}
