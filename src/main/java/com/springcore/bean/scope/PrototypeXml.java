package com.springcore.bean.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("prototype1")

public class PrototypeXml 
{
	@Value("777")
	private int classId;
	@Value("PrototypeXml")
	private String className;
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
	@Override
	public String toString() {
		return "PrototypeXml [classId=" + classId + ", className=" + className + "]";
	}
	
	
}
