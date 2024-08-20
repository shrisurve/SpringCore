package com.springcore.bean.scope;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class StudentPrototype 
{
	@Value("277757")
	private int studentId;
	@Value("Shrikant Surve")
	private String studentName;
	@Value("#{address}")
	private List<String> address;
	@Value("#{courses}")
	private Set<String> courses;
	@Value("#{feesStructure}")
	private Map<String, Integer>feesStructure;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Set<String> getCourses() {
		return courses;
	}
	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
	public Map<String, Integer> getFeesStructure() {
		return feesStructure;
	}
	public void setFeesStructure(Map<String, Integer> feesStructure) {
		this.feesStructure = feesStructure;
	}
	@Override
	public String toString() {
		return "StudentPrototype [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address
				+ ", courses=" + courses + ", feesStructure=" + feesStructure + "]";
	}
	
	
	
	
	
}
