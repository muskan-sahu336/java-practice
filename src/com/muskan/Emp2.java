package com.muskan;

public class Emp2 {
	private int employeeId;
	private String employeeName;
	private int salary;
	
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
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Emp2 emp = new Emp2();
		emp.setEmployeeId(101);
		emp.setEmployeeName("muskan");
		emp.setSalary(45000);
		System.out.println(emp.getEmployeeId());
		System.out.println(emp.getEmployeeName());
		System.out.println(emp.getSalary());
	}
}
