package com.springcore.bean.scope;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("prototypeExample")
@Scope("prototype")
public class PrototypeAnnotation 
{
	@Value("999")
	private int classId;
	@Value("Prototype")
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
		return "PrototypeAnnotation [classId=" + classId + ", className=" + className + ", address=" + address + "]";
	}
	
	
}
