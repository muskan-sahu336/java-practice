package com.muskan;

class BoilWater extends Thread{
	public void run() {
		System.out.println("Boiling Water...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Water is ready !");
	}
}

class BoilMilk extends Thread{
	public void run() {
		System.out.println("Boiling Milk...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Milk is ready !");
	}
}

class GrindCoffee extends Thread{
	public void run() {
		System.out.println("Grinding Coffee beans...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Coffee powder is ready !");
	}
}

public class Coffee {
	public static void main(String[] args) {
		BoilWater water = new BoilWater();
		BoilMilk milk = new BoilMilk();
		GrindCoffee coffee = new GrindCoffee();
		
		water.start();
		
		try {
			water.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		milk.start();
		
		try {
			milk.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		coffee.start();
		
		try {
			coffee.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("!! COFFEE IS READY !!");
	}
}





























