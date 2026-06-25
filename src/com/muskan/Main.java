package com.muskan;

public class Main {
	
	//Default method
	public void siri() {
		System.out.println("Hey, How are you?");
	}
	//Parameterised method	
	public void siri(String name) {
		System.out.println("Hey "+name+", How are you?");
	}
	
	public void add(int x, int y) {
		System.out.println(x+y);
	}
	
	public void multiply(int x, int y) {
		System.out.println(x*y);
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		String name = "Muskan";
		obj.siri();
		obj.siri(name);
		obj.add(12,44);
		obj.multiply(12,44);
	}
}
