package com.springcore.constructInject;

public class Employee 
{
	private int empId;
	private String empName;
	private Company comp;
	public Employee(int empId, String empName, Company comp) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.comp = comp;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", comp=" + comp + "]";
	}
	
	
	
	
}
