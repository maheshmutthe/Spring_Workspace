package com.morningstar.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private int studentId;
	private String studentName;
	private double studentScore;
	
	private Address address;	//address dependancy
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Address from student");
		this.address = address;
	}

	public Student() {
	}
	
	public Student(int studentId, String studentName, double studentScore) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentScore = studentScore;
	}
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
	public double getStudentScore() {
		return studentScore;
	}
	public void setStudentScore(double studentScore) {
		this.studentScore = studentScore;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentScore=" + studentScore
				+ "]";
	}
	
}
