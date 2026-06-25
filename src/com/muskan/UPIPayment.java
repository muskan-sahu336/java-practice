package com.muskan;

abstract class Payment{
	abstract void pay();
}

public class UPIPayment extends Payment{
	void pay(){
		System.out.println("UPI Payment done susccessfully !");
	}
	public static void main(String[] args) {
		UPIPayment pay1 = new UPIPayment();
		pay1.pay();
	}
}
