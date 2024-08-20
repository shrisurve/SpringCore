package com.springcore.bean.scope;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("singleton")
public class Singleton 
{
	@Value("123")
	private int classId;
	@Value("Singleton")
	private String className;
	@Value("#{address}")
	private List<String> address;
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Singleton [classId=" + classId + ", className=" + className + ", address=" + address + "]";
	}
	
	
}
