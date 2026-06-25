package com.muskan;

interface ATM1{
//	normal method not allowed , only abstrat method are allowed .
	abstract void withdraw();
}

class axis implements ATM1{
	public void withdraw() {
		System.out.println("Money withdraw successfully!");
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		axis a = new axis();
		a.withdraw();	
	}
}
