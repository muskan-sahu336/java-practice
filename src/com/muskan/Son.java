package com.muskan;

//Multilevel Inheritance
class grandpa {
	public void plot() {
		System.out.println("3cr");
	}
}

class father extends grandpa{
	public void car() {
		System.out.println("skoda");
	}
	
}

public class Son extends father{
	public static void main(String[] args) {
		Son aditya = new Son();
		aditya.plot();
		aditya.car();
	}
}
