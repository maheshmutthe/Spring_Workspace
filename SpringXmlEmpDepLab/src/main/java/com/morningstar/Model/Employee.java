package com.morningstar.Model;

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	private String empEmail;
	private String empDOJ;
	
	public Employee() {}
	
	public Employee(int empId, String empName, double empSalary, String empEmail, String empDOJ) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empEmail = empEmail;
		this.empDOJ = empDOJ;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpDOJ() {
		return empDOJ;
	}
	public void setEmpDOJ(String empDOJ) {
		this.empDOJ = empDOJ;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empEmail="
				+ empEmail + ", empDOJ=" + empDOJ + "]";
	}
	
	
	
}
