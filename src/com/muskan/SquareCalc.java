package com.muskan;

public class SquareCalc {
	void square(int n ) {
		System.out.println("square of "+n+" : "+n*n);
	}
	public static void main(String[] args) {
		SquareCalc obj = new SquareCalc();
		obj.square(5);
	}
}
