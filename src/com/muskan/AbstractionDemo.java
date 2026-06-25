package com.muskan;

// Abstraction : hiding internal implementation, showing only necessary data to user . used in banking systems specially.

abstract class ATM{
	abstract void withdraw();
}

class HDFC extends ATM{
	void withdraw() {
		System.out.println("Money withrdrawn successfully!");
	}
}
public class AbstractionDemo {
	public static void main(String[] args) {
		ATM m = new HDFC();
		m.withdraw();
	}
}
