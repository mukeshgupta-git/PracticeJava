package com.java.practice.constructor;

public class Employee {

	private int employeeId;
	private String employeeName;
	private String employeeAddress;
	private static String COMPANY_NAME;

	public Employee(int employeeId, String employeeName, String employeeAddress) {
		this();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}

	public Employee(String employeeName, int employeeId, String employeeAddress) {
		this();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}

	public Employee(int employeeId, String employeeName) {
		this();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public Employee(String employeeName, String employeeAddress) {
		this(12);
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}

	public Employee(int employeeId) {
		this();
		this.employeeId = employeeId;
	}

	public Employee() {
		this.COMPANY_NAME = "EPAM";
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", Company name=" + COMPANY_NAME + "]";
	}

}
