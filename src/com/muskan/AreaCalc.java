package com.muskan;
// Method overloading
public class AreaCalc {
	void area(int side) {
		System.out.println("area of sq. : "+side*side);
	}
	
	void area(int length, int breath) {
		System.out.println("area of rect : "+length*breath);
	}
	
	public static void main(String[] args) {
		AreaCalc a = new AreaCalc();
		a.area(5);
		a.area(50,25);
	}
}
