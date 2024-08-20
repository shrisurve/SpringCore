package com.springcore.primitives;

public class Teacher 
{
	private int teacherId;
	private String teacherName;
	private String teacherAddress;
	private String teacherMobNo;
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherAddress() {
		return teacherAddress;
	}
	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}
	public String getTeacherMobNo() {
		return teacherMobNo;
	}
	public void setTeacherMobNo(String teacherMobNo) {
		this.teacherMobNo = teacherMobNo;
	}
 
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherAddress=" + teacherAddress
				+ ", teacherMobNo=" + teacherMobNo + "]";
	}
	
	
}
