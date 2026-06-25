package com.muskan;

class Emp{
	void work() {
		System.out.println("Employee is working !");
	}
}

public class Developer extends Emp{
	void work() {
		System.out.println("Developer is working !");
	}
	
	public static void main(String[] args) {
		Developer d = new Developer();
		d.work();
	}
}
