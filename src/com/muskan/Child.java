package com.muskan;

// Single Inheritance
class Dad{
	public void car() {
		System.out.println("Thar");
	}
}


public class Child extends Dad{
	public static void main(String[] args) {
		Child maya = new Child();
		maya.car();
	}
}
