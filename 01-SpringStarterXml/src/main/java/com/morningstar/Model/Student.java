package com.morningstar.Model;

public class Student {
	private int studentId;
	private String studentName;
	private double studentScore;
	
	public Student() {
		System.out.println("Student object is getting created: default constructor");
	}
	
	public Student(int studentId, String studentName, double studentScore) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentScore = studentScore;
		System.out.println("Parameterized constructor get called");
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("Setter methed used");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setter methed used");
		this.studentName = studentName;
	}
	public double getStudentScore() {
		return studentScore;
	}
	public void setStudentScore(double studentScore) {
		System.out.println("Setter methed used");
		this.studentScore = studentScore;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentScore=" + studentScore
				+ "]";
	}
	
}
