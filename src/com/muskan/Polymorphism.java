package com.muskan;

//Polymorphism

class Calc{
	// 1.Method Overlaoding : same method name , different parameters.
	void add(int a, int b) {
		System.out.println(a+b);
	} 
	void add(int a , int b , int c) {
		System.out.println(a+b+c);
	}
	
}

public class Polymorphism {
	public static void main(String[] args) {
		Calc c = new Calc();
		c.add(10, 20);
		c.add(10, 20, 30);
	}
}
