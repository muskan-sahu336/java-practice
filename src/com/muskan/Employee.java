package com.muskan;

public class Employee {
	Employee(){
		System.out.println("Hello, i'm Employee.");
	}
	
	Employee(String emp){
		System.out.println("Employee :"+emp);
	}
	
	Employee(String emp, int salary){
		System.out.println("Employee :"+emp+"\t"+"Salary :"+salary);
	}
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee("Sia singh");
		Employee emp3 = new Employee("Neha kumar",45000);
	}
}
