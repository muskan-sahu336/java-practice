package com.muskan;

class Vehicle{
	String brand;
	Vehicle(String brand){
		this.brand = brand;
	}
}

public class Car extends Vehicle{
	String model;
	Car(String brand, String model){
		super(brand);
		this.model = model;
		System.out.println("brand :"+brand+"\tModel :"+model);
	}
	
	public static void main(String[] args) {
		Car c = new Car("BWM", "205");
	}
}
