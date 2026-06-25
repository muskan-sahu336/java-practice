              package com.muskan;

public class ConstructorDemo {
	// Default constructor	
	ConstructorDemo(){
		System.out.println("Hello i'm constructir");
	}
	
	//Parameterized constructor
	ConstructorDemo(String st){
		System.out.println(st);
	}
	
	ConstructorDemo(int n){
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo();
		ConstructorDemo obj1 = new ConstructorDemo("muskan");
		ConstructorDemo obj2 = new ConstructorDemo(33);
	}
}
