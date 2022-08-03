package com.springcore;

public class Student {
	private long studentId;
	private String studentName;
	private String studentAddress;
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Student(long studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}




	public long getStudentId() {
		return studentId;
	}




	public void setStudentId(long studentId) {
		 System.out.println( "setting student id" );
		this.studentId = studentId;
	}




	public String getStudentName() {
		return studentName;
	}




	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}




	public String getStudentAddress() {
		return studentAddress;
	}




	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}




	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	
	

}
