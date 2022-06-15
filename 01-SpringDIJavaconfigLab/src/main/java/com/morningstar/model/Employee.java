package com.morningstar.model;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private String employeeEmail;
	private String employeeDoj;
	
	public Employee()
        { 
		}
	
	
	public Employee(int employeeId, String employeeName, double employeeSalary, String employeeEmail,
			String employeeDoj) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeEmail = employeeEmail;
		this.employeeDoj = employeeDoj;
	}


	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeDoj() {
		return employeeDoj;
	}

	public void setEmployeeDoj(String employeeDoj) {
		this.employeeDoj = employeeDoj;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeEmail=" + employeeEmail + ", employeeDoj=" + employeeDoj + "]";
	}
	
	
}
