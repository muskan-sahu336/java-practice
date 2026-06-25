package com.muskan;

abstract class Appliance{
	abstract void start();
}

public class WashingMachine {
	void start() {
		System.out.println("Washing machine started working properly!");
	}
	public static void main(String[] args) {
		WashingMachine wm = new WashingMachine();
		wm.start();
	}
}
